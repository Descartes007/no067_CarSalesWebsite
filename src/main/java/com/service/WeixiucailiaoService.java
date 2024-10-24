package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeixiucailiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeixiucailiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeixiucailiaoView;


/**
 * 维修材料
 *
 * @author 
 * @email 
 * @date 2021-04-26 11:54:44
 */
public interface WeixiucailiaoService extends IService<WeixiucailiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeixiucailiaoVO> selectListVO(Wrapper<WeixiucailiaoEntity> wrapper);
   	
   	WeixiucailiaoVO selectVO(@Param("ew") Wrapper<WeixiucailiaoEntity> wrapper);
   	
   	List<WeixiucailiaoView> selectListView(Wrapper<WeixiucailiaoEntity> wrapper);
   	
   	WeixiucailiaoView selectView(@Param("ew") Wrapper<WeixiucailiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeixiucailiaoEntity> wrapper);
   	
}

