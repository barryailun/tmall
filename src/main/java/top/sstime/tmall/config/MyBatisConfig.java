package top.sstime.tmall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenwei
 * @create_time 2019/10/21 10:22 下午
 * @descriptions
 */
@Configuration
@MapperScan("top.sstime.tmall.mbg.mapper")
public class MyBatisConfig {
}
