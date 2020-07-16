/*******************************************************************************
 * @(#)ItemServiceFallback.java 2020/7/16
 *
 * Copyright 2020 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.springcloud.order.client;

import com.emrubik.springcloud.order.entity.Item;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 这里请补充该类型的简述说明
 *
 * @author <a href="mailto:mazh@emrubik.com">Ma Zhihao</a>
 * @version $$Revision 1.5 $$ 2020/7/16 18:44
 */

@Component
public class ItemServiceFallback  implements ItemFeignClient {
    /**
     * 服务降级的方法要和原方法一致(名称、参数列表)
     * @param id
     * @return
     */
    @Override
    public Item queryItemById(@PathVariable("id") Long id) {
        return new Item(null, "服务降级方法queryItemById", null, "服务降级方法queryItemById", null);
    }
}
