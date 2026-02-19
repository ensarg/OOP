package tr.edu.maltepe.oop;
/*
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

   public class CounterTest {

      // Helper method to reset the static counter (reflection workaround for testing)
      @BeforeEach
      void resetCounter() throws Exception {
         java.lang.reflect.Field field = Counter.class.getDeclaredField("c");
         field.setAccessible(true);
         field.setInt(null, 0); // null because it's a static field
      }

      @Test
      void testIncrement() {
         Counter counter = new Counter();
         counter.increment();
         assertEquals(1, counter.getValue());
      }

      @Test
      void testDecrement() {
         Counter counter = new Counter();
         counter.increment();
         counter.increment();
         counter.decrement();
         assertEquals(1, counter.getValue());
      }

      @Test
      void testMultipleOperations() {
         Counter counter = new Counter();
         counter.increment();
         counter.increment();
         counter.decrement();
         counter.increment();
         assertEquals(2, counter.getValue());
      }
   }
*/
// This test class uses JUnit 5 to test the Counter class.
