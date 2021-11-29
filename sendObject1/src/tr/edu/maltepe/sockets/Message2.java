package tr.edu.maltepe.sockets;

import java.io.Serializable;

public class Message2 implements Serializable {

    private int a;
    private int b;
    private int result;

    public Message2 (int firstNumber, int secondNumber ){
        this.a = firstNumber;
        this.b = secondNumber;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setResult( int x, int y)  {
        result = x * y  ;
    }

    public int getResult() {
        return result;
    }
}

