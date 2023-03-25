package Kegiatan3_hard;

public class Assassin extends Hero implements CriticalDamage{
    public void spawnIntro(){
        System.out.println("Unseen and unheard");
    }
    public void checkStatus(){
        super.lifeStatus = true;
        super.healthPoint = 3000.0;
        super.defense = 300.0;
        super.attackDamage = 800.0;
    }
    public Assassin(int level){
        checkStatus();
        super.attackDamage += super.attackDamage*bonusDamage;

        super.healthPoint += 90.0*level;
        super.defense += 15.0*level;
        super.attackDamage += 30.0*level;
    }
}
