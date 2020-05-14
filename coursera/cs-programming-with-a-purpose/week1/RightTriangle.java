public class RightTriangle {
    public static void main(String[] args) {
        long a = Integer.parseInt(args[0]);
        long b = Integer.parseInt(args[1]);
        long c = Integer.parseInt(args[2]);
        long a2 = a*a;
        long b2 = b*b;
        long c2 = c*c;
        System.out.println((a > 0 && b > 0 && c > 0) && ((a2 + b2 == c2) || (b2 + c2 == a2) || (a2 + c2 == b2)));
    }
}