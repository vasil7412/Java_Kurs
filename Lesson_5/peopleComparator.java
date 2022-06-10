package OOP.Lesson_5;

import java.util.Comparator;

public class peopleComparator implements Comparator<people> {
    @Override
    public int compare(people p1, people p2) {
        return p1.getName().compareTo(p2.getName());
    }


}
