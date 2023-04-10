import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Vasya", "Pupkyn",250));
        people.add(new Person("Tanya", "Petrova Vasyna",600));
        people.add(new Person("Olya", "Guseva",3000));
        people.add(new Person("Ivan", "Garyn Kotov Lesovsky Shtengel",6));
        people.add(new Person("Baba", "Yaga Kostyanaya Noga",30));
        people.add(new Person("Koshey", "Smerty Net",10));
        people.add(new Person("Kolobok", "Kolobok Ya Tebya S'em", 1));
        people.add(new Person("Kuz'ma", "Petrov Vodkin", 55));

        Collections.sort(people, new PersonComparator());
        System.out.println(people);
    }
}