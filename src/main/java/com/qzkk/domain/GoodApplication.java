package com.qzkk.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author: jzc
 * @date: 18/7/2019-上午9:59
 * @description: 物资申请表
 */
@Entity
@Table(name="good_application")
@Data
@NoArgsConstructor
public class GoodApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //申请编号
    private long gaId;

    //物资编号
    private long gId;

    //申请人编号
    private long uId;

    //审核人编号
    private long approverId = 0;

    //申请的物资数量
    private int number;

    //申请的时间
    private Date applicationTime;

    //通过申请的时间
    private Date startDate;

    //物资归还的时间
    private Date endTime;

    //申请物资的描述
    private String description;

    //审核的状态：0待审核，1审核通过，-1审核不通过
    private int state = 0;

}
