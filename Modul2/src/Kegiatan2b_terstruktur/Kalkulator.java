package Kegiatan2b_terstruktur;
import java.util.*;
public class Kalkulator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        float diagonal1, diagonal2, sisi, luas, keliling;
        int inputMenu;
        System.out.println("\n===PROGRAM KALKULATOR LUAS DAN KELILING BELAH KETUPAT===");
        System.out.println("\nMenu");
        System.out.println("1. Luas Belah Ketupat");
        System.out.println("2. Keliling Belah Ketupat");
        System.out.print("Pilih menu : ");
        inputMenu = userInput.nextInt();

        if(inputMenu==1){
            System.out.println("\nLuas Belah Ketupat");
            System.out.print("Masukkan diagonal 1 : ");
            diagonal1 = userInput.nextFloat();
            System.out.print("Masukkan diagonal 2 : ");
            diagonal2 = userInput.nextFloat();
            luas = (diagonal1*diagonal2)/2;
            System.out.println("Luas : "+luas);
        }else if(inputMenu==2){
            System.out.println("\nKeliling Belah Ketupat");
            System.out.print("Masukkan sisi : ");
            sisi = userInput.nextFloat();
            keliling = 4*sisi;
            System.out.println("Keliling : "+keliling);
        }else{
            System.out.println("Input menu tidak valid");
        }
    }
}