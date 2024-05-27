// String : remove white space

import java.util.*;

class StringX
{
    public String RemoveWhiteSpaces(String str)
    {
        // Step 1 : Convert String to Array
        char Arr[] = str.toCharArray();

        // Step 2 : Perform operation on array
        char Brr[] = new char[Arr.length];

        int i = 0;
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] != ' '))
            {
                Brr[i] = Arr[iCnt];
                i++;
            }
        }

        // Step 3 : Convert Array to String back
        return new String(Brr);

    }
}

class program360
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

