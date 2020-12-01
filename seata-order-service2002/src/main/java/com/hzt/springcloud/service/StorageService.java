package com.hzt.springcloud.service;

/**
 * @author huangzetao
 * @version 1.0.0
 * @ClassName StorageService.java
 * @Description TODO
 * @createTime 2020年12月01日 11:31:00
 */
public interface StorageService {

    // 扣减库存
    void decrease(Long productId, Integer count);
}
