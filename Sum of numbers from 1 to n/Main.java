import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner i = new Scanner(System.in);
      int n = i.nextInt();
      int sum = 0;
      for( int count = 0 ; count <= n; count = count + 1)
      {
         sum = sum + count;
      }
	System.out.println(sum);
    }
}