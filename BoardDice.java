public class BoardDice {

    static void boardDice(int start, int end, String result) {
        if (start == end) {
            System.out.print(result + ",");
            return;
        }
        if (start > end) {
            return;
        }
        for (int dice = 1; dice <= 6; dice++) {
            boardDice(start + dice, end, result + dice);
        }
        // boardDice(start + 1, end, result + "1");
        // boardDice(start + 2, end, result + "2");
        // boardDice(start + 3, end, result + "3");
        // boardDice(start + 4, end, result + "4");
        // boardDice(start + 5, end, result + "5");
        // boardDice(start + 6, end, result + "6");
    }

    public static void main(String[] args) {
        boardDice(0, 10, "");
    }
}
