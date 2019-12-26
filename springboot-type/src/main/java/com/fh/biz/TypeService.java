package com.fh.biz;

import com.fh.po.Type;

import java.util.List;

public interface TypeService {

    long findTypeTotalCount();

    List<Type> queryTypeList(Type type);

    void addType(Type type);

    void deleteType(Integer id);

    Type toUpdateType(Integer id);

    void updateType(Type type);

    Type findById(Integer id);

    List<Type> findTypeList(Type type);
}
