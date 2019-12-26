package com.fh.controller;

import com.fh.biz.TypeService;
import com.fh.common.DataTableResult;
import com.fh.common.ServerResponse;
import com.fh.po.Type;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/type")
public class TypeController {
    @Resource(name = "typeService")
    private TypeService typeService;

    @RequestMapping("/findTypeList")
    public ServerResponse findTypeList(Type type){
        long totalCount = typeService.findTypeTotalCount();
        List<Type> typeList = typeService.queryTypeList(type);
        DataTableResult dataTableResult = new DataTableResult(type.getDraw(),totalCount,totalCount,typeList);
        return ServerResponse.success(dataTableResult);
    }
    @RequestMapping("/queryTypeList")
    public ServerResponse queryTypeList(Type type){
        List<Type> typeList = typeService.findTypeList(type);
        return ServerResponse.success(typeList);

    }
    @RequestMapping("/addType")
    public ServerResponse addType(Type type){
        typeService.addType(type);
        return ServerResponse.success();
    }
    @RequestMapping("/deleteType")
    public ServerResponse deleteType(Integer id){
        typeService.deleteType(id);
        return ServerResponse.success();
    }
    @RequestMapping("/toUpdateType")
    public ServerResponse toUpdateType(Integer id){
        Type type = typeService.toUpdateType(id);
        return ServerResponse.success(type);
    }
    @RequestMapping("/updateType")
    public ServerResponse updateType(Type type){
        typeService.updateType(type);
        return ServerResponse.success();
    }
    @RequestMapping("/findById")
    public String findById(Integer id){
        Type type = typeService.findById(id);
        return type.getGenre();
    }
}
