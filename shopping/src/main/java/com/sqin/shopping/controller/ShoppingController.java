package com.sqin.shopping.controller;

import com.sqin.common.dto.ResponseResult;
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
    public ResponseResult getShoppingList() {
        List<Commodity> commodityList = commodityService.findAll();

        return ResponseResult.success(commodityList);
    }

    @PostMapping("addCommodity")
    public ResponseResult addCommodity(@RequestBody Commodity commodity) {
        commodityService.save(commodity);
        return ResponseResult.success(commodity);
    }

    @PostMapping("updateCommodity")
    public ResponseResult updateCommodity(@RequestBody Commodity commodity) {
        commodityService.save(commodity);
        return ResponseResult.success(commodity);
    }

}
