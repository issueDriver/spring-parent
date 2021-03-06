package com.sgrain.boot.autoconfigure.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: spring-parent
 * @description: Redis配置文件
 * @create: 2020/03/25
 */
@ConfigurationProperties(prefix = "spring.sgrain.redis")
public class RedisSgrainProperties {
    /**
     * 组件开关
     */
    private Boolean enable;

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
}
