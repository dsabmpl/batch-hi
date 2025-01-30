public class Pyramid {
    public static void main(String[] args) {
        int n = 5;
        int val = 1;
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            String str = String.valueOf(val);
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i) + " ");
            }
            // int odd = 2 * row - 1;
            // System.out.print(val);
            val = val * 11;
            // for (int col = 1; col <= odd; col++) {
            // System.out.print("*");
            // // System.out.print("* ");
            // }
            System.out.println();
        }
    }
}
