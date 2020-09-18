package com.anthony.shatdingspringbootmybatisgenerator.config;

/**
 * @Author yebicheng
 * @create 2020/9/15 17:37
 */
import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
import com.dangdang.ddframe.rdb.sharding.api.strategy.table.SingleKeyTableShardingAlgorithm;
import com.google.common.collect.Range;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * Created by yebicheng on 2020-09-16.
 */
public final class ModuloTableShardingAlgorithm implements PreciseShardingAlgorithm<String> {

//    @Override
//    public String doEqualSharding(final Collection<String> tableNames, final ShardingValue<Long> shardingValue) {
//        for (String each : tableNames) {
//            if (each.endsWith(shardingValue.getValue().hashCode() % 4 + "")) {
//                return each;
//            }
//        }
//        throw new IllegalArgumentException();
//    }
//
//    @Override
//    public Collection<String> doInSharding(final Collection<String> tableNames, final ShardingValue<Long> shardingValue) {
//        Collection<String> result = new LinkedHashSet<>(tableNames.size());
//        for (Long value : shardingValue.getValues()) {
//            for (String tableName : tableNames) {
//                if (tableName.endsWith(value.hashCode() % 4 + "")) {
//                    result.add(tableName);
//                }
//            }
//        }
//        return result;
//    }

//    @Override
//    public Collection<String> doBetweenSharding(final Collection<String> tableNames, final ShardingValue<Long> shardingValue) {
//        Collection<String> result = new LinkedHashSet<>(tableNames.size());
//        Range<Long> range = shardingValue.getValueRange();
//        for (Long i = range.lowerEndpoint(); i <= range.upperEndpoint(); i++) {
//            for (String each : tableNames) {
//                if (each.endsWith(i.hashCode() % 4 + "")) {
//                    result.add(each);
//                }
//            }
//        }
//        return result;
//    }

    @Override
    public String doSharding(Collection<String> tables, PreciseShardingValue<String> preciseShardingValue) {
        for (String key : tables) {
            System.out.println("hashcode====="+Math.abs(preciseShardingValue.getValue().hashCode()));
            if (key.endsWith(Math.abs(preciseShardingValue.getValue().hashCode()) % 4 + "")) {
                System.out.println("key================="+key);
                return key;
            }
        }
        throw new UnsupportedOperationException();

    }
}

