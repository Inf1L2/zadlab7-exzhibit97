package pl.edu.ur.oopl7;
import pl.edu.ur.oopl7.zad1.*;
import pl.edu.ur.oopl7.zad2.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Patryk", "Gwizdala", "1 marca 1997", 101355, "inzynerskie", "informatyka", 1);
        System.out.println(student);
        Wykladowca wykladowca = new Wykladowca("Jan", "Kowalski", "3 maja 1950", "dr habilitowany", 20, 1230);
        System.out.println(wykladowca);
        /*
        Punkt2D punkt2d = new Punkt2D(3, 5);
        System.out.println(punkt2d);
        Punkt3D punkt3d = new Punkt3D(1, 2, 3);
        System.out.println(punkt3d);
        */
        //pseudolosowe liczby uzywane jako koordynaty tworzonych punktow 2D
        Random coordRandomizer = new Random();
        Punkt2D[] array2D = new Punkt2D[100];
        for (int i = 0; i < array2D.length; i++) {
            array2D[i] = new Punkt2D(coordRandomizer.nextInt(10), coordRandomizer.nextInt(10));
            //System.out.println(i + " " +array2D[i]);
        }
        //pseudolosowe liczby uzywane jako koordynaty tworzonych punktow 3D
        Punkt2D[] array3D = new Punkt3D[100];
        for (int i = 0; i < array2D.length; i++) {
            array3D[i] = new Punkt3D(coordRandomizer.nextInt(10), coordRandomizer.nextInt(10), coordRandomizer.nextInt(100));
            //System.out.println(i + " " + array3D[i]);
        }
        //sprawdzenie, czy istnieja takie same x i y pomiedzy dowolnymi punktami 2D i 3D.
        int j = 1;
        for (int i = 0; i < 100; i++) {
            if ((array2D[i].getX() == array3D[i].getX()) && (array2D[i].getY() == array3D[i].getY())){
                System.out.println(j + " 2D: " + array2D[i] + " 3D: " +array3D[i]);
                j++;
            }
        }
    }

}
