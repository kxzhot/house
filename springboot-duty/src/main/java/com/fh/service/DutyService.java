package com.fh.service;

import com.fh.entity.Admin;
import com.fh.entity.Duty;

import java.util.List;

public interface DutyService {
    List<Duty> queryAllDuty();

    List<Character> queryCharacterByAdminId(Integer adminId);

    List<Duty> queryDutyByAdminId(int adminId);

    List<Admin> selectAllAdmin();

    void addAdmin(Admin admin);

    Admin getAdminById(int id);

    void updateAdmin(Admin admin);
}
