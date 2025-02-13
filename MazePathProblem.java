public class MazePathProblem {
    static void mazePath(int startRow, int startCol,
            int endRow, int endCol, String paths) {
        if (startRow == endRow && startCol == endCol) {
            System.out.println(paths);
            return;
        }
        if (startCol > endCol || startRow > endRow) {
            return;
        }
        mazePath(startRow, startCol + 1, endRow,
                endCol, paths + "R");
        mazePath(startRow + 1, startCol, endRow,
                endCol, paths + "D");
    }

    public static void main(String[] args) {
        mazePath(0, 0, 2,
                2, "");
    }
}
