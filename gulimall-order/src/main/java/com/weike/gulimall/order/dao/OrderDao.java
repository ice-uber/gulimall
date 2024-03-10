package com.weike.gulimall.order.dao;

import com.weike.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yuanding
 * @email 1472939313@qq.com
 * @date 2024-03-09 10:21:12
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
