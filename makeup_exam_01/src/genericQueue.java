
import java.util.ArrayList;

public class genericQueue<E> {

    private ArrayList<E> mData ;
    private int mHead=0; // index of first full cell
    //private int mTail=0; // index of next empty cell
    private E v;
    public <E> genericQueue(int capacity) {
        mData = new ArrayList<>(capacity);
        //System.out.println("queue capacity : "+mData.size());
    }
    public boolean enqueue( E x) {
        /*
        if (mTail==mData.size()) {
            System.out.println("queue capacity exceeded. mtail: "+mTail);
            return false;
        }
        */
        //System.out.println("mTail "+mTail);
        mData.add(x);
        //mTail++;

        return true;
    }
    public  E  dequeue() throws QueueEmptyException {

        //if (mTail==mHead) return null;
        //printQ();
        //System.out.println("deQ. mHead "+mHead);
        if (mData.isEmpty()) {
           // System.out.println("Q is emty. mHead "+mHead);
            throw new QueueEmptyException("You can not dequeue an empty Q");
        }
        else {
             v = mData.remove(mHead);
            //mHead++;
            return v;
        }

    }


    public  void printQ(){
        System.out.println("Generic Queue:");
        // Display array elements
        for(int i=0; i< mData.size(); i++) {
            System.out.print(" "+mData.get(i));
        }

    }

}
