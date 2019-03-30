import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner oi = new Scanner(System.in);
   int num = oi.nextInt();
    int a,b,c;
    a = num/100;
    b = (num/10)%10;
    c = num % 10;
    System.out.println(c*100+b*10+a);
   }
}