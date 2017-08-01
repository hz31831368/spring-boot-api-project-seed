package com.company.project.service.impl;

import com.company.project.dao.CostDetailMapper;
import com.company.project.model.CostDetail;
import com.company.project.service.CostDetailService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/08/01.
 */
@Service
@Transactional
public class CostDetailServiceImpl extends AbstractService<CostDetail> implements CostDetailService {
    @Resource
    private CostDetailMapper costDetailMapper;

}
