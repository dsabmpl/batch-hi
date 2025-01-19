public strictfp class Demo3 {
    public static strictfp void main(String[] args) {
        // store age
        // Non Decimal Value
        byte age = 20; // 1 byte
        short r = 30000; // 2 byte
        int r2 = 99999; // 4 byte
        long r3 = 2435435456L; // 8 Byte (64 Bit) // long literal
        long r4 = 65675224543l;
        var r5 = 1000L;

        // IEEE- 754 Floating Point Standard

        // Decimal Value
        float t = 90.20f; // 4 byte (float literal)
        double t2 = 100.20; // 8 byte

        boolean att = true; // 1 or 2 byte

        char c = 'न'; // 2 byte (UNICODE chars)
        System.out.println(c);

        // int a = 10;
        // System.out.println(a);
        // System.out.println(a + 10);
        // a = a + 10;
        // System.out.println(a);
    }
}
