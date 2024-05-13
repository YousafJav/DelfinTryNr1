import java.time.LocalDateTime;
import java.io.*;
import java.util.*;


public class RegisterSwimmer {
    String name;
    public static int IDCount;
    int id;
    String address;
    int phoneNumber;
    String email;
    boolean gender; // true female, false male
    boolean payment;
    LocalDateTime birthDate;

    public static ArrayList<RegisterSwimmer> swimmersArray = new ArrayList<RegisterSwimmer>();


    public RegisterSwimmer(String name, int id, String address, int phoneNumber, String email,
                        boolean gender, boolean payment, LocalDateTime birthDate){
        this.name = name;
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.payment = payment;
        this.birthDate = birthDate;
    }


    public String toString(){
        return " " + "ID: " + id + "Name: " + name + "\n" + "Address: " + address + "phone number: " + phoneNumber +
                "email: " + email + "\n" + "Gender: " +
                gender + "Payment: " + payment + "Birthdate: " + birthDate + "\n";
    }


    public static void main(String[] args) {






        try{

        } catch (IOException e){
            System.out.println("Error happened. " + e.getMessage());
        }




    }



}



