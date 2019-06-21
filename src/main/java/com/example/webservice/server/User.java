package com.example.webservice.server;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by sunming on 2019/6/21.
 */
@Data
public class User implements Serializable{
    private static final long serialVersionUID = -3628469724795296287L;

    private String userId;
    private String userName;
    private String email;
}
