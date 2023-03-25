package Kegiatan3_hard;

public class Mage extends Hero implements MagicalDamage{
    public void spawnIntro(){
        System.out.println("Behold the power of my magic");
    }
    public void checkStatus(){
        super.lifeStatus=true;
        super.healthPoint = 2500.0;
        super.defense = 200.0;
        super.attackDamage = 700.0;
    }
    public Mage(int level){
        checkStatus();
        super.attackDamage += super.attackDamage*magicDamageBonus;

        super.healthPoint += 85.0*level;
        super.defense += 10.0*level;
        super.attackDamage += 35.0*level;
    }
}
