
import java.util.ArrayList;
import java.util.*;

public class genericQueue<E> {

    private ArrayList<E> mData ;
    private int mHead=0; // index of first full cell
    private int mTail=0; // index of next empty cell
    private E x,v;
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

        mData.add(x);
        mTail++;
        //System.out.println("mTail "+mTail);
        return true;
    }
    public  E   dequeue() {

        //if (mTail==mHead) return null;

        v=mData.remove(mHead);
        mHead++;
        return v;
    }
    public boolean isQEmopty(){

    return false;
    }
    public  void printQ(){
        System.out.println("Generic Queue:");
        // Display array elements
        for(int i=0; i< mData.size(); i++) {
            System.out.println(" "+mData.get(i));
        }

    }

}
