package Kegiatan1b;

public class Penggaris extends AlatTulis{
    private int panjang;
    public void data(String merek, double harga, int panjang){
        super.merek=merek;
        super.harga=harga;
        this.panjang=panjang;
    }
    public void tampil(){
        System.out.println("Informasi Buku Tulis");
        System.out.println("1. Merek : "+merek);
        System.out.println("2. Harga : "+harga+" rupiah");
        System.out.println("3. Panjang : "+panjang+" cm");
    }
}
