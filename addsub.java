import java.util.Scanner;
public class addsub {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number :- ");
        float num1 = input.nextFloat();
        System.out.print("Enter Second Number :- ");
        float num2 = input.nextFloat();

        float add=num1+num2;
        float sub=num1-num2;
        float mul=num1*num2;
        float div=num1/num2;
        float mod=num1%num2;
        
        System.out.println("The Addition of two number is :- "+add);
        System.out.println("The Subtraction  of two number is :- "+sub);
        System.out.println("The Multiply of two number is :- "+mul);
        System.out.println("The Divide of two number is :- "+div);
        System.out.println("The Remender of two number is :- "+mod);
    }
}
