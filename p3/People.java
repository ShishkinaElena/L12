package p3;

import java.util.Objects;

public class People implements  Comparable<People> {
    private  String name;

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return name.equals(people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

   /* @Override
    public int compareTo(People o) {     // данный метод позволяет сравнить текущий объект с объектом(p),
                                                    который был передан в качестве параметра
        return 0;
    }*/
   @Override
   public int compareTo(People p) {
      // return name.compareTo(p.getName()); // таким методом можно сравнить объекты, метод возвращает отр число, то объект тек будет располагаться перед тем, который дан по параметрам
       // можно сравнить по длине имени:
       return name.length() - p.getName().length();

   }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }
}
