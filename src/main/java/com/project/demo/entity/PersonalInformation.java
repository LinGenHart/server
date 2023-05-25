package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *个人信息：(PersonalInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "PersonalInformation")
public class PersonalInformation implements Serializable {

    //PersonalInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "personal_information_id")
    private Integer personal_information_id;
    // 员工姓名
    @Basic
    private String employee_name;
    // 员工性别
    @Basic
    private String employee_gender;
    // 员工工号
    @Basic
    private Integer employee_job_number;
    // 所属部门
    @Basic
    private String department;
    // 所属岗位
    @Basic
    private String position;
    // 手机号码
    @Basic
    private String phone_number;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
