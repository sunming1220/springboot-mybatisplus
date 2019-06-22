package com.example.dao.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Created by sunming on 2019/6/20.
 */
@Data
@TableName("user")
public class UserDO {

    @TableId
    private String uuid;

    private String username;

    private String password;

    private String salt;
}
