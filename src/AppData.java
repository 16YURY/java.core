import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    private final String fileName;

    AppData(String name) {
        fileName = name;
    }

    public void save() {
        Writer file = new Writer(this, fileName);
    }

    public void load() {
        new Reader(this, fileName);
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void print() {
        System.out.println("Header: " + Arrays.toString(header));
        System.out.println("Data: " + Arrays.deepToString(data));
    }
}

