import java.io.*;
import java.util.*;
public class SumofOdd
{
public static void main(String args[])
{
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number to add only odd number");
int n=sc.nextInt();
for(int i=0;i<=n;i++)
{
 if(i%2!=0)
 {
  sum+=i;
   }
  }
  System.out.println("sum of odd number is = "+sum);
 }
}
