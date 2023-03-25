package Kegiatan2;

public class Sopir {
    private String perusahaan, nama;
    private Kendaraan kendaraan;
    public Sopir(String perusahaan, String nama, Kendaraan kendaraan){
        this.perusahaan = perusahaan;
        this.nama = nama;
        this.kendaraan = kendaraan;
    }
    public void setPerusahaan(String perusahaan){
        this.perusahaan = perusahaan;
    }
    public String getPerusahaan(){
        return perusahaan;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public Kendaraan getKendaraan(){
        return kendaraan;
    }
}
