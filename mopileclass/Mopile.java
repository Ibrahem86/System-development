/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mopileclass;

/**
 *
 * @author Dell
 */
public class Mopile {
    private String Mainfact;
    private int Model;
    private double Price;
    
    public void setMainfact (String m)
    {
        Mainfact = m;
    }
    public void setModel (int d)
    {
         if (Model > 2006)
           Model = d;
      else
          System.out.println("Invaled Model");
    }
    public void setPrice (double p)
    {
        if(Price > 0)
        Price = p;
        else
          System.out.println("Invaled Model");
    }
    public String getMainfact ()
    {
        return Mainfact;
    
    }
    public int getModel ()
    {
          return Model;
    }
    public double getPrice()
    {
        return Price;
    }
}
