package tr.edu.sehir.oop;

import java.io.Serializable;

public class aCoordinate implements Serializable {

    protected float x,y,  radius,speed, angleInDegree;

    public aCoordinate() {
        x=10;y=10;radius= (float) 10.0; speed=5;angleInDegree= (float) 45.00;
    }

    public aCoordinate(float x, float y, float radius, float speed, float angleInDegree){
        this.x=x; this.y=y;this.radius=radius;this.speed=speed;this.angleInDegree=angleInDegree;
    }

    public float getX(){ return x;}
    public float getY(){ return y;}

    public float getRadius(){ return radius;}
    public float getSpeed(){ return speed;}
    public float getAngleInDegree(){ return angleInDegree;}

}
