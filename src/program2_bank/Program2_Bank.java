package program2_bank;
public class Program2_Bank 
{
    public static void main(String[] args) 
    {
        Account a1 = new Account(1,"ahmed",4000);
       a1.add_Annual_Interest();
       a1.add_Annual_Interest_Rate();
       a1.add_Monthly_Interest();
       a1.add_Monthly_Interest_Rate();
       a1.Date_created("12:00 pm");
       
       a1.Result();
       
       a1.deposite(2000);
       a1.Result();
       
       a1.withdraw(1000);
       a1.Result();
    }
    
}
