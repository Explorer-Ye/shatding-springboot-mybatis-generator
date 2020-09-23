package com.anthony.shatdingspringbootmybatisgenerator.service;

import com.anthony.shatdingspringbootmybatisgenerator.entity.CallDetails;

import java.util.List;
import java.util.Map;

/**
 * @Author yebicheng
 * @create 2020/9/15 16:25
 */
public interface CallDetailsService {

    void add(CallDetails detail);

    List<CallDetails> get();

    List<Map> getCallInfo(String sessionKey);

}
