package com.mybatis.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mybatis.web.entity.SysDict;
import com.mybatis.web.service.SysDictService;
import com.mybatis.web.util.Jackson2Util;

/**
 * @author lihongjie
 * @date 2018年11月30日 上午11:21:02
 * 
 */
@Controller
@RequestMapping("/dicts")
public class SysDictController {
	@Autowired
	private SysDictService sysDictService;
	@RequestMapping
	public ModelAndView dicts(SysDict sysDict, Integer offset, Integer limit) {
		ModelAndView mv = new ModelAndView();
		
		mv.setView(Jackson2Util.jsonView());
		List<SysDict> dicts = sysDictService.findBySysDict(sysDict, offset, limit);
		mv.addObject("dicts", dicts);
		return mv;
	}
	
	@RequestMapping("/intoDicts")
	public ModelAndView intoDicts() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dicts");
		return mv;
	}
	
	
	@RequestMapping("/findDictsById")
	public ModelAndView findDictsById() {
		ModelAndView mv = new ModelAndView();
		mv.setView(Jackson2Util.jsonView());
		
		SysDict sysDict = sysDictService.findById(1l);
		mv.addObject("sysDict", sysDict);
		
		return mv;
	}
	
	

}
