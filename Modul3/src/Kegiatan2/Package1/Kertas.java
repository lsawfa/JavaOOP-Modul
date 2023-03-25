package Kegiatan2.Package1;

public class Kertas {
    protected String merek;
    protected double harga;
    protected double panjang;
    protected double lebar;
    public Kertas(String merek, double harga){
        this.harga=harga;
        this.merek=merek;
    }
    public Kertas(String merek){
        this.harga=25000.00;
        this.merek=merek;
    }
    public Kertas(double harga){
        this.harga=harga;
        this.merek="Kiki";
    }
    public Kertas(){
        this.harga=23000.00;
        this.merek="Sinar Dunia";
    }
    public void tampil(){
        System.out.println("Merek kertas adalah "+merek);
        System.out.println("Harga kertas adalah "+harga+" rupiah per 100 lembar");
    }
}