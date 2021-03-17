package com.lihuan.wiki.service;

import com.lihuan.wiki.domain.Test;
import com.lihuan.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.selectByExample(null);
    }
}
