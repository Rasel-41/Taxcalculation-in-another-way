package q1;

import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marital status :");
        String status = in.next();
        System.out.println("Enter your income");
        double income = in.nextDouble();
        double tax = 0;
        if(status.equals("single")){
            if(income<=32000){
                tax = 0.1*income;
            }
            else{
                tax = 3200+0.25*(income-32000);
            }
        } else if (status.equals("married")) {
            if(income<=64000){
                tax = 0.1*income;
            }
            else{
                tax = 6400+0.25*(income-64000);
            }

        }
        else {
            System.out.println("Illegal marital condition");
        }
        System.out.println("Your tax is: "+tax);
    }
}
