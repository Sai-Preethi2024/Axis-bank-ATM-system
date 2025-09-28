public class ATMSystem{
public static void main(String[] args) {
BankAccount acc1 = new BankAccount("Preethi", 1234567890L, 5000.00, 1111);
BankAccount acc2 = new BankAccount("Anusha", 9876543210L, 300.00, 2222);
BankAccount acc3 = new BankAccount("Aishu", 5555555555L, 1000.00, 3333);
System.out.println("=== ATM Simulation Start ===\n");
acc1.printBalance(1111);
acc2.printBalance(2222);
acc3.printBalance(3333);

System.out.println("\n--- Deposit Tests ---");
acc1.deposit(1111, 2000);
acc1.deposit(1234, 100);

System.out.println("\n--- Withdrawal Tests ---");
acc3.withdraw(3333, 400);
acc3.withdraw(3333, 200);
acc1.withdraw(1111, 6501);   

System.out.println("\n--- PIN Failure Examples ---");
acc2.withdraw(1234, 100); 
acc2.printBalance(1111);   

System.out.println("\n--- Fix low balance by deposit, then withdraw ---");
acc2.deposit(2222, 500);   
acc2.withdraw(2222, 250);  
System.out.println("\n=== ATM Simulation End ===");
}
}