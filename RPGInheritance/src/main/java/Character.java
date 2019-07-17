public class Character {
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;

    public Character(){}

    public Character(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    // speed and stamina must be above 5
    public void run(int stamina, int speed) {
        if (stamina < 5 && speed < 5) {
            System.out.println("Not enough stamina and speed to escape");
        } else {
            System.out.println("Successfully escaped");
        }
    }

    public int attack(int strength, int speed, int attackPower) {
        return strength * attackPower;
    }

    public void heal() {
        this.health += 15;
    }

    public void decreaseHealth() {
        this.health -= 5;
    }

    public void increaseStamina() {
        this.stamina += 10;
    }

    public void decreaseStamina() {
        this.stamina -= 5;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                '}';
    }
}