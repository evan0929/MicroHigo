package com.service.higoService;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;
import io.servicecomb.provider.springmvc.reference.RestTemplateBuilder;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author  someguy
 * @version  [版本号, 2017年1月3日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@Component
public class HigoServiceApplication {
	private static RestTemplate restTemplate = RestTemplateBuilder.create();
    public static void main(String[] args) throws Exception {
        Log4jUtils.init();
        BeanUtils.init();
        String discountResult =
    	        restTemplate.getForObject("cse://higodb/getDiscount?location=beijing", String.class);
        System.out.println("beijing:"+discountResult);
    }
}
