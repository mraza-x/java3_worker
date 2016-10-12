/**
Mohammed Raza
CSC 236 - Lab1 # 2 (class2)
*/

public class ProductionWorker extends Employee
{
   private int shift;
   private double payrate;

   public ProductionWorker()
   {   super();

	   shift = 0;
	   payrate = 0;
   }


   public ProductionWorker(String n, String i, String d, int s, double pr)
   {  super(n,i,d);

	  shift = s;
	  payrate = pr;
   }


   public void setShift(int s)
   {
      shift = s;
   }


   public void setPayRate(double pr)
   {
      payrate = pr;
   }



   public int getShift()
   {
      return shift;
   }



   public double getPayRate()
   {
      return payrate;
   }

   public String toString()
   {
	   String str = " ";
	   return str;
   }


}
