package com.example.commodity.service.impl;

import com.example.commodity.domain.Commodity;
import com.example.commodity.mapper.CommodityMapper;
import com.example.commodity.service.CommodityService;
import com.example.commodity.util.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityMapper commodityMapper;
    @Override
    public boolean save(Commodity commodity) {
        return commodityMapper.save(commodity);
    }

    @Override
    public boolean delete(Set<Integer> commodityId) {
        return commodityMapper.delete(commodityId);
    }


    @Override
    public boolean update(Commodity commodity) {
        return commodityMapper.update(commodity);
    }

    @Override
    public Pagination<Commodity> find(String name, Pagination pagination) {
        int count = commodityMapper.findCount(name);
        pagination.setPageCount(count % pagination.getPAGESIZE()==0 ? count / pagination.getPAGESIZE() :
                count / pagination.getPAGESIZE()+1);
        List<Commodity> list = commodityMapper.find(name,pagination);
        pagination.setResults(list);
        return pagination;
    }

    @Override
    public Integer findCount(String name) {
        return commodityMapper.findCount(name);
    }
}
