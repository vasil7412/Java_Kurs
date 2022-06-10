package OOP.Lesson_6.ZOO;

import OOP.Lesson_6.Account;

import java.lang.invoke.SwitchPoint;
import java.util.*;

public class mainClub {

    public static void main(String[] args) {

        Map<Person, List<Animal>> personListMap = new HashMap<>();

        goClub(personListMap);

       }

public static void goClub (Map<Person, List<Animal>> personListMap){

    Scanner sc = new Scanner(System.in);
    int age;
    String namePerson;
    String nameAnimal;
    String typeAnimal;

    System.out.println("Виберіть дію:");
    System.out.println("1 - додати людину до клубу");
    System.out.println("2 - додати тварину до людини");
    System.out.println("3 - забрати тварину від людини");
    System.out.println("4 - видалити людину з клубу");
    System.out.println("5 - вивести на екран зооклуб");
    System.out.println("6 - вийти з програми");

    int n = sc.nextInt();

    switch (n){
        case 1 ->{

            System.out.println("Введіть імя:");
            namePerson  = sc.next();
            System.out.println("Введіть вік:");
            age  = sc.nextInt();
            ArrayList<Animal> animalList = new ArrayList<>();
            personListMap.put(new Person(namePerson, age),animalList );

            goClub(personListMap);

        }
        case 2 ->{

            System.out.println("Введіть імя людини:");
            namePerson  = sc.next();
            System.out.println("Введіть вік людини:");
            age  = sc.nextInt();
            System.out.println("Введіть тип тварини:");
            typeAnimal  = sc.next();
            System.out.println("Введіть імя тварини:");
            nameAnimal  = sc.next();

            Person p = new Person(namePerson,age);

            for (Map.Entry <Person, List<Animal>> entry : personListMap.entrySet()) {

                if (entry.getKey().equals(p)){
                    List <Animal> animals = entry.getValue();
                    animals.add(new Animal(typeAnimal,nameAnimal));
                    entry.setValue(animals);
                }

            }

            goClub(personListMap);

        }
        case 3 ->{

            System.out.println("Введіть імя людини:");
            namePerson  = sc.next();
            System.out.println("Введіть вік людини:");
            age  = sc.nextInt();
            System.out.println("Введіть тип тварини:");
            typeAnimal  = sc.next();
            System.out.println("Введіть імя тварини:");
            nameAnimal  = sc.next();

            Person p = new Person(namePerson,age);
            Animal a = new Animal(typeAnimal,nameAnimal);

            for (Map.Entry <Person, List<Animal>> entry : personListMap.entrySet()) {

                if (entry.getKey().equals(p)){
                    List <Animal> animals = entry.getValue();

                    for (Animal animal: animals) {
                        if (animal.equals(a)){
                            animals.remove(animal);
                            break;
                        }
                    }
                    entry.setValue(animals);
                }
            }
            goClub(personListMap);
        }
        case 4 ->{
            System.out.println("Введіть імя людини:");
            namePerson  = sc.next();
            System.out.println("Введіть вік людини:");
            age  = sc.nextInt();

            Person p = new Person(namePerson,age);

            Set <Person> keys = personListMap.keySet();

            for (Person keyPerson: keys) {

                if (keyPerson.equals(p)){
                    personListMap.remove(keyPerson);
                }
            }
            goClub(personListMap);
        }
        case 5 ->{

            printMap(personListMap);
            goClub(personListMap);

        }
        case 6 ->{
        }
    }
}

    public static void printMap(Map<Person, List<Animal>> mapForPrint){

        for (Map.Entry <Person, List<Animal>> entry : mapForPrint.entrySet()) {
            System.out.print(entry.getKey().getName() + " його тварини :" );

            for (Animal animal:entry.getValue()) {
                System.out.print(animal.getType() + " name:" + animal.getName() + "; ");
            }

            System.out.println();

        }

    }


}


