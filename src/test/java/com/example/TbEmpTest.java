package com.example;

import com.example.dto.TbEmp;
import com.example.dao.mapper.TbEmpMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
    public void testSelect() {
        List<TbEmp> tbEmps = tbEmpMapper.selectList(null);
        Assert.assertEquals(4, tbEmps.size());
        tbEmps.forEach(System.out::println);
    }

    @Test
    public void ave() {
//        List<Double> list = new ArrayList<>();
//        list.add(1.2);
//        list.add(2.0);
//        list.add(3.0);
//        OptionalDouble average = list.stream().mapToDouble(x -> x).average();
//        double asDouble = average.getAsDouble();
//        asDouble = 999.9;
//        int i = new Double(asDouble).intValue();
//        i = i / 50;
//        System.out.println(i);

        System.out.println(1 - 2);
        System.out.println(Math.abs(1 - 2));
    }

}
