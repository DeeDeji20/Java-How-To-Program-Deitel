package africa.semicolon.chapterFour.gasMileage;

import java.util.Scanner;

public class GasMileageTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalUsage =0;
        GasMileage car1 = new GasMileage(0, 0);
        int carGallon;
        int carMile;

        do{
            System.out.println("Enter miles travelled");
            carMile = scan.nextInt();
            System.out.println("Enter gallons");
            carGallon = scan.nextInt();
            car1.setMilesDriven(carMile);
            car1.setGallons(carGallon);
            System.out.println(car1.milesPerGallon());

            totalUsage = car1.combinedMilesPerGallon();
            System.out.println(totalUsage);
        }
        while(carMile > 0 && carGallon > 0);
    }
}
