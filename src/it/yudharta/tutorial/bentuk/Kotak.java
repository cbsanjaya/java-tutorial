package it.yudharta.tutorial.bentuk;

public class Kotak {
    private int sisi;

    public Kotak(){
        this.sisi = 4;
    }
    public Kotak(int sisi) {
        this.sisi = sisi;
    }

    public int luas(){
        return sisi * sisi;
    }

    public int luas(int panjang, int lebar) {
        return panjang * lebar;
    }

    public void setSisi(int sisi){
        int tambah = 5;
        this.sisi = sisi * tambah;
    }

    public int getSisi () {
        return this.sisi;
    }

}
