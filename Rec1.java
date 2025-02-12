public class Rec1 {

    static void show(int num) {
        // Base case or Termination Case
        if (num == 5) {
            return; // exit from the current function call
        }
        System.out.println("Amit " + num); // Pre Logic
        // Small Problem
        show(num + 1); // Repeat
        // Post Logic
        System.out.println("Srivastava " + num);
    }

    public static void main(String[] args) {
        show(0);
    }
}
