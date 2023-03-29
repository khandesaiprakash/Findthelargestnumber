//Create the import statement, it works on  a users input!
import java.util.Scanner;
public class Findthelargestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //print the first number
        System.out.println("Enter the first number:");
        int firstNumber = sc.nextInt();    //inetegr input method
        //print the second number
        System.out.println("Enter the second element:");
        int secondNumber = sc.nextInt();
        //print the third element
        System.out.println("Enter the third element:");
        int thirdNumber = sc.nextInt();
        //maximum number
        int maxNumber = 0;
        //First condition
        if(firstNumber > maxNumber){
            maxNumber = firstNumber;
        }
        if(secondNumber > maxNumber) {
            maxNumber = secondNumber;
        }
        if(thirdNumber > maxNumber) {
            maxNumber = thirdNumber;
        }
        // print the result
        System.out.println("The highest number is: " + maxNumber);

    }
}
