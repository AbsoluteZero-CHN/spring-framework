package com.noload.spring.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author hao.caosh@ttpai.cn
 * @date 2020-01-21 15:15
 */
@Lazy
@Component
public class LazyBean {

	public LazyBean() {
		System.out.println("com.noload.spring.lazy.LazyBean init...");
	}
}
