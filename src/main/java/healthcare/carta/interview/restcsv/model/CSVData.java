package healthcare.carta.interview.restcsv.model;

import java.util.List;
/*
It is a class to store CSV data
 */
public class CSVData {

    private List<Double> numbers;
    private Double totalSum;
    private Integer recordCount;

    public CSVData(List<Double> numbers, Double totalSum, Integer recordCount) {
        this.numbers = numbers;
        this.totalSum = totalSum;
        this.recordCount = recordCount;
    }

    public List<Double> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Double> numbers) {
        this.numbers = numbers;
    }

    public Double getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(Double totalSum) {
        this.totalSum = totalSum;
    }

    public Integer getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(Integer recordCount) {
        this.recordCount = recordCount;
    }
}
