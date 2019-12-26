package com.fh.controller;

import com.fh.entity.Admin;
import com.fh.entity.Duty;
import com.fh.service.DutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//@CrossOrigin
@Controller
@RequestMapping("duty")
public class DutyController {
    @Autowired
    private DutyService dutyService;

    @PostMapping("queryCharacterByAdminId")
    @ResponseBody
    public List<Character> queryCharacterByAdminId(Integer adminId){
        List<Character> characterList = dutyService.queryCharacterByAdminId(adminId);
        return characterList;
    }

    @PostMapping("queryDutyByAdminId")
    @ResponseBody
    public List<Duty> queryDutyByAdminId(int adminId){
        List<Duty> dutyList = dutyService.queryDutyByAdminId(adminId);
        return dutyList;
    }

    @GetMapping("queryAllDuty")
    @ResponseBody
    public List queryAllDuty(){
        List<Duty> dutyList = dutyService.queryAllDuty();
        return dutyList;
    }
    /**
     * 管理员管理
     */
    @PostMapping("adminManage")
    @ResponseBody
    public String adminManage(String dutyUrl){

        return dutyUrl;
    }
    /**
     * 查询所有的后台管理人员
     */
    @GetMapping("selectAllAdmin")
    @ResponseBody
    public List<Admin> selectAllAdmin(){
        List<Admin> adminList = dutyService.selectAllAdmin();
        return adminList;
    }
    /**
     * 添加管理员
     */
    @PostMapping("addAdmin")
    @ResponseBody
    public String addAdmin(Admin admin){
        dutyService.addAdmin(admin);
        return "添加成功";
    }
    /**
     * 根据ID获取管理员信息
     */
    @PostMapping("getAdminById")
    @ResponseBody
    public Admin getAdminById(int id){
        Admin admin = dutyService.getAdminById(id);
        return admin;
    }
    /**
     *
     */
    @PostMapping("updateAdmin")
    @ResponseBody
    public String updateAdmin(Admin admin){
        dutyService.updateAdmin(admin);
        return "修改成功";
    }
}
