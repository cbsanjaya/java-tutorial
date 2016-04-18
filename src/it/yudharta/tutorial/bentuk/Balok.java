package it.yudharta.tutorial.bentuk;


public class Balok extends Bentuk{
    public int tinggi = 0;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int luas(){
        return this.panjang * this.lebar * this.tinggi;
    }

    public int luas(int tinggi){
        return this.panjang * this.lebar * tinggi;
    }

}
