package it.yudharta.tutorial;

import it.yudharta.tutorial.bentuk.Balok;
import it.yudharta.tutorial.bentuk.Bentuk;
import it.yudharta.tutorial.bentuk.PersegiPanjang;

public class _07Pewarisan {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(8,10);
        System.out.println("luas Persegi Panjang 1 : " + pp.luas());

        Balok bl = new Balok(2,3,6);
        System.out.println("Luas Balok 1 :" + bl.luas());

        Bentuk obj = new Balok(9,6,5);
        System.out.println("Luas Balok 2 :" + obj.luas());

        Bentuk obj2 = new PersegiPanjang(8,5);
        System.out.println("luas Persegi Panjang 2 : " + obj2.luas());
        System.out.println(obj2.toString());

    }
}
