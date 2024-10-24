package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WeixiucailiaoDao;
import com.entity.WeixiucailiaoEntity;
import com.service.WeixiucailiaoService;
import com.entity.vo.WeixiucailiaoVO;
import com.entity.view.WeixiucailiaoView;

@Service("weixiucailiaoService")
public class WeixiucailiaoServiceImpl extends ServiceImpl<WeixiucailiaoDao, WeixiucailiaoEntity> implements WeixiucailiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeixiucailiaoEntity> page = this.selectPage(
                new Query<WeixiucailiaoEntity>(params).getPage(),
                new EntityWrapper<WeixiucailiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeixiucailiaoEntity> wrapper) {
		  Page<WeixiucailiaoView> page =new Query<WeixiucailiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeixiucailiaoVO> selectListVO(Wrapper<WeixiucailiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeixiucailiaoVO selectVO(Wrapper<WeixiucailiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeixiucailiaoView> selectListView(Wrapper<WeixiucailiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeixiucailiaoView selectView(Wrapper<WeixiucailiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
