package com.fh.biz;

import com.fh.po.Sales;
import com.fh.vo.SalesVo;

import java.util.List;

public interface SalesService {
    long findSalesCount();

    List<SalesVo> findSalesList(Sales sales);

    void addSales(Sales sales);

    void deleteSales(Integer id);

    SalesVo toUpdateSales(Integer id);

    void updateSales(Sales sales);

    Sales findSalesById(Integer id);
}
