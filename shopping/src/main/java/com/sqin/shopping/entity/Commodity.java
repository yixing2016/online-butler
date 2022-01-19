package com.sqin.shopping.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "commodity")
@Data
public class Commodity implements Serializable {

    @Id
    @GeneratedValue(generator="jpa-uuid")
    @GenericGenerator(name="jpa-uuid",strategy="uuid")
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "create_time")
    private Long createTime;

    @Column(name = "last_update_time")
    private Long lastUpdateTime;

    @Column(name = "status")
    private String status;

    @Column(name = "purchaseTime")
    private Long purchaseTime;

    @Column(name = "market")
    private String market;

}
