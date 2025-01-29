public class PrintDigit {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;
        int copy = num;
        // digit count
        while (num != 0) {
            num = num / 10; // make number small
            count++;
        }
        num = copy;
        // Compute the Power
        int pow = (int) Math.pow(10, count - 1);
        while (num != 0) {
            System.out.println(num / pow);
            // make the number small
            num = num % pow;
            // make the power small
            pow = pow / 10;
        }
    }
}
