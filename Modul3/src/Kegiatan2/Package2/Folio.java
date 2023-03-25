package Kegiatan2.Package2;

import Kegiatan2.Package1.Kertas;

public class Folio extends Kertas {
    private int jumlahgaris;
    public Folio(String merek, double harga){
        super("Vision", 24000.00);
    }
    public Folio(String merek){
        super("Big Boss");
    }
    public Folio(double harga){
        super(22000.00);
    }
    public Folio(){
        super();
    }
    public void data(){
        this.jumlahgaris=30;
        super.panjang = 34.3;
        super.lebar = 21.6;
    }
    public void tampil(){
        data();
        super.tampil();
        System.out.println("Jumlah garis adalah "+jumlahgaris);
        System.out.println("Panjang kertas adalah "+panjang+" cm");
        System.out.println("Lebar kertas adalah "+lebar+" cm\n");
    }
}