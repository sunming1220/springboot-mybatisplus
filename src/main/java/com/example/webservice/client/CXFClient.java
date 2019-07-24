package com.example.webservice.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * Created by sunming on 2019/6/21.
 */
public class CXFClient {

    public static void main(String[] args) {
        //创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://192.168.40.240:8080/rminf/services/RmOutAccess?wsdl");
        // 需要密码的情况需要加上用户名和密码
        // client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME, PASS_WORD));
        Object[] objects = {"xtlb", "jkxlh", "jkid","UTF8XmlDoc"};
        try {
            // invoke("方法名",参数1,参数2,参数3....);

            objects = client.invoke("writeObjectOut", objects);
            System.out.println("返回数据:" + objects[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }

//        try {
//            // 接口地址
//            String address = "http://192.168.40.240:8888/demo/api?wsdl";
//            // 代理工厂
//            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
//            // 设置代理地址
//            jaxWsProxyFactoryBean.setAddress(address);
//            // 设置接口类型
//            jaxWsProxyFactoryBean.setServiceClass(UserService.class);
//            // 创建一个代理接口实现
//            UserService us = (UserService) jaxWsProxyFactoryBean.create();
//            // 数据准备
//            String userId = "maple";
//            // 调用代理接口的方法调用并返回结果
//            String result = us.getUser(userId);
//            System.out.println("返回结果:" + result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
