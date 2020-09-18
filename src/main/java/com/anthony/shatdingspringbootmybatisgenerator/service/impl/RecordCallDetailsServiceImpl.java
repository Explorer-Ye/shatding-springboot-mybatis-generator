package com.anthony.shatdingspringbootmybatisgenerator.service.impl;

import com.anthony.shatdingspringbootmybatisgenerator.entity.RecordCallDetails;
import com.anthony.shatdingspringbootmybatisgenerator.mapper.RecordCallDetailsMapper;
import com.anthony.shatdingspringbootmybatisgenerator.service.RecordCallDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author yebicheng
 * @create 2020/9/16 13:54
 */
@Service
public class RecordCallDetailsServiceImpl implements RecordCallDetailsService {

    @Autowired
    private RecordCallDetailsMapper recordCallDetailsMapper;


    @Override
    public void addTwo(RecordCallDetails recordCallDetails) {
        recordCallDetailsMapper.insert(recordCallDetails);
    }
}
