package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *井下设备：(DownholeEquipment)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "DownholeEquipment")
public class DownholeEquipment implements Serializable {

    //DownholeEquipment编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "downhole_equipment_id")
    private Integer downhole_equipment_id;
    // 矿井编号
    @Basic
    private String mine_number;
    // 设备数量
    @Basic
    private String number_of_equipment;
    // 保养周期
    @Basic
    private String maintenance_cycle;
    // 设备型号
    @Basic
    private String equipment_model;
    // 操作人员
    @Basic
    private Integer operator;
    // 缺陷状况
    @Basic
    private String defect_condition;
    // 维修情况
    @Basic
    private String maintenance;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
