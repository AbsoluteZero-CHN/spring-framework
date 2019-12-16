package com.noload.spring.populate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hao.caosh@ttpai.cn
 * @date 2019-12-12 11:15
 */
@Component
public class InjectedBean {

	@Autowired
	private InjectBean injectBean;
}
