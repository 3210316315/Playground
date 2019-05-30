import java.util.Scanner;
class Main {
	public static void main (String[] args){
	Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      if(n%2==1 ||n%2==0)
      {
        for(int i=1;i<=n;i++)
        {
          System.out.println(i);
          i++;
        }
      }
	}
}