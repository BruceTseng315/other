package com.kevin.controller;

import com.kevin.infrastructure.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: kevin
 * Date: 2019-05-09
 * Time: 14:10
 */
@Api(value = "Test", tags = "For test", description = "for test")
@RestController
public class TestController {
    @GetMapping("/test")
    @ApiOperation(value = "test hello",notes = "for test")
    public Result<String> hello(){
        return Result.success("Hello, world!");
    }
}
