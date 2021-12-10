package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<String> fantastic = new Stack<>();
        fantastic.push("Matrix");
        fantastic.push("Venom");
        fantastic.push("Avatar");

        Stack<String> triller = new Stack<>();
        triller.push("Kill Bill");
        triller.push("Bad boys");
        triller.push("Shooter");

        Stack<String> drama = new Stack<>();
        drama.push("The blind side");
        drama.push("Cast away");
        drama.push("Rain man");

        ArrayList<String> movieGeners = new ArrayList<>(); //добавляем Stack в ArrayList
        movieGeners.addAll(fantastic);
        movieGeners.addAll(triller);
        movieGeners.addAll(drama);

        System.out.print("Movie Geners : "); //вывод на консоль все фильмы
        for (String mg : movieGeners) {
            System.out.print(mg + ", ");
        }
        System.out.println();

        System.out.print("Fantastic films : ");
        for (int i=0; i < movieGeners.size(); i++) { //жанр фантастика
            for (int j=0; j < fantastic.size(); j++) {
                System.out.print(fantastic.pop() + " "); //извлечение и удаление элемента из стека
            }
        }
        System.out.println();

        System.out.print("Triller films : ");
        for (int i = 0; i < triller.size(); i++) //жанр триллер
            System.out.print(triller.get(i) + " ");
        System.out.println();

        System.out.print("Drama films : ");
        for (int i = 0; i < drama.size(); i++) //жанр драма
            System.out.print(drama.get(i) + " ");
        System.out.println();

        drama.set(1, "Molly");                  //замена элемента
        for (int i = 0; i < drama.size(); i++)
        System.out.print(drama.get(i) + " ");

        }

}
