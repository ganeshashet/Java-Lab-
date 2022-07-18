import java.util.*;
class Addmatrix
{
public static void main(String args[])
{
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number of rows");
int rows=sc.nextInt();
System.out.println("enter a number of coloums");
int cols=sc.nextInt();
int a[][]=new int[rows][cols];
int b[][]=new int[rows][cols];
int c[][]=new int[rows][cols];
 System.out.println("enter the First matrix");
 for(i=0;i<rows;i++)
 {
  for(j=0;j<cols;j++)
  { 
   a[i][j]=sc.nextInt();
   }
  }
System.out.println("enter the second matrix");
 for(i=0;i<rows;i++)
 {
  for(j=0;j<cols;j++)
  { 
   b[i][j]=sc.nextInt();
   }
  } 
System.out.println("addition of matrix");
 for(i=0;i<rows;i++)
 {
  for(j=0;j<cols;j++)
  { 
   c[i][j]=a[i][j]+b[i][j];
   }
  }
 for(i=0;i<rows;i++)
 {
  for(j=0;j<cols;j++)
  { 
   System.out.print(c[i][j]+" ");
   }
 System.out.println("");
  }
}
}