package com.anthony.shatdingspringbootmybatisgenerator.service.impl;

import com.anthony.shatdingspringbootmybatisgenerator.entity.CallDetails;
import com.anthony.shatdingspringbootmybatisgenerator.entity.CallDetailsExample;
import com.anthony.shatdingspringbootmybatisgenerator.mapper.CallDetailsMapper;
import com.anthony.shatdingspringbootmybatisgenerator.service.CallDetailsService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author yebicheng
 * @create 2020/9/15 16:26
 */
@Service
public class CallDetailsServiceImpl implements CallDetailsService {

    @Autowired
    private CallDetailsMapper callDetailsMapper;

    @Override
    public void add(CallDetails detail) {
        callDetailsMapper.insert(detail);
    }

    @Override
    public List<CallDetails> get() {
        CallDetailsExample example = new CallDetailsExample();
        CallDetailsExample.Criteria criteria = example.createCriteria();
        criteria.andSideBetween((byte)1,(byte)20);
        example.setOrderByClause("reslut_text asc");
        PageHelper.startPage(2,5);
        return callDetailsMapper.selectByExample(example);
    }

    @Override
    public List<Map> getCallInfo(String sessionKey) {
        return callDetailsMapper.getCallInfo(sessionKey);
    }
}
