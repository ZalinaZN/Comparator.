import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Comparator.comparing(Person::check).thenComparing(Person::getAge).compare(o1,o2);
    }
}
