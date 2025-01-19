public class Demo {

    // can we have more than one main in java single class
    public static void main() {
        System.out.println("My Main...");
    }

    public static void main(int x) {
        System.out.println("My Main of int ...");
    }

    // can we change signature of main
    static public void main(String... a) {
        // main();
        // main(10);
        System.out.println("Hello Java"); // print in new line
        System.out.print("Hello"); // print in same line
    }
}
