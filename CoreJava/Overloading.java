class Demo
{
    public int Addition(int a, int b)
    {
        return a+b;
    }

    public int Addition(int a, int b, int c)
    {
        return a+b+c;
    }

    public double Addition(double a, double b)
    {
        return a+b;
    }

    public double Addition(double a, double b, double c)
    {
        return a+b+c;
    }
}
class Overloading
{
    public static void main(String A[])
    {
        Demo obj = new Demo();

        int A = 10, int B = 20, int C =30, int iRet = 0;
        double X = 10.8, double Y = 20.6, double Z = 30.5, double dRet = 0;

        iRet=obj.Addition(A,B);
        iRet=obj.Addition(A,B,C);

        dRet=obj.Addition(X,Y);
        dRet=obj.Addition(X,Y,Z);

    }
}