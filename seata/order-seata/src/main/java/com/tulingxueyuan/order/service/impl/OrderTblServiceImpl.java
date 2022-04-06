package com.tulingxueyuan.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tulingxueyuan.order.pojo.OrderTbl;
import com.tulingxueyuan.order.service.OrderTblService;
import com.tulingxueyuan.order.mapper.OrderTblMapper;
import org.apache.skywalking.apm.toolkit.trace.Tag;
import org.apache.skywalking.apm.toolkit.trace.Trace;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 光子
* @description 针对表【order_tbl】的数据库操作Service实现
* @createDate 2022-04-01 09:40:33
*/
@Service
public class OrderTblServiceImpl extends ServiceImpl<OrderTblMapper, OrderTbl>
    implements OrderTblService{

    @Override
    @Trace
    @Tag(key="getAll",value = "returnedObj")
//    @Tags{@Tag(key="getAll",value="arg[0]")}
    public List<OrderTbl> getAll() {
        return query().list();
    }
}




