package com.example.service.impl;

import com.example.dto.TbEmp;
import com.example.dao.TbEmpMapper;
import com.example.service.TbEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sunming on 2019/6/14.
 */
@Service
public class TbEmpServiceImpl implements TbEmpService{
    @Autowired
    private TbEmpMapper tbEmpMapper;

     public List<TbEmp> selectList(){
         List<TbEmp> tbEmps = tbEmpMapper.selectList(null);
         return tbEmps;
     };
 }
