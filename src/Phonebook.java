import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    private final HashMap<String, ArrayList<String>> book;

    public Phonebook() {
        book = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        ArrayList<String> i = get(surname);
        i.add(phoneNumber);
        book.put(surname, i);
    }

    public ArrayList<String> get(String surname) {
        ArrayList<String> i = book.get(surname);
        if (i == null) {
            i = new ArrayList<>();
        }
        return i;
    }

    @Override
    public String toString() {
        return book.toString();
    }


}
