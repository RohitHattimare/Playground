import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {      
      Scanner i = new Scanner(System.in);
      int n = i.nextInt();
      for( int g=1 ; g<=n ; g++)
      {
         if( n % g == 0)
           System.out.println(g);
      }
   }
}