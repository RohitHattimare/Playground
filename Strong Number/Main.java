import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner i = new Scanner(System.in);
      int n = i.nextInt();
      int temp = n;
      int sum = 0, fact = 1;
      while(n>0)
      {
        int rem = n % 10;
       for(int count = 1; count <= rem ; count++)
        {
          fact = fact * count;
        }
        sum = sum + fact;
        fact = 1;
        n = n/10;
      }
      if(sum == temp)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}