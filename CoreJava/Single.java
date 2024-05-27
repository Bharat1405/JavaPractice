
class Base 
{
    public int A;
    public int B;
    
    public Base()
    {
        System.out.println("Inside base constructor");
        this.A = 11;
        this.B = 21;
    }
    public void fun()
    {
        System.out.println("Inside ase fun");
    }
}

class Derrived extends Base
{
    public int X;
    public int Y;

    public Derrived()
    {
        System.out.println("Inside derrived constructor");
        this.X = 51;
        this.Y = 101;
    }
    public void gun()
    {
        System.out.println("Inside ase gun");
    }
}

class Single
{
    public static void main(String A[])
    {
        Derrived dobj = new Derrived();     //No Casting
        dobj.fun();
        dobj.gun();

        System.out.println(dobj.A);
        System.out.println(dobj.B);
        System.out.println(dobj.X);
        System.out.println(dobj.Y);

    }
}

        // Base bobj = new Base();             //No Casting
        // Derrived dobj = new Derrived();     //No Casting

        // Base bobj2 = new Derrived();        //Up Casting
        // Derrived dobj = new Base();         //Down Casting (Not Allowed)
    