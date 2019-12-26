package com.fh.service;

import com.fh.entity.Admin;

public interface AdminService {
    Admin queryAdminByAccount(String adminAccount);
}
