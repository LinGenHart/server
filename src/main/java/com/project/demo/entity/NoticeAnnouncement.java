package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *通知公告：(NoticeAnnouncement)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "NoticeAnnouncement")
public class NoticeAnnouncement implements Serializable {

    //NoticeAnnouncement编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notice_announcement_id")
    private Integer notice_announcement_id;
    // 公告标题
    @Basic
    private String announcement_title;
    // 发布日期
    @Basic
    private Timestamp release_date;
    // 类型
    @Basic
    private String type;
    // 备注
    @Basic
    private String remarks;
    // 内容
    @Basic
    private String content;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
