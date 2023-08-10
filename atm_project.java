import java.util.Scanner;

class Main {
  static class ATM {
    float Balance;
   private int pin = 1234;

 public void checkpin() {
      System.out.print("Enter your pin: ");
      Scanner sc = new Scanner(System.in);
      int enteredPin = sc.nextInt();
      if (enteredPin == pin) {
        menu();
      } else {
        System.out.println("Enter a valid pin");
         System.out.print("Enter your pin: ");
             sc = new Scanner(System.in);
             enteredPin = sc.nextInt();
         if (enteredPin == pin) {
        menu();
      }
      }
    
             }

    public void menu() {
      System.out.println("Enter your choice");
      System.out.println("1. Withdraw amount");
      System.out.println("2. Deposit amount");
      System.out.println("3. Transfer");
      System.out.println("4. Balance");
      System.out.println("5. Quit");

      Scanner sc = new Scanner(System.in);
      int opt = sc.nextInt();
       if (opt == 1) {
        withdrawamount();
      } else if (opt == 2) {
        depositamount();
      } else if (opt == 3) {
        transfer();
      } else if (opt == 4) {
         TotalBalance();
         
      }else if(opt==5){
          System.out.println("Thank you for using the ATM.");
        return;
      } 
      else {
        System.out.println("Please Enter a valid number");
      }
    }

  

    public void withdrawamount() {
      System.out.println("Enter withdraw amount");
      Scanner sc = new Scanner(System.in);
      float amount = sc.nextFloat();
      if (amount > Balance) {
        System.out.println("Insufficient amount");
      } else {
        Balance = Balance - amount;
        System.out.println("Money withdrawn successfully");
      }
      menu();
    }

    public void depositamount() {
      System.out.println("Enter deposit amount");
      Scanner sc = new Scanner(System.in);
      float amount = sc.nextFloat();
      Balance = Balance + amount;
      System.out.println("Money deposited successfully");
      menu();
    }

    public void transfer() {
      System.out.println("Enter transfer amount");
      Scanner sc = new Scanner(System.in);
      float amount = sc.nextFloat();
      if (amount > Balance) {
        System.out.println("Insufficient amount");
      } else {
        Balance = Balance - amount;
        System.out.println("Transfer successfully");
      }
      menu();
    }

    public void TotalBalance(){
      System.out.println("Balance: " + Balance);
      menu();
    }
  }

  public static void main(String[] args) {
    ATM obj = new ATM();
    obj.checkpin();
  }
}
