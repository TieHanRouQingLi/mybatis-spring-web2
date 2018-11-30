package com.mybatis.web.service;

import java.util.List;

import com.mybatis.web.entity.SysDict;

public interface SysDictService {
	
	SysDict findById(Long id);
	
	boolean deleteById(Long id);
	
	boolean saveOrUpdate(SysDict sysDict);
	
	List<SysDict> findBySysDict(SysDict sysDict, Integer offset, Integer limit);

}
