public class NumberToString {
    static String words[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    static void numberToString(int num) {
        if (num == 0) {
            return;
        }
        numberToString(num / 10);
        int digit = num % 10;
        System.out.print(words[digit] + " ");
        // switch(digit){
        // case 1:
        // System.out.println("one");
        // }
    }

    public static void main(String[] args) {
        numberToString(123);
        System.out.println();
        // 123 - One two three
        // "123"
    }
}
