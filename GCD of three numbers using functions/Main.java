import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	 Scanner i = new Scanner(System.in);
      int n1 = i.nextInt();
      int n2 = i.nextInt();
      int n3 = i.nextInt();

    System.out.println(gcdof3(n1,n2));
    } 
  
  public static int gcdof3(int n1, int n2)
  {
    int min;
    if(n1 > n2)
       {
         min = n2;
       }
    else
       {
         min = n1;
       }
    while(min >= 1)
    {
      if( n1 % min == 0 && n2 % min == 0)
       {
         return min;
       }
      min--;
    }
    return 0;
    }
  } 
