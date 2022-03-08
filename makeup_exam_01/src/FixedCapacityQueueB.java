public class FixedCapacityQueueB {

    private int[] mData = null;
    private int mHead=0; // index of first full cell
    private int mTail=0; // index of next empty cell
    private int capacity=0;
    private int numberofelements=0;
    public FixedCapacityQueueB(int capacity) {
        mData = new int[capacity];
        this.capacity=capacity;
    }
    public boolean enqueue(int x) {

        if (numberofelements==capacity) {
            System.out.println("queue capacity exceeded. numberof elements: "+numberofelements);
            return false;
        }
        mData[mTail]=x;
        mTail =(mTail+1) % capacity ;
        numberofelements++;
        System.out.println("enqueue, mTail: "+mTail+" mHead: "+mHead +" numelem:"+numberofelements);

        return true;
    }
    public int dequeue() {

        if (isQEmopty())
            return -1;
        int v=mData[mHead];
        mData[mHead]=0;
        mHead=(mHead+1) % capacity;
        numberofelements--;
        System.out.println("dequeue, mTail: "+mTail+" mHead: "+mHead +"  numelem:"+numberofelements);

        return v;
    }

    public  void printQ(){
        System.out.print("Queue:");
        for (int i=0; i<mData.length; i++ )
            System.out.print(" "+mData[i]);
    }

    public boolean isQEmopty() {
        if (numberofelements == 0)
            return true;
        else
            return false;
    }

    public int sizeQ(){
        return numberofelements;
    }
}
