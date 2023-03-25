package Kegiatan1b;

import java.util.Scanner;

public class Main {
    public static void tampilMenu(){
        System.out.println("=== PROGRAM MENCARI INFORMASI ALAT TULIS ===");
        System.out.println("1. Buku tulis");
        System.out.println("2. Pensil");
        System.out.println("3. Penggaris");
    }
    public static void pilihMenu(){
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Pilih menu : ");
        int menu= inputUser.nextInt();
        if(menu==1){
            System.out.println("--- Menu Buku Tulis ---");
            BukuTulis menu1 = new BukuTulis();
            menu1.data("Vision", 20000, 38);
            menu1.tampil();
        }else if(menu==2){
            System.out.println("--- Menu Pensil ---");
            Pensil menu2 = new Pensil();
            menu2.data("Faber Castel", 5000, "2B");
            menu2.tampil();
        }else if(menu==3){
            System.out.println("--- Menu Penggaris ---");
            Penggaris menu3 = new Penggaris();
            menu3.data("Faber Castel", 6000, 30);
            menu3.tampil();
        }else {
            System.out.println("Menu invalid");
        }
    }
    public static void main(String[] args) {
        tampilMenu();
        pilihMenu();
    }
}