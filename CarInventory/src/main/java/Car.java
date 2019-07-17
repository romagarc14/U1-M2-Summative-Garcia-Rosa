public class Car{
    private String make;
    private String model;
    private int year;
    private String color;
    private int miles;

    public Car(String make, String model, int year, String color, int miles) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.miles = miles;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getMiles() {
        return miles;
    }
    public void setMiles(int miles) {
        this.miles = miles;
    }


        }


