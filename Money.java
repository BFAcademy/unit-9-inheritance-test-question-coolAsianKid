public class Money
{
    private double amount;

    Money(double b)
    {
        amount = b;
    }

    public double getAmount()
    {
        return amount;
    }}

class Coin extends Money
{
    private String name;
    public Coin(String a, double b)
    {
        super(b);
        name = a;
    }

    public String toString()
    {
        if (this.getAmount() == 0.25)
        {return "Quarter";}
        if (this.getAmount() == 0.10)
        {return "Dime";}
        if (this.getAmount() == 0.05)
        {return "Nickel";}
        return name;
    }

    public String getName()
    {
        return name;
    }
    public boolean equals(Coin a)
    {   
        boolean result = true;
        if (this.getAmount() != a.getAmount())
        {
            result = false;
        }

    
        for (int i = 0; i < this.toString().length(); i++)
{
        if (this.getName().substring(i, i+1).compareTo(a.getName().substring(i,i+1)) != 0)
        {
            result = false;
        }}

        return result;
    }

}

class Nickel extends Coin
{
    
    public Nickel()
    {
        super("Nickel", 0.05);
    }

    public boolean equals(Coin a)
    {
        boolean result = super.equals(a);
        return result;
    }
}

class Dime extends Coin
{
    public Dime()
    {
        super("Dime", 0.10);
    }
    public boolean equals(Coin a)
    {boolean result = super.equals(a);
        return result;
    }
}

class Quarter extends Coin
{
    public Quarter()
    {
        super("Quarter", 0.25);
    }
    public boolean equals(Coin a)
    {boolean result = super.equals(a);
        return result;
    }
}
class Bill extends Money
{
    private String name;
    public Bill(int a)
    {
        super(a);
        name = "$"+a;
    }
    public String toString()
    {
        return name;
        
    }
}