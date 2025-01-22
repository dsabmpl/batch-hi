public class LogicBuild {
    // loops, if else , switchcase
    public static void main(String[] args) {
        // operators
        // + - * / %
        // > < >= <= == != (true, false)
        // byte a = 10;
        // byte b = 20;
        // byte c = (byte)(a + b);
        // += /= -=*/
        // && , || !
        // Conditional Statements
        // 1. if else 2. SwitchCase
        // Simple if else
        // if(true){

        // }
        // else{

        // }
        // multiple if else
        // nested if else
        // Three number Greater nested if
        int a = 10;
        int b = 20;
        int c = 30;
        if (a > b) {
            if (a > c) {
                System.out.println("A is Greater");
            } else {
                System.out.println("C is Greater");
            }
        } else {
            if (b > c) {
                System.out.println("B is Greater");
            } else {
                System.out.println("C is Greater");
            }
        }

    }
}
