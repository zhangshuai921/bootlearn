package com.boot.redis.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: springboot-demo
 * @description:
 * @author: zhangshuai
 * @create: 2020-03-26 16:04
 **/
@Data
public class Users implements Serializable {

    private static final long serialVersionUID = 8666638425979532211L;

    @ApiModelProperty(value = "主键ID")
    private int id;
    @ApiModelProperty(value = "用户名")
    private String userName;

}
