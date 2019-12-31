package com.askerlve.ums.controller.oauth2.dto.oauth;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel("刷新token实体")
public class Oauth2RefreshTokenParams {

    @ApiModelProperty(value = "refreshToken的值", required = true)
    private String refreshToken;

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
