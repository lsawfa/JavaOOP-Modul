package Kegiatan1b;

public class BukuTulis extends AlatTulis{
    private int isi;
    public void data(String merek, double harga, int isi){
        super.merek=merek;
        super.harga=harga;
        this.isi=isi;
    }
    public void tampil(){
        System.out.println("Informasi Buku Tulis");
        System.out.println("1. Merek : "+merek);
        System.out.println("2. Harga : "+harga+" rupiah");
        System.out.println("3. Isi : "+isi+" lembar");
    }
}
