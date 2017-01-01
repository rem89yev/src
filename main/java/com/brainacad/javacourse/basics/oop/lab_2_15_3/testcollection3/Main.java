package com.brainacad.javacourse.basics.oop.lab_2_15_3.testcollection3;

import java.util.*;

/**
 * @author Dmitry Adonin
 * @since 27/08/16.
 */
public class Main {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            String s = "num_" + i;
            arrayList.add(s);
            linkedList.add(s);
        }

        Iterator<String> arrayListIterator = arrayList.iterator();
        while (arrayListIterator.hasNext()) {
            System.out.println(arrayListIterator.next());
        }

        System.out.println();

        Iterator<String> linkedListIterator = linkedList.iterator();
        while (linkedListIterator.hasNext()) {
            System.out.println(linkedListIterator.next());
        }

        System.out.println();

        ListIterator<String> listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            linkedList.add(listIterator.previous());
        }

        printElements(linkedList);

    }

    private static <E> void printElements(Collection<E> collection) {
        Iterator<E> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
