package com.qzkk.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author: jzc
 * @date: 15/7/2019-上午10:00
 * @description:
 */

@Entity
@Table(name="good")
@Data
@NoArgsConstructor
public class Good {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long gId;

    //名称
    private String name;

    //编号
    private String identifier;

    //总数量
    private int number;

    //使用中的物资数量
    private int usingNumber;

    //申请中的物资数量
    private int applyingNumber;

    //物资图片
    private String images;

    //描述
    private String description;

    //规格
    private String specification;

    //是否被删除
    private int del;

}
