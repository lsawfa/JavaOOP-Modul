package Kegiatan2;
import java.io.*;
import java.util.Scanner;

public class Main {
    static dinasPertanahan objek = new dinasPertanahan();
    static Scanner inputUser = new Scanner(System.in);
    static Scanner inputUser1 = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        FileWriter fileAlamat = new FileWriter("C:\\Java\\Modul5\\src\\Kegiatan2\\Alamat.txt");
        FileWriter filePanjangTanah = new FileWriter("C:\\Java\\Modul5\\src\\Kegiatan2\\PanjangTanah.txt");
        FileWriter fileLuasTanah = new FileWriter("C:\\Java\\Modul5\\src\\Kegiatan2\\LuasTanah.txt");
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
                    fileAlamat.write(objek.getAlamat()+"\n");
                    System.out.println("----- OUTPUT -----");
                    System.out.println("Alamat yang diinputkan : "+objek.getAlamat());
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
            }else if(submenu==2){
                System.out.print("Panjang Tanah\t: ");
                try {
                    objek.setPanjangTanah(inputUser.nextInt());
                    filePanjangTanah.write(objek.getPanjangTanah()+"\n");
                    System.out.println("----- OUTPUT -----");
                    System.out.println("Panjang tanah yang diinputkan : "+objek.getPanjangTanah());
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
                    fileLuasTanah.write(objek.getLuasTanah()+"\n");
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
        fileAlamat.close();
        filePanjangTanah.close();
        fileLuasTanah.close();
        try {
            File myaalamat = new File("C:\\Java\\Modul5\\src\\Kegiatan2\\Alamat.txt");
            Scanner readerFile = new Scanner(myaalamat);
            System.out.println("Data yang telah diinputkan pada file Alamat : ");
            while(readerFile.hasNextLine()){
                String data = readerFile.nextLine();
                System.out.println("\t"+data);
            }
        }catch (IOException e){
            System.out.println("Message : "+e);
        }
        try {
            File mypanjangtanah = new File("C:\\Java\\Modul5\\src\\Kegiatan2\\PanjangTanah.txt");
            Scanner readerFile = new Scanner(mypanjangtanah);
            System.out.println("Data yang telah diinputkan pada file Panjang Tanah : ");
            while(readerFile.hasNextLine()){
                String data = readerFile.nextLine();
                System.out.println("\t"+data);
            }
        }catch (IOException e){
            System.out.println("Message : "+e);
        }
        try {
            File myluastanah = new File("C:\\Java\\Modul5\\src\\Kegiatan2\\LuasTanah.txt");
            Scanner readerFile = new Scanner(myluastanah);
            System.out.println("Data yang telah diinputkan pada file Luas Tanah : ");
            while(readerFile.hasNextLine()){
                String data = readerFile.nextLine();
                System.out.println("\t"+data);
            }
        }catch (IOException e){
            System.out.println("Message : "+e);
        }
    }
}