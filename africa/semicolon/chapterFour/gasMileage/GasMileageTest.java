package africa.semicolon.chapterFour.gasMileage;

import java.util.Scanner;

public class GasMileageTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        GasMileage car1 = new GasMileage(0, 0);
        System.out.println("Enter miles travelled");
        int carMile = scan.nextInt();
        System.out.println("Enter gallons");
        int carGallon = scan.nextInt();
        car1.setMilesDriven(carMile);

        car1.setGallons(carGallon);
        System.out.println(car1.milesPerGallon());
    }
}
