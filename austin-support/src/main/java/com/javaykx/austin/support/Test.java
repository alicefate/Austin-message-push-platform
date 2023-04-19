package com.javaykx.austin.support;

import java.util.Arrays;
import java.util.List;

import cn.hutool.core.collection.CollUtil;
import com.alibaba.fastjson.JSON;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import com.google.common.base.Throwables;

public class Test {

    public static void main(String[] args) {
        try {
            LombokTest lombokTest1 = LombokTest.builder().id("1").name("give me a try").build();
            LombokTest lombokTest2 = LombokTest.builder().id("2").name("It's important").build();
            List<LombokTest> lombokTests = Arrays.asList(lombokTest1, lombokTest2);
            if (CollUtil.isNotEmpty(lombokTests)) {
                System.out.println(JSON.toJSONString(lombokTests));
            }
        } catch (Exception e) {
            System.out.println(Throwables.getStackTraceAsString(e));
        }
        System.out.println("hah");
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @Builder
    public static class LombokTest{
        private String name;
        private String id;
    }
}
