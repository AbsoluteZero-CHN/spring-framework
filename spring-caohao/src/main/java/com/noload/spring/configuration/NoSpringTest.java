package com.noload.spring.configuration;


import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;

/**
 * 即使不标注为 @Component, Spring 也会扫描到, 只不过不会 put 到 beanDefinitionMap 中
 * @see ClassPathScanningCandidateComponentProvider#scanCandidateComponents()
 * */
public class NoSpringTest {
}
