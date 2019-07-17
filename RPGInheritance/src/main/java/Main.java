import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // To test, please choose "farmer" for your class.

        System.out.println("Welcome! Choose your class: farmer, constable, or warrior.");
            String characterType = scanner.nextLine();
            int monsterHP = 300;

        if (characterType.equals("farmer")) {
            Farmer f1 = new Farmer();
            System.out.println("Name your character.");
            f1.setName(scanner.nextLine());
            System.out.println("You chose " + f1.getName());
            f1.setStrength(75);
            f1.setHealth(100);
            f1.setStamina(75);
            f1.setSpeed(10);
            f1.setAttackPower(1);

            System.out.println("A monster with " + monsterHP + " health has appeared. Do you want to fight or run?");
            String action = scanner.nextLine();
            if (action.equals("fight")){
                while (monsterHP > 0) {
                    System.out.println("You are now engaged in combat. Do you want to attack, heal, plow, harvest, or view status?");
                    String fight = scanner.nextLine();
                    switch (fight) {
                        case "view status":
                            System.out.println(f1.toString());
                            break;
                        case "attack":
                            monsterHP -= f1.getStrength() * f1.getAttackPower();
                            System.out.println("Monster received a critical hit! The monster's health is now " + monsterHP);
                            break;
                        case "heal":
                            f1.heal();
                            System.out.println("Health has increased!");
                            break;
                        case "plow":
                            monsterHP -= f1.plow();
                            System.out.println("Monster was hit! The monster's health is now " + monsterHP);
                            break;
                        case "harvest":
                            f1.harvest();
                            System.out.println("Your attack power has increased.");
                            break;

                        default:
                            System.out.println("Try again.");
                            break;
                    }}
                System.out.println("The monster is dead. I hope you're happy.");
            } else if (action.equals("run")){
                        f1.run(f1.getStamina(),f1.getSpeed());
            } else {
                System.out.println("Try again.");
            }
        } else if(characterType.equals("constable")) {
            Constable c1 = new Constable();
            c1.setStrength(60);
            c1.setHealth(100);
            c1.setStamina(60);
            c1.setSpeed(20);
            c1.setAttackPower(5);
            System.out.println("Sorry, this character is not available.");
        } else if(characterType.equals("warrior")) {
            Warrior w1 = new Warrior();
            w1.setStrength(60);
            w1.setHealth(100);
            w1.setStamina(60);
            w1.setSpeed(20);
            w1.setAttackPower(5);
            System.out.println("Sorry, this character is not available.");
        }  else {
            System.out.println("Choose farmer.");
        }
        }
}