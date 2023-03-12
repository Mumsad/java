package maths;
public class addition
{
public int add(int x,int y)
{
return(x+y);
}
}

import maths.*;
class demo1
{
public static void main(String[] args)
{
addition a=new addition();
subtraction s=new subtraction();
multiplication m=new multiplication();
division d=new division();
System.out.println("addition is"+a.add(10,20));
System.out.println("subtraction is"+s.sub(10,20));
System.out.println("multiplication is"+m.mul(10,20));
System.out.println("division is"+d.div(10,20));
}
}