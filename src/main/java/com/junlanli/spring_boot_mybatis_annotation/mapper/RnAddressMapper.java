package com.junlanli.spring_boot_mybatis_annotation.mapper;

import com.junlanli.spring_boot_mybatis_annotation.model.RnAddress;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Copyright (C) 2015 - 2017 SOHU FOCUS Inc., All Rights Reserved.
 *
 * @Author: junlanli@sohu-inc.com
 * @Date: 2017-01-04
 */
@Mapper
public interface RnAddressMapper {

    @Select("SELECT * FROM rn_address WHERE id = #{id}")
    RnAddress findyById(@Param("id") Integer id);
}
