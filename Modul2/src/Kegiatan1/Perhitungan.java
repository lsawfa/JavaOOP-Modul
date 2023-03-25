package Kegiatan1;
import java.util.*;
public class Perhitungan {
    private int NilaiProgdas;
    private int NilaiKalkulus;
    private int NilaiOrkom;
    private double Hasil;

    public void setNilaiProgdas(int NilaiProgdas){
        this.NilaiProgdas=NilaiProgdas;
    }
    public int getNilaiProgdas(){
        return NilaiProgdas;
    }
    public void setNilaiKalkulus(int NilaiKalkulus){
        this.NilaiKalkulus=NilaiKalkulus;
    }
    public int getNilaiKalkulus(){
        return NilaiKalkulus;
    }
    public void setNilaiOrkom(int NilaiOrkom){
        this.NilaiOrkom=NilaiOrkom;
    }
    public int getNilaiOrkom(){
        return NilaiOrkom;
    }
    public double hitungRata(int NilaiProgdas, int NilaiKalkulus, int NilaiOrkom){
        Hasil = (NilaiProgdas+NilaiKalkulus+NilaiOrkom)/3.0;
        return Hasil;
    }
    public void cekNilai(double Hasil){
        if(Hasil >= 70.0){
            System.out.println("Status : LULUS");
        }else {
            System.out.println("Status : TIDAK LULUS");
        }
    }
    public static void main(String[] args) {
        Perhitungan perhitunganratarata = new Perhitungan();
        Scanner userInput = new Scanner(System.in);
        //Input
        System.out.print("Nilai Progdas : ");
        perhitunganratarata.setNilaiProgdas(userInput.nextInt());
        System.out.print("Nilai Kalkulus : ");
        perhitunganratarata.setNilaiKalkulus(userInput.nextInt());
        System.out.print("Nilai Orkom : ");
        perhitunganratarata.setNilaiOrkom(userInput.nextInt());
        //tampil
        System.out.println("\nNilai Anda : ");
        System.out.println("Nilai Progdas : "+perhitunganratarata.getNilaiProgdas());
        System.out.println("Nilai Kalkulus : "+perhitunganratarata.getNilaiKalkulus());
        System.out.println("Nilai Orkom : "+perhitunganratarata.getNilaiOrkom());

        double rata = perhitunganratarata.hitungRata(perhitunganratarata.getNilaiProgdas(), perhitunganratarata.getNilaiKalkulus(), perhitunganratarata.getNilaiOrkom());
        System.out.printf("\nRata-Rata : %.3f\n", rata);
        perhitunganratarata.cekNilai(rata);
    }
}