public class SumOfDigit {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        while (num != 0) {
            // Step - 1 Get the Last Digit
            int digit = num % 10;
            sum = sum + digit; // Step - 2 Sum the Digit
            // Step - 3 Make the Number Small
            num = num / 10;
        }
        System.out.println(sum);

    }
}
