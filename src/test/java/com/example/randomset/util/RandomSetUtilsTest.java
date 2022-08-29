package com.example.randomset.util;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * 生成不重复随机数测试类
 *
 * @author FZH
 * @date 2022/08/30
 */
class RandomSetUtilsTest {
    private static final Logger LOGGER = getLogger(RandomSetUtilsTest.class);

    /**
     * 使用Set集合实现生成不重复随机数
     */
    @Test
    void random1() {
        LOGGER.debug(RandomSetUtils.random1(33, 6).toString());
    }

    /**
     * 使用byte数组实现生成不重复随机数
     */
    @Test
    void random2() {
        LOGGER.debug(Arrays.toString(RandomSetUtils.random2(33, 6)));
    }

    /**
     * 使用类似开放寻址方式生成不重复随机数实现3
     */
    @Test
    void random3() {
        LOGGER.debug(Arrays.toString(RandomSetUtils.random3(33, 6)));
    }
}