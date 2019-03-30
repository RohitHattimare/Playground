import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner ip = new Scanner(System.in);
      int n1 = ip.nextInt();
      int a =n1/100;
      int b = n1%10;
      System.out.println(a+b);
	}
}