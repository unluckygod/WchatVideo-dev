package com.video.controller;

import com.video.utils.RedisOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	
	@Autowired
	public RedisOperator redis;
	
	public static final String USER_REDIS_SESSION = "user-redis-session";
	
	// 文件保存的命名空间
	public static final String FILE_SPACE = "/Users/zhouchao/Desktop/biye/dev";
	
	// ffmpeg所在目录
	public static final String FFMPEG_EXE = "ffmpeg";
	
	// 每页分页的记录数
	public static final Integer PAGE_SIZE = 6;
	
}
