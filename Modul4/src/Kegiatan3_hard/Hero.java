package Kegiatan3_hard;

abstract public class Hero {
    public double healthPoint, attackDamage, defense;
    public int level;
    public boolean lifeStatus;

    public void attack(Hero target){}
    public void reviewDamage(double damage, double defense, double healthPoint){
        double realDamage = damage - defense;
        this.healthPoint = healthPoint - realDamage;
        if (healthPoint>0){
            lifeStatus=true;
        }else {
            lifeStatus=false;
        }
    }
    abstract public void spawnIntro();
    public void checkStatus(double healthPoint, double defense, double attackDamage){
        this.healthPoint = healthPoint;
        this.defense = defense;
        this.attackDamage = attackDamage;
        if (healthPoint<=0){
            lifeStatus=false;
        }
    }
}
