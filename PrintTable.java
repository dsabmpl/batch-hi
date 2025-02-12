public class PrintTable {
    static String printTable(int num, int count) {
        // Base case
        if (count == 0) {
            return "";
        }
        String r = printTable(num, count - 1);
        String exp = num + "*" + count + "=" + (num * count);
        return r + exp + "\n";
    }

    public static void main(String[] args) {
        String r = printTable(5, 10);
        System.out.println(r);
        // String name = "Amit";
        // name[0]='R';
    }
}
