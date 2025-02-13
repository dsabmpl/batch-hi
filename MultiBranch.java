public class MultiBranch {

    static void multiBranch(int num) {
        if (num <= 0) {
            return;
        }
        System.out.println(num);
        multiBranch(num - 1);
        multiBranch(num - 2);
    }

    static void singleBranch(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        singleBranch(num - 1);
    }

    public static void main(String[] args) {
        singleBranch(3);
        multiBranch(3);
    }
}
