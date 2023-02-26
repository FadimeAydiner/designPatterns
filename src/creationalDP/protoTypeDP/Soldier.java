package creationalDP.protoTypeDP;

public class Soldier implements Cloneable{
    private  int health;
    private  int speed;
    private  int lifeTime;
    private  int agility;
    private  int rank;
    private  int power;
    private  String weapon;
    private boolean isAvaliableForWar;

    public Soldier(int health, int speed, int lifeTime, int agility, int rank, int power, String weapon, boolean isAvaliableForWar) {
        this.health = health;
        this.speed = speed;
        this.lifeTime = lifeTime;
        this.agility = agility;
        this.rank = rank;
        this.power = power;
        this.weapon = weapon;
        this.isAvaliableForWar = isAvaliableForWar;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public boolean isAvaliableForWar() {
        return isAvaliableForWar;
    }

    public void setAvaliableForWar(boolean avaliableForWar) {
        isAvaliableForWar = avaliableForWar;
    }

    //method to give information about soldier
    public void showSoldierInfo(){
        System.out.println("Health: "+health);
        System.out.println("speed: "+speed);
        System.out.println("lifeTime: "+lifeTime);
        System.out.println("agility: "+agility);
        System.out.println("rank: "+rank);
        System.out.println("power: "+power);
        System.out.println("weapon: "+weapon);

        if(isAvaliableForWar){
            System.out.println("Ready to fight");
        }
        else
            System.out.println("Unable to fight");
    }

    @Override
    public Soldier clone() {
        Soldier soldier=null;
        try {
            soldier = (Soldier) super.clone();

        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
        return soldier;
    }
}
