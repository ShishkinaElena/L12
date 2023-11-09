package p1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();
        names.add("Alex"); // Метод add добавление элементов
        names.add("Igor");
        names.add("Masha");
        // добавим элемент, который существует:
        boolean fl = names.add("Alex");
        System.out.println(fl); // т.к. уже есть это имя, то будет false

        System.out.println(names.size());  // получение размера = 3
        for (String name: names){
            System.out.println(name);
        }
        names.remove("Alex");
        System.out.println("_________________________");

        // создаем коллекцию объектов  класса People
        HashSet<People> peoples = new HashSet<>();
        peoples.add( new People("Alex"));
        peoples.add( new People("Masha"));
        peoples.add( new People("Katya"));
        peoples.add( new People("Alex"));

        // посмотрим какие элементы есть
        for (People people: peoples) {
            System.out.println(people.getName()); // получилось два одинаковых имени, что бы этого избежать надо сгенерировать equals метод
            //System.out.println(peoples); // ответ [p1.People@10f87f48, p1.People@5b480cf9, p1.People@6f496d9f, p1.People@723279cf]
        }
    }
}