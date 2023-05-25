package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *安全考勤：(SafetyAttendance)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "SafetyAttendance")
public class SafetyAttendance implements Serializable {

    //SafetyAttendance编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "safety_attendance_id")
    private Integer safety_attendance_id;
    // 矿井编号
    @Basic
    private String mine_number;
    // 工作人员
    @Basic
    private Integer working_personnel;
    // 考勤状况
    @Basic
    private String attendance_status;
    // 工作时长
    @Basic
    private String working_hours;
    // 进矿时间
    @Basic
    private Timestamp ore_feeding_time;
    // 出矿时间
    @Basic
    private Timestamp ore_drawing_time;
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
