package com.company.project.service.impl;

import com.company.project.dao.ConfigurationMapper;
import com.company.project.model.Configuration;
import com.company.project.service.ConfigurationService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/08/01.
 */
@Service
@Transactional
public class ConfigurationServiceImpl extends AbstractService<Configuration> implements ConfigurationService {
    @Resource
    private ConfigurationMapper configurationMapper;

}
