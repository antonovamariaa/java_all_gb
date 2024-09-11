package sem3;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    /*Заполнить список десятью случайными числами. 
    Отсортировать список методом sort() и вывести его на экран. */
    public static void main(String[] args) {
        ArrayList <Integer> arlist = new ArrayList<>();
        Random  random = new Random();
        for (int i = 0; i < 10; i++) {
            arlist.add(random.nextInt(21)); // отказывается брать 2 аргумента
        }
        System.out.println(arlist);
        arlist.sort(null); //по возрастанию, Comparator.reverseOrder() - по убыванию
        System.out.println(arlist);
    }
}
