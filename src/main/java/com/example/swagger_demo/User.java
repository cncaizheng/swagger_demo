package com.example.swagger_demo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author cai
 * @date 2020/5/6 17:22
 */
@ApiModel(description = "用户实体类")
public class User implements Serializable {
    @ApiModelProperty(value ="姓名",allowableValues = "张三,李四,王五")
    private String name;
    @ApiModelProperty(value ="性别",allowableValues = "男,女,未知")
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
