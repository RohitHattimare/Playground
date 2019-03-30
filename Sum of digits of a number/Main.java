import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner i  = new Scanner(System.in);
      int n = i.nextInt();
      int sum = 0, last_dig = 0;
      while(n>=1)
      {
        last_dig = n % 10;
        sum = sum + last_dig;
        n = n/10;
      }
    System.out.println(sum); 
    }
}