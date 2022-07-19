// Transpose of matrix
import java.util.*;
class Transpose
{
public static void main(String args[])
{
 int i,j;
 Scanner sc=new Scanner(System.in);
System.out.println("enter the elements of an array");
int a[][]=new int[3][3];
for(i=0;i<3;i++)
{
 for(j=0;j<3;j++)
 {
  a[i][j]=sc.nextInt();
 }
 }
System.out.println(" normal matrix is ");
for(i=0;i<3;i++)
{
 for(j=0;j<3;j++)
 {
  System.out.print(a[i][j]+ " ");
 }
System.out.println(" ");
 }
System.out.println("Transpose of matrix");
for(i=0;i<3;i++)
{
 for(j=0;j<3;j++)
 {
  System.out.print(a[j][i]+" ");
  
 }
System.out.println(" ");
 }
}
}