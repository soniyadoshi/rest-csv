package healthcare.carta.interview.restcsv.helper;

import healthcare.carta.interview.restcsv.model.CSVData;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
This class is helper class to parse csv
 */
public class CSVHelper {

     /*
       This method parses the CSV and stores CSV data in CSVData object for stream data calculation.
     */
    public static CSVData parseCSV (InputStream is, String colName) throws Exception {

        List<Double> numberList = new ArrayList<>();
        Double sum  = 0.0;
        CSVData csvData = null;

        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));) {

            CSVParser csvParser = new CSVParser(fileReader,
                    CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
            Iterable<CSVRecord> csvRecords = csvParser.getRecords();

            for (CSVRecord csvRecord : csvRecords) {

                Double num = Double.valueOf(csvRecord.get(colName));
                numberList.add(num);
                sum += num;
            }

            csvData = new CSVData(numberList, sum, numberList.size());

        } catch (Exception e) {
            throw new IOException("fail to parse CSV file: " + e.getMessage());
        }

        return csvData;
    }
}
