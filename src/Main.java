import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        int base,exponent,result=1;

        System.out.print("Enter the base: ");
        base = keyboard.nextInt();

        System.out.print("Enter the exponent: ");
        exponent = keyboard.nextInt();

        for (int i=1;i<=exponent;i++){

            result = result * base;

        }

        System.out.println();
        System.out.print("RESULT--> ");
        System.out.print(base + "^"+exponent+" = "+result);
        System.out.print(" <--RESULT");


    }
}
