package com.tulingxueyuan.order.service;

import com.tulingxueyuan.order.pojo.OrderTbl;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 光子
* @description 针对表【order_tbl】的数据库操作Service
* @createDate 2022-04-01 09:40:33
*/
public interface OrderTblService extends IService<OrderTbl> {
    public List<OrderTbl> getAll();
}
