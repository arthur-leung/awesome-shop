package com.arthur.framework.mapper;

import com.arthur.framework.entity.SkuSpecValue;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SkuSpecValueMapper extends BaseMapper<SkuSpecValue> {
}
