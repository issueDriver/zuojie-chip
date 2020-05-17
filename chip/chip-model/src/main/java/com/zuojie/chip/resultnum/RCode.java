package com.zuojie.chip.resultnum;

/**
 * 枚举多种表达式
 */
public enum RCode {

    SUCCESS(0),ERROR(1),NOTFOUND(404);
    private int val;
    private RCode(int v){
        val=v;
    }

    public int getVal() {
        return val;
    }
}


