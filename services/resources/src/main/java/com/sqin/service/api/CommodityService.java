package com.sqin.service.api;

import com.sqin.entity.Commodity;
import java.util.List;

public interface CommodityService {

    List<Commodity> findAll();

    String save(Commodity commodity);

}
