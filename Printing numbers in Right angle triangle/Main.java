import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
  		// Type your code here
      int n=in.nextInt();
      int i,j,sum=0;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=i;j++)
        {
          System.out.print(i);
          sum++;
        }
        System.out.print("\n");
      }
	}
        
}