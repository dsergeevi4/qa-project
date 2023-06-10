import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 5;
        List<Double> Array2 = new ArrayList<>();
        System.out.println("Введите пять чисел:");
        for (double i = 0; i < size; i++) {
            Array2.add(input.nextDouble());
        }
        System.out.print("Элементы списка:");
        System.out.println(Array2);

        Collections.sort(Array2);
        for (double q : Array2)
            System.out.println(q);

        System.out.println("Сумма всех чисел: " + sumArrayList(Array2));
    }

    public static double sumArrayList(List<Double> list) {
        return list.stream().mapToDouble(Double::doubleValue).sum();
    }
}