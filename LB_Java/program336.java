// Accept no and count digis.

import java.util.*;

class Digits
{
   public int countDigits(int iValue)
   {
        int iCount = 0;
        while(iValue != 0)
        {
            iCount++;
            iValue/=10;
        }
        return iCount;
   }
}

class program336
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();
        int iRet = dobj.countDigits(iNo);

        System.out.println("Number of digits: "+iRet);
    }
}