public class RandomWalkers {
    public static void main(String[] args) {
        int distance = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int x;
        int y;
        double direction;
        int steps;
        int allSteps = 0;
        for (int t = 0; t < trials; t++) {
            x = 0;
            y = 0;
            steps = 0;
            while ((Math.abs(x) + Math.abs(y) != distance)) {
                direction = Math.random();
                if (direction < 0.25) {
                    y += 1;
                } else if (direction >= 0.25 && direction < 0.5) {
                    x += 1;
                } else if (direction >= 0.5 && direction < 0.75) {
                    y -= 1;
                } else {
                    x -= 1;
                }
                steps += 1;
            }
            allSteps += steps;
        }
        System.out.println("average number of steps = " + (double) allSteps/trials);
    }
}