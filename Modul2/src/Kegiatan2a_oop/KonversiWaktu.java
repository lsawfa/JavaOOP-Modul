package Kegiatan2a_oop;
import java.util.*;
public class KonversiWaktu {
    private int bulan, hari, jam, menit, detik, pilih;
    public void setBulan(int bulan) {
        this.bulan = bulan;
    }
    public int getBulan() {
        return bulan;
    }
    public void setHari(int hari) {
        this.hari = hari;
    }
    public int getHari() {
        return hari;
    }
    public void setJam(int jam) {
        this.jam = jam;
    }
    public int getJam() {
        return jam;
    }
    public void setMenit(int menit) {
        this.menit = menit;
    }
    public int getMenit() {
        return menit;
    }
    public void setDetik(int detik) {
        this.detik = detik;
    }
    public int getDetik() {
        return detik;
    }
    public void konversi(){
        if(pilih==1){
            hari = bulan*28;
        }else if(pilih==2){
            hari = bulan*29;
        }else if(pilih==3){
            hari = bulan*30;
        }else if(pilih==4){
            hari = bulan*31;
        }else{
            System.out.println("Input tidak valid");
        }
        setJam(getHari()*24);
        setMenit(getJam()*60);
        setDetik(getMenit()*60);
    }
    public void tampilkanHasilKonversi(){
        System.out.printf("%d bulan = %d hari\n", getBulan(), getHari());
        System.out.printf("%d bulan = %d jam\n", getHari(), getJam());
        System.out.printf("%d bulan = %d menit\n", getJam(), getMenit());
        System.out.printf("%d bulan = %d detik\n", getMenit(), getDetik());
    }
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        KonversiWaktu konversiwaktuoop = new KonversiWaktu();
        System.out.println("===== PROGRAM KONVERSI WAKTU =====");
        System.out.println("1. Jika 1 bulan = 28 hari, pilih nomor 1");
        System.out.println("2. Jika 1 bulan = 29 hari, pilih nomor 1");
        System.out.println("3. Jika 1 bulan = 30 hari, pilih nomor 1");
        System.out.println("4. Jika 1 bulan = 31 hari, pilih nomor 1");
        System.out.print("Pilih waktu bulan : ");
        konversiwaktuoop.pilih=inputUser.nextInt();
        System.out.print("Masukkan waktu dalam bulan : ");
        konversiwaktuoop.setBulan(inputUser.nextInt());
        konversiwaktuoop.konversi();
        konversiwaktuoop.tampilkanHasilKonversi();
    }
}
