import java.io.*;
import java.util.*;
public class Series
{
public static void main(String args[])
{
 int sum=0;
 Scanner sc=new Scanner(System.in);
 int s=9,n=139;
 for(int i=s;i<n;i++)
{
  if(i%10==0)
  {
   sum=i-1;
   System.out.println(sum);
 }

}
}
}