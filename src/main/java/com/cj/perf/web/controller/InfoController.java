package com.cj.perf.web.controller;

import com.cj.perf.web.service.TransService;
import com.cj.pojo.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * @author chen·jie
 */
@Controller
public class InfoController {

    @Autowired
    private TransService transService;

    @GetMapping("/insert")
    @ResponseBody
    Object doSth() {
        Stu ss = new Stu(24);
        transService.doSth(ss);
        System.out.println(ss);
        return new HashMap(){{put(1,1);}};
    }
}
