import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
   Scanner i = new Scanner(System.in);
   int base = i.nextInt();
   int exp = i.nextInt();
    System.out.println(pow(base, exp)); 
 }
  
  public static int pow(int base, int exp)
  {
    int pow = 1;
    while(exp >= 1)
    {
       pow = pow * base;
      exp--;
    }
    return pow;
  }
} 
   	