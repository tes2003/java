import java.util.Scanner;
public class AreaCalculator
{
  void calculateArea(float x)
  {
   System.out.println("Area of the square:"+x*x+"sq units");
   }
   void calculateArea(float x,float y)
   {
     System.out.println("Area of the rectangle:"+x*y+"sq units");
    }
    void calculateArea(double r)
    {
      double area=3.14*r*r;
      System.out.println("Area of the circle:"+area+"sq units");
      }
      public static void main(String args[])
      {
        Scanner Scanner=new Scanner(System.in);
        AreaCalculator obj=new AreaCalculator();
        System.out.println("TESMOL SHAJI\n56\n06-04-2024\nQ10:Area of different shapes using overloaded functions");
        System.out.println("Enter the dimensions");
        System.out.println("Enter side length of the square:");
        float side=Scanner.nextFloat();
        obj.calculateArea(side);
        System.out.print("Enter the length of the rectangle:");
        float length=Scanner.nextFloat();
        System.out.print("Enter the width of the rectangle:");
        float width=Scanner.nextFloat();
        obj.calculateArea(width,length);
         System.out.print("Enter the radius of the circle:");
         double radius=Scanner.nextDouble();
         obj.calculateArea(radius);
         Scanner.close();
         }
      }
        
