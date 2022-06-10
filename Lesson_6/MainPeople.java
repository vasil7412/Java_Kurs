package OOP.Lesson_6;

import java.util.HashMap;
import java.util.Map;

public class MainPeople {

    public static void main(String[] args) {

        Person P1 = new Person("Persona 1");
        Person P2 = new Person("Persona 2");
        Person P3 = new Person("Persona 3");
        Person P4 = new Person("Persona 4");

        Map<String, Account> mapPerson = new HashMap<>();

        mapPerson.put("P1",new Account(11111));
        mapPerson.put("P2",new Account(22222));
        mapPerson.put("P3",new Account(33333));

        printMap(mapPerson);

        System.out.println("Після видалення Р1:");

        mapPerson.remove("P1");

        printMap(mapPerson);

        System.out.println("Додамо персону Р4 :");
        mapPerson.put("P4",new Account(44444));

        printMap(mapPerson);

    }

    public static void printMap(Map<String,Account> mapForPrint){

        for (Map.Entry <String,Account> entry : mapForPrint.entrySet()) {
            System.out.println(entry.getKey() + " номер рахунку: " + entry.getValue().getNumberAccount());
        }

    }

}
