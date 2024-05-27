
class Demo <T>
{
    public T value;

    public void Accept(T no)
    {
        value = no;
    }

    public void Dispaly()
    {
        System.out.println(value);
    }
}
class Generic3
{
    public static void main(String arg[])
    {
       Demo <Integer> obj1 =new Demo<Integer>();
       obj1.Accept(11);
       obj1.Dispaly();

       Demo <Double> obj2 =new Demo<Double>();
       obj2.Accept(10.6);
       obj2.Dispaly();
    }
}