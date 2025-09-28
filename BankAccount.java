class BankAccount{
private String customerName;
private long accountNumber;
private double currentBalance;
private int securityPIN;

public BankAccount(String customerName, long accountNumber, double currentBalance, int securityPIN){
this.customerName = customerName;
this.accountNumber = accountNumber;
this.currentBalance = currentBalance;
this securityPIN = securityPIN;
}
public void deposit(int enteredPIN, double amount){
if(validatePin(enterPIN)){
if(amount>0){
balance +=amount;
System.out.println("Deposit sucessful. Amount: " + amount);
}
else{
System.out.println("Amount must be positive");
}
else{
System.out.println("Incorrect PIN");
}
public void withdraw(int enterPin, double amount){
if (validatePin(enteredPin)){ 
if (amount > 0 && balance - amount >= 500){
balance -= amount;
System.out.println("Withdrawal successful! Amount: " + amount);
}
else{
System.out.println("Withdrawal failed. Minimum balance 500 required.");
}
}
else{
System.out.println("Incorrect PIN");
}
}
public void printBalance(int enteredPin){
if (validatePin(enteredPin)){
System.out.println("Current Balance for " + name + ": " + balance);
}
else{
System.out.println("Incorrect PIN");
}
}
private boolean validatePin(int enteredPin){
return this.pin == enteredPin;
}
}
 

