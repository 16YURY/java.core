import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {

    Reader(AppData appData, String fileName) {
        ArrayList<String> file = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String str;
            while ((str = reader.readLine()) != null) {
                file.add(str);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        int[][] intData = new int[file.size()-1][];
        for (int j = 0; j < file.size(); j++) {
            String line = file.get(j);
            if (j == 0) {
                appData.setHeader(line.split(";"));
            } else {
                String[] params = line.split(";");
                int[] intParams = new int[params.length];
                for (int i = 0; i < params.length; i++){
                    intParams[i] = Integer.parseInt(params[i]);
                }
                intData[j-1] = intParams;
            }
        };

        appData.setData(intData);
    }
}

