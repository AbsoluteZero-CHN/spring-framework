package com.noload.spring.populate;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author hao.caosh@ttpai.cn
 * @date 2019-12-12 10:44
 */
@Component
@Primary
public class PrimaryInjectBeanImpl implements InjectBean {

	@Override
	public String toString() {
		return "PrimaryInjectBeanImpl";
	}
}
