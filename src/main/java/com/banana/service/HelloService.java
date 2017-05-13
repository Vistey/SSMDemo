package com.banana.service;

import com.banana.dao.ClassicMapper;
import com.banana.model.Classic;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Sai on 2017/5/13. this 15:32
 */
@Service
public class HelloService {

  @Resource
  private ClassicMapper classicMapper;

  public List<Classic> selectAll(){
    return classicMapper.selectAll();
  }
}
