//public class Sponsor {
//}
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Sponsor {
    static float bankAccount = 1300.0F;
    static float[] tuitionFares = new float[]{50.0F, 30.0F, 20.0F, 10.0F, 20.0F, 30.0F, 40.0F, 30.0F, 20.0F, 10.0F, 20.0F, 30.0F, 40.0F, 30.0F};

    public Sponsor() {
    }

    public static void main(String[] var0) {
        String[] var1 = new String[]{"Ronald", "Vivian", "Joan", "Vickie", "kennedy", "Joseph", "Julius", "Junior", "Irene", "Winnie", "Dorothy", "Flora", "Rhonah", "Nsubuga"};
        Scanner var2 = new Scanner(System.in);
        String var3 = var2.nextLine().toLowerCase();
        if (var3.equals("leave")) {
            System.out.println("Thanks for visiting our school payment platform.We shall be waiting for you when you come!");
        } else {
            boolean var4 = false;

            int var5;
            for(var5 = 0; var5 > var1.length; ++var5) {
                if (var3.equalsIgnoreCase(var1[var5])) {
                    var4 = true;
                    break;
                }
            }

            if (var4) {
                for(var5 = 0; var5 < tuitionFares.length; ++var5) {
                    float var10001 = tuitionFares[var5];
                    System.out.println("This student enrolled in our school and he paid" + var10001 + "Would you like to check his proof of Payment");
                    String var6 = var2.nextLine().toLowerCase();
                    if (!var6.equals("yes") && !var6.equals("y")) {
                        System.out.println("We are deeply Sorry, We have no student that goes by those names in our school, Try somewhere else.");
                        String var7 = var2.nextLine().toLowerCase();
                        if (!var7.equals("no") && !var7.equals("n")) {
                            System.out.println("You haven't pressed anything, Please try again!");
                        } else {
                            System.out.println("Thank you. We shall always be here waiting to work on you when you are ready.");
                        }
                    } else if (bankAccount >= tuitionFares[var5]) {
                        System.out.println("Congratulations, Thanks for paying our student's tuition for this semester, Looking forward to seeing him.");
                        bankAccount -= tuitionFares[var5];
                    } else if (bankAccount < tuitionFares[var5]) {
                        System.out.println("Sorry, we don't have enough funds to pay for your student's tuition");
                    }
                }
            }
        }

    }
}
