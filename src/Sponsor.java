//public class Sponsor {
//}
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Sponsor {
    public static double totalBankAccount = 1300.0D;

    public Sponsor(double bankAccount) {
        totalBankAccount = bankAccount;
    }

    public void withdraw(Double amount) {
        totalBankAccount = totalBankAccount-amount;
    }

    public double getTotalBankAccount() {
        return totalBankAccount;
    }

    public static Map<String, Double> getStudentFares() {
        Map<String, Double> studentFares = new HashMap<>();

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

        return studentFares;
    }

    public static boolean checkEnrolledStudent(Map<String, Double> studentFares, String studentName) {
        boolean result = false;

        for(int i=0; i<studentFares.size(); i++) {
            if (studentFares.containsKey(studentName)) {
                result = true;
                break;
            }
        }

        return result;
    }
}