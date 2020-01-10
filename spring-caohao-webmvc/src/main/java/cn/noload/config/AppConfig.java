package cn.noload.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author hao.caosh@ttpai.cn
 * @date 2020-01-09 17:17
 */
@Configuration
@ComponentScan("cn.noload")
@EnableWebMvc
public class AppConfig {
}
