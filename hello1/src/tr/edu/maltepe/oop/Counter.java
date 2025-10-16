package tr.edu.maltepe.oop;

public class Counter {

    private int count;
    Counter(){count=0;}  //default value is zero
    Counter (int initialvalue){
        count=initialvalue;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int countin) {
        count = countin;
    }

    public void icrement(){
        count++;
    }
    public void icrement(int delta){
        count=count +delta;
    }
    public void reset(){
        count=0;
    }
}
