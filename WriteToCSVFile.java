import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class WriteToCSVFile {

    public static void main(String args[]) throws Exception {

        String csvFile = "/Users/username/Desktop/outputfile.csv";      // set the location of the CSV file
        CSVWriter writer = new CSVWriter(new FileWriter(csvFile));

        // Create individual records
        String record1[] = {"First Name", "Surname", "Age"};
        String record2[] = {"Mary", "Smith", "36"};
        String record3[] = {"Bob", "Jones", "39"};

        // Add individual records to list
        List<String[]> records = new ArrayList<>();
        records.add(record1);
        records.add(record2);
        records.add(record3);

        // Write records to CSV file
        writer.writeAll(records);
        writer.flush();

        // Confirm data has been written
        System.out.println("Data successfully written to file.");
    }
}
