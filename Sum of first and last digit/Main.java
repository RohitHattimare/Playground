import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
	Scanner i = new Scanner(System.in);
      int n = i.nextInt();
      int last_dig = n % 10;
      while(n>=10)
      {
        n=n/10;
      }
     int  sum = last_dig + n;
      System.out.println(sum);
    }
}