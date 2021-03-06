package com.arthur.framework.mapper;

import com.arthur.framework.entity.SpuSpecValue;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SpuSpecValueMapper extends BaseMapper<SpuSpecValue> {
}
