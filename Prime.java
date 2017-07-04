# primeno
import java.io.*;
import java.util.*;
public class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b;
int flag=0;
System.out.println("Enter the integer");
a=sc.nextInt();
b=a/2;
for (int i=2;i<=b;i++)
{
if(a%2==0)
{
System.out.println("is not a prime no");
flag=1;
break;
}
}
if(flag==0)
{
System.out.println("is a prime");
}

}
}

