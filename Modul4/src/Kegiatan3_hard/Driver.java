package Kegiatan3_hard;
import java.util.*;
public class Driver {
    public int l1, l2;
    public double h1, d1, a1, h2, d2, a2;
    public String hero1, hero2;
    public void player1(){
        System.out.println("===Player 1===");
        Scanner inputUser = new Scanner(System.in);
        Assassin assassin = new Assassin(0);
        Tank tank = new Tank(0);
        Mage mage = new Mage(0);
        System.out.print("Hero : ");
        this.hero1 = inputUser.nextLine();
        if(hero1.compareTo("Assassin")==0){
            System.out.print("Level : ");
            assassin.level=inputUser.nextInt();
            assassin = new Assassin(assassin.level);
            System.out.println("Attack damage : "+assassin.attackDamage);
            System.out.println("Health poin : "+assassin.healthPoint);
            System.out.println("Life status : "+assassin.lifeStatus);
            System.out.println("Defense : "+assassin.defense);
            assassin.checkStatus(assassin.healthPoint, assassin.defense, assassin.attackDamage);
            a1=assassin.attackDamage; h1=assassin.healthPoint; d1=assassin.defense; l1=assassin.level;
        }else if(hero1.compareTo("Tank")==0){
            System.out.print("Level : ");
            tank.level=inputUser.nextInt();
            tank = new Tank(tank.level);
            System.out.println("Attack damage : "+tank.attackDamage);
            System.out.println("Health poin : "+tank.healthPoint);
            System.out.println("Life status : "+tank.lifeStatus);
            System.out.println("Defense : "+tank.defense);
            tank.checkStatus(tank.healthPoint, tank.defense, tank.attackDamage);
            a1=tank.attackDamage; h1=tank.healthPoint; d1=tank.defense; l1=tank.level;
        }else if(hero1.compareTo("Mage")==0){
            System.out.print("Level : ");
            mage.level=inputUser.nextInt();
            mage = new Mage(mage.level);
            System.out.println("Attack damage : "+mage.attackDamage);
            System.out.println("Health poin : "+mage.healthPoint);
            System.out.println("Life status : "+mage.lifeStatus);
            System.out.println("Defense : "+mage.defense);
            mage.checkStatus(mage.healthPoint, mage.defense, mage.attackDamage);
            a1=mage.attackDamage; h1=mage.healthPoint; d1=mage.defense; l1=mage.level;
        }else{
            System.out.println("Hero tidak tersedia");
        }
    }
    public void player2(){
        System.out.println("===Player 2===");
        Scanner inputUser = new Scanner(System.in);
        Assassin assassin = new Assassin(0);
        Tank tank = new Tank(0);
        Mage mage = new Mage(0);
        System.out.print("Hero : ");
        this.hero2 = inputUser.nextLine();
        if(hero2.compareTo("Assassin")==0){
            System.out.print("Level : ");
            assassin.level=inputUser.nextInt();
            assassin = new Assassin(assassin.level);
            System.out.println("Attack damage : "+assassin.attackDamage);
            System.out.println("Health poin : "+assassin.healthPoint);
            System.out.println("Life status : "+assassin.lifeStatus);
            System.out.println("Defense : "+assassin.defense);
            assassin.checkStatus(assassin.healthPoint, assassin.defense, assassin.attackDamage);
            a2=assassin.attackDamage; h2=assassin.healthPoint; d2=assassin.defense; l2=assassin.level;
        }else if(hero2.compareTo("Tank")==0){
            System.out.print("Level : ");
            tank.level=inputUser.nextInt();
            tank = new Tank(tank.level);
            System.out.println("Attack damage : "+tank.attackDamage);
            System.out.println("Health poin : "+tank.healthPoint);
            System.out.println("Life status : "+tank.lifeStatus);
            System.out.println("Defense : "+tank.defense);
            tank.checkStatus(tank.healthPoint, tank.defense, tank.attackDamage);
            a2=tank.attackDamage; h2=tank.healthPoint; d2=tank.defense; l2=tank.level;
        }else if(hero2.compareTo("Mage")==0){
            System.out.print("Level : ");
            mage.level=inputUser.nextInt();
            mage = new Mage(mage.level);
            System.out.println("Attack damage : "+mage.attackDamage);
            System.out.println("Health poin : "+mage.healthPoint);
            System.out.println("Life status : "+mage.lifeStatus);
            System.out.println("Defense : "+mage.defense);
            mage.checkStatus(mage.healthPoint, mage.defense, mage.attackDamage);
            a2=mage.attackDamage; h2=mage.healthPoint; d2=mage.defense; l2=mage.level;
        }else{
            System.out.println("Hero tidak tersedia");
        }
    }
    public static void main(String[] args) {
        int i=1;
        Driver driver = new Driver();
        driver.player1();
        driver.player2();
        System.out.println("\n-----------FIGHT BEGIN-------------");
        while (true){
            System.out.println("\n-----ROUND "+i+"------");
            if(driver.hero1.compareTo("Assassin")==0){
                Assassin assassin = new Assassin(driver.l1);
                System.out.println("---Player 1 TURN---");
                if(driver.hero2.compareTo("Mage")==0){
                    Mage mage = new Mage(driver.l2);
                    assassin.reviewDamage(driver.a1, driver.d2, driver.h2);
                    if (assassin.healthPoint>0){
                        assassin.lifeStatus=true;
                    }else {
                        assassin.healthPoint=0.0;
                        assassin.lifeStatus=false;
                    }
                    assassin.spawnIntro();
                    System.out.println("Player 2 HP remaining : "+assassin.healthPoint);
                    mage.reviewDamage(driver.a2, driver.d1, driver.h1);
                    System.out.println("---Player 2 TURN---");
                    if (mage.healthPoint>0){
                        mage.lifeStatus=true;
                    }else {
                        mage.healthPoint=0.0;
                        mage.lifeStatus=false;
                    }
                    mage.spawnIntro();
                    System.out.println("Player 1 HP remaining : "+mage.healthPoint);
                    driver.h2= assassin.healthPoint;
                    driver.h1= mage.healthPoint;
                    if (assassin.lifeStatus==false){
                        System.out.println("Mage is dead");
                        System.out.println("Player 1 winning the game");
                        break;
                    }else if (mage.lifeStatus==false){
                        System.out.println("Assassin is dead");
                        System.out.println("Player 2 winning the game");
                        break;
                    }
                }
                else if(driver.hero2.compareTo("Tank")==0){
                    Tank tank = new Tank(driver.l2);
                    assassin.reviewDamage(driver.a1, driver.d2, driver.h2);
                    if (assassin.healthPoint>0){
                        assassin.lifeStatus=true;
                    }else {
                        assassin.healthPoint=0.0;
                        assassin.lifeStatus=false;
                    }
                    assassin.spawnIntro();
                    System.out.println("Player 2 HP remaining : "+assassin.healthPoint);
                    tank.reviewDamage(driver.a2, driver.d1, driver.h1);
                    System.out.println("---Player 2 TURN---");
                    if (tank.healthPoint>0){
                        tank.lifeStatus=true;
                    }else {
                        tank.healthPoint=0.0;
                        tank.lifeStatus=false;
                    }
                    tank.spawnIntro();
                    System.out.println("Player 1 HP remaining : "+tank.healthPoint);
                    driver.h2= assassin.healthPoint;
                    driver.h1= tank.healthPoint;
                    if (assassin.lifeStatus==false){
                        System.out.println("Tank is dead");
                        System.out.println("Player 1 winning the game");
                        break;
                    }else if (tank.lifeStatus==false){
                        System.out.println("Assassin is dead");
                        System.out.println("Player 2 winning the game");
                        break;
                    }
                }
                else if(driver.hero2.compareTo("Assassin")==0){
                    Assassin assassin1 = new Assassin(driver.l2);
                    assassin.reviewDamage(driver.a1, driver.d2, driver.h2);
                    if (assassin.healthPoint>0){
                        assassin.lifeStatus=true;
                    }else {
                        assassin.healthPoint=0.0;
                        assassin.lifeStatus=false;
                    }
                    assassin.spawnIntro();
                    System.out.println("Player 2 HP remaining : "+assassin.healthPoint);
                    assassin1.reviewDamage(driver.a2, driver.d1, driver.h1);
                    System.out.println("---Player 2 TURN---");
                    if (assassin1.healthPoint>0){
                        assassin1.lifeStatus=true;
                    }else {
                        assassin1.healthPoint=0.0;
                        assassin1.lifeStatus=false;
                    }
                    assassin1.spawnIntro();
                    System.out.println("Player 1 HP remaining : "+assassin1.healthPoint);
                    driver.h2= assassin.healthPoint;
                    driver.h1= assassin1.healthPoint;
                    if (assassin.lifeStatus==false){
                        System.out.println("Tank is dead");
                        System.out.println("Player 1 winning the game");
                        break;
                    }else if (assassin1.lifeStatus==false){
                        System.out.println("Assassin is dead");
                        System.out.println("Player 2 winning the game");
                        break;
                    }
                }
            }
            else if(driver.hero1.compareTo("Tank")==0){
                Tank tank = new Tank(driver.l1);
                System.out.println("---Player 1 TURN---");
                if(driver.hero2.compareTo("Mage")==0){
                    Mage mage = new Mage(driver.l2);
                    tank.reviewDamage(driver.a1, driver.d2, driver.h2);
                    if (tank.healthPoint>0){
                        tank.lifeStatus=true;
                    }else {
                        tank.healthPoint=0.0;
                        tank.lifeStatus=false;
                    }
                    tank.spawnIntro();
                    System.out.println("Player 2 HP remaining : "+tank.healthPoint);
                    mage.reviewDamage(driver.a2, driver.d1, driver.h1);
                    System.out.println("---Player 2 TURN---");
                    if (mage.healthPoint>0){
                        mage.lifeStatus=true;
                    }else {
                        mage.healthPoint=0.0;
                        mage.lifeStatus=false;
                    }
                    mage.spawnIntro();
                    System.out.println("Player 1 HP remaining : "+mage.healthPoint);
                    driver.h2= tank.healthPoint;
                    driver.h1= mage.healthPoint;
                    if (tank.lifeStatus==false){
                        System.out.println("Mage is dead");
                        System.out.println("Player 1 winning the game");
                        break;
                    }else if (mage.lifeStatus==false){
                        System.out.println("Tank is dead");
                        System.out.println("Player 2 winning the game");
                        break;
                    }
                }
                else if(driver.hero2.compareTo("Assassin")==0){
                    Assassin assassin = new Assassin(driver.l2);
                    tank.reviewDamage(driver.a1, driver.d2, driver.h2);
                    if (tank.healthPoint>0){
                        tank.lifeStatus=true;
                    }else {
                        tank.healthPoint=0.0;
                        tank.lifeStatus=false;
                    }
                    tank.spawnIntro();
                    System.out.println("Player 2 HP remaining : "+tank.healthPoint);
                    assassin.reviewDamage(driver.a2, driver.d1, driver.h1);
                    System.out.println("---Player 2 TURN---");
                    if (assassin.healthPoint>0){
                        assassin.lifeStatus=true;
                    }else {
                        assassin.healthPoint=0.0;
                        assassin.lifeStatus=false;
                    }
                    assassin.spawnIntro();
                    System.out.println("Player 1 HP remaining : "+assassin.healthPoint);
                    driver.h2= tank.healthPoint;
                    driver.h1= assassin.healthPoint;
                    if (tank.lifeStatus==false){
                        System.out.println("Mage is dead");
                        System.out.println("Player 1 winning the game");
                        break;
                    }else if (assassin.lifeStatus==false){
                        System.out.println("Tank is dead");
                        System.out.println("Player 2 winning the game");
                        break;
                    }
                }
                else if(driver.hero2.compareTo("Tank")==0){
                    Tank tank1 = new Tank(driver.l2);
                    tank.reviewDamage(driver.a1, driver.d2, driver.h2);
                    if (tank.healthPoint>0){
                        tank.lifeStatus=true;
                    }else {
                        tank.healthPoint=0.0;
                        tank.lifeStatus=false;
                    }
                    tank.spawnIntro();
                    System.out.println("Player 2 HP remaining : "+tank.healthPoint);
                    tank1.reviewDamage(driver.a2, driver.d1, driver.h1);
                    System.out.println("---Player 2 TURN---");
                    if (tank1.healthPoint>0){
                        tank1.lifeStatus=true;
                    }else {
                        tank1.healthPoint=0.0;
                        tank1.lifeStatus=false;
                    }
                    tank1.spawnIntro();
                    System.out.println("Player 1 HP remaining : "+tank1.healthPoint);
                    driver.h2= tank.healthPoint;
                    driver.h1= tank1.healthPoint;
                    if (tank.lifeStatus==false){
                        System.out.println("Mage is dead");
                        System.out.println("Player 1 winning the game");
                        break;
                    }else if (tank1.lifeStatus==false){
                        System.out.println("Tank is dead");
                        System.out.println("Player 2 winning the game");
                        break;
                    }
                }
            }
            else if(driver.hero1.compareTo("Mage")==0){
                Mage mage = new Mage(driver.l1);
                System.out.println("---Player 1 TURN---");
                if(driver.hero2.compareTo("Assassin")==0){
                    Assassin assassin = new Assassin(driver.l2);
                    mage.reviewDamage(driver.a1, driver.d2, driver.h2);
                    if (mage.healthPoint>0){
                        mage.lifeStatus=true;
                    }else {
                        mage.healthPoint=0.0;
                        mage.lifeStatus=false;
                    }
                    mage.spawnIntro();
                    System.out.println("Player 2 HP remaining : "+mage.healthPoint);
                    assassin.reviewDamage(driver.a2, driver.d1, driver.h1);
                    System.out.println("---Player 2 TURN---");
                    if (assassin.healthPoint>0){
                        assassin.lifeStatus=true;
                    }else {
                        assassin.healthPoint=0.0;
                        assassin.lifeStatus=false;
                    }
                    assassin.spawnIntro();
                    System.out.println("Player 1 HP remaining : "+assassin.healthPoint);
                    driver.h2= mage.healthPoint;
                    driver.h1= assassin.healthPoint;
                    if (assassin.lifeStatus==false){
                        System.out.println("Assassin is dead");
                        System.out.println("Player 1 winning the game");
                        break;
                    }else if (assassin.lifeStatus==false){
                        System.out.println("Mage is dead");
                        System.out.println("Player 2 winning the game");
                        break;
                    }
                }
                else if(driver.hero2.compareTo("Tank")==0){
                    Tank tank = new Tank(driver.l2);
                    mage.reviewDamage(driver.a1, driver.d2, driver.h2);
                    if (mage.healthPoint>0){
                        mage.lifeStatus=true;
                    }else {
                        mage.healthPoint=0.0;
                        mage.lifeStatus=false;
                    }
                    mage.spawnIntro();
                    System.out.println("Player 2 HP remaining : "+mage.healthPoint);
                    tank.reviewDamage(driver.a2, driver.d1, driver.h1);
                    System.out.println("---Player 2 TURN---");
                    if (tank.healthPoint>0){
                        tank.lifeStatus=true;
                    }else {
                        tank.healthPoint=0.0;
                        tank.lifeStatus=false;
                    }
                    tank.spawnIntro();
                    System.out.println("Player 1 HP remaining : "+tank.healthPoint);
                    driver.h2= mage.healthPoint;
                    driver.h1= tank.healthPoint;
                    if (tank.lifeStatus==false){
                        System.out.println("Assassin is dead");
                        System.out.println("Player 1 winning the game");
                        break;
                    }else if (tank.lifeStatus==false){
                        System.out.println("Mage is dead");
                        System.out.println("Player 2 winning the game");
                        break;
                    }
                }
                else if(driver.hero2.compareTo("Mage")==0){
                    Mage mage1 = new Mage(driver.l2);
                    mage.reviewDamage(driver.a1, driver.d2, driver.h2);
                    if (mage.healthPoint>0){
                        mage.lifeStatus=true;
                    }else {
                        mage.healthPoint=0.0;
                        mage.lifeStatus=false;
                    }
                    mage.spawnIntro();
                    System.out.println("Player 2 HP remaining : "+mage.healthPoint);
                    mage1.reviewDamage(driver.a2, driver.d1, driver.h1);
                    System.out.println("---Player 2 TURN---");
                    if (mage1.healthPoint>0){
                        mage1.lifeStatus=true;
                    }else {
                        mage1.healthPoint=0.0;
                        mage1.lifeStatus=false;
                    }
                    mage1.spawnIntro();
                    System.out.println("Player 1 HP remaining : "+mage1.healthPoint);
                    driver.h2= mage.healthPoint;
                    driver.h1= mage1.healthPoint;
                    if (mage1.lifeStatus==false){
                        System.out.println("Assassin is dead");
                        System.out.println("Player 1 winning the game");
                        break;
                    }else if (mage1.lifeStatus==false){
                        System.out.println("Mage is dead");
                        System.out.println("Player 2 winning the game");
                        break;
                    }
                }
            }
            i++;
        }
    }
}