import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Radius :- ");
        double radius = input.nextDouble();
        
        double result;
        double pi = 3.14;

        result=Math.PI*radius*radius;

        System.out.println("Area of circle is :- "+result);

    }
}
