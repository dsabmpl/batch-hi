public class CountEvenOdd {
    // int[]
    // [0] = evenCount
    // [1] = oddCount
    static int[] countEvenOdd(int range) {
        // Base case
        if (range == 0) {
            int result[] = new int[2];
            return result;
        }
        int r[] = countEvenOdd(range - 1);
        if (range % 2 == 0) {
            r[0]++;
        } else {
            r[1]++;
        }
        return r;
    }

    public static void main(String[] args) {
        int r[] = countEvenOdd(5);
        System.out.println("Even " + r[0]);
        System.out.println("Odd " + r[1]);
    }
}
