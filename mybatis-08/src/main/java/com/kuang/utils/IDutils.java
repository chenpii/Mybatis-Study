package com.kuang.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @author chenpi
 * @create 2022-08-29 21:43
 */
@SuppressWarnings("all") //抑制警告
public class IDutils {

    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    @Test
    public void test(){
        System.out.println(IDutils.getId());
        System.out.println(IDutils.getId());
        System.out.println(IDutils.getId());
    }
}
