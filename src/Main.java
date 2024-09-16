import java.util.Arrays;

public class Main {
    public static String[] arr;

    public static void main(String[] args) {
        arr = new String[]{"5",  "1", "123"};
        System.out.println("Source array: " + Arrays.toString(arr));
        try {
            String[] newArray = swap(arr, 1, 2);
            System.out.println("Swapped array: " + Arrays.toString(newArray));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBoxBig = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBoxSmall = new Box<>();

        Apple apple = new Apple();
        appleBox.add(apple);
        appleBox.add(apple);
        appleBox.add(new Apple());

        appleBoxBig.add(apple);
        appleBoxBig.add(apple);
        appleBoxBig.add(apple);
        appleBoxBig.add(apple);
        appleBoxBig.add(apple);
        appleBoxBig.add(apple);

        Orange orange = new Orange();
        orangeBox.add(orange);
        orangeBox.add(orange);
        orangeBox.add(orange);
        orangeBox.add(orange);
        orangeBox.add(orange);
        orangeBox.add(orange);
        orangeBox.add(orange);
        orangeBox.add(orange);

        orangeBoxSmall.add(orange);
        orangeBoxSmall.add(orange);

        appleBox.print("apple");
        appleBoxBig.print("appleBig");
        orangeBox.print("orange");
        orangeBoxSmall.print("orangeSmall");

        System.out.println("Compare box apple and appleBig " + appleBox.compare(appleBoxBig));
        System.out.println("Compare box orange and appleBig " + orangeBox.compare(appleBoxBig));
        System.out.println("Compare box orangeSmall and apple " + orangeBoxSmall.compare(appleBox));

        appleBox.fillBox(appleBoxBig);
        orangeBoxSmall.fillBox(orangeBox);

        appleBox.print("apple");
        appleBoxBig.print("appleBig");
        orangeBox.print("orange");
        orangeBoxSmall.print("orangeSmall");

    }
    public static String[] swap(String[] arr, int idx1, int idx2) throws Exception {

        int length = arr.length - 1;
        if (idx1 > length || idx1 < 0) {
            throw new Exception("Wrong parameter 1: " + idx1 + ", must be from 0 to " + length);
        }
        if (idx2 > length || idx2 < 0) {
            throw new Exception("Wrong parameter 2: " + idx2 + ", must be from 0 to " + length);
        }
        String temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
        return arr;
    }
}
