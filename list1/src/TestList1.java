public class TestList1 {

   public static void main(String[] args) {
      LinkedList list = new LinkedList();
      list.add(3);
      list.add(2);
      list.add(1);
      list.removeElement(2);
      list.displayList();
      list.add(10);
      list.add(20);
      list.displayList();
   }



}
