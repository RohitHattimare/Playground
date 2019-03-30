import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
	Scanner i = new Scanner(System.in);
      int num =  i.nextInt();
      int sqr = square(num);
      System.out.println(sqr);
    } 
  
   public static int square(int m)
   {
     int sq = m * m;
     return sq;
   }
}