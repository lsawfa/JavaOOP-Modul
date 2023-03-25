package Kegiatan2b_oop;
import java.util.*;
public class BelahKetupat {
    private float d1, d2, s, luas, keliling;
    public void setd1(float d1){
        this.d1=d1;
    }
    public float getd1(){
        return d1;
    }
    public void setd2(float d2){
        this.d2=d2;
    }
    public float getd2(){
        return d2;
    }
    public void inputDiagonal(){
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan diagonal 1 : ");
        setd1(inputUser.nextFloat());
        System.out.print("Masukkan diagonal 2 : ");
        setd2(inputUser.nextFloat());
    }
    public float hitungLuas(float d1, float d2){
        luas = (d1*d2)/2;
        return luas;
    }
    public void sets(float s){
        this.s=s;
    }
    public float gets(){
        return s;
    }
    public void inputSisi(){
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan sisi : ");
        sets(inputUser.nextFloat());
    }
    public float hitungKeliling(float s){
        keliling = 4 * s;
        return keliling;
    }
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("===== PROGRAM MENCARI LUAS DAN KELILING BELAH KETUPAT =====");
        System.out.println("\n--- Menu ---");
        System.out.println("1. Luas belah ketupat");
        System.out.println("2. Keliling belah ketupat");
        System.out.print("Pilih menu : ");
        int menu = inputUser.nextInt();
        if(menu==1){
            BelahKetupat luasbk = new BelahKetupat();
            System.out.println("\n--- Luas Belah Ketupat ---");
            luasbk.inputDiagonal();
            System.out.println("Luas : "+luasbk.hitungLuas(luasbk.getd1(), luasbk.getd2()));
        }else if(menu==2){
            BelahKetupat kelilingbk = new BelahKetupat();
            System.out.println("\n--- Keliling Belah Ketupat ---");
            kelilingbk.inputSisi();
            System.out.println("Keliling : "+kelilingbk.hitungKeliling(kelilingbk.gets()));
        }else{
            System.out.println("Input menu tidak valid");
        }
    }
}