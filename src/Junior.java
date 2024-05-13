import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.*;
import java.util.*;
import java.time.LocalTime;
class Junior extends RegisterSwimmer{
    int price;
    boolean competitive;

    public Junior(String name, int id, String address, int phoneNumber, String email,
                  boolean gender, boolean payment, LocalDateTime birthDate,
                  int price, boolean competitive){
        //String name, String id, String address, int phoneNumber, String email,
        //                        boolean gender, boolean payment, LocalDateTime birthDate
        super(name, id, address, phoneNumber, email, gender, payment, birthDate);
        this.price = price;
        this.competitive = competitive;
    }

    public String toString(){
        return "Price: " + price + " Competitive: " + competitive + super.toString() + "\n";
    }

    public static void junior(){
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
        int price = 1000;
        System.out.println("Are you competitive? Type 1 for yes or 2 for no.");
        int answer = scan.nextInt();
        boolean competitive = false;
        if (answer == 1){
            competitive = true;

            System.out.println("What was the minute of your record?");
            int minute = scan.nextInt();
            System.out.println("And how many seconds?");
            int seconds = scan.nextInt();
            LocalDate recordTime = LocalDate.of(0, minute, seconds);
            System.out.println("In which year");
            int yearRecord = scan.nextInt();
            System.out.println("What month?");
            int monthRecord = scan.nextInt();
            System.out.println("What day?");
            int dayRecord = scan.nextInt();
            LocalDateTime recordDate = LocalDateTime.of(yearRecord, monthRecord, dayRecord, 0, 0);


            System.out.println("Type 1 if your style is butterfly");
            System.out.println("Type 2 if your style is crawl");
            System.out.println("Type 3 if your style is backcrawl");
            System.out.println("Type 4 if your style is breaststroke");

            int style = scan.nextInt();
            String swimStyle = "None";
            if (style == 1){
                swimStyle = "butterfly";
                SwimRecords newButterfly = new SwimRecords(id, recordDate, recordTime);
                SwimRecords.juniorButterfly.add(newButterfly);
                writeRecords(swimStyle, id, recordDate, recordTime);
            } else if (style == 2){
                swimStyle = "crawl";
                SwimRecords newCrawl = new SwimRecords(id, recordDate, recordTime);
                SwimRecords.juniorCrawl.add(newCrawl);
                writeRecords(swimStyle, id, recordDate, recordTime);
            } else if (style == 3){
                swimStyle = "backcrawl";
                SwimRecords newBackcrawl = new SwimRecords(id, recordDate, recordTime);
                SwimRecords.juniorBackcrawl.add(newBackcrawl);
                writeRecords(swimStyle, id, recordDate, recordTime);
            } else if (style == 4){
                swimStyle = "breaststroke";
                SwimRecords newBreaststroke = new SwimRecords(id, recordDate, recordTime);
                SwimRecords.juniorBreaststroke.add(newBreaststroke);
                writeRecords(swimStyle, id, recordDate, recordTime);
            }
        } else if (answer == 2){
            competitive = false;
        }

        Junior newMember = new Junior(name, id, address, number, mail, gender, payment, birtdate, price, competitive);
        swimmersArray.add(newMember);
        writeToFile(name, id, address, number, mail, gender, payment, birtdate, price, competitive);
    }



    public static void writeToFile(String name, int id, String address, int number, String mail, boolean gender, boolean payment,
                                   LocalDateTime birthdate, int price, boolean competitive){
        try{
            FileWriter writer = new FileWriter("C:\\Kodning\\Delfin\\src\\Members.txt", true);
            String writeFile = price + " " + id + " " + name + "\n" +
                    address + " " + number + " " + mail + " " + gender + " " + payment + "\n" +
                    birthdate + " " + competitive + "\n";
            writer.write(writeFile);
            System.out.println("Written to file succesfully.");
            writer.close();
        } catch (IOException e){
            System.out.println("Error happened. " + e.getMessage());
        }

    }

    public static void writeRecords(String swimStyle, int id, LocalDateTime recordDate, LocalDate recordsTime){
        try{
            FileWriter writer = new FileWriter("C:\\Kodning\\Delfin\\src\\SwimmingRecords.txt", true);
            String writeFile = swimStyle + " " + id + " " + recordDate + " " + recordsTime + "\n";
            writer.write(writeFile);
            writer.close();
        } catch (IOException e){
            System.out.println("Error happened. " + e.getMessage());
        }

    }

}
