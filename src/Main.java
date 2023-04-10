import java.util.*;

public class Main {
    public static void main(String[] args) {

         List<Person> people = new ArrayList<>();
        //TreeSet<Person> people = new TreeSet<>() ;
        people.add(new Person("Vasya", "Pupkyn",2500));
        people.add(new Person("Tanya", "Petrova Vasyna",15));
        people.add(new Person("Olya", "Guseva",3000));
        people.add(new Person("Ivan", "Garyn Kotov Lesovsky Shtengel",6));
        people.add(new Person("Baba", "Yaga Kostyanaya Noga",30));
        people.add(new Person("Koshey", "Smerty Net",1000));
        people.add(new Person("Kolobok", "Kolobok Ya Tebya S'em", 100));
        people.add(new Person("Kuz'ma", "Petrov Vodkin", 55));

        Collections.sort(people, new PersonComparator());
        System.out.println(people);
    }
}