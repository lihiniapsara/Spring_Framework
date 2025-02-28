package org.example.spring_boot_13.advisor;

import org.example.spring_boot_13.util.ResponseUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class AppWideExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseUtil exeptionHandler(Exception e) {
        return new ResponseUtil(500, "Internal Server Error", e.getMessage());
    }
}
