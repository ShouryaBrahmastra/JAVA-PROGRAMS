
public class HeavyMotorVehicle extends Vehicle {

    int capacity_in_tons;

    HeavyMotorVehicle(String company, int price) {
        super(company, price);
    }

    void display(int num, int capacity_in_tons) {
        System.out.println("\nVehicle name: " + company + "\nModel id: " + num + "\nPrice: " + price
                + "\nCapacity in Tons: " + capacity_in_tons + "\n");
    }
}