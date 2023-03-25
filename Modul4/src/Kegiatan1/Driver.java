package Kegiatan1;
import java.util.*;
public class Driver {
    public void menu(){
        Scanner inputUser = new Scanner(System.in);
        System.out.println("PROGRAM MENCARI LUAS PERMUKAAN DAN VOLUME");
        System.out.println("MENU");
        System.out.println("1. Kerucut");
        System.out.println("2. Bola");
        System.out.print("Pilih menu : ");
        int menu = inputUser.nextInt();
        if(menu==1){
            Kerucut inikerucut = new Kerucut();
            System.out.print("Masukkan jari jari kerucut : ");
            inikerucut.r_kerucut=inputUser.nextDouble();
            System.out.print("Masukkan tinggi kerucut : ");
            inikerucut.t_kerucut=inputUser.nextDouble();
            System.out.print("Masukkan sisi miring kerucut : ");
            inikerucut.sisimiring=inputUser.nextDouble();
            inikerucut.hitungLuasPermukaan(inikerucut.r_kerucut, inikerucut.t_kerucut);
            inikerucut.hitungVolume(inikerucut.r_kerucut, inikerucut.sisimiring);
            System.out.printf("Luas permukaan kerucut : %.3f\n", inikerucut.getLuasPermukaan());
            System.out.printf("Volume kerucut : %.3f\n\n", inikerucut.getVolume());
        }else if(menu==2){
            Bola inibola = new Bola();
            System.out.print("Masukkan jari jari bola : ");
            inibola.r_bola=inputUser.nextDouble();
            inibola.hitungLuasPermukaan(inibola.r_bola);
            inibola.hitungVolume(inibola.r_bola);
            System.out.printf("Luas permukaan bola : %.3f\n", inibola.getLuasPermukaan());
            System.out.printf("Volume bola : %.3f\n", inibola.getVolume());
        }else{
            System.out.println("Menu invalid");
        }
    }
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.menu();

    }
}
