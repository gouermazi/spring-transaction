package com.cj.perf.web.service;

import com.cj.perf.web.dao.InfoMapper;
import com.cj.pojo.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author chen·jie
 */
@Service
public class TransService {
    @Autowired
    private InfoMapper infoMapper;
    @Autowired
    private YuService yuService;

    @Transactional(propagation = Propagation.REQUIRED)
    public  int doSth(Stu stu) {
        int o = infoMapper.insert(stu);
//        System.out.println(1/0);

        yuService.dd();

        return 0;
    }
}
