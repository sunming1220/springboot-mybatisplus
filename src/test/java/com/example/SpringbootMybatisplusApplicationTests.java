package com.example;

import cn.hutool.core.io.FileUtil;
import com.example.activemq.Producer;
import com.example.ssh.RemoteExecuteCommand;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisplusApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private Producer producer;

    @Test
    public void test() {
        ActiveMQQueue destination = new ActiveMQQueue("test.queue");
        producer.sendMessage(destination, "my name is sunming");
    }

    @Test
    public void execLinuxCmd() {
        RemoteExecuteCommand rec = new RemoteExecuteCommand("192.168.70.189", "ubuntu", "ubuntu");
        String s = rec.execute("cat /opt/files/tmp/download/autoTAF/20190719/17/0ca25c99f022462e9a55329e02ef7f19/10u.json");
        System.out.println(s);
//        File file = new File("/opt/files/tmp/download/autoTAF/20190719/18/0ca25c99f022462e9a55329e02ef7f19/10u.json");

//        PrintWriter pw = null;
//        try {
//            pw = new PrintWriter(file);
//            pw.write(s);
//            pw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        FileUtil.writeString(s, "/opt/files/tmp/download/autoTAF/20190719/18/0ca25c99f022462e9a55329e02ef7f19/10u.json", "utf-8");

        System.out.println("写入成功..");

    }

    @Test
    public void date() {
        String nowDateStr = "20190720";
        int hour = 2;
        String date = nowDateStr + " " + hour + ":00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        Date parse = null;
        try {
            parse = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(parse);
        SimpleDateFormat sdff = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String format = sdff.format(parse);
        System.out.println(format);
    }

}
