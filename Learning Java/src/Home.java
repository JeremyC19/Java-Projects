import java.util.Objects;
import java.util.Scanner;

public class Home {

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the model, address and zip code in that order of the home you would like to remove: ");

        removeHome(scnr.nextLine(), scnr.nextLine(), scnr.nextInt());
    }

    public static void removeHome(String homeModel, String homeAddress, int homeZipCode){

        homeInfo home1 = new homeInfo();
        home1.model = "Condo";
        home1.Address = "101 Mitchell Road, North Park, Colorado";
        home1.zipCode = 85401;

        if(Objects.equals(homeModel, home1.model) && Objects.equals(homeAddress, home1.Address) && homeZipCode == home1.zipCode){
            System.out.println("Removed: " + home1.Address);
            home1 = null;

        } else {
            System.out.print("Mismatch");
        }

    }
}
