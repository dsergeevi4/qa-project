import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String name;
   String age; 
    
    Scanner input = new Scanner(System.in);
    
    
    System.out.print("Введите ФИО ");
    name = input.nextLine();
    System.out.println("Добро пожаловать в курс " +name);
    System.out.print(name+ ", введите Ваш возраст");
    age = input.nextLine();
    System.out.println("Ваш возраст " +age);
  } 
}