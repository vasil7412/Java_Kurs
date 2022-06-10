package OOP.Lesson_5;

import java.util.Comparator;

public class people implements Comparable<people>, Comparator<people> {

    String name;
    int age;

    public people(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public people() {
    }


    @Override
    public int compareTo(people o) {
        return 0;
    }

    @Override
    public int compare(people o1, people o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
