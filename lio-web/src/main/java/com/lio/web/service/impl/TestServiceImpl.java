package com.lio.web.service.impl;

import com.lio.common.service.impl.IServiceImpl;
import com.lio.web.dao.TestMapper;
import com.lio.web.domain.Test;
import com.lio.web.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("testService")
public class TestServiceImpl extends IServiceImpl<Test> implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> getTestList(){
        return this.selectAll();
    }

}
