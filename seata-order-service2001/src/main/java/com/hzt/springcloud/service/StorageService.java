package com.hzt.springcloud.service;

import com.hzt.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author huangzetao
 * @version 1.0.0
 * @ClassName StorageService.java
 * @Description TODO StorageService
 * @createTime 2020年12月01日 11:19:00
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService{
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
