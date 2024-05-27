// Accept no and sum digits.

import java.util.*;

class Digits
{
   public int sumDigits(int iValue)
   {
        int iSum = 0;
        while(iValue != 0)
        {
            iSum = iSum + (iValue % 10);
            iValue = iValue / 10;
        }
        return iSum;
   }
}

class program338
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();
        int iRet = dobj.sumDigits(iNo);

        System.out.println("Sum of digits: "+iRet);
    }
}