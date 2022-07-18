// array sorting in ascendinag and decanding order
import java.util.*;
class Nsorting
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
 System.out.println("Sorting of array in ascending order\n"); 
  for(i=0;i<len;i++)
  {
	for(j=i+1;j<len;j++)
	{
		if(arr[i]>arr[j])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
  }
for(int asort:arr)
System.out.print(asort+ " ");
 System.out.println("\nSorting of array in decending order\n"); 
  for(i=0;i<len;i++)
  {
	for(j=i+1;j<len;j++)
	{
		if(arr[i]<arr[j])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
  }
for(int dsort:arr)
System.out.print(dsort+ " ");

}
}
