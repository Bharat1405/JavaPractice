// String : remove white space

import java.util.*;

class StringX
{
    public String RemoveWhiteSpaces(String str)
    {
        // Step 1 : Convert String to Array
        char Arr[] = str.toCharArray();

        // Step 2 : Perform operation on array
        String output = "";

        int i = 0;
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] != ' '))
            {
                output = output + Arr[iCnt];
            }
        }

        // Step 3 : Convert Array to String back
        return output;

    }
}

class program361
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

