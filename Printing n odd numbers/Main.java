import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner ip = new Scanner(System.in);
      int n = ip.nextInt();
      for(int count = 0; count <= n * 2; count = count + 1)
      {
         if(count % 2  != 0)
           System.out.println(count);
      }
	}
}