package com.example;

import com.example.dto.TbEmp;
import com.example.mapper.TbEmpMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.IOException;
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

    /**
     * java执行python文件
     * @param args
     */
    public static void main(String[] args) {
        try {
            System.out.println("start");
            String[] strings = new String[]{"python", "D:/demo.py"};
            Process pr = Runtime.getRuntime().exec(strings);
            BufferedReader br = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            pr.waitFor();
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
