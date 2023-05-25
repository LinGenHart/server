package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *风险统计：(RiskStatistics)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "RiskStatistics")
public class RiskStatistics implements Serializable {

    //RiskStatistics编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "risk_statistics_id")
    private Integer risk_statistics_id;
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
    // 隐患
    @Basic
    private String hidden_danger;
    // 通风
    @Basic
    private String improve_air_circulation;
    // 违规
    @Basic
    private String violation;
    // 超标灰尘
    @Basic
    private String excessive_dust;
    // 硫化物
    @Basic
    private String sulfide;
    // 一氧化碳
    @Basic
    private String carbon_monoxide;
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
