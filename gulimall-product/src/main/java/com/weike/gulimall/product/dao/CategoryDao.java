package com.weike.gulimall.product.dao;

import com.weike.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yuanding
 * @email 1472939313@qq.com
 * @date 2024-03-08 22:44:24
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
