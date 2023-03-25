package Kegiatan2a_terstruktur;
import java.util.*;
public class KonversiWaktu {
    public static void main(String[] args) {
        int bulan, hari=0, jam, menit, detik;
        Scanner inputUser = new Scanner(System.in);
        System.out.println("===== PROGRAM KONVERSI WAKTU =====");
        System.out.println("1. Jika 1 bulan = 28 hari, pilih nomor 1");
        System.out.println("2. Jika 1 bulan = 29 hari, pilih nomor 2");
        System.out.println("3. Jika 1 bulan = 30 hari, pilih nomor 3");
        System.out.println("4. Jika 1 bulan = 31 hari, pilih nomor 4");
        System.out.print("Pilih waktu bulan : ");
        int pilih = inputUser.nextInt();
        System.out.print("Masukkan waktu dalam bulan : ");
        bulan = inputUser.nextInt();
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
        jam = hari*24;
        menit = jam*60;
        detik = menit*60;
        System.out.printf("%d bulan = %d hari\n", bulan, hari);
        System.out.printf("%d bulan = %d jam\n", bulan, jam);
        System.out.printf("%d bulan = %d menit\n", bulan, menit);
        System.out.printf("%d bulan = %d detik\n", bulan, detik);
    }
}