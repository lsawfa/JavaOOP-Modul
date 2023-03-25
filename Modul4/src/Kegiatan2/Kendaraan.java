package Kegiatan2;

public class Kendaraan {
    private String jenis, merek, warna;
    public Kendaraan(String jenis, String merek, String warna){
        this.jenis = jenis;
        this.merek = merek;
        this.warna = warna;
    }
    public String getJenis(){
        return jenis;
    }
    public String getMerek(){
        return merek;
    }
    public String getWarna(){
        return warna;
    }
}
