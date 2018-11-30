package com.mybatis.web.util;

import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

public class Jackson2Util {
	public static MappingJackson2JsonView jsonView()
	{
		MappingJackson2JsonView mjjv=new MappingJackson2JsonView();
		mjjv.setExtractValueFromSingleKeyModel(true);
		return mjjv;
	}
}
