import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        color();
    }

    public static void color(){

        Scanner scnr = new Scanner(System.in);

        try {

            System.out.println("Enter three colors: ");

            String[] colors = new String[3];

            colors[0] = scnr.next();
            colors[1] = scnr.next();
            colors[2] = scnr.next();
            colors[3] = scnr.next();

            System.out.println("Success");

            System.out.print("Your three colors are: ");
            for(int i = 0; i<colors.length; i++) {
                System.out.print(colors[i] + ", ");
            }

        } catch(Throwable e){
            System.out.println("Failure");
        }
    }
}