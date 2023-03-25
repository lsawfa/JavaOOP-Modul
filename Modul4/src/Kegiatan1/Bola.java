package Kegiatan1;

public class Bola extends BangunRuang{
    public double lp_bola;
    public double v_bola;
    public double r_bola;

    public void hitungLuasPermukaan(double r_bola){
        this.r_bola = r_bola;
        this.lp_bola = 4.0*super.PHI*Math.pow(r_bola, 2.0);
    }
    public void hitungVolume(double r_bola){
        this.r_bola = r_bola;
        this.v_bola=(4.0/3.0)*(super.PHI*Math.pow(r_bola, 2.0));
    }
    public double getLuasPermukaan(){
        return lp_bola;
    }
    public double getVolume(){
        return v_bola;
    }
}
