public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        for (int i=0; i < n; i++) {
            String row = "";
            for (int j=0; j < n; j++) {
                if ((i>=j && i<j+width+1) || (i<j && i>j-width-1)) {
                    row += "*  ";
                } else {
                    row += "0  ";
                }
            }
            System.out.println(row + "\n");
        }
    }
}