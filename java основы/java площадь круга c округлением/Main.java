import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    double radius;
    
    Scanner input = new Scanner(System.in);
    
    
    System.out.print("Введите радиус круга: ");
    radius = input.nextDouble();
    double area = 3.14159 * radius * radius;
    System.out.print("Площадь круга равна: " +Math.round(area));
 
  } 
}