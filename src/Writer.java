import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    Writer(AppData appData, String fileName) {
        String[] header = appData.getHeader();
        int[][] data = appData.getData();

        String headerLine = String.join(";", header) + "\n";

        String dataLine = "";
        for (int[] datum : data) {

            for (int j = 0; j < datum.length; j++) {
                dataLine = dataLine + datum[j];
                if (j < datum.length - 1) {
                    dataLine = dataLine + ";";
                }
            }
            dataLine = dataLine + "\n";
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(headerLine);
            writer.write(dataLine);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

