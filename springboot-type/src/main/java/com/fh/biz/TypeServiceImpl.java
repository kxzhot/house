package com.fh.biz;

import com.fh.mapper.TypeMapper;
import com.fh.po.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("typeService")
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeMapper typeMapper;

    @Override
    public long findTypeTotalCount() {
        long count = typeMapper.findTypeTotalCount();
        return count;
    }

    @Override
    public List<Type> queryTypeList(Type type) {

        return typeMapper.queryTypeList(type);
    }

    @Override
    public void addType(Type type) {
        typeMapper.addType(type);
    }

    @Override
    public void deleteType(Integer id) {
        typeMapper.deleteType(id);
    }

    @Override
    public Type toUpdateType(Integer id) {
        return typeMapper.toUpdateType(id);
    }

    @Override
    public void updateType(Type type) {
        typeMapper.updateType(type);
    }

    @Override
    public Type findById(Integer id) {
        return typeMapper.findById(id);
    }

    @Override
    public List<Type> findTypeList(Type type) {
        return typeMapper.findTypeList(type);
    }
}
