public class Fact {
    // 5 * 4 * 3 * 2 * 1 = 120
    static int fact(int num) {
        // Base case
        if (num == 1) {
            return num;
        }
        // Small Problem
        int r = fact(num - 1);
        return r * num;
    }

    static void fact(int num, int result) {
        // Base case
        if (num == 1) {
            System.out.println(result);
            return;
        }
        // Small Problem
        fact(num - 1, result * num);
    }

    public static void main(String[] args) {
        fact(5, 1);
    }
}
