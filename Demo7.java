import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;

/*
 * String 
 * Predefine Class java.lang.String
 * String is a collection of chars eg. char[]
 * String contains lot of predefine methods
 * String use String Pool
 * String are Immutable
 * String class final class
 * 
 */
//import java.lang.*; // By Default import
public class Demo7 {
    public static void main(String[] args) {
        // Value Type
        int x;
        var y = 20;
        x = 10;
        // Reference Type
        String name = "Amit"; // String Literal (1 or 0) // 1
        String n = "Amit"; // 0
        String f = "Amit";
        f = "Shyam";
        // Memory
        // Runtime.getRuntime().totalMemory();
        // Runtime.getRuntime().freeMemory();
        for (int i = 1; i <= 100000; i++) {
            // String b = new String("Amit");
            String b = "Amit";
        }
        // Memory
        String name2 = new String("Amit");

        // Solution - Mutable String
        // capacity = 16
        // or len + 16
        StringBuffer sb = new StringBuffer(100); // Sync
        // StringBuilder sb = new StringBuilder(); // prefer (Methods are not
        // Synchronized) latest Java 1.5
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        // sb.ensureCapacity(100);
        // len > capacity
        // new cap = old cap * 2 + 2
        // new cap < len
        // newcap = len
        sb.append("Amit");
        sb.append("hgjkdfhjgkgjflkgjklfgjhklfgjhjglkhjlkgjhgjflhjgfjhlkjglhjlgfhjkkgjhfdkghkfjhgkjfh");
        sb.reverse();
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        // Wrapper Classes
        int h = 10; // value (data)
        Integer h2 = 10; // reference (object) = data + methods
        Float hh = 10.20F;
        Double ggg = 90.20;
        Character cc = 'A';
        Byte b5 = 110;
        byte r = h2.byteValue();
        float tt = h2.floatValue();
        String g = h2.toString();
        // xxxValue
        // Java InBuild Data Structure works only on objects
        LinkedList<Integer> l = new LinkedList<>();
        long gp = 100000000000000L; // 8 Byte
        // Big Types
        BigInteger bi = new BigInteger("1000000000000000000000");
        BigInteger bi3 = new BigInteger("6547568678678769789879");
        BigInteger bi4 = bi.add(bi3);
        BigDecimal bi2 = new BigDecimal("6546565465756.43432");
    }
}
