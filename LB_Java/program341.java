// Armstrong number

import java.util.*;

class Digits
{
   public boolean cheakArmstrong(int iNo)
   {
    int iTemp = iNo;

    //  Count no of digit
    int iCount = 0;
    while(iTemp != 0)
    {
        iCount++;
        iTemp = iTemp / 10;
    }

    iTemp = iNo;
    
    int iSum = 0;
    int iPower = 1;
    int iCnt = 0;
    int iDigit =0;

    while(iNo != 0)
    {
        iDigit = iNo % 10;

        // Logic to calc. power;
        for(iCnt = 1; iCnt <= iCount; iCnt++)
        {
            iPower = iPower * iDigit;
        }

        iSum = iSum + iPower;
        iPower = 1;
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

class program341
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