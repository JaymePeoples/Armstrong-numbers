/**
 * Created by Jayme Peoples on 6/16/2017.
 */
import java.util.Scanner;

public class Cubes {//Armstrong number is number when all numbers cubed and added together equals original number
    public static void main(String [] args){
        Scanner scnr = new Scanner(System.in);
        int userNum =0;
        int sum = 0;
        int remainder = 0;
        int digits = 0;
        int i = 0;

        System.out.print("Enter any integer to see if it's an Armstrong number: ");
        userNum = scnr.nextInt();

        i = userNum;

        while (i !=0 ) {
            ++digits; //will allow for larger numbers
            i = i / 10;
        }
        i = userNum;
        while (i != 0){
            remainder =i%10; /*use %10 to extract last number so you are using each digit individually
                              not as place value*/
            sum = (int) (sum + Math.pow(remainder, digits)); //power increases as digits increase
            i = i/10;
        }
        if (sum == userNum) {
            System.out.println("True");
        }
         else{
            System.out.println("False");
        }
        return;
    }
}
