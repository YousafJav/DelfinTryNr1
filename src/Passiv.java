import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Passiv extends RegisterSwimmer{

    int price;

    public Passiv(String name, int id, String address, int phoneNumber, String email,
                  boolean gender, boolean payment, LocalDateTime birthDate,
                  int price){
        super(name, id, address, phoneNumber, email, gender, payment, birthDate);
        this.price = price;
    }
    public String toString(){
        return "Price: " + price + super.toString() + "\n";
    }

    public static void passive(){
        Scanner scan = new Scanner(System.in);
        IDCount++;
        System.out.println("Whats the name of the member?");
        String name = scan.nextLine();
        int id = IDCount;
        System.out.println("Whats the address?");
        String address = scan.nextLine();
        System.out.println("Whats the phone number?");
        int number = scan.nextInt();
        System.out.println("Whats the email?");
        String mail = scan.next();
        System.out.println("Are you a male or female, type 1 for female otherwise type 2");
        int genderNum = scan.nextInt();
        boolean gender = false;
        if (genderNum == 1){
            gender = true;
        } else if (genderNum == 2){
            gender = false;
        }

        boolean payment = true;
        System.out.println("Whats your birth year?");
        int year = scan.nextInt();
        System.out.println("Whats your birth month?");
        int month = scan.nextInt();
        System.out.println("Whats your birthday?");
        int day = scan.nextInt();
        LocalDateTime birtdate = LocalDateTime.of(year, month, day, 0, 0);
        int price = 500;

        Passiv newMember = new Passiv(name, id, address, number, mail, gender, payment, birtdate, price);
        swimmersArray.add(newMember);
        writeToFile(name, id, address, number, mail, gender, payment, birtdate, price);

    }


    public static void writeToFile(String name, int id, String address, int number, String mail, boolean gender, boolean payment,
        LocalDateTime birthdate, int price){


            try{
                FileWriter writer = new FileWriter("C:\\Kodning\\Delfin\\src\\Members.txt", true);
                String writeFile = price + " " + id + " " + name + "\n" +
                        address + " " + number + " " + mail + " " + gender + " " + payment + "\n" +
                        birthdate + "\n";
                writer.write(writeFile);
                System.out.println("Written to file succesfully.");
                writer.close();
            } catch (IOException e){
                System.out.println("Error happened. " + e.getMessage());
            }



        }

}
