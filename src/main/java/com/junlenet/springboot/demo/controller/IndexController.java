package com.junlenet.springboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述:
 * created by hwj on 2018/5/31 22:27
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public Object index(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> map = new HashMap<>();
        map.put("id",1000);
        map.put("name","胡为军");
        return map;
    }
}
