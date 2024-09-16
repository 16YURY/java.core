import java.util.ArrayList;

public class Box <T extends  Fruit> {

    double sum = 0;
    public ArrayList<T> array;

    public Box() {
        array = new ArrayList<>();
    }

    public void add(T fruit) {
        array.add(fruit);
    }

    public double getWeight() {
        sum = 0;
        array.forEach((fruit) -> sum += fruit.weight);
        return sum;
    }

    public boolean compare(Box box) {
        return getWeight() == box.getWeight();
    }

    public void fillBox(Box<T> box) {
        array.forEach((fruit) -> box.add(fruit));
        array.clear();
    }

    @Override
    public String toString() {
        return "Box{" +
                "weight=" + getWeight() +
                ", array=" + array +
                '}';
    }

    public void print(String subject) {
        System.out.println(subject + " " + this.toString());
    }
}
