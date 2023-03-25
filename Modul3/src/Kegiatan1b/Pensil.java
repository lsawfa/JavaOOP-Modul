package Kegiatan1b;

public class Pensil extends AlatTulis{
    private String jenis;
    public void data(String merek, double harga, String jenis){
        super.merek=merek;
        super.harga=harga;
        this.jenis=jenis;
    }
    public void tampil(){
        System.out.println("Informasi Pensil");
        System.out.println("1. Merek : "+merek);
        System.out.println("2. Harga : "+harga+" rupiah");
        System.out.println("3. Jenis : "+jenis);
    }
}
