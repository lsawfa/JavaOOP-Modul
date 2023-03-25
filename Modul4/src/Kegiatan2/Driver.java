package Kegiatan2;

public class Driver {
    public static void main(String[] args) {
        Kendaraan o_kendaraan = new Kendaraan("Mobil", "Fortuner", "Hitam");
        Sopir o_sopir = new Sopir("Grab", "Budi", o_kendaraan);
        System.out.println("PROGRAM DATA DRIVER OJEK OLINE");
        System.out.println("Perusahaan : "+o_sopir.getPerusahaan());
        System.out.println("Nama sopir : "+o_sopir.getNama());
        System.out.println("Jenis kendaraan : "+o_sopir.getKendaraan().getJenis());
        System.out.println("Merk Kendaraan : "+o_sopir.getKendaraan().getMerek());
        System.out.println("Warna kendaraan: "+ o_sopir.getKendaraan().getWarna());
    }
}
