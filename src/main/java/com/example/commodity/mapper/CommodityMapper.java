package com.example.commodity.mapper;

import com.example.commodity.domain.Commodity;
import com.example.commodity.util.Pagination;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

@Mapper
public interface CommodityMapper {
    boolean save(Commodity commodity);
    boolean delete(Set<Integer> commodityId);
    boolean update(Commodity commodity);
    //MyBatis中一个方法包含多个参数时,需要为每个参数加＠Param注解
    //这些注解里面的名字都是放在映射文件当中的建议可以一样的方便使用
    List<Commodity> find(@Param("name") String name, @Param("pagination") Pagination pagination);
    Integer findCount(String name);
}
