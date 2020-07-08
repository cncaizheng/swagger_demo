package com.example.swagger_demo;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cai
 * @date 2020/5/6 17:23
 */
@RestController
public class SwaggerTestController {


    @ApiOperation(value = "测试生成Swagger", notes = "测试生成Swagger", tags = "swagger模块")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "age", value = "年龄", paramType = "body", dataType = "Integer", required = true)
    )
    @ApiResponses(
            @ApiResponse(code = 400, message = "请求参数没填好")
    )
    @PostMapping("/test")
    public void test( User user){
        System.out.println("Spring boot 集成 Swagger2");
    }
}
