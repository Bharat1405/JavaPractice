// Accept no and sum digits.

import java.util.*;

class Digits
{
   public int sumDigits(int iValue)
   {
        int iSum = 0;
        int iDigit = 0;
        while(iValue != 0)
        {
            iDigit = iValue % 10;
            iSum += iDigit;
            iValue/=10;
        }
        return iSum;
   }
}

class program337
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