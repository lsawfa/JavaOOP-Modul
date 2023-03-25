package Kegiatan2.Package1;
import Kegiatan2.Package2.Folio;
public class Drive{
    public static void main(String[] args) {
        System.out.println("=== PROGRAM INFORMASI JENIS KERTAS ===");
        Folio folio = new Folio("Vision", 24000.00);
        Folio folio1 = new Folio("Big Bos");
        Folio folio2 = new Folio(22000.00);
        Folio folio3 = new Folio();
        folio.tampil();
        folio1.tampil();
        folio2.tampil();
        folio3.tampil();
    }
}
