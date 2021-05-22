// 新闻组件
var newsTmp = Vue.extend({
    template: `<div>
                <div class="news-list">
                    <h4>最新公告</h4>
                    <ul>
                    <li v-for="item1 in announcements" ><a v-bind:href="'news-view.html?enId='+item1.enId" target="_blank">{{item1.enTitle | doNameFilter(item1.enTitle)}}</a></li>
                    </ul>
                </div>
                <div class="spacer"></div>
                <div class="news-list">
                    <h4>新闻动态</h4>
                    <ul>
                    <li v-for="item2 in news"><a v-bind:href="'news-view.html?enId='+item2.enId" target="_blank">{{item2.enTitle | doNameFilter(item2.enTitle)}}</a></li>
                    </ul>
                </div>
                </div>`,
    data:function(){
        return {
            news: {},
            announcements:{}
        };
    },     
    filters:{
        // 名字过滤
		doNameFilter:function(epName){
			var ep_Name = epName;
            if(ep_Name.length > 18){
                ep_Name = ep_Name.substring(0,15);
			    return ep_Name + "...";
            }else{
                return ep_Name;
            }
			
		}
    }, 
    mounted:function() {
        // 获取新闻和公告
				axios.get(
					server_url + '/news/getNewsByEnType',
					{
						params:{enType: '1'}
					}
				).then(res=>{
					this.news = res.data.t;
				});

				axios.get(
					server_url + '/news/getNewsByEnType',
					{
						params:{enType: '2'}
					}
				).then(res=>{
					this.announcements = res.data.t;
				});
    },
})