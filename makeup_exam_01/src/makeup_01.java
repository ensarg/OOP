public class makeup_01 {



    public static void main(String[] args) {

        /*
        FixedCapacityQueueB myq1 = new FixedCapacityQueueB(5);

        myq1.enqueue(5);
        myq1.enqueue(6);
        myq1.enqueue(9);
        myq1.enqueue(10);
        myq1.enqueue(11);
        myq1.enqueue(12);
        myq1.printQ();
        System.out.println("\n---------1------------------\n");
        System.out.println(myq1.dequeue());
        System.out.println(myq1.dequeue());
        System.out.println(myq1.dequeue());
        System.out.println(myq1.dequeue());
        System.out.println(myq1.dequeue());
        System.out.println(myq1.dequeue());

        myq1.printQ();
        System.out.println("\n----------2-----------------\n");
        myq1.enqueue(20);
        myq1.printQ();
*/

        genericQueue gq = new genericQueue(5);
        gq.enqueue(14.2345);
        gq.enqueue("ensar");
        gq.enqueue(16);

        gq.printQ();
        System.out.println("\n-----now dequeue----------------------\n");
        try {
            System.out.println(" " + gq.dequeue());
            System.out.println(" " + gq.dequeue());
            System.out.println(" " + gq.dequeue());
            //System.out.println(" " + gq.dequeue());

        } catch (QueueEmptyException exp){
            System.out.println(exp);
        }







    }

}
