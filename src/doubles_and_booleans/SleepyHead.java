package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
          *JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
      int weekday  =  JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
     
      if (weekday==0) {
    	  isWeekday=true;
      }
      else {
    	  isWeekday=false;
      }
      System.out.println(isWeekday);
      
      
      
      int vacation  =  JOptionPane.showConfirmDialog(null, "Are you on vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
      
      if (vacation==0) {
    	  isVacation=true;
      }
      
      else {
    	  isVacation=false;
      }
      
      
      if(isVacation == true || isWeekday == false) {
    	  System.out.println("Sleep in!");
      }
      
      
      
      if(isVacation == false && isWeekday == true) {
    	  System.out.println("Get up lazybones!");
      }
      
      
      
      
        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are not on vacation,
         * print “sleep in�?.
         */
    }
}
