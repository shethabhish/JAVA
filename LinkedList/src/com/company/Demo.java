package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placestovisit = new LinkedList<>();
//            placestovisit.add("Sydney");
//            placestovisit.add("Melbourne");
//            placestovisit.add("Brisbane");
//            placestovisit.add("Perth");
//            placestovisit.add("Canberra");
//            placestovisit.add("Adelaide");
//            placestovisit.add("Darwin");
//
//            printList(placestovisit);
//
//            placestovisit.add(1,"Alice Springs");
//            printList(placestovisit);
//
//            placestovisit.remove(4);
//            printList(placestovisit);
            addInOrder(placestovisit,"Sydney");
            addInOrder(placestovisit,"Melbourne");
            addInOrder(placestovisit,"Brisbane");
            addInOrder(placestovisit,"Perth");
            addInOrder(placestovisit,"Canberra");

            printList(placestovisit);

            addInOrder(placestovisit, "Alice Spring");
            addInOrder(placestovisit,"Sydney");
            printList(placestovisit);
            visit(placestovisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " +i.next());
        }
        System.out.println("=====================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList,String newCity) {
        ListIterator<String> iterator = linkedList.listIterator();
            while (iterator.hasNext()) {
                int comparsion = iterator.next().compareTo(newCity);
                if (comparsion == 0) {
                    //equal do not add
                    System.out.println("City already exists");
                    return false;
                }
                else if(comparsion>0) {
                    //new city should appear before this one (alphabetically)
                    iterator.previous();
                    iterator.add(newCity);
                    return true;
                }
                else if(comparsion<0) {
                    // move on next ciy
                }
            }
            iterator.add(newCity);
            return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean direction = true;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()) {
            System.out.println("List is empty");
            return;
        } else {
            System.out.println("Now visiting " +listIterator.next());
            printmenu();
        }

        while (!quit) {
            int action = scanner.nextInt();

            switch (action) {
                case 0:
                    System.out.println("Holidays are over");
                    quit = true;
                    break;

                case 1:
                    if(!direction){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        direction=true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Visiting " +listIterator.next());
                    }
                    else  {
                        System.out.println("End");
                        direction=false;
                    }
                    break;

                case 2:
                    if (direction) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        direction = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Visiting " +listIterator.previous());
                    }
                    else {
                        System.out.println("You're at the starting");
                        direction = true;
                    }
                    break;

                case 3:
                    printmenu();
                    break;
            }

        }
    }
    private static void printmenu() {
        System.out.println("Available actions are: \n press");
        System.out.println("0 to quit \n 1 to go to next city \n 2 to go to preious city \n 3 to print menu");
    }
}
