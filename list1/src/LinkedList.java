public class LinkedList {
   Element head;
   public void add(int item) {
      head = new Element(item, head);
   }
   @Override
   public String toString() {
      return head == null ? "" : head.toString();
   }
   // Method to remove an element from the list
   public void removeElement(int item) {
      if (head == null) {
         return;
      }

      if (head.item == item) {
         head = head.next;
         return;
      }

      Element current = head;
      while (current.next != null) {
         if (current.next.item == item) {
            current.next = current.next.next;
            return;
         }
         current = current.next;
      }
   }

   // Method to display the elements of the list
   public void displayList() {
      Element current = head;
      while (current != null) {
         System.out.print(current.item + " ");
         current = current.next;
      }
      System.out.println();
   }
}


