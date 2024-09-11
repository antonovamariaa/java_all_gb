package sem3;

import java.util.ArrayList;

public class Task2 {
    /*
     * Создать список типа ArrayList
    Поместить в него как строки, так и целые числа. 
    Пройти по списку, найти и удалить целые числа.
     */
    public static void main(String[] args) {
        ArrayList<Object> arlist = new ArrayList<>();
        arlist.add(1);
        arlist.add(8);
        arlist.add(7.5);
        arlist.add("ello");
        arlist.add(9);
        arlist.add("4");
        arlist.add(9);
        
        for (int i = 0; i < arlist.size(); i++) {
            Object o = arlist.get(i);
            if(o instanceof Integer) {//instance  сравнение классов
                arlist.remove(i);
                i--; //при удалении элементы сдвигаются, для проверки
                    //всех элементов надо после удаления двигать на 1 назад
            }            
        }
        System.out.println(arlist);

    }
}




/*
 
//Создать список типа ArrayList
//Поместить в него как строки, так и целые числа.
//Пройти по списку, найти и удалить целые числа.
 
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<>();
        myList.add(1);
        myList.add(9);
        myList.add("hello");
        myList.add(1.5);
        myList.add("88");
        System.out.println(myList);
//        ver1(myList);
        ver2(myList);
        System.out.println(myList);
    }

    private static void ver2(ArrayList<Object> myList) {
        Iterator iterator = myList.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            if (o instanceof Integer){
                iterator.remove();
            }
        }
//        myList.removeIf(o -> o instanceof Integer);
    }

    private static void ver1(ArrayList<Object> myList) {
        for (int i = 0; i < myList.size(); i++) {
            Object o = myList.get(i);
            if (o instanceof Integer){
                myList.remove(i);
                i--;
            }
        }
    }
 */