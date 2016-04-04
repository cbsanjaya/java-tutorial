package it.yudharta.tutorial;

/**
 * Created by cahya on 04/04/2016.
 */
public class _05StatemenPengulangan {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println("java...");
        }

        if ("aku".equals("aku")) {
            return;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("*****");
        }

        int nomer = 0;
        while (nomer < 0) {
            System.out.println("xxxxx");
            nomer++;
        }

        int abc = 0;
        do {
            System.out.println("vvvvv");
            abc++;
        } while (abc < 0);

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
