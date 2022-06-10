package OOP.Lesson_5;

import java.util.*;

public class mainPeople {

    public static void main(String[] args) {

        ArrayList<people> peoples = new ArrayList<>();

        people p1 = new people("P1",15);
        people p2 = new people("P3",20);
        people p3 = new people("P2",10);

        peoples.add(p1);
        peoples.add(p2);
        peoples.add(p3);

        System.out.println("До сортировки по имени");
        printList(peoples);

        peopleComparator peopleComparator = new peopleComparator();
        Collections.sort(peoples,peopleComparator);

        System.out.println("После сортировки по имени");

        printList(peoples);

        Set <people> peopleSet = new HashSet<>();

        peopleSet.add(p3);
        peopleSet.add(p1);
        peopleSet.add(p2);
        System.out.println("Виведемо хешсет");
        printList(peopleSet);

        LinkedHashSet <people> peopleLinkedHashSet = new LinkedHashSet<>();

        peopleLinkedHashSet.add(p1);
        peopleLinkedHashSet.add(p2);
        peopleLinkedHashSet.add(p3);
        System.out.println("Виведемо LinkedHashSet");
        printList(peopleLinkedHashSet);

        TreeSet <people> peopleTreeSet = new TreeSet<>();

        peopleTreeSet.add(p2);
        peopleTreeSet.add(p3);
        peopleTreeSet.add(p1);

        System.out.println("Виведемо TreeSet");

        printList(peopleTreeSet);

    }

    public static void printList(ArrayList<people> vewList){
        for (people item: vewList) {

            System.out.println(item.getName() + " - " + item.getAge());

        }



    }

    public static void printList(Set <people> vewList){
        for (people item: vewList) {

            System.out.println(item.getName() + " - " + item.getAge());

        }

    }

}
