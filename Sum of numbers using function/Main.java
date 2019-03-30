import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner i = new Scanner(System.in);
      int n = i.nextInt();
      System.out.println( son(n));
	}
  
  public static int son(int n)
  {
   int sum = 0;
    for(int i = 0; i <= n; i++)
    {
      sum = sum + i;
    }
     return sum;
 }
}