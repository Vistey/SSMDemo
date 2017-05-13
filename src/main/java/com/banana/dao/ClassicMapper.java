package com.banana.dao;

import com.banana.model.Classic;

import java.util.List;

public interface ClassicMapper {
    int deleteByPrimaryKey(Integer number);

    int insert(Classic record);

    int insertSelective(Classic record);

    Classic selectByPrimaryKey(Integer number);

    int updateByPrimaryKeySelective(Classic record);

    int updateByPrimaryKey(Classic record);

    List<Classic> selectAll();
}