package com.fh.service;

import com.alibaba.fastjson.JSONObject;
import com.fh.entity.Admin;
import com.fh.entity.Duty;
import com.fh.mapper.DutyMapper;
import com.fh.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DutyServiceImpl implements DutyService {
    @Autowired
    private DutyMapper dutyMapper;

    @Override
    public List<Duty> queryAllDuty() {
        List<Duty> addDutyList = dutyMapper.queryAllDuty();
        RedisUtil.set("allDutyList", JSONObject.toJSONString(addDutyList));
        return dutyMapper.queryAllDuty();
    }

    @Override
    public List<Character> queryCharacterByAdminId(Integer adminId) {
        return dutyMapper.queryCharacterByAdminId(adminId);
    }

    @Override
    public List<Duty> queryDutyByAdminId(int adminId) {
        List<Duty> partDutyList = dutyMapper.queryDutyByAdminId(adminId);
        RedisUtil.set("partDutyList",JSONObject.toJSONString(partDutyList));
        return dutyMapper.queryDutyByAdminId(adminId);
    }

    @Override
    public List<Admin> selectAllAdmin() {
        return dutyMapper.selectAllAdmin();
    }

    @Override
    public void addAdmin(Admin admin) {
        dutyMapper.addAdmin(admin);
    }

    @Override
    public Admin getAdminById(int id) {
        return dutyMapper.getAdminById(id);
    }

    @Override
    public void updateAdmin(Admin admin) {
        dutyMapper.updateAdmin(admin);
    }
}
