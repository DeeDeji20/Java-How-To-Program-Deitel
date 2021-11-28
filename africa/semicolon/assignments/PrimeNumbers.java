package africa.chapterSix;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scan.nextInt();
        double value=0;
        int store = 0;
        int num;
        for ( num =1; num<= number; num++){
            value= Math.pow(num, 2);
            if (number == value){
                System.out.println(num);
                break;
            }
        }
            if (number % 2 == 0 || number%3 == 0 || number% num ==0) {
                System.out.println("Not prime");
            }else{
                System.out.println("Prime");
            }
    }
}
