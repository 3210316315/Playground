import java.util.*;
class Main
{
public static int power(int base,int exponent)
{
  int i=1,s=1;
  while(i<=exponent)
  {
    
    s=s*base;
    i++;
  }
  return s;
}
public static void main(String args[])
{
  Scanner in=new Scanner(System.in);
  //System.out.println("base=");
  int n1=in.nextInt();
  //System.out.println("exponent=");
  int n2=in.nextInt();
  int pof=power(n1,n2);
  System.out.println(pof);
}
}