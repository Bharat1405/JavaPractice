
class Demo
{
    public int No1;
    final public int No2;
    final public int No3;

    public Demo(int i, int j, int k)
    {
        this.No1 = i;
        this.No2 = j;
        this.No3 = k;
    }


}



class Final1
{
    public static void main (String A[])
    {
        Demo obj = new Demo(11,21,51);
        System.out.println(obj.No1);
        System.out.println(obj.No2);
        System.out.println(obj.No3);
        
        obj.No1++;
        // obj.No2++;
        // obj.No3++;

        System.out.println(obj.No1);
        System.out.println(obj.No2);
        System.out.println(obj.No3);
       
    }
}