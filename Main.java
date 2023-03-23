public class Main 
{
 	public static void main(String[] args) 
{
 		int[] T1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] T2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

  for(int j =0; j<10; j++)
  {
    int p = 0;
    int b = T2[p];
 	  for(int i = 0; i<10; i++ )
      {
        int c = T1[j] * T2[i];
        System.out.println(T1[j] + "*" + T2[i] + "=" + c);
      }
    System.out.println("");
  }
 }
}