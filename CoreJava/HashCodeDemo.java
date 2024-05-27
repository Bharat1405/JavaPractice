class Marvellous        //extends Object
{
    public int No1;
    public int No2;

}

class HashCodeDemo      //extends Object
{
    public static void main(String Arg[])
    {
        Marvellous mobj = new Marvellous();
        System.out.println("Hash code :"+mobj.hashCode());
    }
}