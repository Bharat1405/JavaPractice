// String : to lower, to upper, to toogle
import java.util.*;

class StringX
{
    public String StrLower(String str)
    {
        // Step 1 : Convert String to Array
        char Arr[] =str.toCharArray();

        // Step 2 : Perform operation on array
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);
            }
        }

        // Step 3 : Convert Array to String back
        String ret = new String(Arr);

        return ret;
    }

    public String StrUpper(String str)
    {
        // Step 1 : Convert String to Array
        char Arr[] =str.toCharArray();

        // Step 2 : Perform operation on array
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] - 32);
            }
        }

        // Step 3 : Convert Array to String back
        String ret = new String(Arr);

        return ret;
    }

    public String StrToggle(String str)
    {
        // Step 1 : Convert String to Array
        char Arr[] =str.toCharArray();

        // Step 2 : Perform operation on array
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] - 32);
            }
            else if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);
            }
        }

        // Step 3 : Convert Array to String back
        String ret = new String(Arr);

        return ret;
    }
}

class program356
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sobj.nextLine();

        StringX obj = new StringX();

        String sRet = obj.StrToggle(name);
        System.out.println("Converted String : "+sRet);

        sRet = obj.StrLower(name);
        System.out.println("Converted String : "+sRet);

        sRet = obj.StrUpper(name);
        System.out.println("Converted String : "+sRet);
        
    }
}

