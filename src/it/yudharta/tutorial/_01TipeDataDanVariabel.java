package it.yudharta.tutorial;

public class _01TipeDataDanVariabel {
    public static void main(String[] args) {
        // TIPE BILANGAN BULAT
        byte bt = 123; // -128 sampai 127
        System.out.println("byte: " + Byte.MIN_VALUE + " sampai " + Byte.MAX_VALUE);

        short sr = 123; // -32.768 sampai 32.767
        System.out.println("short: " + Short.MIN_VALUE + " sampai " + Short.MAX_VALUE);

        int in = 123; // - 2.147.483.648 sampai 2.147.483.647
        System.out.println("int: " + Integer.MIN_VALUE + " sampai " + Integer.MAX_VALUE);

        long lg = 123; // -9.223.372.036.854.775.808 sampai 9.223.372.036.854.775.807
        System.out.println("long: " + Long.MIN_VALUE + " sampai " + Long.MAX_VALUE);

        // TIPE BILANGAN RIIL
        float fl = 123; // 1.4E-45 sampai 3.4028235E38
        System.out.println("float: " + Float.MIN_VALUE + " sampai " + Float.MAX_VALUE);

        double db = 123; // 4.9E-324 sampai 1.7976931348623157E308
        System.out.println("double: " + Double.MIN_VALUE + " sampai " + Double.MAX_VALUE);

        char ch1 = 'A', ch2 = 66; // 66 = 'B'
        System.out.println("karakter 1: " + ch1 + " dan karakter 2: " + ch2);

        boolean a = true, b = false;
        System.out.println("variabel A: " + a + " dan varibel B: " + b);
    }
}
