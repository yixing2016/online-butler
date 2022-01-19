package com.sqin.shopping.service.impl;

import com.sqin.shopping.entity.Commodity;
import com.sqin.shopping.repository.CommodityRepository;
import com.sqin.shopping.service.api.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityRepository commodityRepository;

    @Override
    public List<Commodity> findAll() {
        return commodityRepository.findAll();
    }

    @Override
    public String save(Commodity commodity) {
        // only commodity name is mandatory to user.
        commodity.setCreateTime(System.currentTimeMillis());
        commodity.setStatus("0");
        Commodity result = commodityRepository.save(commodity);
        return result.getId();
    }
}
