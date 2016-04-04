package it.yudharta.tutorial;

public class _04StatemenIf {
    public static void main(String[] args) {
        int b = 5;

        /**
         * statemen if untuk satu kondisi....
         */
        if (b > 6) {
            System.out.println("statemen ini tidak akan di eksekusi...");
        }

        if (b < 6) {
            System.out.println("nilai b kurang dari 6....");
        }

        /**
         * statemen if untuk dua kondisi...
         */

        int a = -3;

        if (a < 0) {
            System.out.println(a + " Bernilai Negatif...");
        } else {
            System.out.println(a + " Bernilai Positif...");
        }

        /**
         * statement if tiga kondisi atau lebih...
         */

        int c = 0;
        if (c < 0) {
            System.out.println(c + " Bernilai Negatif.");
        } else if (c > 0) {
            System.out.println(c + " Bernilai Positif.");
        } else {
            System.out.println(c + " Adalah Nol...");
        }

        /**
         * statemen switch...
         */

        int nomer = 7;

        switch (nomer) {
            case 1 :
                System.out.println("Nomer Satu."); break;
            case 2 :
                System.out.println("Nomer Dua."); break;
            case 3 :
                System.out.println("Nomer Tiga."); break;
            case 4 :
                System.out.println("Nomer Empat."); break;
            case 5 :
                System.out.println("Nomer Lima."); break;
            case 6 :
                System.out.println("Nomer Enam."); break;
            case 7 :
                System.out.println("Nomer Tujuh."); break;
            case 8 :
                System.out.println("Nomer Delapan."); break;
            case 9 :
                System.out.println("Nomer Sembilan."); break;
            default:
                System.out.println("Nomer Tidak dikenali.");
        }

        switch ("aku"){
            case "kamu" :
                System.out.println("gak cocok..."); break;
            case "aku" :
                System.out.println("cocok...."); break;
        }

    }
}
