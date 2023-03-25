package Kegiatan3_hard;

public class Tank extends Hero{
    public void spawnIntro(){
        System.out.println("Kill me if u can !!");
    }
    public void checkStatus(){
        super.lifeStatus=true;
        super.healthPoint = 7000.0;
        super.defense = 500.0;
        super.attackDamage = 500.0;
    }
    public Tank(int level){
        checkStatus();
        super.healthPoint += 200.0*level;
        super.defense += 15.0*level;
        super.attackDamage += 20.0*level;
    }
}
