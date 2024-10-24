import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import cheliangzhanshi from '@/views/modules/cheliangzhanshi/list'
    import storeup from '@/views/modules/storeup/list'
    import forum from '@/views/modules/forum/list'
    import weixiucailiao from '@/views/modules/weixiucailiao/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chat from '@/views/modules/chat/list'
    import messages from '@/views/modules/messages/list'
    import discusscheliangzhanshi from '@/views/modules/discusscheliangzhanshi/list'
    import orders from '@/views/modules/orders/list'
    import cheliangpinpai from '@/views/modules/cheliangpinpai/list'
    import cailiaofenlei from '@/views/modules/cailiaofenlei/list'
    import config from '@/views/modules/config/list'
    import cheliangxinghao from '@/views/modules/cheliangxinghao/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '汽车资讯',
        component: news
      }
      ,{
	path: '/cheliangzhanshi',
        name: '车辆展示',
        component: cheliangzhanshi
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/forum',
        name: '用户交流',
        component: forum
      }
      ,{
	path: '/weixiucailiao',
        name: '维修材料',
        component: weixiucailiao
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/chat',
        name: '在线客服',
        component: chat
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
	path: '/discusscheliangzhanshi',
        name: '车辆展示评论',
        component: discusscheliangzhanshi
      }
      ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
      ,{
	path: '/cheliangpinpai',
        name: '车辆品牌',
        component: cheliangpinpai
      }
      ,{
	path: '/cailiaofenlei',
        name: '材料分类',
        component: cailiaofenlei
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/cheliangxinghao',
        name: '车辆型号',
        component: cheliangxinghao
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
