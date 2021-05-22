// 分页条组件构造器
var pageTmp = Vue.extend({
    // 分页条组件模板，通过``封装起来，以文本形式存在
    // 加入div标签，需要一个根节点
    template:`
        <div>
            <a href="javascript:void(0)" v-show="cpage.pageNo>1" v-on:click="cdoQuery(1)">首页</a>
	  		<a href="javascript:void(0)" v-show="cpage.pageNo>1" v-on:click="cdoQuery(cpage.pageNo-1)">上一页</a>
	  		<a href="javascript:void(0)" v-show="cpage.pageNo<cpage.totalPage" v-on:click="cdoQuery(cpage.pageNo+1)">下一页</a>
	  		<a href="javascript:void(0)" v-show="cpage.pageNo<cpage.totalPage" v-on:click="cdoQuery(cpage.totalPage)">尾页</a>
	  		第{{cpage.pageNo}}/{{cpage.totalPage}}页 共{{cpage.totalCount}}条记录 
	  		<input type="text" name="goPage" value="" size="1" v-model="goPage" />
	  		<input type="button" name="goPageBtn" value="go" v-on:click="cdoGoPage(goPage)"/>
        </div>      
    `,
    // 父传子，通过props，将cpage与vue对象data里的pageList进行关联
    props:['cpage'],
    // 组件构造器里的data以函数的形式返回值
    data:function(){
        return {
            goPage:''
        }
    },
    methods:{
        cdoQuery:function(pageNo){
            // 发送的点击事件以及值
            this.$emit("query", pageNo);
        },
        cdoGoPage:function(pageNo){
            console.log(this.goPage),
            console.log("***"+pageNo);
            this.$emit("dogopage",pageNo)
        }
    }
}) 