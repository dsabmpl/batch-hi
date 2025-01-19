public class Demo5 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();
        // String Literal
        String name = "Amit".intern();
        String name2 = "Amit";
        String name6 = "Amit";
        name2 = "Shyam";
        name2 = "Amit";
        System.out.println(name2);
        System.out.println(name);
        String name3 = new String("Amit");
        System.out.println(name == name2);
        System.out.println(name == name3);
        String name4 = new String("Ram").intern();
        String name5 = "Ram";
        System.out.println(name4 == name5);

    }
}
