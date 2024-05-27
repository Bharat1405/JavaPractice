// Accept no and return generic root.

import java.util.*;

class Digits
{
   public int genericRoot(int iNo)
   {
        int iSum = 0;
        int iDigit = 0;

        while(iNo >= 10)
        {
            while(iNo != 0)
            {
                iDigit = iNo % 10;
                iSum = iSum + iDigit;
                iNo = iNo / 10;
            }
            if(iSum >= 10)
            {
                iNo = iSum;
                iSum = 0;
            }
            else
            {
                iNo = iSum;
                break;
            }
        }
        return iNo;

        // while(iSum > 10)
        // {
        //     while(iNo != 0)
        //     {
        //         iSum = iSum + (iNo % 10);
        //         iNo = iNo / 10;
        //     }
        //     iNo = iSum;
        //     if(iSum > 10)
        //     {
        //         iSum = 0;
        //     }
        // } 
        // return iSum;  
   }
}

class program339
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();
        int iRet = dobj.genericRoot(iNo);

        System.out.println("Sum of digits: "+iRet);
    }
}