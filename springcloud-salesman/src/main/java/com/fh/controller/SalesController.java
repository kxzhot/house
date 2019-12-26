package com.fh.controller;

import com.fh.biz.SalesService;
import com.fh.common.DataTableResult;
import com.fh.common.ServerResponse;
import com.fh.po.Sales;
import com.fh.vo.SalesVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesController {
    @Resource
    private SalesService salesService;

    @RequestMapping("/findSalesList")
    public ServerResponse findSalesList(Sales sales){
        long totalCount = salesService.findSalesCount();
        List<SalesVo> salesList = salesService.findSalesList(sales);
        DataTableResult dataTableResult = new DataTableResult(sales.getDraw(),totalCount,totalCount,salesList);
        return ServerResponse.success(dataTableResult);
    }
    @PostMapping("/addSales")
    public ServerResponse addSales(Sales sales){
        salesService.addSales(sales);
        return ServerResponse.success();
    }
    @RequestMapping("/deleteSales")
    public ServerResponse deleteSales(Integer id){
        salesService.deleteSales(id);
        return ServerResponse.success();
    }
    @RequestMapping("/toUpdateSales")
    public ServerResponse toUpdateSales(Integer id){
        SalesVo salesVo = salesService.toUpdateSales(id);
        return ServerResponse.success(salesVo);
    }
    @RequestMapping("updateSales")
    public ServerResponse updateSales(Sales sales){
        salesService.updateSales(sales);
        return ServerResponse.success();
    }
    @RequestMapping("findSalesById")
    public String findSaleById(Integer id){
        Sales sales = salesService.findSalesById(id);
        return sales.getSalesName();
    }
}
