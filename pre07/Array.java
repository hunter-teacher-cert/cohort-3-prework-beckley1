import java.io.*;
import java.util.Arrays;

public class Array{
   //method for exponential array values (exercise 1a)
    public static double[] powArray(double[] a, double power){
    double[] values = new double[a.length];
    for (int i=0;i < a.length;i++){
      values[i] = Math.pow(a[i],power);
}
      return values;

      }    

  //method for histogram (exercise 1b)
   public static int[] histogram(int[] scores, int counters){
      int[] counter = new int[counters];
      for (int element:scores){
         counter[element]++;
      }
      return counter;
   }
  public static void main (String[] args){
    System.out.println("Exercise 1a from Think Java Chapter 8.");
    double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
    //Array exponent = new Array();
    //double[] result;
   // result = exponent.powArray(a, 3.0);
    System.out.print("Exponential is " + result);
    //Can't get this to print!!!!
  }




}
