package com.cj.perf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;

@SpringBootApplication
public class PerfApplication {

    public static void main(String[] args) {
        SpringApplication.run(PerfApplication.class, args);
    }


}

@RestController()
class Res {

    @GetMapping()
    public Object hello(HttpServletResponse response) {
        response.setHeader("Last-Modified", new Date().toGMTString());
        System.out.println(Instant.now());
        return new HashMap(){{put("1", 1);}};
    }
}



