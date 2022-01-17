package com.sqin.service.impl;

import com.sqin.entity.Commodity;
import com.sqin.repository.CommodityRepository;
import com.sqin.service.api.CommodityService;

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
        Commodity result = commodityRepository.save(commodity);
        return result.getStatus();
    }
}
