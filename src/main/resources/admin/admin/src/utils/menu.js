const menu = {
    list() {
        return [{"backMenu":[{"child":[{"buttons":["查看","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"车辆展示","menuJump":"列表","tableName":"cheliangzhanshi"}],"menu":"车辆展示管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"车辆品牌","menuJump":"列表","tableName":"cheliangpinpai"}],"menu":"车辆品牌管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"车辆型号","menuJump":"列表","tableName":"cheliangxinghao"}],"menu":"车辆型号管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"维修材料","menuJump":"列表","tableName":"weixiucailiao"}],"menu":"维修材料管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"材料分类","menuJump":"列表","tableName":"cailiaofenlei"}],"menu":"材料分类管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户交流","tableName":"forum"}],"menu":"用户交流"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"在线客服","tableName":"chat"},{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"汽车资讯","tableName":"news"}],"menu":"系统管理"},{"child":[{"buttons":["查看","删除"],"menu":"已完成订单","tableName":"orders/已完成"},{"buttons":["查看","删除"],"menu":"已发货订单","tableName":"orders/已发货"},{"buttons":["查看","删除"],"menu":"未支付订单","tableName":"orders/未支付"},{"buttons":["查看","删除"],"menu":"已取消订单","tableName":"orders/已取消"},{"buttons":["查看","删除","发货"],"menu":"已支付订单","tableName":"orders/已支付"},{"buttons":["查看","删除"],"menu":"已退款订单","tableName":"orders/已退款"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"车辆展示列表","menuJump":"列表","tableName":"cheliangzhanshi"}],"menu":"车辆展示模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["删除","查看"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"车辆展示列表","menuJump":"列表","tableName":"cheliangzhanshi"}],"menu":"车辆展示模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]
    }
}
export default menu;
