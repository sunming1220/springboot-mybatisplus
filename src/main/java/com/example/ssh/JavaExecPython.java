package com.example.ssh;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by sunming on 2019/6/15.
 */
public class JavaExecPython {
    public static void main(String[] args) {

    }

    /**
     * java执行本地python文件
     */
    public void exec(){
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


    public void execLinuxPy(){
        RemoteExecuteCommand remoteExecuteCommand = new RemoteExecuteCommand("192.168.70.203", "ubuntu", "ubuntu");
        if(remoteExecuteCommand.login()){
            String execute = remoteExecuteCommand.execute("python /home/ubuntu/demo.py");
            System.out.println(execute);
        }
    }
}
