package com.example.commodity.service;

import com.example.commodity.domain.Commodity;
import com.example.commodity.util.Pagination;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

public interface CommodityService {

    boolean save(Commodity commodity);
    boolean delete(Set<Integer> commodityId);
    boolean update(Commodity commodity);
    Pagination<Commodity> find(@Param("name") String name, @Param("pagination") Pagination pagination);
    Integer findCount(String name);
}
