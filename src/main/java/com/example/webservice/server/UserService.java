package com.example.webservice.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by sunming on 2019/6/21.
 */
@WebService
public interface UserService {
    @WebMethod
     String getUser(@WebParam(name = "userId") String userId);
}
