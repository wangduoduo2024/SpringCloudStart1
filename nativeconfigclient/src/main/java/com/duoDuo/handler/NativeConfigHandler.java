package com.duoDuo.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 暗影精灵
 */
@RestController
@RequestMapping("/native")
public class NativeConfigHandler {


    @GetMapping("/index")
    public String index(){
        return "你好";
    }
}
