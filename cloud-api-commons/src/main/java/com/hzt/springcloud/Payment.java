package com.hzt.springcloud;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author hzt
 * @version 1.0.0
 * @ClassName Payment.java
 * @Description TODO Payment
 * @createTime 2020年11月24日 19:32:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private Long id;
    private String serial;
}