package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *安全故事：(SafetyStory)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "SafetyStory")
public class SafetyStory implements Serializable {

    //SafetyStory编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "safety_story_id")
    private Integer safety_story_id;
    // 矿井编号
    @Basic
    private String mine_number;
    // 瓦斯浓度
    @Basic
    private String gas_concentration;
    // 异常时间
    @Basic
    private Timestamp abnormal_time;
    // 事故原因
    @Basic
    private String cause_of_accident;
    // 处理措施
    @Basic
    private String treatment_measures;
    // 操作人员
    @Basic
    private Integer operator;
    // 备注
    @Basic
    private String remarks;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
