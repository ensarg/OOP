package model;


public class ClickModel {
   private int clickCount = 0;

   public void increment() {
      clickCount++;
   }

   public int getClickCount() {
      return clickCount;
   }
}

