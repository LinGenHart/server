package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *安全监测：(SafetyMonitoring)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "SafetyMonitoring")
public class SafetyMonitoring implements Serializable {

    //SafetyMonitoring编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "safety_monitoring__id")
    private Integer safety_monitoring__id;
    // 矿井编号
    @Basic
    private String mine_number;
    // 瓦斯浓度
    @Basic
    private String gas_concentration;
    // 风速
    @Basic
    private String wind_speed;
    // 风压
    @Basic
    private String wind_pressure;
    // 温度
    @Basic
    private String temperature;
    // 记录日期
    @Basic
    private Timestamp record_date;
    // 记录人员
    @Basic
    private Integer recorder;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
