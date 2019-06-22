package com.example.web.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by sunming on 2019/6/20.
 */
@Data
public class UserVO {

    @ApiModelProperty(value = "uuid",required = true)
    private String uuid;

    @ApiModelProperty(value = "账号名",required = true)
    private String username;

    @ApiModelProperty(value = "密码",required = true)
    private String password;

    @ApiModelProperty(value = "盐",required = true)
    private String salt;
}
