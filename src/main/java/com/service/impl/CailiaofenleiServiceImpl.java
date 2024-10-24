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


import com.dao.CailiaofenleiDao;
import com.entity.CailiaofenleiEntity;
import com.service.CailiaofenleiService;
import com.entity.vo.CailiaofenleiVO;
import com.entity.view.CailiaofenleiView;

@Service("cailiaofenleiService")
public class CailiaofenleiServiceImpl extends ServiceImpl<CailiaofenleiDao, CailiaofenleiEntity> implements CailiaofenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CailiaofenleiEntity> page = this.selectPage(
                new Query<CailiaofenleiEntity>(params).getPage(),
                new EntityWrapper<CailiaofenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CailiaofenleiEntity> wrapper) {
		  Page<CailiaofenleiView> page =new Query<CailiaofenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CailiaofenleiVO> selectListVO(Wrapper<CailiaofenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CailiaofenleiVO selectVO(Wrapper<CailiaofenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CailiaofenleiView> selectListView(Wrapper<CailiaofenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CailiaofenleiView selectView(Wrapper<CailiaofenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
