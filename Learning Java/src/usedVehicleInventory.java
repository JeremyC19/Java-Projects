import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


import static java.awt.SystemColor.text;
import static javax.swing.UIManager.get;

public class usedVehicleInventory {
    private String vehicleMake;
    private String vehicleModel;
    private String vehicleColor;
    private int vehicleYear;
    private int vehicleMileage;
    private String vinNumber;
    private static ArrayList<usedVehicleInventory> vehicleInventory;
    private final static String FILENAME = "C:\\Users\\gcor7\\usedVehicleInventory.txt";
    static boolean YN;
    private usedVehicleInventory vehicle;


    public usedVehicleInventory() {
    vehicleInventory = new ArrayList<usedVehicleInventory>();
}

public usedVehicleInventory(String make, String model, String color, int year, int mileage, String vin) {
    this.vehicleMake = make;
    this.vehicleModel = model;
    this.vehicleColor = color;
    this.vehicleYear = year;
    this.vehicleMileage = mileage;
    this.vinNumber = vin;
}
public String getMake() {
    return vehicleMake;
}

public String getModel(){
    return vehicleModel;
}

public String getColor() {
    return vehicleColor;
}

public int getYear() {
    return vehicleYear;
}

public int getMileage() {
    return vehicleMileage;
}

public String getVin() {
    return vinNumber;
}

public void setMake(String make) {
    this.vehicleMake = make;
}

public void setModel(String model) {
    this.vehicleModel = model;
}

public void setColor(String color) {
    this.vehicleColor = color;
}

public void setYear(int year) {
    this.vehicleYear = year;
}

public void setMileage(int mileage) {
    this.vehicleMileage = mileage;
}

public void setVin(String vinNumber) {
    this.vinNumber = vinNumber;
}

public void addVehicle(usedVehicleInventory vehicle) {
    usedVehicleInventory.add(vehicle);
}

    private static void add(usedVehicleInventory vehicle) {
    }

    public void removeVehicle(String make, String model, String color, int year, int mileage, String vin) {
    for (int i=0;i<vehicleInventory.size();i++) {
            usedVehicleInventory vehicle = vehicleInventory.get(i);
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)
            && vehicle.getColor().equalsIgnoreCase(color) &&
            vehicle.getYear()==year&& vehicle.getMileage()==mileage) {
                vehicleInventory.remove(vehicle);
            }
    }
}


public void updateVehicle(String makeOld, String modelOld, String colorOld, int yearOld, int mileageOld, String vinOld,
        String makeNew, String modelNew, String colorNew, int yearNew, int mileageNew, String vinNew){
        for(int i=0;i<vehicleInventory.size();i++){
        usedVehicleInventory vehcile=vehicleInventory.get(i);
        if(vehicle.getMake().equalsIgnoreCase(makeOld)&&
        vehicle.getModel().equalsIgnoreCase(modelOld)&&
        vehicle.getColor().equalsIgnoreCase(colorOld)&&
        vehicle.getYear()==yearOld&&
        vehicle.getMileage()==mileageOld){
        vehicle.setMake(makeNew);
        vehicle.setModel(modelNew);
        vehicle.setColor(colorNew);
        vehicle.setYear(yearNew);
        vehicle.setMileage(mileageNew);
        vehicle.setVin(vinNew);
        }
        }
        }

public void Display() {
    BufferedWriter bw = null;
    try {
        FileWriter fw = new FileWriter(FILENAME);
        bw = new BufferedWriter(fw);
        System.out.println("\nVehicles Information:\n");
        for (int i = 0; i < vehicleInventory.size(); i++) {
            usedVehicleInventory vehicleInventory;
            get(i);
            System.out.println("Vehicle " + (i + 1) + ":");
            bw.write("Vehicle " + (i + 1) + ":");
            bw.newLine();
            System.out.println("Make: " + vehicle.getMake());
            bw.write("Make: " + vehicle.getMake());
            bw.newLine();
            System.out.println("Model: " + vehicle.getModel());
            bw.write("Model: " + vehicle.getModel());
            bw.newLine();
            System.out.println("Color: " + vehicle.getColor());
            bw.write("Color: " + vehicle.getColor());
            bw.newLine();
            System.out.println("Year: " + vehicle.getYear());
            bw.write("Year: " + vehicle.getYear());
            bw.newLine();
            System.out.println("Mileage: " + vehicle.getMileage());
            bw.write("Mileage: " + vehicle.getMileage());
            bw.newLine();
            System.out.println("Vin Number: " + vehicle.getVin());
            bw.write("Vin Number: " + vehicle.getVin());
            bw.newLine();
            bw.newLine();
            System.out.println("");
        }
        bw.flush();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException ioe) {
        ioe.printStackTrace();
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
                if (bw != null) {
                    bw.close();
            }
} catch (Exception e) {
            e.printStackTrace();
}
}
}


public static void main (String[] args) {
    usedVehicleInventory automobile = new usedVehicleInventory();
    Scanner userInput = new Scanner(System.in);
    while(true) {
        System.out.println("\nUsed Vehicle Inventory Menu:");
        System.out.println("");
        System.out.println("1. Add Used Vehicle");
        System.out.println("2. Update Existing Vehicle");
        System.out.println("3. Remove Vehicle Inventory");
        System.out.println("4. Used Vehicle Inventory");
        System.out.println("5. Write Inventory to file");
        System.out.println("6. Close");
        System.out.println("");
        System.out.println("Your Selection: ");
        int option = userInput.nextInt();
        userInput.nextLine();
        if (option == 1) {
            System.out.println("\nAdd Used Vehicle Menu");
            System.out.println("");
            System.out.println("Vehicle Make: ");
            String make = userInput.nextLine();
            System.out.println("");
            System.out.println("Vehicle Model: ");
            String model = userInput.nextLine();
            System.out.println("");
            System.out.println("Vehicle Color: ");
            String color = userInput.nextLine();
            System.out.println("");
            System.out.println("Vehicle Year: ");
            int year = userInput.nextInt();
            System.out.println("");
            System.out.println("Vehicle Mileage: ");
            int mileage = userInput.nextInt();
            System.out.println("");
            System.out.println("Vin Number: ");
            String vin = userInput.nextLine();
            System.out.println("");
            usedVehicleInventory vehicle = new usedVehicleInventory(make,
                    model, color, year, mileage, vin);
            automobile.addVehicle(vehicle);
        } else if (option == 2) {
            System.out.println("Vehicle Make: ");
            String makeOld = userInput.nextLine();
            System.out.println("");
            System.out.println("Vehicle Model: ");
            String modelOld = userInput.nextLine();
            System.out.println("");
            System.out.println("Vehicle Color: ");
            String colorOld = userInput.nextLine();
            System.out.println("");
            System.out.println("Vehicle Year: ");
            int yearOld = userInput.nextInt();
            System.out.println("");
            System.out.println("Vehicle Mileage: ");
            int mileageOld = userInput.nextInt();
            System.out.println("");
            System.out.println("Vin Number: ");
            String vinOld = userInput.nextLine();
            System.out.println("");
            System.out.println("\nEnter New Vehicle Information to Update:");
            System.out.println("Vehicle Make: ");
            String makeNew = userInput.nextLine();
            System.out.println("");
            System.out.println("Vehicle Model: ");
            String modelNew = userInput.nextLine();
            System.out.println("");
            System.out.println("Vehicle Color: ");
            String colorNew = userInput.nextLine();
            System.out.println("");
            System.out.println("Vehicle Year: ");
            int yearNew = userInput.nextInt();
            System.out.println("");
            System.out.println("Vehicle Mileage: ");
            int mileageNew = userInput.nextInt();
            System.out.println("");
            System.out.println("Vin Number: ");
            String vinNew = userInput.nextLine();
            automobile.updateVehicle(makeOld, modelOld, colorOld, yearOld, mileageOld, vinOld,
                    makeNew, modelNew, colorNew, yearNew, mileageNew, vinNew);
        } else if (option == 3) {
            System.out.println("\nWhich Vehicle Would You Like To Remove?");

            System.out.print("Vehicle Make: ");
                    String make = userInput.nextLine();

            System.out.print("Vehicle Model: ");
                    String model = userInput.nextLine();

            System.out.print("Vehicle Color: ");
            String color = userInput.nextLine();

            System.out.print("Vehicle Make: ");
                int year = userInput.nextInt();

            System.out.print("Vehicle Mileage: ");
                int mileage = userInput.nextInt();

            System.out.print("Vin Number: ");
            String vin = userInput.nextLine();
            System.out.println("");
                automobile.removeVehicle(make, model, color, year, mileage, vin);


        } else if (option == 4) {
            for (int i=0; i < vehicleInventory.size(); i++) {
                System.out.println(vehicleInventory.get(i) + " ");
            }
        } else if (option == 5) {
            try {
                FileWriter fileWriter = new FileWriter("Vehicle Inventory.txt");

                fileWriter.write(String.valueOf(text));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            break;
        }
    }

}
}