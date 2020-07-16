/*******************************************************************************
 * @(#)Item.java 2020/7/16
 *
 * Copyright 2020 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.springcloud.commodity.entity;

import lombok.Data;

/**
 * 这里请补充该类型的简述说明
 *
 * @author <a href="mailto:mazh@emrubik.com">Ma Zhihao</a>
 * @version $$Revision 1.5 $$ 2020/7/16 8:35
 */
@Data
public class Item {


    private Long id;

    private String title;

    private String pic;

    private String desc;

    private Long price;

    public Item() {
    }

    public Item(long id, String title, String pic, String desc, Long price) {
        this.id = id;
        this.title = title;
        this.pic = pic;
        this.desc = desc;
        this.price = price;
    }

}
