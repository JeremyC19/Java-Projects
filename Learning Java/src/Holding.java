import java.util.Scanner;

public class Holding {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your weekly income: ");
        int income = Integer.parseInt(scn.nextLine());

        if (income<500)
        {
            System.out.println("Your tax rate is 10 percent");
        }
        else if(income<1500)
        {
            System.out.println("Your tax rate is 15 percent");
        }
        else if(income<2500)
        {
            System.out.println("Your tax rate is 20 percent");
        }
        else if(income>=2500)
            System.out.println("Your tax rate is 30 percent");
    }


}

