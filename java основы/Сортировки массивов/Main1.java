import java.util.Arrays;
import java.util.Collections;

class Main1 {
    public static void main(String[] args) {
        Integer[] x = { 4, 9, 3, 2, 5, 18, 21, 7, 11, 15, 5, 17 };
{
Arrays.sort(x);
for (int a : x) 
System.out.print(a + ", ");
System.out.print("\n");
}
{
Arrays.sort(x, Collections.reverseOrder());
for (int b : x) 
System.out.print( b +  ", ");
}
}
}