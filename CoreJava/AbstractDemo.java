 class RBI 
{
   public abstract float CalculatteROI();
   // virtual float CalculatteROI()=0;

   public void DisplayRules()
   {
      System.out.println("ADAR and PAN required");
      System.out.println("Minimus balance : Rs.10,000");
   }
}

class BOM extends RBI            
{
   public float CalculatteROI()
   {
      return 7.7f;
   }
}

class SBI extends RBI            
{
   public float CalculatteROI()
   {
      return 5.7f;
   }
}


class AbstactDemo
{
   public static void main (String A[])
   {
      // RBI robj = new RBI();

      SBI sobj = new SBI();
      BOM bobj = new BOM();

      sobj.DisplayRules();
      bobj.DisplayRules();

      float fRet = 0.0f;

      fRet = sobj.CalculatteROI();
      System.out.println("ROI of SBI : "+fRet);

      fRet = bobj.CalculatteROI();
      System.out.println("ROI of BOM : "+fRet);
   }
}