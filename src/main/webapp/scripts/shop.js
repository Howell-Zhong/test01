//创建头部导航栏组件构造器
var head = Vue.extend({
	template: `		
	  	<div>
	  		<div id="header" class="wrap">
	  			<div id="logo"><img src="../images/logo.gif" /></div>
					<div class="help">
						<a href="javascript:void(0)" v-on:click="cgoCenter" >{{userName}}个人中心</a>
						<a href="javascript:void(0)" v-on:click="cgoCart" class="shopping">购物车</a>
						<a href="javascript:void(0)" v-on:click="doLogin">{{login}}</a>
						<a href="register.html">注册</a>
						<a href="guestbook.html">留言</a>
					</div>
	  			<div class="navbar">
	  				<ul class="clearfix">
	  					<li :class="cnum==3?'current':'null'"><a href="index.html?num=03">首页</a></li>
	  					<li :class="cnum<3?'current':'null'"><a href="product-list.html?num=01">图书</a></li>
	  					<li :class="cnum>6?'current':'null'"><a href="product-list.html?num=07">百货</a></li>
	  					<li :class="cnum==5?'current':'null'"><a href="product-list.html?num=05">医药保健</a></li>
	  					<li :class="cnum==6?'current':'null'"><a href="news-view.html?num=06">新闻</a></li>
	  				</ul>
	  			</div>
	  		</div>
	  	</div>
	`,
	//此处可以在mounted中获取携带的参数进行判断用户点击了哪个，然后变成橙色，不用从页面传递到组件
	props: ['cnum'],
	data: function() {
		return {
			//此处可以把userName换成user，当登陆的时候把user信息存储进sessionStorage，现在可以拿出来，包括用户名，用户头像
			userName: '',
			login: ''
		};
	},
	methods: {
		//点击个人中心之后进行判断
		cgoCenter: function() {
			//判断是否登录了
			if (null != sessionStorage.getItem("userMsg") && '' != sessionStorage.getItem("userMsg")) {
				var user = JSON.parse(sessionStorage.getItem("userMsg"));
				//判断账号类型
				if ("1" == user.euType) {
					console.log(user.euType)
					window.location.href = "../user/index.html"
				} else if ("2" == user.euType) {
					console.log(user.euType)
					window.location.href = "../manage/index.html"
				}
			} else {
				window.location.href = "../shop/login.html"
			}
		},
		//点击登录按钮之后进行判断
		doLogin: function() {
			if (this.login == "登录") {
				window.location.href = "login.html"
			} else if (this.login == "注销") {
				sessionStorage.removeItem("userMsg");
				//刷新页面
				window.location.href = "login.html"
			}
		},
		//点击购物车之后进行判断
		cgoCart: function() {
			//判断是否登录了
			if (null != sessionStorage.getItem("userMsg") && '' != sessionStorage.getItem("userMsg")) {
				var user = JSON.parse(sessionStorage.getItem("userMsg"));
				window.location.href = "shopping.html"

			} else {
				window.location.href = "../shop/login.html"
			}
		},
		//还缺少一个点击留言
		
	},
	mounted() {
		//每个页面判断是否登录了
		if (null != sessionStorage.getItem("userMsg") && '' != sessionStorage.getItem("userMsg")) {
			//登录了
			this.login = "注销"
			var user = JSON.parse(sessionStorage.getItem("userMsg"));
			//判断账号是否被禁用
			if (null == user.euStatus && "2" == user.euStatus) {
				//window.location.href = "../shop/login.html"				
			} else {
				//判断账号是否有用户名
				if (null != user.euUserName) {
					this.userName = user.euUserName + "的";
				}
			}

		} else {
			this.login = "登录"
		}
	}

})

//创建时间组件
var time = Vue.extend({
	template: `				
		<div class="welcome wrap">
			尊敬的{{userName}}，您好，现在是{{nowTime}}
		</div>	
	`,
	//这里可以通过mounted获取sessionStorage中的对象来获取用户名
	data: function() {
		return {
			nowTime: '',
			userName: '用户'
		};
	},
	methods: {
		//此处是格式化时间
		timeFormate: function(timeStamp) {
			let year = new Date(timeStamp).getFullYear();
			let month = new Date(timeStamp).getMonth() + 1 < 10 ? "0" + (new Date(timeStamp).getMonth() +
				1) :
				new Date(timeStamp).getMonth() + 1;
			let date = new Date(timeStamp).getDate() < 10 ? "0" + new Date(timeStamp).getDate() : new Date(
				timeStamp).getDate();
			let hh = new Date(timeStamp).getHours() < 10 ? "0" + new Date(timeStamp).getHours() : new Date(
				timeStamp).getHours();
			let mm = new Date(timeStamp).getMinutes() < 10 ? "0" + new Date(timeStamp).getMinutes() :
				new Date(
					timeStamp).getMinutes();
			let ss = new Date(timeStamp).getSeconds() < 10 ? "0" + new Date(timeStamp).getSeconds() :
				new Date(
					timeStamp).getSeconds();
			this.nowTime = year + "年" + month + "月" + date + "日" + " " + hh + ":" + mm + ':' + ss;
		}
	},
	mounted() {
		this.timeFormate(new Date());

		//判断是否登录了
		if (null != sessionStorage.getItem("userMsg") && '' != sessionStorage.getItem("userMsg")) {
			//登录了
			var user = JSON.parse(sessionStorage.getItem("userMsg"));
			//判断账号是否被禁用
			if (null == user.euStatus && "2" == user.euStatus) {
				//window.location.href = "../shop/login.html"				
			} else {
				//判断账号是否有用户名
				if (null != user.euUserName) {
					this.userName = user.euUserName;
				}
			}
		}
	}
})


//创建左侧导航栏组件构造器
var left = Vue.extend({
	template: `		
	  	<div class="box">
	  		<h2>商品分类</h2>
	  		<dl>
	  			<dt>图书音像</dt>
	  			<dd><a href="product-list.html?num=02">图书</a></dd>
	  			<dd><a href="product-list.html?num=03">音乐</a></dd>
	  			<dt>百货</dt>
	  			<dd><a href="product-list.html?num=08">运动健康</a></dd>
	  			<dd><a href="product-list.html?num=09">服装</a></dd>
	  			<dd><a href="product-list.html?num=10">家居</a></dd>
	  			<dd><a href="product-list.html?num=12">美妆</a></dd>
	  			<dd><a href="product-list.html?num=13">母婴</a></dd>
	  			<dd><a href="product-list.html?num=14">食品</a></dd>
	  			<dd><a href="product-list.html?num=15">手机数码</a></dd>
	  			<dd><a href="product-list.html?num=16">家具首饰</a></dd>
	  			<dd><a href="product-list.html?num=17">手表饰品</a></dd>
	  			<dd><a href="product-list.html?num=18">鞋包</a></dd>
	  			<dd><a href="product-list.html?num=19">家电</a></dd>
	  			<dd><a href="product-list.html?num=20">电脑办公</a></dd>
	  			<dd><a href="product-list.html?num=21">玩具文具</a></dd>
	  			<dd><a href="product-list.html?num=22">汽车用品</a></dd>
				<dt>医药保健</dt>
				<dd><a href="product-list.html?num=23">家用医疗</a></dd>
				<dd><a href="product-list.html?num=24">营养保健</a></dd>
	  		</dl>
	  	</div>
	`
})

//创建最近浏览组件
var lastView = Vue.extend({
	template: `		
	  	<div class="last-view">
	  		<h2>最近浏览</h2>
	  		<dl class="clearfix" v-for="item in products">
	  			<dt><img v-bind:src="item.epFileName | doPictureFilter(item.epFileName)" height="40" width="40" /></dt>
	  			<dd><a v-bind:href="'product-view.html?epId='+item.epId">{{item.epName | doNameFilter(item.epName)}}</a></dd>
	  		</dl>
	  	</div>
	`,
	data: function() {
		return {
			products: []
		}
	},
	filters: {
		// 图片显示
		doPictureFilter: function(epFileName) {
			return server_url + epFileName;
		},
		// 名字过滤
		doNameFilter: function(epName) {
			var ep_Name = epName;
			ep_Name = ep_Name.substring(0, 8);
			return ep_Name + "...";
		}
	},
	mounted: function() {
		// 取出本地缓存->最近浏览
		if (localStorage.getItem("recent") != null && localStorage.getItem("recent") != '') {
			this.products = JSON.parse(localStorage.getItem("recent"));
			console.log("缓存取出" + this.products);
		}
	}
})

//创建底部版权浏览组件
var footer = Vue.extend({
	template: `		
	  	<div id="footer">
	  		Copyright &copy; 2021 北大青鸟 All Rights Reserved. 京ICP证1000001号
	  	</div>
	`
})
