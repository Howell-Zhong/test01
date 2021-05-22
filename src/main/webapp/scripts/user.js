//创建头部导航栏组件构造器
var head = Vue.extend({
	template: `		
	  	<div>
	  		<div id="header" class="wrap">
	  			<div id="logo"><img src="../images/logo.gif" /></div>
	  			<div class="help"><a href="../shop/index.html">返回前台页面</a><a href="javascript:void(0)" v-on:click="doLogout">注销</a></div>
	  			<div class="navbar">
	  				<ul class="clearfix">
	  					<li :class="num==1?'current':'null'"><a href="index.html">首页</a></li>
	  					<li :class="num==2?'current':'null'"><a href="user-modify.html">用户</a></li>
	  					<li :class="num==3?'current':'null'"><a href="address.html">收货地址</a></li>
	  					<li :class="num==4?'current':'null'"><a href="order.html">订单</a></li>
	  					<li :class="num==5?'current':'null'"><a href="guestbook.html">留言</a></li>
	  				</ul>
	  			</div>
	  		</div>
	  		<div id="childNav">
	  			<div class="welcome wrap">
	  				尊敬的用户{{user}}，您好，现在是{{nowTime}}，欢迎回到个人中心。
	  			</div>
	  		</div>
	  		<div id="position" class="wrap">
				您现在的位置：<a href="index.html">易买网</a> &gt; 个人中心
			</div>
	  	</div>
	`,
	//此处可以在每个前端页面写定num
	//此处可以把user名换成user对象，当登陆的时候把user信息存储进sessionStorage，可以在mounted中拿出来，包括用户名，用户头像
	props: ['num', 'user'],
	data: function() {
		return {
			nowTime: ''
		};
	},
	methods: {
		timeFormate:function(timeStamp) {
			let year = new Date(timeStamp).getFullYear();
			let month = new Date(timeStamp).getMonth() + 1 < 10 ? "0" + (new Date(timeStamp).getMonth() + 1) :
				new Date(timeStamp).getMonth() + 1;
			let date = new Date(timeStamp).getDate() < 10 ? "0" + new Date(timeStamp).getDate() : new Date(
				timeStamp).getDate();
			let hh = new Date(timeStamp).getHours() < 10 ? "0" + new Date(timeStamp).getHours() : new Date(
				timeStamp).getHours();
			let mm = new Date(timeStamp).getMinutes() < 10 ? "0" + new Date(timeStamp).getMinutes() : new Date(
				timeStamp).getMinutes();
			let ss = new Date(timeStamp).getSeconds() < 10 ? "0" + new Date(timeStamp).getSeconds() : new Date(
				timeStamp).getSeconds();
			this.nowTime = year + "年" + month + "月" + date + "日" + " " + hh + ":" + mm + ':' + ss;
		},
		doLogout:function(){
			//注销
			sessionStorage.removeItem("userMsg");
			location.reload();
		}
	},
	mounted() {
		this.timeFormate(new Date());
	}
})


//创建左侧导航栏组件构造器
var left = Vue.extend({
	template: `		
	  	<div class="box">
	  		<dl>
	  			<dt>账号管理</dt>
	  			<dd><a href="user-modify.html">个人资料</a></dd>
	  			<dd><a href="password-modify.html">修改密码</a></dd>
	  			<dt>地址管理</dt>
	  			<dd><em><a href="address-modify.html">新增</a></em><a href="address.html">收货地址</a></dd>
	  			<dt>订单管理</dt>
	  			<dd><a href="order.html">我的订单</a></dd>
	  			<dt>留言管理</dt>
	  			<dd><a href="guestbook.html">我的留言</a></dd>
			</dl>
	  	</div>
	`
})

var footer = Vue.extend({
	template: `		
	  	<div id="footer">
	  		Copyright &copy; 2010 北大青鸟 All Rights Reserved. 京ICP证1000001号
	  	</div>
	`
})
