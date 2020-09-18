package com.anthony.shatdingspringbootmybatisgenerator.mapper;

import com.anthony.shatdingspringbootmybatisgenerator.entity.RecordCallDetails;
import com.anthony.shatdingspringbootmybatisgenerator.entity.RecordCallDetailsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordCallDetailsMapper {
    long countByExample(RecordCallDetailsExample example);

    int deleteByExample(RecordCallDetailsExample example);

    int deleteByPrimaryKey(String sessionKey);

    int insert(RecordCallDetails record);

    int insertSelective(RecordCallDetails record);

    List<RecordCallDetails> selectByExample(RecordCallDetailsExample example);

    RecordCallDetails selectByPrimaryKey(String sessionKey);

    int updateByExampleSelective(@Param("record") RecordCallDetails record, @Param("example") RecordCallDetailsExample example);

    int updateByExample(@Param("record") RecordCallDetails record, @Param("example") RecordCallDetailsExample example);

    int updateByPrimaryKeySelective(RecordCallDetails record);

    int updateByPrimaryKey(RecordCallDetails record);
}