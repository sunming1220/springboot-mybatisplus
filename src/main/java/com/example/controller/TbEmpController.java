package com.example.controller;

import com.example.dto.TbEmp;
import com.example.response.Response;
import com.example.service.TbEmpService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sunming on 2019/6/14.
 */
@RestController
@Api(tags = "swagger学习", description = "swagger demo")
public class TbEmpController {

    @Autowired
    private TbEmpService tbEmpService;

    @ApiOperation(value = "获取所有数据")
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Response selectList(){
        List<TbEmp> tbEmps = tbEmpService.selectList();
        return new Response(200,"success",tbEmps);
    }
}
