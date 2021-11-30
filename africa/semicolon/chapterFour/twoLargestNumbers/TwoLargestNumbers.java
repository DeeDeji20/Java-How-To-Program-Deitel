package africa.semicolon.chapterFour.twoLargestNumbers;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value ;
        int count=0;
        int largestNumber =Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
//        int largestStore = largestNumber;
        int temp = largestNumber;
        System.out.println(temp);
        while (count < 4){
            System.out.println("Enter numbers");
            value = scan.nextInt();

            if (value > secondLargest){
                temp = value;
            }
            if(value > largestNumber){
                largestNumber = value;

            }
            else if(value > secondLargest && value < largestNumber){
                secondLargest = temp;
//                    System.out.println(secondLargest);
            }else {
                secondLargest = value;
            }
            ++count;
        }
        System.out.println(largestNumber);
        System.out.println(secondLargest);
    }
}
