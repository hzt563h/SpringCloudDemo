package com.hzt.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.hzt.springcloud.CommonResult;

public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler");
    }
}
