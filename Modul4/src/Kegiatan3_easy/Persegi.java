package Kegiatan3_easy;

public class Persegi implements BangunDatar{
    public int sisi;
    @Override
    public double luas(){
        return sisi*sisi;
    }
    @Override
    public double keliling(){
        return 4.0*sisi;
    }
}
