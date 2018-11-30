package com.mybatis.web.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.web.entity.SysDict;
import com.mybatis.web.mapper.SysDictMapper;
import com.mybatis.web.service.SysDictService;
/**
* @author lihongjie  
* @date 2018Äê11ÔÂ30ÈÕ
 */
@Service
public class SysDictServiceImpl implements SysDictService{

	@Autowired
	private SysDictMapper sysDictMapper;
	
	@Override
	public SysDict findById(Long id) {
		return sysDictMapper.selectByPrimaryKey(id);
	}

	@Override
	public boolean deleteById(Long id) {
		
		boolean result = false;
		int num = sysDictMapper.deleteByPrimaryKey(id);
		if(num>0) {
			result=true;
		}
		return result;
		
	}

	@Override
	public boolean saveOrUpdate(SysDict sysDict) {
		
		boolean result = false;
		int num = sysDictMapper.updateByPrimaryKey(sysDict);
		if(num>0) {
			result = true;
		}
		return result;
		
	}

	@Override
	public List<SysDict> findBySysDict(SysDict sysDict, Integer offset, Integer limit) {
		
		RowBounds rowBounds = RowBounds.DEFAULT;
		if(offset != null && limit != null) {
			rowBounds = new RowBounds(offset, limit);
		}
		
		return sysDictMapper.selectBySysDict(sysDict, rowBounds);
	}

}
