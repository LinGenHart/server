package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *安全法律：(SafetyLaw)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "SafetyLaw")
public class SafetyLaw implements Serializable {

    //SafetyLaw编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "safety_law_id")
    private Integer safety_law_id;
    // 法律标题
    @Basic
    private String legal_title;
    // 发布日期
    @Basic
    private Timestamp release_date;
    // 法规名称
    @Basic
    private String regulation_name;
    // 颁布单位
    @Basic
    private String issuing_unit;
    // 备注
    @Basic
    private String remarks;
    // 具体内容
    @Basic
    private String concrete_content;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
