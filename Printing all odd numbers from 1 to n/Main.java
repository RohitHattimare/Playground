import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner i = new Scanner(System.in);
      int num = i.nextInt();
      
      for(int count = 1 ; count <= num ; count = count + 1)
      {
        if(count % 2 != 0)
         System.out.println(count);
      }
	}
}