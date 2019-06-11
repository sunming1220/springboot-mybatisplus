package com.example;

import com.example.dto.TbEmp;
import com.example.mapper.TbEmpMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by sunming on 2019/6/11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TbEmpTest {

    @Autowired
    private TbEmpMapper tbEmpMapper;

    @Test
    public void testSelect(){
        List<TbEmp> tbEmps = tbEmpMapper.selectList(null);
        Assert.assertEquals(4,tbEmps.size());
        tbEmps.forEach(System.out::println);
    }
}
