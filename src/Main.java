public class Main {
    public static String[][] arr;
    public static final int SIZE = 4;


    public static void main(String[] args) {
        arr = new String[][]{{"5","2.1","4","1"}, {"8","9","3","1"}, {"1","5","2","2"}, {"4","4","6","7"}};

        int sum = 0;
        try {
            sum = argArray(arr);
        } catch (MyArraySizeException e) {
//            sum = 1;
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
//            sum = 100;
            System.out.println(e.getMessage());
        }
        System.out.println("Sum: " + sum);
    }

    public static int argArray(String[][] arr) {
        int size = arr.length;
        if (size != SIZE) {
            throw new MyArraySizeException(" Wrong array size: " + size + ", must be: " + SIZE);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            String[] line = arr[i];
            size = line.length;
            if (size != SIZE) {
                throw new MyArraySizeException(" Wrong array size: " + size + ", must be: " + SIZE + " in line " + i);
            }
            for (int j = 0; j < line.length; j++) {
                String s = line[j];
                try {
                    sum += Integer.parseInt(s);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Wrong data '" + s + "' in line " + i + ", position " + j);
                }
            }
        }

        return sum;
    }
}
