package com.fh.mapper;

import com.fh.po.Sales;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SalesMapper {
    long findSalesCount();

    List<Sales> findSalesList(Sales sales);

    void addSales(Sales sales);

    void deleteSales(Integer id);

    Sales toUpdateSales(Integer id);

    void updateSales(Sales sales);

    Sales findSalesById(Integer id);
}
