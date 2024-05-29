package tr.edu.maltepe.oop;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private String address;
    private int stdno;

    public Employee(String name, String address, int n){
        this.name =name;
        this.address =  address;
        this.stdno =n;
    }
    public String getName(){
        return  name;
    }
    public String getAddress(){
        return  address;
    }

    public int getStdno(){
        return stdno;
    }


}
