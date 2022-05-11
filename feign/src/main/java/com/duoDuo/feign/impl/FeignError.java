package com.duoDuo.feign.impl;

import com.duoDuo.entity.Student;
import com.duoDuo.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author 暗影精灵
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中";
    }
}
