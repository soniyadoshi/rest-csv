package healthcare.carta.interview.restcsv.controller;

import healthcare.carta.interview.restcsv.helper.CSVHelper;
import healthcare.carta.interview.restcsv.model.CSVData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping
public class CSVController {

    @PostMapping
    public ResponseEntity<Double> average(@RequestParam("data") MultipartFile file, @RequestParam("column") String colName) throws Exception {

        CSVData csvData = CSVHelper.parseCSV(file.getInputStream(), colName);
        Double average = csvData.getTotalSum() / csvData.getRecordCount();
        return ResponseEntity.ok().body(average);
    }


}
