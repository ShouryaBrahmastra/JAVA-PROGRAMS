
import java.util.Scanner;

class TestMain {
    public static void main(String args[]) {

        LightMotorVehicle[] ob2 = new LightMotorVehicle[3];
        HeavyMotorVehicle[] ob3 = new HeavyMotorVehicle[2];

        System.out.println("Enter the type of vehicle: \n Press 1 for light vehicle and Press 2 for heavy vehicle");

        try (Scanner sc = new Scanner(System.in)) {
            int choice = sc.nextInt();

            switch (choice) {

                case (1): {
                    int i = 1000;
                    ob2[0] = new LightMotorVehicle("MARUTI", 200000);
                    ob2[0].display(34, i);

                    i += 1;
                    ob2[1] = new LightMotorVehicle("BMW", 2450000);
                    ob2[1].display(34, i);

                    i += 1;
                    ob2[2] = new LightMotorVehicle("MERCEDEES", 4600000);
                    ob2[2].display(34, i);

                    break;
                }
                case (2): {
                    int i = 1003;

                    ob3[0] = new HeavyMotorVehicle("TATA", 234300);
                    ob3[0].display(i, 40);

                    i += 1;
                    ob3[1] = new HeavyMotorVehicle("MAHINDRA", 584500);
                    ob3[1].display(i, 50);
                    break;
                }
                default:
                    System.out.println("Invalid Choice\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}