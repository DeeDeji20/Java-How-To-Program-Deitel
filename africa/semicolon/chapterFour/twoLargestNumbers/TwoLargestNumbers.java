package africa.semicolon.chapterFour.twoLargestNumbers;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value ;
        int count=0;
        int largestNumber =Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        while (count < 4){
            System.out.println("Enter numbers");
            value = scan.nextInt();
            if(value > largestNumber){
                largestNumber = value;
            }
            if(value != largestNumber && value > secondLargest ){
                secondLargest = value;
                System.out.println(secondLargest);
            }
            count++;
        }
        System.out.println(largestNumber);
        System.out.println(secondLargest);
    }
}
