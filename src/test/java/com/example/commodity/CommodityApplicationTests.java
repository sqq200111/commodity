package com.example.commodity;

import com.example.commodity.domain.Commodity;
import com.example.commodity.mapper.CommodityMapper;
import com.example.commodity.service.CommodityService;
import com.example.commodity.service.impl.CommodityServiceImpl;
import com.example.commodity.util.Pagination;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommodityApplicationTests {
    @Autowired
    private CommodityMapper commodityMapper;

    @Test
    public void contextLoads() {
        Pagination pagination = new Pagination();
        pagination.setCurrentPageIndex(1);
    List<Commodity> commodities =
            commodityMapper.find("Spring",pagination);
    commodities.forEach(System.out::println);
    }

}
