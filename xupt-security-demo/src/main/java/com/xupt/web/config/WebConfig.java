package com.xupt.web.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.xupt.web.filter.TimeFilter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{
	
	
//	@Autowired
//	private TimeInterceptor timeInterceptor;
	
	
	/**
	 * 没法拿到方法参数的值
	 * @author zgh
	 *
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
//		registry.addInterceptor(timeInterceptor);
	}
//	@Bean
	public FilterRegistrationBean timeFilter() {
		
		FilterRegistrationBean registrationBean=new FilterRegistrationBean();
		TimeFilter timeFilter=new TimeFilter();
		registrationBean.setFilter(timeFilter);
		
		List<String> urls=new ArrayList<>();
		urls.add("/*");
		registrationBean.setUrlPatterns(urls);
		return registrationBean;
		
	}

}
