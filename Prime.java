public class Prime {
    public static void main(String[] args) {
        // Approach - 2
        int num = 17;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println("Not Prime Number");
                return; // exit from the function
            }
        }
        System.out.println("Prime Number");
        /*
         * Approach - 1
         * int num = 117;
         * int factorCount = 0;
         * for (int i = 1; i <= num; i++) {
         * if (num % i == 0) {
         * factorCount++; // factorCount = factorCount + 1
         * }
         * }
         * if (factorCount == 2) {
         * System.out.println("Prime Number");
         * } else {
         * System.out.println("Not Prime Number");
         * }
         */
    }
}
