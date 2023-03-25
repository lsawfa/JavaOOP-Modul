package Kegiatan3_easy;

public class Lingkaran implements BangunDatar{
    public int jarijari;
    @Override
    public double luas(){
        return PHI*jarijari*jarijari;
    }
    @Override
    public double keliling(){
        return PHI*2.0*jarijari;
    }
}
