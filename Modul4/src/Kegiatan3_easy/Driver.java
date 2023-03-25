package Kegiatan3_easy;
import java.util.*;
public class Driver {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        Tabung tabung = new Tabung();
        Persegi persegi = new Persegi();
        Limas limas = new Limas();
        System.out.println("=====\tPROGRAM MENGHITUNG LUAS KELILING DAN VOLUME\t=====");
        System.out.println("1. Luas dan Keliling Lingkaran\t|| Volume Tabung");
        System.out.println("2. Luas dan Keliling Persegi\t|| Volume Limas");
        System.out.print("Pilih menu : ");
        Scanner userInput = new Scanner(System.in);
        int pilih = userInput.nextInt();
        if(pilih==1){
            System.out.printf("Masukkan jari-jari lingkaran : ");
            lingkaran.jarijari = userInput.nextInt();
            tabung.jarijari=lingkaran.jarijari;
            System.out.print("Masukkan tinggi tabung : ");
            tabung.tinggi = userInput.nextInt();
            System.out.println("Luas Lingkaran : "+lingkaran.luas());
            System.out.println("Keliling Lingkaran : "+lingkaran.keliling());
            System.out.println("Volume Tabung : "+tabung.getVolume());
        }else if(pilih==2){
            System.out.printf("Masukkan sisi persegi : ");
            persegi.sisi = userInput.nextInt();
            limas.sisi = persegi.sisi;
            System.out.printf("Masukkan tinggi limas : ");
            limas.tinggi = userInput.nextInt();
            System.out.println("Luas Persegi : "+persegi.luas());
            System.out.println("Keliling Persegi : "+persegi.keliling());
            System.out.println("Volume Limas : "+limas.getVolume());
        }else {
            System.out.println("Input invalid");
        }
    }
}
