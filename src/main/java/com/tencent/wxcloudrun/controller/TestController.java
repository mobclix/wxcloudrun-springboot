package com.tencent.wxcloudrun.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.tencent.wxcloudrun.config.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.List;

/**
 * counter控制器
 */
@RestController

public class TestController {

  final Logger logger;

  public TestController() {
    this.logger = LoggerFactory.getLogger(TestController.class);
  }


  /**
   * 
   * @return API response json
   */
  @GetMapping(value = "/api/advertise/roll")
  ApiResponse get() {
    return ApiResponse.ok("滚动广告");
  }
}
