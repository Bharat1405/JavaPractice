
class Base 
{
    public int A;
    
    public Base()
    {
        System.out.println("Inside base Defualt constructor");
        this.A = 11;
    }
    public Base(int i)
    {
        System.out.println("Inside base Param. constructor");
        this.A = i;
    }

    public void fun()
    {
        System.out.println("Inside ase fun");
    }
}

class Derrived extends Base
{
    public int X;
    public int A;
    public Derrived()
    {
        super(101);                                          //Constructor
        System.out.println("Inside derrived constructor");
        this.X = 51;
        this.A = 51
    }
    public void gun()
    {
        System.out.println("Inside ase gun");
        System.out.println("Value of A : "+this.A);        //Data
        System.out.println("Value of A : "+super.A);        //Data
        super.fun();                                        //method

    }
}

class SuperDemo
{
    public static void main(String A[])
    {
        Derrived dobj = new Derrived();     //No Casting
        dobj.gun();

       

    }
}

     

/* 
    1. Access data of parent from child
    2. Call methods of parent from child
    3. Call constructor of parent from child
*/