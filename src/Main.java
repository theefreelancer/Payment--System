import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Sponsor sponsor = new Sponsor(Sponsor.totalBankAccount);
        Scanner originInput = new Scanner(System.in);
        System.out.println("Enter prompt : ");

        String input = originInput.nextLine().toLowerCase(); //no need to set up local (default : EN)

        Map<String, Double> studentFares = Sponsor.getStudentFares();

        if (input.equals("payments")) {
            Scanner studentPrompt = new Scanner(System.in);
            System.out.println("Enter enrolled name :");
            String studentName = studentPrompt.nextLine();

            if (Sponsor.checkEnrolledStudent(studentFares, studentName)) { //in case student they input is in the map
                Double fare = studentFares.get(studentName);
                System.out.println("The student " + studentName + " pays" + fare);
                Scanner paymentPrompt = new Scanner(System.in);
                System.out.println("Should we make payments? ");
                String paymentCmd = paymentPrompt.nextLine();

                if (paymentCmd.equals("yes") || paymentCmd.equals("y")) {
                    if (sponsor.getTotalBankAccount() >= fare) {
                        System.out.println("Thank you for making this payment!");
                        sponsor.withdraw(fare);
                    } else {
                        System.out.println("sorry, the account balance on your account can support this transaction");
                    }
                } else if (paymentCmd.equals("no") || paymentCmd.equals("n")) {
                    System.out.println("Thank you for choosing us for all your payment services, you can as well try again later!");
                } else {
                    System.out.println("A student with those details did not enroll in our institution");
                }
            } else {
                System.out.println("Thanks for visiting our school payment platform.We shall be waiting for you when you come!");
            }
        }
    }
}
