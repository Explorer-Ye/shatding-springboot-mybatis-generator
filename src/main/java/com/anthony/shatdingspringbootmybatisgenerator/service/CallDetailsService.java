package com.anthony.shatdingspringbootmybatisgenerator.service;

import com.anthony.shatdingspringbootmybatisgenerator.entity.CallDetails;

import java.util.List;

/**
 * @Author yebicheng
 * @create 2020/9/15 16:25
 */
public interface CallDetailsService {

    void add(CallDetails detail);

    List<CallDetails> get();

}
