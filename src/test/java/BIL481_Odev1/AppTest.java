/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package BIL481_Odev1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    public void testFound() {
       ArrayList<Integer> array = new ArrayList<>(Arrays.asList(3, 25, 1, 11, 21));
       assertTrue(App.searchSum(array, 1, 3, 7));
    }
 
    @Test
    public void testNotFound() {
       ArrayList<Integer> array = new ArrayList<>(Arrays.asList(3, 25, 1, 11, 21));
       assertFalse(App.searchSum(array, 1, 3, 5));
    }
 
    @Test
    public void testEmptyArray() {
       ArrayList<Integer> array = new ArrayList<>();
       assertFalse(App.searchSum(array, 1, 3, 7));
    }
 
    @Test
    public void testNull() {
       assertFalse(App.searchSum(null, 1, 3, 7));
    }

    @Test
    public void testMissingInteger() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(3, 25, 1, 11, 21));
        assertFalse(App.searchSum(array, 1, 3, null));
    }
 
}
