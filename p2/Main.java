package p2;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Ivan");
        names.add("Masha");
        names.add("Alex");
        names.add("Igor");
        names.add("Masha2");
        names.add("Alex2");
        System.out.println(names.size());
        //names.remove("Alex");
        for (String name : names) {
            System.out.println(name); // сортирует по алфавиту
        }
        // получить первый элемент:
        System.out.println(names.first());
        // последний элемент:
        System.out.println(names.last());

        // получить кусок коллекции по границам:
        SortedSet<String> set = names.subSet("Igor","Masha"); // итог [Igor, Ivan] - последний элемент не включается
        System.out.println(set);


        // получаем элемент, который больше искомого
        String greater = names.higher("Masha");
        System.out.println(greater);

        // можно получить предыдущий элемент
        System.out.println(names.lower("Masha"));

        SortedSet<String> setL = names.headSet("Ivan");
        System.out.println(setL);
        SortedSet<String> setH = names.tailSet("Ivan");
        System.out.println(setH);

        // можно перевернуть коллекцию и выбрать в обратном порядке
        NavigableSet<String> namDesq = names.descendingSet();
        System.out.println(namDesq); // [Masha2, Masha, Ivan, Igor, Alex2, Alex]








    }
}
