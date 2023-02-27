

public class BankAccount {
  private String accountNumber;
  private Double balance;
  private String titleHolder;
  private Double withdrawLimit;
  

  public void deposit(double depositAmount){
    balance += depositAmount= 500;


  }

  public void withdraw(double withdrawAmount){

    balance -= withdrawAmount = 200;

  }

  public void printInformation(){
    System.out.println("What is your bank account number? " + accountNumber);
    System.out.println("What is your title name? " + titleHolder);
    System.out.println("What is the balance in the bank? " + balance);
    System.out.println("What is your withdraw limit? " + withdrawLimit);
    System.out.println("I am doing to witdraw " + 200  + " dollars out of my bank.");
  }

    public static void main (String[] arg){

      BankAccount myAccount = new BankAccount();
      myAccount.accountNumber = "36978-7";
      myAccount.titleHolder = "Jason John Nichols";
      
     
   
      
      myAccount.printInformation();
    }
    
}




 
  

  