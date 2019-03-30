import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int arr[]= new int[size];
    for(int i = 0 ; i < size; i++)
    {
      arr[i] = in.nextInt();
    }
    int value = in.nextInt();
    equalornot(arr,size,value);
  }
  
  public static void equalornot(int arr[], int size, int value)
  {
    int sum = 0;
    for(int i = 0; i < size; i++)
    {
      for(int j = i+1;  j < size; j++)
      {
        sum = arr[i]+arr[j];
        if(sum == value)
        {
          System.out.println(arr[i]+ ", "+ arr[j]);
        }
      }
    }
  }
}