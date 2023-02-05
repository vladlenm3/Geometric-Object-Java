// Module #2
// name: Vladlen Mykhailovskyi
//Date: 2/4/2023
package com.company;
import java.text.DecimalFormat;
import java.util.ArrayList;
public class Main {
    /** The main( ) method call other methods */
    public static void main(String[] args) {
        // list created
        ArrayList<Shape>list = new ArrayList();
        // decimal format set
        DecimalFormat df = new DecimalFormat("#.00");
        // description of a program
        System.out.println("*************** Program Description ***************\n");
        System.out.print("This program will create 3 Shape (Circle, Square, RightTriangle) objects, and");
        System.out.print("\nstore their references in an ArrayList. Using a for loop, ");
        System.out.println("information about all Shape\nobjects will printed to the console.\n");
        // creating 3 objects
        Shape obj1= new Circle(16,1);
        Shape obj2= new Square(7,2);
        Shape obj3= new RightTriangle(5,9,3);
        // add objects to the list
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        // print results
        System.out.print("Identifier      Area");
        for(int i=0;i<list.size();i++){
            System.out.print(" \n" + list.get(i).getIdentifier() + " \t\t\t\t" + df.format(list.get(i).Area()) + " sq. inches");
        }

    }
}
//Shape class
abstract class Shape
{
    // member variable
    private int identifier;
    /** * The Shape() method is non-arg constructor that sets default variable */
    public Shape(){
        this.identifier = 0;
    }
    /** * The Shape() method is arg constructor that sets variables */
    public Shape(int identifier){
        this.identifier = identifier;
    }
    /** * The getIdentifier() method returns identifier */
    public int getIdentifier(){
        return this.identifier;
    }
    /** * The Area( ) method computes and returns the area of the object. Overridden in child classes */
    public abstract double Area();
}
//Circle class
class Circle extends Shape{
    //data member
    private double radius;
    /** * The Circle() method is non-arg constructor that sets default variable */
    public Circle(){
        this.radius = 0;
    }
    /** * The Circle() method is an arg constructor that sets variables */
    public Circle(double radius,int identifier){
        super(identifier);
        this.setRadious(radius);;
    }
    /** * The getRadius() method returns radius of a circle */
    public double getRadious(){
        return this.radius;
    };
    /** * The setRadius() method sets circle radius variable */
    public void setRadious(double radius){
        this.radius = radius;
    }
    /** * The Area( ) method computes and returns the area of the circle, overrides Area() method */
    public double Area(){

        return Math.PI*Math.pow(getRadious(),2);
    }
}
//Square class
class Square extends Shape{
    //data member
    private double side;
    /** * The Square() method is non-arg constructor that sets default variable */
    public Square(){
        this.side = 0;
    }
    /** * The Square() method is arg constructor that sets variable */
    public Square(double side,int identifier){
        super(identifier);
        this.side=side;
    }
    /** * The getSide() method returns side of a square */
    public double getSide(){
        return this.side;
    };
    /** * The setSide() method sets side of a square */
    public void setSide(double side){
        this.side = side;
    }
    /** * The Area( ) method Computes and returns the area of the square, overrides Area() method */
    public double Area(){
        return Math.pow(this.side,2);
    }
}
//RightTriangle class
class RightTriangle extends Shape{
    //data member
    private double height,base;
    /** * The RightTriangle() method is non-arg constructor that sets default variables*/
    public RightTriangle(){
        this.height = 0;
        this.base = 0;
    }
    /** * The RightTriangle() method is arg constructor that sets variables */
    public RightTriangle(double height,double base,int identifier){
        super(identifier);
        this.height = height;
        this.base = base;
    }
    /** * The getHeight() method returns height */
    public double getHeight(){
        return this.height;
    };
    /** * The getBase() method returns base */
    public double getBase(){
        return this.base;
    };
    /** * The setHeight() method sets height variable */
    public void setHeight(double height){
        this.height = height;
    }
    /** * The setBase() method sets base variable */
    public void setBase(double base){
        this.base = base;
    }
    /** * The Area( ) method computes and returns the area of the triangle, overrides Area() method */
    public double Area(){
        return 0.5*this.height*this.base;
    }
}

