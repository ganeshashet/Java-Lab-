class Greatest
{
public static void main(String arg[])
{
    int a=10, b=11, c=14, big ;//local variables
 
    System.out.println("gratest among three numbers ");
 
     big = a > b ? (a > c ? a : c) : (b > c ? b : c);//using conditional operator

    System.out.println("a="+a+" , b= "+b+" , c="+c+" is "+big); //displaying the values greatest among 3 numbers
 }
}
    