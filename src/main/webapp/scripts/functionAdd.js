// 分类添加验证
function CheckProductClass(obj) {
    obj.parentNode.parentNode.className = "";
    var msgBox = obj.parentNode.getElementsByTagName("span")[0];
    switch (obj.name) {
        case "className":
            if (obj.value == "") {
                msgBox.innerHTML = "分类名不能为空";
                msgBox.className = "error";
                return false;
            }
            break;
    }
    return true;
};
function FocusProductClass (obj) {
    obj.parentNode.parentNode.className = "current";
    var msgBox = obj.parentNode.getElementsByTagName("span")[0];
    msgBox.innerHTML = "";
    msgBox.className = "";
};

// 商品添加验证
function CheckProduct(obj) {
    obj.parentNode.parentNode.className = "";
    var msgBox = obj.parentNode.getElementsByTagName("span")[0];
    switch (obj.name) {
        case "epName":
            if (obj.value == "") {
                msgBox.innerHTML = "商品名称不能为空";
                msgBox.className = "error";
                return false;
            }
            break;
        case "epDescription":
            if (obj.value == "") {
                msgBox.innerHTML = "商品详情不能为空";
                msgBox.className = "error";
                return false;
            }
            break;  
        case "epStock":
            if (obj.value == "") {
                msgBox.innerHTML = "商品库存不能为空";
                msgBox.className = "error";
                return false;
            }
            break;     
        case "epPrice":
            if (obj.value == "") {
                msgBox.innerHTML = "商品价格不能为空";
                msgBox.className = "error";
                return false;
            }
            break;             
    }
    return true;
};
function FocusProduct (obj) {
    obj.parentNode.parentNode.className = "current";
    var msgBox = obj.parentNode.getElementsByTagName("span")[0];
    msgBox.innerHTML = "";
    msgBox.className = "";
};


// 新闻新增验证
function CheckNews(obj) {
    obj.parentNode.parentNode.className = "";
    var msgBox = obj.parentNode.getElementsByTagName("span")[0];
    switch (obj.name) {
        case "title":
            if (obj.value == "") {
                msgBox.innerHTML = "标题不能为空";
                msgBox.className = "error";
                return false;
            }
            break;
        case "enTitle":
            if (obj.value == "") {
                msgBox.innerHTML = "标题不能为空";
                msgBox.className = "error";
                return false;
            }
            break;    
    }
    return true;
};
function FocusNews (obj) {
    obj.parentNode.parentNode.className = "current";
    var msgBox = obj.parentNode.getElementsByTagName("span")[0];
    msgBox.innerHTML = "";
    msgBox.className = "";
};