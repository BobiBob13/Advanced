package Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        List<Person> listPeople = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String personInfo = scan.nextLine();
            String name = personInfo.split("\\s+")[0];
            int age = Integer.parseInt(personInfo.split("\\s+")[1]);

            if (age > 30) {
                Person person = new Person(name,age);
                listPeople.add(person);
            }
        }
        listPeople.sort(Comparator.comparing(Person::getName));

        for (Person person : listPeople) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
        }
    }


