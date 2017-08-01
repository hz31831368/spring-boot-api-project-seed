package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ReceivedDetail;
import com.company.project.service.ReceivedDetailService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/08/01.
*/
@RestController
@RequestMapping("/received/detail")
public class ReceivedDetailController {
    @Resource
    private ReceivedDetailService receivedDetailService;

    @PostMapping("/add")
    public Result add(ReceivedDetail receivedDetail) {
        receivedDetailService.save(receivedDetail);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        receivedDetailService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(ReceivedDetail receivedDetail) {
        receivedDetailService.update(receivedDetail);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        ReceivedDetail receivedDetail = receivedDetailService.findById(id);
        return ResultGenerator.genSuccessResult(receivedDetail);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ReceivedDetail> list = receivedDetailService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
