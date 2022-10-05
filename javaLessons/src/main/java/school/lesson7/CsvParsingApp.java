package school.lesson7;

import java.io.File;
import java.io.IOException;

public class CsvParsingApp {
    private static final String[] header = {"Value 1", "Value 2", "Value 3", "Value 4"};
    private static final int[][] data = {{100, 200, 123}, {300, 400, 500}, {222, 333, 444, 555}, {144, 3777, 3749, 1}};
    private static final String[] newHeader = {"Departments", "Employees", "Equipment", "Stationary"};
    private static final int[][] newData = {{8, 20, 7, 40}, {6, 40, 20, 567}, {1, 7, 18, 239}, {15, 888, 999,}};

    public static void main(String[] args) throws IOException {
        CsvParser parser = new CsvParser();
        File path = new File("").getAbsoluteFile();
        String pathToFile = path.getAbsolutePath() + "/newfile.csv";

        AppData appData = new AppData(header, data);

        String symbol = ";";
        parser.save(pathToFile, appData, symbol);

        appData = parser.read(pathToFile, symbol);
        System.out.println(appData);

        AppData newAppData = new AppData(newHeader, newData);
        parser.save(pathToFile, newAppData, symbol);
    }
}
