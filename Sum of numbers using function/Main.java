import java.util.Scanner;
class Main{
  public static int son(int n)
  {
    int i,sum=0;
    for(i=1;i<=n;i++)
    {
      sum=sum+i;
      //return sum;
    }
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sod=son(n);
      System.out.println(sod);
	}
}