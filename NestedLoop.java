public class NestedLoop {
    public static void main(String[] args) {
        // Labeled Loop
        outer: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == j) {
                    // break outer;
                    continue outer;
                    // return; // exit from the function
                    // continue; // skip from the current iteration
                    // break; // exit from the current loop
                }
                System.out.println("I is " + i + " J is " + j);
            }
        }
    }
}
