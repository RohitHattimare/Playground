import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner i  = new Scanner(System.in);
  int num = i.nextInt();
    for(int n = 1; n <= num; n++)
    {
      System.out.print(n);
      if(n % 3 ==0)
        System.out.print(",");
    }
  }
}