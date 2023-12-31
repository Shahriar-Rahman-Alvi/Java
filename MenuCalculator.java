import java.util.*;

public class MenuCalculator {

    public static void main(String[] args) {

        //Creating a scanner
        Scanner sc = new Scanner(System.in);

        do {
            //Prompt the user to choose from the menu
            System.out.print("\nCalculator Menu" +
                    "\n1 - Addition" +
                    "\n2 - Subtraction" +
                    "\nQ - Exit\n" +
                    "\nChoose an option : ");
            char input = sc.next().charAt(0);

            //Addition
            if (input == '1') {
                System.out.println("\nADDITION" +
                        "\nEnter two numbers : ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                int ans = num1 + num2;

                System.out.println("\nAnswer : " + ans);


            }
            //Subtraction
            else if (input == '2') {
                System.out.println("\nSUBTRACTION" +
                        "\nEnter two numbers : ");
                int number1 = sc.nextInt();
                int number2 = sc.nextInt();

                int answer = number1 - number2;

                System.out.println("\nAnswer : " + answer);
            }

            else if(input == 'Q' || input == 'q'){
                System.out.println("Exit");
                break;
            }

            else{
                System.out.println("Invalid option");
            }

        } while (true);
    }
}