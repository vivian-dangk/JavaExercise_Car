
package OOP;

public class CAR {
    private String model;
    private int year;
    public CAR(String model,int year){
        this.model = model;
        this.year = year;
    }
    public void displayDetails() {
    System.out.println("Car Model: " + model + ", Year: " + year);
    }
}

