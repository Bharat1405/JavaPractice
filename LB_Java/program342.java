// Armstrong number

import java.util.*;

class Digits
{
    int countDigits(int iNo)
    {
        int iCount = 0;
        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }
        return iCount;
    }

    int power(int X, int Y)
    {
        int iPower = 1;

        for(int iCnt = 1; iCnt <= Y; iCnt++)
        {
            iPower = iPower * X;
        }
        return iPower;
    }

    public boolean cheakArmstrong(int iNo)
    {
        int iCount = 0, iSum = 0, iDigit = 0, iRet = 0;
        iCount = countDigits(iNo);

        int iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRet = power(iDigit, iCount);
            iSum = iSum + iRet;
            iNo = iNo /10;
        }

        if(iSum == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program342
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();
        boolean bRet = dobj.cheakArmstrong(iNo);

        if(bRet == true)
        {
            System.out.println("No. is Armstrong");
        }
        else
        {
            System.out.println("No. is not Armstrong");

        }
    }
}

/*
    Input = 371
    3^3 + 7^3 + 1^3
    27 + 343 + 1
    371
*/