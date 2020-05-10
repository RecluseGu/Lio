package com.lio.web.dao;


import com.lio.common.config.MyMapper;
import com.lio.web.domain.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper extends MyMapper<Test> {

    List<Test> getTestList();

}
