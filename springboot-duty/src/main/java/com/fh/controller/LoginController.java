package com.fh.controller;

import com.alibaba.fastjson.JSON;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fh.entity.Admin;
import com.fh.service.AdminService;
import com.fh.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@CrossOrigin
@Controller
@RequestMapping("admin")
public class LoginController {
    @Autowired
    private AdminService adminService;

    @PostMapping("login")
    @ResponseBody
    public String login(String adminAccount){
        String token = "";
        Admin admin = adminService.queryAdminByAccount(adminAccount);
        token= JWT.create().withAudience(admin.getAdminAccount())// 将 user id 保存到 token 里面
                .sign(Algorithm.HMAC256(admin.getAdminPassword()));// 以 password 作为 token 的密钥
        String jsonString = JSON.toJSONString(admin);
        RedisUtil.set("admin",jsonString);
        RedisUtil.set(token,jsonString);
        return token;
    }

    /**
     * 获取登陆用户的对象
     */
    @PostMapping("getAdmin")
    @ResponseBody
    public Admin getAdmin(String token){
        String adminStr = RedisUtil.get(token);
        Admin admin = JSON.parseObject(adminStr,Admin.class);
        return admin;
    }

}
