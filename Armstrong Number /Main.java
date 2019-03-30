import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner ip = new Scanner(System.in);
      int n = ip.nextInt();
      int temp = n;
      int count = 0;
      while( n > 0 )
      {
        count++;
        n = n/10;        
      }
      n = temp;
      int sum = 0, pow = 1;
      while(n > 0)
      {
        int rem = n % 10;
        for( int i = 1; i <= count; i++)
        {
          pow = pow * rem;
        }
        sum = sum + pow;
        pow = 1;
        n = n/10;
      }
      if( sum == temp)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
      
	}
}