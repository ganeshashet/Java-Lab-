import java.io.*;
import java.util.*;
public class Table
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number which u want table ");
int num=sc.nextInt();
System.out.println("enter the limit");
int l=sc.nextInt();
for(int i=1;i<=l;i++)
{
System.out.println(num+"X"+i+"="+num*i);
}
}
}
 