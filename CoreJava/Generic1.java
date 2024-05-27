
class Generic1
{
    public static <T> void Display(T Arr[])
    {
        for(T no :Arr)
        {
            System.out.println(no);
        }
    }

    public static void main(String arg[])
    {
        Integer A[] = {10,20,30,40};
        Float B[] = {50.2f,60.6f,70.8f};
        Double C[] = {50.7,60.3,70.8};

        Display(A);
        Display(B);
        Display(C);

    }
}