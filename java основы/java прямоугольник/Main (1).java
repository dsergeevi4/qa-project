
public class Main
{
	public static void main(String[] args) {

Rectangle rectangle = new Rectangle(1,4,5,4);

    System.out.println("ширина прямоугольника " + rectangle.getWidth());
    System.out.println("длина прямоугольника " + rectangle.getHeight());
    System.out.println("Площадь равна " + rectangle.getArea());
    System.out.println("Периметр равен " + rectangle.getPerimeter());
rectangle.move(1, 1);
rectangle.rect_print();

	}
	
}
