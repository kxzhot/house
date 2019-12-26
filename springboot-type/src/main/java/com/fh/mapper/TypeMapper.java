package com.fh.mapper;

import com.fh.po.Type;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TypeMapper {
    long findTypeTotalCount();

    List<Type> queryTypeList(Type type);

    void addType(Type type);

    void deleteType(Integer id);

    Type toUpdateType(Integer id);

    void updateType(Type type);

    Type findById(Integer id);

    List<Type> findTypeList(Type type);
}
