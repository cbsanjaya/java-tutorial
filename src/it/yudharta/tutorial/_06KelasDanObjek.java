package it.yudharta.tutorial;


import it.yudharta.tutorial.bentuk.Kotak;

public class _06KelasDanObjek {
    public static void main(String[] args) {
        PersegiPanjang obj1 = new PersegiPanjang();
        obj1.panjang = 50;
        obj1.lebar = 60;

        int luas = obj1.panjang * obj1.lebar;

        System.out.println("Luas obj1 adalah: " + luas);

        PersegiPanjang obj2 = new PersegiPanjang();
        obj2.panjang = 4;
        obj2.lebar = 5;

        System.out.println("Luas obj2 adalah: " + obj2.panjang * obj2.lebar);
        PersegiPanjang obj3 = new PersegiPanjang();
        obj3.isiData(5,6);

        int hasil = obj3.luas();
        System.out.println("hasil obj3: " + hasil);

        String kembali = obj3.halo("Cahya Bagus Sanjaya");
        System.out.println(kembali);

        Kotak kotak = new Kotak(5);
        kotak.setSisi(5);

        System.out.println("Luas Kotak adalah: " +kotak.luas());

        Kotak kotak1 = new Kotak();
        System.out.println("Luas kotak1 adalah:" + kotak1.luas());

        System.out.println("Panjang x lebar: " + kotak1.luas(9,10));
    }
}

class PersegiPanjang{
    int panjang;
    int lebar;

    String halo(String nama) {
        int hasil = luas();
        return "Halo, Nama saya " + nama + " hasil Perhitungan adalah : " + luas();
    }

    void isiData(int p, int lebar) {
        panjang = p;
        this.lebar = lebar;
    }

    int luas() {
        return this.panjang * this.lebar;
    }


}
