package com.company.project.service.impl;

import com.company.project.dao.ReceivedDetailMapper;
import com.company.project.model.ReceivedDetail;
import com.company.project.service.ReceivedDetailService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/08/01.
 */
@Service
@Transactional
public class ReceivedDetailServiceImpl extends AbstractService<ReceivedDetail> implements ReceivedDetailService {
    @Resource
    private ReceivedDetailMapper receivedDetailMapper;

}
