package com.sqin.shopping.service.api;


import com.sqin.shopping.entity.Commodity;

import java.util.List;

public interface CommodityService {

    List<Commodity> findAll();

    String save(Commodity commodity);

}
