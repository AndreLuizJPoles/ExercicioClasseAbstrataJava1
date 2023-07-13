package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();
        System.out.print("Enter the number of shapes: ");
        int numberOfShapes = sc.nextInt();
        for(int i=0;i<numberOfShapes;i++){
            System.out.println("Shape #" + (i+1) +" data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char shapeType = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.next();
            if(shapeType == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                shapes.add(new Rectangle(Color.valueOf(color), width, height));
            }
            else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shapes.add(new Circle(Color.valueOf(color), radius));
            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS:");
        for(Shape shape : shapes){
            System.out.println(String.format("%.2f", shape.area()));
        }
        sc.close();
    }
}