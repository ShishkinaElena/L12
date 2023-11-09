package p3;

// добавить свой класс

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<People> peoples = new TreeSet<>();
        peoples.add(new People("Alex")); // здесь получим ошибку, т.к. объект не может быть преобразован, надо применить интерфейс Comparable
        peoples.add(new People("Alex")); // в коллекцию поподёт только один Alex

        System.out.println(peoples); // [p3.People@1f2e5d] , если хотим красивое наименование, то надо добавить toString


    }



}
