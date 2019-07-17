public class Warrior extends Character {
    private int shieldStrength = 100;


    public Warrior(){}

    public void block(int shieldStrength){
        this.shieldStrength +=1;
    }
    public void decreaseShieldStrength(int shieldStrength){
        this.shieldStrength -= 1;


    }

}
