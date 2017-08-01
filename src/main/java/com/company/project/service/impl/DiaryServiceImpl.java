package com.company.project.service.impl;

import com.company.project.dao.DiaryMapper;
import com.company.project.model.Diary;
import com.company.project.service.DiaryService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/08/01.
 */
@Service
@Transactional
public class DiaryServiceImpl extends AbstractService<Diary> implements DiaryService {
    @Resource
    private DiaryMapper diaryMapper;

}
