public class FixedCapacityQueueA {
    int[] mData = null;
    int mHead=0; // index of first full cell
    int mTail=0; // index of next empty cell
    public FixedCapacityQueueA(int capacity) {
        mData = new int[capacity];
    }
    public boolean enqueue(int x) {

        if (mTail==mData.length) return false;
        mData[mTail]=x;
        mTail++;
        return true;
    }
    public int dequeue() {

        if (mTail==mHead) return -1;
        int v=mData[mHead];
        mHead++;
        return v;
    }
}

