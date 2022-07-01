class Variexam1
{
static int a=20;// static variable
int bb=10;// Instance variable
public void exam()
{
System.out.println("the value is "+bb);
}
public static void main(String args[])
{
int abc=100; //local variable
System.out.println("the value of number is "+abc);
Variexam1 n=new Variexam1();
n.exam();
System.out.println("the value is "+a);
}
}
