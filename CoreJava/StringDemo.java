
class StringDemo     
{
    public static void main(String Arg[])
    {
       char Arr[] = {'H','E','L','L','O'};

       String str1 = new String(Arr);

       String str2 = "HELLO";

       String str3 = new String("HELLO");

       System.out.println(str1);
       System.out.println(str2);
       System.out.println(str3);

       System.out.println(str1.length());
       System.out.println(str2.length());
       System.out.println(str3.length());
        
    }
}