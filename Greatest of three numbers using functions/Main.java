import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner i = new Scanner(System.in);
        int n1 = i.nextInt();
        int n2 = i.nextInt();
        int n3 = i.nextInt();
      System.out.println(go3n(n1,n2,n3));
    }
  
  public static int go3n(int n1, int n2, int n3)
  {
    if(n1 > n2)
    {
     if(n1 > n3)
     {
       return n1;
     }
      else
      {
        return n2;
      }
    }
    else
    {
      return n2;
    }
  }
}
