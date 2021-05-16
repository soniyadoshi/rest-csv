package healthcare.carta.interview.restcsv.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.io.IOException;
import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IOException.class)
    public ResponseEntity<?> customException(Exception ex, WebRequest request) {
        ErrorDetail details = new ErrorDetail(ex.getMessage(), request.getDescription(false), new Date());
        return new ResponseEntity(details, HttpStatus.EXPECTATION_FAILED);
    }
}
