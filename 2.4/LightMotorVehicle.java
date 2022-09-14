public class LightMotorVehicle extends Vehicle {

    int mileage;
    int num;

    LightMotorVehicle(String company, int price) {
        super(company, price);
    }

    void display(int mileage, int num) {
        System.out.println("\nVehicle name: " + company + "\nModel id: " + num + "\nPrice: " + price + "\nMileage: "
                + mileage + "KmpH");

    }

}
