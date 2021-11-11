package tr.edu.sehir.oop;

public class EncapsDemo1 {

    private int tckn;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getTckn(){
        return tckn;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }


    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmptckn(int newValue){
        tckn = newValue;
    }
}
