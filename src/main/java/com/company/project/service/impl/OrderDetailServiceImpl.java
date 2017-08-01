package com.company.project.service.impl;

import com.company.project.dao.OrderDetailMapper;
import com.company.project.model.OrderDetail;
import com.company.project.service.OrderDetailService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/08/01.
 */
@Service
@Transactional
public class OrderDetailServiceImpl extends AbstractService<OrderDetail> implements OrderDetailService {
    @Resource
    private OrderDetailMapper orderDetailMapper;

}
