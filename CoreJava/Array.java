class Array
{
    public static void main(String A[])
    {
        //Staic Way
        int Arr1[] = {10,20,30,40,50};      //Member initialisation list

        //Dynamic Way
        int Arr2[] = new int[5];
        Arr2[0] = 10;
        Arr2[1] = 20;                       //Member by member
        Arr2[2] = 30;
        Arr2[3] = 40;
        Arr2[4] = 50;

        System.out.println("Arr1: "+Arr1.length);
        System.out.println("Arr2: "+Arr2.length);
    }
}