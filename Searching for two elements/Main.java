import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      for(int ind = 0; ind < size; ind++)
      {
        arr[ind] = in.nextInt();
       }
        int no1 = in.nextInt();  
        int no2 = in.nextInt();
            int nill_no1 = -1;
            int nill_no2 = -1;
    
            for( int n = 0; n < size ; n++)
            {
              if(no1 == arr[n])
              {
                nill_no1 = n;
              }
              if(no2 == arr[n])
              {
                nill_no2 = n;
              }
            }
            System.out.println(nill_no1);
            System.out.println(nill_no2);   
            
      }
    }