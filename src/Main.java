import java.io.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {
    public static void main(String[] args) {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{100, 200, 123}, {300, 400, 500}};

        AppData appData = new AppData("demo.csv");
        appData.setData(data);
        appData.setHeader(header);


        appData.save();
        appData.load();
        appData.print();
    }
}