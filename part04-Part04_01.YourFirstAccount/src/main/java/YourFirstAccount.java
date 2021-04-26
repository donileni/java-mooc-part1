
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account ewingsAccount = new Account("Ewing's account", 100.00);
        
        ewingsAccount.deposit(20.00);
        
        System.out.println(ewingsAccount);
    }
}
