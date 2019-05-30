import java.util.Scanner;
class Main
{
    public static int square(int a)
    {
      int maths=a*a;
      return maths;
    }
    //return maths;
	public static void main (String[] args)
    {
	   Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sqr=square(n);
      System.out.println(sqr);
	} 
}