/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package BIL481_Odev1;

import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }

    public static boolean searchSum(ArrayList<Integer> array, Integer number1, Integer number2, Integer number3) {
        System.out.println("inside search");
        if (array == null) return false;
        if (number1 == null || number2 == null || number3 == null) return false;
        
        int sum = number1 + number2 + number3;
  
        for (int elt : array) {
          if (elt == sum) return true;
        }
        return false;
    }

}
