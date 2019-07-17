public class Farmer extends Character {


    public Farmer(){}


    public int plow(){
        return getSpeed() + getStrength();

    }
    public int harvest(){
        setAttackPower(getAttackPower() * 2);
        return getAttackPower();
    }

}
