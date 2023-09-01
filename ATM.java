import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 100000;
        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    int withdraw = input.nextInt();
                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;
                case 2:
                    System.out.print("Enter money to be deposited:");
                    int deposit = input.nextInt();
                    balance += deposit;
                    System.out.println("Your Money has been successfully deposited");
                    break;
                case 3:
                    System.out.println("Balance : " + balance);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
