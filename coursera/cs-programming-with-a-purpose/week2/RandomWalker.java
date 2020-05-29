public class RandomWalker {
    public static void main(String[] args) {
        int distance = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        double direction;
        int steps = 0;
        System.out.println("(" + x + ", " + y + ")");
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
            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println("steps = " + steps);
    }
}