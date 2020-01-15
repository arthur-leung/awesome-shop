package com.arthur.framework.mapper;

import com.arthur.framework.entity.ShoppingCart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ShoppingCartMapper extends BaseMapper<ShoppingCart> {
}
