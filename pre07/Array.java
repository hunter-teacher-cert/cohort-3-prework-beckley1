import java.io.*;
import java.util.Arrays;

public class Array{
   
    public static double[] powArray(double[] a, double power){
    double[] values = new double[a.length];
    for (int i=0;i < a.length;i++){
      values[i] = Math.pow(a[i],power);
}
      return values;

      }    
  public static void main (String[] args){
    System.out.println("Exercise 1a from Think Java Chapter 8.");
    double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
    System.out.print(powArray(a, 3.0));
  }




}
