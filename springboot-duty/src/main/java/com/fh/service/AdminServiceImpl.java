package com.fh.service;

import com.fh.entity.Admin;
import com.fh.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin queryAdminByAccount(String adminAccount) {
        return adminMapper.queryAdminByAccount(adminAccount);
    }
}
