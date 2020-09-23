package com.anthony.shatdingspringbootmybatisgenerator.controller;

import com.anthony.shatdingspringbootmybatisgenerator.entity.CallDetails;
import com.anthony.shatdingspringbootmybatisgenerator.entity.RecordCallDetails;
import com.anthony.shatdingspringbootmybatisgenerator.service.CallDetailsService;
import com.anthony.shatdingspringbootmybatisgenerator.service.RecordCallDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/**
 * @Author yebicheng
 * @create 2020/9/15 15:19
 */

@RestController
@RequestMapping("/sharding")
public class ShardingController {

    @Autowired
    private CallDetailsService  callDetailsService;

    @Autowired
    private RecordCallDetailsService recordCallDetailsService;

    @PostMapping("/add")
    public void add(){
        Runnable r = () -> {
            for (int i = 0; i < 1000000; i++) {
                CallDetails callDetails = new CallDetails();
                callDetails.setSessionKey(UUID.randomUUID().toString().replace("-",""));
                callDetails.setSide((byte) i);
                callDetails.setElapsedTime(Math.abs(new Random().nextInt()));
                callDetails.setReslutText("测试"+i);
                callDetailsService.add(callDetails);
            }
        };
        new Thread(r).start();
        System.out.println("over");
    }

    /**
     * 分页查询
     * @return
     */
    @GetMapping("list")
    public List<CallDetails> get(){
        return callDetailsService.get();
    }

    /**
     * 插入
     */
    @PostMapping("/addTwoTables")
    public void addTwo(){
        Runnable r = () -> {
            for (int i = 0; i < 4000; i++) {
                RecordCallDetails recordCallDetails = new RecordCallDetails();
                String sessionKey = UUID.randomUUID().toString().replace("-","");
                recordCallDetails.setSessionKey(sessionKey);
                recordCallDetails.setDirection((byte) (i%2));
                recordCallDetails.setDuration(Math.abs(new Random().nextLong()));
                recordCallDetails.setExternalNo("utry");
                recordCallDetails.setRecordUrl("http://www.baidu.com");
                recordCallDetails.setTaskId(UUID.randomUUID().toString().replace("-",""));
                recordCallDetailsService.addTwo(recordCallDetails);
                for(int j =0;j<10;j++){
                    CallDetails callDetails = new CallDetails();
                    callDetails.setSessionKey(sessionKey);
                    callDetails.setElapsedTime(Math.abs(new Random().nextInt()));
                    callDetails.setReslutText("测试"+j);
                    callDetailsService.add(callDetails);
                }
            }
        };
        new Thread(r).start();
        System.out.println("over");
    }

    /**
     * 联表查询
     * @param sessionKey
     * @return
     */
    @GetMapping("/getCallDetail")
    public List<Map> getCallDetail(String sessionKey){
        return callDetailsService.getCallInfo(sessionKey);
    }

}
