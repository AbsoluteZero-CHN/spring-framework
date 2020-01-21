package com.noload.spring.populate.expand;

import com.noload.spring.populate.InjectBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hao.caosh@ttpai.cn
 * @date 2020-01-21 17:16
 */
@Component
public class DontPopulateBean {

	@Autowired
	private InjectBean injectBean;

	public void getInjectBean() {
		// TODO CustomizeInstantiationAwareBeanPostProcessor 重写了 postProcessAfterInstantiation 方法, 让当前 bean 返回 false. 这里 injectBean 就不会被填充了
		System.out.println("DontPopulateBean 中被注入的 bean :" + injectBean);
	}
}
