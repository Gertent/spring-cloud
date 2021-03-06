package com.gertent.config;

import com.gertent.bean.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @Author wyf
 * @Date 2019/1/2 11:30
 * @Desc
 * @Version 1.0
 */
//配置类==配置文件
//@Configuration  //告诉Spring这是一个配置类
@Configuration
//@ComponentScan(value = "com.gertent")
//@ComponentScan(value = "com.gertent",excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})})
@ComponentScan(value = "com.gertent",includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})},useDefaultFilters = false)
//@ComponentScan(value="com.gertent.controller",includeFilters = {
//        @ComponentScan.Filter(type= FilterType.ANNOTATION,classes={Controller.class}),
//
//})
@ComponentScans(
		value = {
				@ComponentScan(value="com.gertent",includeFilters = {
/*						@Filter(type=FilterType.ANNOTATION,classes={Controller.class}),
						@Filter(type=FilterType.ASSIGNABLE_TYPE,classes={BookService.class}),*/
						@ComponentScan.Filter(type=FilterType.CUSTOM,classes={MyTypeFilter.class})
				},useDefaultFilters = false)
		}
		)
//@ComponentScan  value:指定要扫描的包
//excludeFilters = Filter[] ：指定扫描的时候按照什么规则排除那些组件
//includeFilters = Filter[] ：指定扫描的时候只需要包含哪些组件
//FilterType.ANNOTATION：按照注解
//FilterType.ASSIGNABLE_TYPE：按照给定的类型；
//FilterType.ASPECTJ：使用ASPECTJ表达式
//FilterType.REGEX：使用正则指定
//FilterType.CUSTOM：使用自定义规则
public class MainConfig {

    //给容器中注册一个Bean;类型为返回值的类型，id默认是用方法名作为id
    @Bean("person234")
    public Person person01(){
        return new Person("lisi", 20);
    }

}