package healthcare.carta.interview.restcsv.exception;

import java.util.Date;

public class ErrorDetail {

    private String message;
    private String details;
    private Date date;

    public ErrorDetail(String message, String details, Date date) {
        this.message = message;
        this.details = details;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ErrorDetail{" +
                "message='" + message + '\'' +
                ", details='" + details + '\'' +
                ", date=" + date +
                '}';
    }
}
