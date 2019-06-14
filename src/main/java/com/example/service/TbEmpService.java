package com.example.service;

import com.example.dto.TbEmp;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sunming on 2019/6/14.
 */

public interface TbEmpService {


    List<TbEmp> selectList();
}
