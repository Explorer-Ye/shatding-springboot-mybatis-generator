package com.anthony.shatdingspringbootmybatisgenerator.mapper;

import com.anthony.shatdingspringbootmybatisgenerator.entity.CallDetails;
import com.anthony.shatdingspringbootmybatisgenerator.entity.CallDetailsExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CallDetailsMapper {
    long countByExample(CallDetailsExample example);

    int deleteByExample(CallDetailsExample example);

    int insert(CallDetails record);

    int insertSelective(CallDetails record);

    List<CallDetails> selectByExample(CallDetailsExample example);

    int updateByExampleSelective(@Param("record") CallDetails record, @Param("example") CallDetailsExample example);

    int updateByExample(@Param("record") CallDetails record, @Param("example") CallDetailsExample example);
}