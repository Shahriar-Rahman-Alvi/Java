import java.util.Scanner;
public class OddEven {
        // main method begins execution of Java application
        public static void main(String[] args)
        {
            // create Scanner
            Scanner input = new Scanner(System.in);

            // initialize variables
            int num;	// an integer for user input

            System.out.print("Enter an integer: ");	// prompt
            num = input.nextInt();	// read an integer from user

            // if remainder is 0 after divide by 2, the number is an even number
            if (num % 2 == 0)
                System.out.printf("%d is an even number", num);	// display the integer as even number

            // if remainder is not zero after divide by 2, the number is an odd number
            if (num % 2 != 0)
                System.out.printf("%d is an odd number", num);	// display the integer as odd number

        }
}
