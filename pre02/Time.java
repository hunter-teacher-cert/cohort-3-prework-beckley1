import java.io.*;
import java.util.*;

public class Time{

public static void main(String[] args){
  int hour = 16;
  int minute = 54;
  int second = 32;
  int timeOfDayInSeconds = 24 * 60 * 60;
  int timeSinceMidnightSeconds = hour * 3600 + minute * 60 + second;
  int timeLeftInSeconds = timeOfDayInSeconds - timeSinceMidnightInSeconds;
   
      int startHour = 18, startMinute = 45, startSecond = 36;
      int startTimeSinceMidnightInSeconds = startHour * 3600 + startMinute * 60 + startSecond; //in seconds
   
      int timeInterval = timeSinceMidnightInSeconds - startTimeSinceMidnightInSeconds;
   
      System.out.println("Time since midnight: " + timeSinceMidnightInSeconds + " seconds");
      System.out.println("Time remaining today: " + timeLeftInSeconds + " seconds"); 
      System.out.println("Percentage of day passed: " + (double)timeSinceMidnightInSeconds / (double)(24 * 60 *60) +"%");
      System.out.println("Elapsed time: " + timeInterval + " seconds");
  }
}