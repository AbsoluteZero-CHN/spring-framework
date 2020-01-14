package com.noload.spring.cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hao.caosh@ttpai.cn
 * @date 2020-01-14 13:54
 */
@Component
public class SelfInjectBean {

	@Autowired
	// TODO 支持自己注入自己
	private SelfInjectBean selfInjectBean;
}
