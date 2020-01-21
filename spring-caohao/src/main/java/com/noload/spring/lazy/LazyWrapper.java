package com.noload.spring.lazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hao.caosh@ttpai.cn
 * @date 2020-01-21 15:15
 */
@Component
public class LazyWrapper {

	@Autowired
	private LazyBean lazyBean;
}
