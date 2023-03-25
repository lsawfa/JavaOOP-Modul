package Kegiatan1;

import Kegiatan1.dinasPertanahan;

import java.util.*;

public class Main {
    static Kegiatan1.dinasPertanahan objek = new dinasPertanahan();
    static Scanner inputUser = new Scanner(System.in);
    static Scanner inputUser1 = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        String lanjut="yes";
        System.out.println("===== PROGRAM DINAS PERTANAHAN =====");
        do {
            System.out.println("\n----- INPUT -----");
            System.out.println("1. Alamat");
            System.out.println("2. Panjang Tanah");
            System.out.println("3. Luas Tanah");
            System.out.printf("Pilih menu nomor data yang akan diinputkan : ");
            int submenu = inputUser.nextInt();
            if(submenu==1) {
                System.out.print("Alamat\t: ");
                try {
                    objek.setAlamat(inputUser1.nextLine());
                    System.out.println("----- OUTPUT -----");
                    System.out.println("Alamat yang diinputkan : "+objek.getAlamat());
                }catch (IndexOutOfBoundsException e){
                    System.out.println("Message : "+e);
                }
                catch (Exception e){
                    System.out.println("Message : "+e);
                }finally {
                    try {
                        System.out.print("\nLanjut ? (Yes or No) : ");
                        lanjut = inputUser.nextLine();
                    }catch (Exception e){
                        continue;
                    }
                }
            }else if(submenu==2){
                System.out.print("Panjang Tanah\t: ");
                try {
                    objek.setPanjangTanah(inputUser.nextInt());
                    System.out.println("----- OUTPUT -----");
                    System.out.println("Panjang tanah yang diinputkan : "+objek.getPanjangTanah());
                }catch (IndexOutOfBoundsException e){
                    System.out.println("Message : "+e);
                }catch (Exception e){
                    System.out.println("Message : "+e);
                }finally {
                    try {
                        System.out.print("\nLanjut ? (Yes or No) : ");
                        lanjut = inputUser.nextLine();
                    }catch (Exception e){
                        continue;
                    }
                }
            }else if (submenu==3){
                System.out.print("Luas Tanah\t: ");
                try {
                    objek.setLuasTanah(inputUser.nextInt());
                    System.out.println("----- OUTPUT -----");
                    System.out.println("Luas tanah yang diinputkan : "+objek.getLuasTanah());
                }catch (Exception e){
                    System.out.println("Message : "+e);
                }finally {
                    try {
                        System.out.print("\nLanjut ? (Yes or No) : ");
                        lanjut = inputUser.nextLine();
                    }catch (Exception e){
                        continue;
                    }
                }
            }else {
                System.out.println("Menu invalid");
            }
            while (true){
                System.out.print("Yakin ? Lanjut? (Yes or No) : ");
                lanjut = inputUser.nextLine();
                System.out.println();
                if(lanjut.compareTo("YES")==0||lanjut.compareTo("Yes")==0||lanjut.compareTo("yes")==0||lanjut.compareTo("NO")==0||lanjut.compareTo("No")==0||lanjut.compareTo("no")==0){
                    break;
                }else {
                    try {
                        throw new Exception("Input harus yes or no");
                    }catch (Exception e){
                        System.out.println(e);
                    }
                }
            }
        }while (lanjut.compareTo("YES")==0||lanjut.compareTo("Yes")==0||lanjut.compareTo("yes")==0);
    }
}