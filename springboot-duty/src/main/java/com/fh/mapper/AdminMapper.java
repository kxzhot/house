package com.fh.mapper;

import com.fh.entity.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper {

    Admin queryAdminByAccount(String adminAccount);
}
