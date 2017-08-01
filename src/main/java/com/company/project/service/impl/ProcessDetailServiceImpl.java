package com.company.project.service.impl;

import com.company.project.dao.ProcessDetailMapper;
import com.company.project.model.ProcessDetail;
import com.company.project.service.ProcessDetailService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/08/01.
 */
@Service
@Transactional
public class ProcessDetailServiceImpl extends AbstractService<ProcessDetail> implements ProcessDetailService {
    @Resource
    private ProcessDetailMapper processDetailMapper;

}
