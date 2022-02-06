package com.company;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle(){
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float l, float w){
        length = l;
        width = w;
    }

    public float getLength(){
        return length;
    }

    public float getWidth(){
        return width;
    }

    public void setLength(float l){
        length = l;
    }
    public void  setWidth(float w){
        width = w;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return  width + length + width + length;
    }

    public String Print(){
        return "Restangle[length=" + length + ",width=" + width + "]";
    }

}
