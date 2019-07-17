import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Car Inventory!");

        while (true) {
            System.out.println("Enter the action you want to perform:");
            System.out.println("add, list, delete, or search");
            String action = scanner.nextLine();

            Scanner input = new Scanner(System.in);


            if (action.equals("add")) {

                System.out.println("Enter car make:");
                String make = input.nextLine();
                System.out.println("Enter model:");
                String model = input.nextLine();
                System.out.println("Enter color:");
                String color = input.nextLine();
                System.out.println("Enter year:");
                int year = input.nextInt();
                System.out.println("Enter total miles:");
                int miles = input.nextInt();

                Car car = new Car(make, model, year, color, miles);
                carList.add(car);

            } else if (action.equals("list")) {
                //use next line to make sure list action executes
                System.out.println("Current Inventory:");

                for (int i = 0; i < carList.size(); i++) {
                    System.out.println("Entry #" + i);
                    System.out.println(carList.get(i).getMake());
                    System.out.println(carList.get(i).getModel());
                    System.out.println(carList.get(i).getColor());
                    System.out.println(carList.get(i).getYear());
                    System.out.println(carList.get(i).getMiles());

                }
            } else if (action.equals("delete")) {
                System.out.println("Enter entry number to remove:");

                Scanner sc = new Scanner(System.in);
                int y = sc.nextInt();
                carList.remove(y);

            } else if (action.equals("search")) {
                System.out.println("Do you want to search by make, model, color, year, or miles?");
                Scanner s = new Scanner(System.in);
                String z = s.nextLine();
                if (z.equals("make")) {
                    System.out.println("Enter car make:");
                    Scanner a = new Scanner(System.in);
                    String k = a.nextLine();
                    System.out.println("The following entry #s contain your query:");
                    for (int i = 0; i < carList.size(); i++) {
                        if (carList.get(i).getMake().equals(k)) {
                            System.out.println("Entry #" + i);
                        }
                    }
                } else if (z.equals("model")) {
                    System.out.println("Enter car model:");
                    Scanner a = new Scanner(System.in);
                    String k = a.nextLine();
                    System.out.println("The following entry #s contain your query:");
                    for (int i = 0; i < carList.size(); i++) {
                        if (carList.get(i).getModel().equals(k)) {
                            System.out.println("Entry #" + i);
                        }
                    }
                }   else if (z.equals("color")) {
                    System.out.println("Enter car color:");
                    Scanner a = new Scanner(System.in);
                    String k = a.nextLine();
                    System.out.println("The following entry #s contain your query:");
                    for (int i = 0; i < carList.size(); i++) {
                        if (carList.get(i).getColor().equals(k)) {
                            System.out.println("Entry #" + i);
                        }
                    }
                }   else if (z.equals("year")) {
                    System.out.println("Enter car year:");
                    Scanner a = new Scanner(System.in);
                    int k = a.nextInt();
                    System.out.println("The following entry #s contain your query:");
                    for (int i = 0; i < carList.size(); i++) {
                        if (carList.get(i).getYear()==(k)) {
                            System.out.println("Entry #" + i);
                        }
                    }
                }   else if (z.equals("miles")) {
                    System.out.println("Find entries with miles fewer than:");
                    Scanner a = new Scanner(System.in);
                    int k = a.nextInt();
                    System.out.println("The following entry #s have fewer than miles entered:");
                    for (int i = 0; i < carList.size(); i++) {
                        if (carList.get(i).getMiles()<(k)) {
                            System.out.println("Entry #" + i);
                        }
                    }
                }
            } else {
                System.out.println("Try again.");
            }
        }
    }
}
