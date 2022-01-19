package com.sqin.shopping.controller;

import com.sqin.common.util.JsonTranslation;
import com.sqin.shopping.entity.Commodity;
import com.sqin.shopping.service.api.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Sheng, Qin
 * 2022-01-19 14:12
 */
@RestController
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
