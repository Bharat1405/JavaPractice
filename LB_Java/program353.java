// Array: Summation of all elemets (Logic inside same class)
import java.util.*;

class StringX
{
    public int countSmall(String str)
    {
        char cArr[] = str.toCharArray();
        int iCount = 0;

        for(int iCnt=0; iCnt < cArr.length; iCnt++)
        {
            if((cArr[iCnt] >= 'a') && (cArr[iCnt] <= 'z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class program353
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sobj.nextLine();

        StringX obj = new StringX();
        int iRet = obj.countSmall(name);
        System.out.println("Number of small characters is : "+iRet);

    }
}

