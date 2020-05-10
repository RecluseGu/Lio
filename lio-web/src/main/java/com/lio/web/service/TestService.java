package com.lio.web.service;

import com.lio.common.service.IService;
import com.lio.web.domain.Test;
import java.util.List;

public interface TestService extends IService<Test> {

    List<Test> getTestList();

}
