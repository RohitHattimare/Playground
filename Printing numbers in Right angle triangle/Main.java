import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner i = new Scanner(System.in);
      int num = i.nextInt();
      for( int row =1; row <= num ; row++)
      {
        for(int col=1; col <= row ; col++)
       {
          System.out.print(row);
       }
        System.out.print("\n");
     } 
  }
}