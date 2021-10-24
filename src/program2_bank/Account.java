package program2_bank;
public class Account 
{
    private int ID =0;
    private String Name;
    private double Balance =0;
    private String Date;
    private double Annual_Interst;
    private double Annual_Interst_Rate;
    private double Monthly_Interst;
    private double Monthly_Interst_Rate;
    private double rate = 0.15;
      
    public Account()
    {    }
    public Account(int id ,String name ,double bal)
    {
        ID = id;
        Name = name;
        Balance = bal;
    }
    
    
    public void set_id(int id)
    {
        ID = id;
    }
    public void set_name(String name)
    {
        Name = name;
    }
    public void set_balance(double bal)
    {
        Balance = bal;
    }
    public String Date_created(String date)
    {
        Date = date;
        return Date;
    }
    
    
    public int get_id()
    {
        return ID;
    }
    public String get_name()
    {
        return Name;
    }
    public double get_balance()
    {
        return Balance;
    }
    public double get_annual()
    {
        return Annual_Interst;
    }
    public double get_annual_rate()
    {
        return Annual_Interst_Rate;
    }
    
    
    public void add_Annual_Interest()
    {
         Annual_Interst = Balance + (Balance * rate);
    }
    public void add_Annual_Interest_Rate()
    {
         Annual_Interst_Rate = Balance * rate;
    }
    public void add_Monthly_Interest()
    {
         Monthly_Interst= (Balance + (Balance * rate))/12;
    }
    public void add_Monthly_Interest_Rate()
    {
         Monthly_Interst_Rate = (Balance + (Balance * rate))/(12*Balance);
    }
    
    public void withdraw(double amt)
    {
        if(this.Balance >= amt)
        {
            this.Balance-=amt;
        }
    }
    
    public void deposite(double amt)
            
    {
       Balance += amt; 
    }
    
    public void Result()
    {
        System.out.println("ID : " +ID +" | Name : "+Name +" |\tThe Balance : "+Balance +" |\tThe Time of opening the Account : "+Date
                +" \nAnnual Interset : "+Annual_Interst+" |\tAnnual Interset Rate : "+Annual_Interst_Rate +" |\tMonthly Interset : "+Monthly_Interst +" |\tMonthly Interset Rate : "+Monthly_Interst_Rate);
    }
}