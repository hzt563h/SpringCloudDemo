package com.hzt.springcloud;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hzt
 * @version 1.0.0
 * @ClassName CommonResult.java
 * @Description TODO CommonResult
 * @createTime 2020年11月24日 19:32:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    // 404 not found
    private Integer code;
    private String message;
    private T       data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}