// String : remove white space

import java.util.*;

class StringX
{
    public String RemoveWhiteSpaces(String str)
    {
       return str.replaceAll("\\s","");

    }
}

class program362
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sobj.nextLine();

        StringX obj = new StringX();

        String sRet = obj.RemoveWhiteSpaces(name);
        System.out.println("String without white spaces : "+sRet);
        
    }
}

