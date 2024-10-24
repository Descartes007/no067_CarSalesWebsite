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


import com.dao.DiscusscheliangzhanshiDao;
import com.entity.DiscusscheliangzhanshiEntity;
import com.service.DiscusscheliangzhanshiService;
import com.entity.vo.DiscusscheliangzhanshiVO;
import com.entity.view.DiscusscheliangzhanshiView;

@Service("discusscheliangzhanshiService")
public class DiscusscheliangzhanshiServiceImpl extends ServiceImpl<DiscusscheliangzhanshiDao, DiscusscheliangzhanshiEntity> implements DiscusscheliangzhanshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusscheliangzhanshiEntity> page = this.selectPage(
                new Query<DiscusscheliangzhanshiEntity>(params).getPage(),
                new EntityWrapper<DiscusscheliangzhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusscheliangzhanshiEntity> wrapper) {
		  Page<DiscusscheliangzhanshiView> page =new Query<DiscusscheliangzhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusscheliangzhanshiVO> selectListVO(Wrapper<DiscusscheliangzhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusscheliangzhanshiVO selectVO(Wrapper<DiscusscheliangzhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusscheliangzhanshiView> selectListView(Wrapper<DiscusscheliangzhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusscheliangzhanshiView selectView(Wrapper<DiscusscheliangzhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
