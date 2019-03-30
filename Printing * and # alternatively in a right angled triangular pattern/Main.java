import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int num = in.nextInt();
      int count = 0;
      for(int row = 0; row < num; row++)
      {
        for(int col = 0 ; col<= row; col++)
        {
          count++;
          if(count%2 ==0)
            System.out.print("#");
          else
            System.out.print("*");
        } 
        System.out.print("\n");
      }
    }
}