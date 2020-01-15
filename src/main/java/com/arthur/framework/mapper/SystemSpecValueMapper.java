package com.arthur.framework.mapper;

import com.arthur.framework.entity.SystemSpecValue;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SystemSpecValueMapper extends BaseMapper<SystemSpecValue> {
}
