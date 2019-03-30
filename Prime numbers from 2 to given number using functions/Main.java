import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner i = new Scanner(System.in);
    int n = i.nextInt();
    for( int j = 2 ; j<= n; j++)
     {
      if(is_prime(j))
         {
           System.out.println(j);
         }
     }
  }
  
  public static boolean is_prime(int n)
  {
    boolean prime = true;
    for(int num = 2; num<=n/2 ;num++)
   if(n % num == 0)
    {
      prime = false ;
      break;
    }
  return prime;
  }
}