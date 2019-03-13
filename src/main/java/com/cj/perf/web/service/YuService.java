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
public class YuService {
    @Autowired
    private InfoMapper infoMapper;

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void dd() {
        infoMapper.insert(new Stu(88));

        System.out.println(1/0);
    }
}
