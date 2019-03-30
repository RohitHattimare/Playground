import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int arr[] = new int[size];
    for(int i = 0; i < size; i++)
    {
      arr[i] = in.nextInt();
    }
    eleofgreat(arr, size);
  }
  
  public static void eleofgreat(int arr[], int size)
  {
    int great1 = 0;
    for(int i = 0; i < size; i++)
        {
          if(arr[i] > great1)
          {
            great1 = arr[i] ;
          }
        }
        for(int i = 0; i < size; i++)
        {
           if(great1 == arr[i])
           {
             System.out.println(i);
           }
        }
     }
}