package com.duoDuo.feign;

import com.duoDuo.entity.Student;
import com.duoDuo.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author 暗影精灵
 */
@FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}
