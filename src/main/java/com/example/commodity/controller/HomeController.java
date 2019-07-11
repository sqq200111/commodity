package com.example.commodity.controller;

import com.example.commodity.domain.Commodity;
import com.example.commodity.service.CommodityService;
import com.example.commodity.service.impl.CommodityServiceImpl;
import com.example.commodity.util.Pagination;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @Autowired
    private CommodityServiceImpl commodityServiceimpl;

    @RequestMapping("/")
    @ResponseBody
    public String home(String name, Pagination pagination){
        pagination.setCurrentPageIndex(1);
        Gson gson = new Gson();
        return gson.toJson(commodityServiceimpl.find(name,pagination));

    }
}
