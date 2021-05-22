//获取地址栏参数，当要获取地址栏传递的参数的时候必须要添加这个脚本
function getUrlParam (name) {
    var reg = new RegExp('(^|&)' + name + '=([^&]*)(&|$)');
    var r = window.location.search.substr(1).match(reg);
    if (r != null) 
    	return decodeURIComponent(r[2]); 
    return null;
}