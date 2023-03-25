package Kegiatan1;

public class Kerucut extends BangunRuang{
    public double lp_kerucut;
    public double v_kerucut;
    public double r_kerucut, sisimiring, t_kerucut;

    public void hitungLuasPermukaan(double r_kerucut, double t_kerucut){
        this.r_kerucut = r_kerucut;
        this.t_kerucut = t_kerucut;
        this.lp_kerucut = (super.PHI*Math.pow(r_kerucut, 2.0))+(super.PHI*r_kerucut*sisimiring);
    }
    public void hitungVolume(double r_kerucut, double sisimiring){
        this.r_kerucut = r_kerucut;
        this.sisimiring = sisimiring;
        this.v_kerucut = (super.PHI*Math.pow(r_kerucut, 2.0)*t_kerucut)/3.0;
    }
    public double getLuasPermukaan(){
        return lp_kerucut;
    }
    public double getVolume(){
        return v_kerucut;
    }
}
