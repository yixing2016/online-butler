package com.sqin.controller;

import com.sqin.common.util.JsonTranslation;
import com.sqin.entity.Commodity;
import com.sqin.service.api.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/shopping")
public class ShoppingController {

    @Autowired
    CommodityService commodityService;

    @GetMapping("/getShoppingList")
    public String getShoppingList() {

        List<Commodity> commodityList = commodityService.findAll();

        return JsonTranslation.object2JsonString(commodityList);
    }

    @PostMapping("addCommodity")
    public String addCommodity(@RequestBody Commodity commodity) {
        return commodityService.save(commodity);
    }

}
