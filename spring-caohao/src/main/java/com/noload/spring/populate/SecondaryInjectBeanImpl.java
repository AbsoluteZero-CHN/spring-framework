package com.noload.spring.populate;

import org.springframework.stereotype.Component;

/**
 * @author hao.caosh@ttpai.cn
 * @date 2019-12-12 10:45
 */
@Component
public class SecondaryInjectBeanImpl implements InjectBean {

	@Override
	public String toString() {
		return "SecondaryInjectBeanImpl";
	}
}
