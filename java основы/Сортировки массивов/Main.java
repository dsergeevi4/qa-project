public class Main { 
 
  public static void main(String args[]){
    int[] x = new int[] { 4, 9, 3, 2, 5, 18, 21, 7, 11, 15, 5, 17 };
 
    int max = getMax(x);
    System.out.println("Максимальное значение: "+max);
 
    int min = getMin(x);
    System.out.println("Минимальное значание: "+min);
  }
 
  public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
 
  public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  } 
}