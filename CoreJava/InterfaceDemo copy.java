interface RBI 
{
   public final float PI = 3.14f;

   public float CalculateArea(float Radius);
   public float CalculateCircumferance(float Radius);
}

class Demo implements Circle
{
   public float CalculateArea(float Radius)
   {
      return PI* Radius* Radius;
   }
   public float CalculateCircumferance(float Radius)
   {
      return 2*PI*Radius;
   }
}


class InterfaceDemo
{
   public static void main (String A[])
   {
      Demo obj = new Demo();

      

   }

}