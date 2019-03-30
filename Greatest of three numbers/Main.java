import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner i =new Scanner(System.in);
      int a,b,c;
      a = i.nextInt();
      b = i.nextInt();
      c = i.nextInt();
      if(a>b)
         {
          if(a>c)
            System.out.println(a);
          else
            System.out.println(c);
         }
      else
        if(b>c)
        System.out.println(b);
      else
        System.out.println(c);
    }
  }