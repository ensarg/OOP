package tr.edu.sehir.oop;

// square is a rectangle

public class Square extends Rectangle{


    Square (int length){
        super(length,length);
    }
    @Override
    public void setHeight(int height) {

        super.setHeight(height);
    }


    public int getArea(){
        return (super.getArea());
    }
}
