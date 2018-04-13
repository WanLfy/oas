package com.zzu.oas.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qinhao on 2018/4/13.
 */
@Component
@ConfigurationProperties(prefix = "oas.con")
public class PropertiesConfig {

    private Map<String, String> posts = new HashMap<String, String>();

    public Map<String, String> getPosts() {
        return posts;
    }

    public void setPosts(Map<String, String> posts) {
        this.posts = posts;
    }
}
