package com.askerlve.ums.web.oauth2.properties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties(OAuth2ClientProperties.class)
public class OAuth2CoreConfig {
}
