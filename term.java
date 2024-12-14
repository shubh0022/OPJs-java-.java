

import java.util.*;
class demo 
{
public static void main (String amit[])
  {
    int a,b,sum;
    a=1;
    b=1;
  
Scanner sc=new Scanner (System.in);
System.out.print("enter how many term you want");
int num=sc.nextInt();
System.out.print("1,1");
for(int i=3; i<=num;i++)
{ 
 sum=a+b;
System.out.print ("," +sum);
a=b;
b=sum;
}
  }
}
