public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone;
    }

    public void depositFunds(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount successfully credited, Updated balance in your account is $"+balance);
        }
    }
    public void withdrawFunds(double amount){
        if(balance-amount>=0){
            balance-=amount;
            System.out.println("$"+amount+" successfully debited, updated balance = $"+this.balance);
        }else{
            System.out.println("Insufficient balance");
        }
    }

}



/*
public class Main {
    public static void main(String[] args) {
        BankAccount ma= new BankAccount();
        ma.setAccountNumber("1011398634");
        ma.setBalance(20000);
        ma.setCustomerName("Eric Cartman");
        ma.setEmail("ericCartman1@gmail.com");
        ma.setPhone("101-555-4628");

        System.out.println("Customer name - "+ma.getCustomerName());
        System.out.println("customer e-mail - "+ma.getEmail());
        System.out.println("customer acc. balance - $"+ma.getBalance());
        System.out.println("customer account number - "+ma.getAccountNumber());
        System.out.println("customer contact number - "+ma.getPhone());


        ma.withdrawFunds(5000);
        ma.withdrawFunds(8000);
        ma.withdrawFunds(7000);
        ma.depositFunds(6000);
        ma.withdrawFunds(22000);
    }
}

*/