import java.util.ArrayList;
import java.util.HashMap;

public class Main {


    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        list.add("E");
        list.add("A");
        list.add("C");
        list.add("D");
        list.add("C");
        list.add("D");

        HashMap<String, Integer> dictionary = new HashMap<>();

        list.forEach(s -> {
            Integer item = dictionary.get(s);
            if (item == null) {
                dictionary.put(s, 1);
            } else {
                dictionary.put(s, item + 1);
            }
        });

        Phonebook book = new Phonebook();

        book.add("Иванов", "11111");
        book.add("Петров", "22222");
        book.add("Сидоров", "33333");
        book.add("Комаров", "44444");
        book.add("Комаров", "+999999");
        book.add("Смирнов", "55555");
        System.out.println(dictionary);
        System.out.println(book);
        System.out.println(book.get("Комаров"));
        System.out.println(book.get("Смирнов"));
        System.out.println(book.get("Комаров1"));


    }
}