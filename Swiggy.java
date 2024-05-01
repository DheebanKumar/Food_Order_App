import java.util.Scanner;

public class Swiggy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n");
        System.out.println("\t************************");
        System.out.println("\t|  WELCOME TO PORTAL   |");
        System.out.println("\t************************");
        System.out.println("\t|  1. About us         |");
        System.out.println("\t|----------------------|");
        System.out.println("\t|  2. USER REGISTRATION|");
        System.out.println("\t|----------------------|");
        System.out.println("\t|  3. Swiggy           |");
        System.out.println("\t|----------------------|");
        System.out.println("\t|  4. Feedback         |");
        System.out.println("\t|----------------------|");
        System.out.println("\t|  5. EXIT             |");
        System.out.println("\t************************");

        System.out.print(" \n\tEnter your choice No:  ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
            System.out.println("\n\n\tAbout Us: Swiggy is India's largest and most valuable online food ordering and delivery platform. With a presence in over 500 cities, we connect millions of foodies with their favorite restaurants every day.");
            break;
            case 2:
                userRegistration(scanner);
                break;
            case 3:
            showSwiggyMenu(scanner);
            break;
            case 4:
            System.out.println("\t\t*  Thanks for your Time. Feedback please!  *");
            String presstime = scanner.nextLine();
            String feedback = scanner.nextLine();
            System.out.println("\t\t**********************************************************************");
            System.out.println("\t\t|Here your FEEDBACK\n\t\t|"+ feedback + "\n\t\t|We take it, Thank you once again!  |");
            System.out.println("\t\t**********************************************************************");
            break;

            case 5:
                System.out.println("\n\n");
                System.out.println("\t\t****************");
                System.out.println("\t\t*  Thank you!  *");
                System.out.println("\t\t****************");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }

    private static void userRegistration(Scanner scanner) {
        System.out.println("\n\t*** Welcome to the registration panel *** ");
        System.out.println("--------------------------------");
        scanner.nextLine(); // consume newline
        System.out.print("Enter your address: \t");
        String address = scanner.nextLine();
        System.out.print("Enter your mobile number: \t");

        while (true) {
            try {
                long mobileNumber = Long.parseLong(scanner.nextLine());
                int otp = generateOTP();
                System.out.println("An OTP has been sent to your mobile number.");
                System.out.print("Enter the OTP: ");
                int enteredOTP = scanner.nextInt();
                if (enteredOTP == otp) {
                    System.out.println("\n\n\t\t********************************");
                    System.out.println("\t*                                  *");
                    System.out.println("\t*  Your Registration is completed  *");
                    System.out.println("\t*                                  *");
                    System.out.println("\t************************************");

                } else {
                    System.out.println("\n\n\t***************************");
                    System.out.println("\t*                             *");
                    System.out.println("\t*       Wrong OTP             *");
                    System.out.println("\t*                             *");
                    System.out.println("\t*******************************");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid mobile number. Please enter again: ");
            }
        }
    }

    private static void showSwiggyMenu(Scanner scanner) {
        System.out.println("\n\tWelcome to Swiggy!");
        System.out.println("\n\tMENU:");
        System.out.println("\t1. Burger - Rs.200.00");
        System.out.println("\t2. Pizza - Rs.280.00");
        System.out.println("\t3. Pasta - Rs.150.00");
        System.out.println("\t4. Coke - Rs.230.00");
        System.out.println("\t5. Confirm Order");
        System.out.println("\t6. Cancel Order");

        double totalBill = 0;
        while (true) {
            System.out.print("\n\tEnter your choice (1-6): ");
            int itemChoice = scanner.nextInt();
            switch (itemChoice) {
                case 1:
                    totalBill += 200.00;
                    break;
                case 2:
                    totalBill += 280.00;
                    break;
                case 3:
                    totalBill += 150.00;
                    break;
                case 4:
                    totalBill += 230.00;
                    break;
                case 5:
                    if (totalBill == 0) {
                        System.out.println("\n\tPlease select at least one item before confirming order.");
                    } else {
                        System.out.println("\n\tOrder confirmed! Your total bill is: Rs." + totalBill);
                        return;
                    }
                    break;
                case 6:
                    System.out.println("\n\tOrder canceled.");
                    return;
                default:
                    System.out.println("\n\tInvalid choice. Please enter a number between 1 and 6.");
                    break;
            }
        }
    }

    private static void foodorder(Scanner scanner){

        System.err.println("GIVe the order");
    }
    private static int generateOTP() {
        double res = Math.random() * 999 + 999;
        return (int) res;
    }
}
