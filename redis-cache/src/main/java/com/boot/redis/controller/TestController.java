package com.boot.redis.controller;

import com.boot.redis.entity.Users;
import com.boot.redis.service.UsersService;
import com.boot.redis.util.RedisUtil;
import com.boot.redis.util.Rest;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @program: springboot-demo
 * @description:
 * @author: zhangshuai
 * @create: 2020-03-26 16:01
 **/
@RequestMapping
@RestController
@Api(tags = "管理")
public class TestController {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    UsersService usersService;

//    @RequestMapping("/set")
//    public void test(){
//
//        boolean b = redisUtil.set("1111", "张帅");
//
//        System.out.println( b ? "成功" : "失败");
//
//        Object o = redisUtil.get("1111");
//
//        System.out.println(o.toString());
//
//    }

    @RequestMapping("/all")
    @ApiOperation(value = "数据全查",notes = "用户信息全查",httpMethod = "POST")
    public Rest<List<Users>> all(){
        Rest<List<Users>> r = new Rest<>();
        List<Users> list = usersService.all();
        r.setData(list);
        r.setErrCode(0);
        r.setMessage("成功！");
        r.setSuccess(true);
        return r;
    }

    @RequestMapping("/getone")
    @ApiOperation(value = "获取用户信息",notes = "查询一条用户信息",httpMethod = "POST")
    public Rest<Users> getone1(@RequestBody Users users){
        Rest<Users> r = new Rest<>();
        Users u = usersService.getone(2);
        r.setData(u);
        return r;
    }

//    @RequestMapping("/updateone")
//    public BackMsg updateone(){
//        Users u = usersService.updateone(1);
//        return new BackMsg();
//    }
//
//    @RequestMapping("/delone")
//    public JSONObject delone(){
//        usersService.delone(1);
//        JSONObject jo = new JSONObject();
//        jo.put("msg","成功");
//        return jo;
//    }

}
