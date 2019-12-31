package com.askerlve.ums.controller.shiro.dto.auth;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel("鉴权入参实体")
public class JudgePerMissionparams {

    @ApiModelProperty(value = "需要鉴权的地址", required = true)
    protected String urlAddress;

    public String getUrlAddress() {
        return urlAddress;
    }

    public void setUrlAddress(String urlAddress) {
        this.urlAddress = urlAddress;
    }
}
