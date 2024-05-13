import java.util.*;
public class DelfinSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Whats the code?");

        boolean program = true;
        int code = scan.nextInt();
        if (code != 1234) {
            program = false;
        } else {
            program = true;
        }

        while (program) {


            //Switch for menu.
            System.out.println("...................");
            System.out.println(".  Menu Delfinen  .");
            System.out.println("...................");
            System.out.println("Choose a number between 1 - 5");
            System.out.println("→ 1. Register a new member");
            System.out.println("→ 2. See swimming records");
            System.out.println("→ 3. Check balance"); // see people who have paid and not payed
            System.out.println("→ 4. See a list of members");//aktive, passive, all //remove a member
            System.out.println("→ 5. Edit a member");
            System.out.println("→ 6. Delete member");
            System.out.println("→ 7. Search for member");


            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("What membership would you like?");
                    System.out.println("1. for senior");
                    System.out.println("2. junior");
                    System.out.println("3. for senior over 60");
                    System.out.println("4. for passive membership");
                    int membership = scan.nextInt();
                    if (membership == 1){
                        Senior.senior();
                    } else if (membership == 2){
                        Junior.junior();
                    } else if (membership == 3){
                        Senior60Plus.registration60Plus();
                    } else if (membership == 4){
                        Passiv.passive();
                    } else {
                        System.out.println("You chose a wrong number.");
                    }

                    break;
                case 2:
                    // swim records
                    break;
                case 3:
                    // balance
                    break;
                case 4:
                    System.out.println(RegisterSwimmer.swimmersArray);
                    break;
                case 5:
                    //edit
                    break;
                case 6:
                    // Delete
                    break;
                case 7:
                    // balance
                    break;
                default:
                    System.out.println("Wrong number, you have to press a number between 1 - 5");
                    break;


            }

        }



    }
}
