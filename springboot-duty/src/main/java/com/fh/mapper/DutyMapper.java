package com.fh.mapper;

import com.fh.entity.Admin;
import com.fh.entity.Duty;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DutyMapper {
    List<Duty> queryAllDuty();

    List<Character> queryCharacterByAdminId(Integer adminId);

    List<Duty> queryDutyByAdminId(int adminId);

    List<Admin> selectAllAdmin();

    void addAdmin(Admin admin);

    Admin getAdminById(int id);

    void updateAdmin(Admin admin);
}
