public class CMYKtoRGB {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double k = Double.parseDouble(args[3]);
        double white = 1-k;
        System.out.println("red = " + (int) (255*white*(1-c)));
        System.out.println("green = " + (int) (255*white*(1-m)));
        System.out.println("red = " + (int) (255*white*(1-y)));
    }
}