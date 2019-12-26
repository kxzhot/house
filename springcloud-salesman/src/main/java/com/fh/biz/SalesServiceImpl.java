package com.fh.biz;

import com.fh.mapper.SalesMapper;
import com.fh.po.Sales;
import com.fh.util.UtilDate;
import com.fh.vo.SalesVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class SalesServiceImpl implements SalesService {
    @Resource
    private SalesMapper salesMapper;
    @Override
    public long findSalesCount() {
        long count = salesMapper.findSalesCount();
        return count;
    }

    @Override
    public List<SalesVo> findSalesList(Sales sales) {
        List<SalesVo> salesVoList = new ArrayList<>();
        List<Sales> salesList = salesMapper.findSalesList(sales);
        for (Sales sales1 : salesList) {
            SalesVo salesVo = getSalesVo(sales1);
            salesVoList.add(salesVo);
        }
        return salesVoList;
    }
    private SalesVo getSalesVo(Sales sales) {
        SalesVo salesVo = new SalesVo();
        salesVo.setId(sales.getId());
        salesVo.setSalesName(sales.getSalesName());
        salesVo.setAge(sales.getAge());
        salesVo.setSex(sales.getSex());
        salesVo.setPhone(sales.getPhone());
        salesVo.setEntryTime(UtilDate.date2Str(sales.getEntryTime(),UtilDate.Y_M_D));
        return salesVo;
    }

    @Override
    public void addSales(Sales sales) {
        salesMapper.addSales(sales);
    }

    @Override
    public void deleteSales(Integer id) {
        salesMapper.deleteSales(id);
    }

    @Override
    public SalesVo toUpdateSales(Integer id) {
        Sales sales = salesMapper.toUpdateSales(id);
        SalesVo salesVo = getSalesVo(sales);
        return salesVo;
    }

    @Override
    public void updateSales(Sales sales) {
        salesMapper.updateSales(sales);
    }

    @Override
    public Sales findSalesById(Integer id) {
        return salesMapper.findSalesById(id);
    }
}
