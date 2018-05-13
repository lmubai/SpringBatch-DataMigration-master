package com.ksource.batch.dao.writer;

import com.ksource.batch.model.writer.UserWriterTest;

import java.util.List;

/**
 * @author itmrchen
 * @date 2016/10/12
 * @time 13:19
 */
public interface UserWriterMapperTest {
    /**
     * spring batch 批量插入
     *
     * @param list
     * @return
     */
    int batchInsert(List<UserWriterTest> list);
}
