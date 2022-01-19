package com.sqin.shopping.repository;

import com.sqin.shopping.entity.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommodityRepository extends JpaRepository<Commodity, String> {



}
