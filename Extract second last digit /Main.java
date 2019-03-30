import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner i =  new Scanner(System.in);
      int a = i.nextInt();
      int v = (a/10)%10;
      System.out.println(v);
	}
}