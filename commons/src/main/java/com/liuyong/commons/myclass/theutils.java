package com.liuyong.commons.myclass;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class theutils {
    public void sendmessage() {
        System.out.println("公共类调用成功");
    }
}
