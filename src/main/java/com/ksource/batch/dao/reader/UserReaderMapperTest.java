package com.ksource.batch.dao.reader;

import com.ksource.batch.model.reader.UserReaderTest;

import java.util.List;

/**
 * @author itmrchen
 * @date 2016/10/12
 * @time 13:19
 */
public interface UserReaderMapperTest {

    List<UserReaderTest> selectAllInfo(int _skiprows, int _pagesize);
}
