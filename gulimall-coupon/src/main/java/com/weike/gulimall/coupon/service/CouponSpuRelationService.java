package com.weike.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.weike.common.utils.PageUtils;
import com.weike.gulimall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author yuanding
 * @email 1472939313@qq.com
 * @date 2024-03-09 10:13:07
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

