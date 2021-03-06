package com.lio.web.controller;

import com.lio.common.CommonTest;
import com.lio.web.domain.Test;
import com.lio.web.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        List<Test> testList = testService.getTestList();
        return testList.toString();
    }

}
