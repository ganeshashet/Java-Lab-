import java.util.*;
class Searching
{
 public static void main(String args[])
{
 
 Scanner sc=new Scanner(System.in);
 int i,j,temp; //declaring variables
 System.out.println("enter the size of an array :\n");
 int len=sc.nextInt(); //reading an input from user
 int arr[]=new int[len]; // initailize length of array in program 
 System.out.println("Enter the array element of array\n");
 for(i=0;i<len;i++)
  {
   // Reading an array elements 
    arr[i]=sc.nextInt();
   }
System.out.println("enter a key :");
int key=sc.nextInt();
for(i=0;i<len;i++)
 // comapring for an key if key found then display the position
  if(key==arr[i])
  System.out.println("key position is "+i);
 
}
}