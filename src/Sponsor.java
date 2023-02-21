//public class Sponsor {
//}
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.HashMap;
import java.util.Scanner;

public class Sponsor {
    static double bankAccount = 1300.0D;
    public Sponsor() {
    }

    public static void main(String[] args) {
//      Create a HashMap, to store an individual student's name and the amount of tuition a given student is supposed to pay.
        HashMap<String, Double> studentFares = new HashMap<>();
        studentFares.put("Ronald", 50.0D);
        studentFares.put("Vivian", 30.0D);
        studentFares.put("Joan", 20.0D);
        studentFares.put("Vickie", 10.0D);
        studentFares.put("Kennedy", 20.0D);
        studentFares.put("Joseph", 30.0D);
        studentFares.put("Julius", 40.0D);
        studentFares.put("Junior", 12.0D);
        studentFares.put("Irene", 8.0D);
        studentFares.put("Winnie", 15.0D);
        studentFares.put("Dorothy", 10.0D);
        studentFares.put("Flora", 10.0D);
        studentFares.put("Rhona", 12.0D);
        studentFares.put("Nsubuga", 18.0D);

//      Calls the scanner utility class to prompt the user to input a command that is either "payments" or "leave"
        Scanner originalInput = new Scanner(System.in);
        System.out.println("Enter prompt:");
        String input = originalInput.nextLine().toLowerCase();

//       Performs a check if the user actually entered a command called "Payments" and the input shouldn't be null.
        if (input !=null && input.equals("payments")) {

//      Calls the user to input the name of the enrolled student
            Scanner studentPrompt = new Scanner(System.in);
            System.out.println("Enter enrolled name:");
            String studentName = studentPrompt.nextLine();
            boolean isStudentEnrolled = false;

            for (String entry : studentFares.keySet()) {
                if (entry.equals(studentName)) {
//              Equates the existing entry to the prompted studentName
                    isStudentEnrolled = true;
                    break;
                }
            }
            if (isStudentEnrolled) {

//              Performs an action when the user's name is in the list of the enrolled students
                System.out.println("The student " + entry.getKey() + "pays" + entry.getValue());

//              Prompts the sponsor to make a choice on whether to make a payment for the beneficiary or not.
                Scanner paymentPrompt = new Scanner(System.in);
                System.out.println("Should we make payments? ");
                String paymentCmd = paymentPrompt.nextLine();
                if(paymentCmd.equals("yes") || paymentCmd.equals("y")){
                    if(bankAccount >= entry.getValue()){
                        System.out.println("Thank you for making this payment!");
                        bankAccount--;
                    }else if (bankAccount < entry.getValue()){
                        System.out.println("sorry, the account balance on your account can support this transaction");
                    }
                } else if (paymentCmd.equals("no") || paymentCmd.equals("n")){
                    System.out.println("Thank you for choosing us for all your payment services, you can as well try again later!");

                }
            } else {
                System.out.println("A student with those details did not enroll in our institution");
            }

        } else if(input.equals("quit") || input.equals("q")) {
            System.out.println("Thanks for visiting our school payment platform.We shall be waiting for you when you come!");

        }

    }
}