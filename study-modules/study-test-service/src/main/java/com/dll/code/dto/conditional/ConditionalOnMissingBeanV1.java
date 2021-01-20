package com.dll.code.dto.conditional;

import lombok.Data;

/**
 * @author dll
 * @date 2021-01-20 15:32
 */
@Data
public class ConditionalOnMissingBeanV1 {
    private String v1name;

    public String getString(ConditionalOnMissingBeanV1 onMissingBeanV1) {
        return "这是一个字符串";
    }
}
