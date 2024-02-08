class Element {
   int item;
   Element next;
   Element(int item, Element next) {
      super();
      this.item = item;
      this.next = next;
   }
   @Override
   public String toString() {
      return item + " " + (next == null ? "" : next);
   }
}
