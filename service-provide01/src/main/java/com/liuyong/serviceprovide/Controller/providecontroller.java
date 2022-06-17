package com.liuyong.serviceprovide.Controller;


import com.liuyong.commons.myclass.theutils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class providecontroller {

    @Value("${server.port}")
    private  String  port;

    @RequestMapping("/getinfo")
    @ResponseBody
    public  String  getinfo(){

         return "端口为"+port+"的服务提供者调用成功";
    }
}
