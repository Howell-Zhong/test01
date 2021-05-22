/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.62 : Database - easybuy
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`easybuy` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `easybuy`;

/*Table structure for table `easybuy_comment` */

DROP TABLE IF EXISTS `easybuy_comment`;

CREATE TABLE `easybuy_comment` (
                                   `ecId` int(11) NOT NULL AUTO_INCREMENT COMMENT '留言编号',
                                   `euId` int(11) DEFAULT NULL COMMENT '用户编号',
                                   `ecTitle` varchar(100) DEFAULT NULL COMMENT '留言标题',
                                   `ecCreateTime` datetime DEFAULT NULL COMMENT '留言时间',
                                   `ecContent` varchar(255) DEFAULT NULL COMMENT '留言内容',
                                   PRIMARY KEY (`ecId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='留言表';

/*Data for the table `easybuy_comment` */

insert  into `easybuy_comment`(`ecId`,`euId`,`ecTitle`,`ecCreateTime`,`ecContent`) values (1,7,'表演','2021-05-04 15:37:23','没什么才艺，我背一遍联盟规则吧'),(2,13,'抽风','2021-05-11 10:34:30','我在阳台抽烟，风抽一半我抽一半，我没和风计较，或许风也有烦恼，可转念一想，风凭什么抽我的烟，于是我开始抽风');

/*Table structure for table `easybuy_news` */

DROP TABLE IF EXISTS `easybuy_news`;

CREATE TABLE `easybuy_news` (
                                `enId` int(11) NOT NULL AUTO_INCREMENT COMMENT '新闻公告编号',
                                `enTitle` varchar(100) DEFAULT NULL COMMENT '标题',
                                `enType` char(2) DEFAULT NULL COMMENT '类型',
                                `enCreateTime` datetime DEFAULT NULL COMMENT '时间',
                                `enContent` varchar(255) DEFAULT NULL COMMENT '内容',
                                PRIMARY KEY (`enId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='新闻公告表';

/*Data for the table `easybuy_news` */

insert  into `easybuy_news`(`enId`,`enTitle`,`enType`,`enCreateTime`,`enContent`) values (1,'2','2','2021-05-13 15:37:32','2');

/*Table structure for table `easybuy_order` */

DROP TABLE IF EXISTS `easybuy_order`;

CREATE TABLE `easybuy_order` (
                                 `eoId` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
                                 `esaId` int(11) DEFAULT NULL COMMENT '收货地址编号',
                                 `euId` int(11) DEFAULT NULL COMMENT '用户编号',
                                 `eoOrderTime` datetime DEFAULT NULL COMMENT '下单时间',
                                 `eoStatus` char(2) DEFAULT NULL COMMENT '订单状态',
                                 `eoCost` double DEFAULT NULL COMMENT '订单总金额',
                                 `eoRemarks` varchar(255) DEFAULT NULL COMMENT '备注',
                                 PRIMARY KEY (`eoId`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='订单表';

/*Data for the table `easybuy_order` */

insert  into `easybuy_order`(`eoId`,`esaId`,`euId`,`eoOrderTime`,`eoStatus`,`eoCost`,`eoRemarks`) values (5,7,6,'2021-05-15 10:50:49','2',4996.1,NULL),(6,7,6,'2021-05-15 10:51:56','2',4996.1,NULL),(7,7,6,'2021-05-15 10:55:45','2',4996.1,NULL),(8,7,6,'2021-05-15 11:00:00','2',4996.1,NULL),(9,7,6,'2021-05-15 11:00:48','2',4996.1,NULL),(10,7,6,'2021-05-15 11:00:52','2',4996.1,NULL),(11,7,6,'2021-05-15 17:27:25','2',1188,NULL),(12,7,6,'2021-05-16 15:26:30','2',0,NULL),(13,7,6,'2021-05-16 15:50:56','2',0,NULL),(14,7,6,'2021-05-16 15:51:19','2',26539.94,NULL),(15,1,5,'2021-05-17 09:56:54','2',0,NULL),(16,7,6,'2021-05-17 14:46:15','2',0,NULL),(17,7,6,'2021-05-17 15:35:01','2',0,NULL),(18,7,7,'2021-05-17 15:36:56','2',2109,NULL),(19,7,6,'2021-05-17 15:47:42','2',0,NULL),(20,1,5,'2021-05-17 15:49:18','2',1494,NULL),(21,8,6,'2021-05-17 15:49:56','2',0,NULL),(22,7,6,'2021-05-17 15:55:02','2',20999.949999999997,NULL),(23,7,6,'2021-05-17 15:55:55','2',20999.949999999997,NULL),(24,7,6,'2021-05-17 15:56:07','2',20999.949999999997,NULL),(25,7,6,'2021-05-17 15:57:41','2',46199.89,NULL),(26,6,9,'2021-05-17 16:55:42','2',29399.93,NULL);

/*Table structure for table `easybuy_order_detail` */

DROP TABLE IF EXISTS `easybuy_order_detail`;

CREATE TABLE `easybuy_order_detail` (
                                        `eodId` int(11) NOT NULL AUTO_INCREMENT COMMENT '详情编号',
                                        `epId` int(11) DEFAULT NULL COMMENT '商品编号',
                                        `eoId` int(11) DEFAULT NULL COMMENT '订单编号',
                                        `eodQuantity` smallint(6) DEFAULT NULL COMMENT '购买数量',
                                        PRIMARY KEY (`eodId`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='订单详情表';

/*Data for the table `easybuy_order_detail` */

insert  into `easybuy_order_detail`(`eodId`,`epId`,`eoId`,`eodQuantity`) values (1,4,4,4),(2,3,4,6),(3,2,4,5),(5,6,7,9),(6,6,7,9),(7,6,7,9),(8,6,7,9),(9,6,9,9),(10,7,9,9),(11,8,9,8),(12,9,9,9),(13,6,10,9),(14,7,10,9),(15,8,10,8),(16,9,10,9),(17,9,11,6),(18,5,14,6),(19,8,14,5),(20,15,18,4),(21,13,18,7),(22,2,20,1),(23,9,20,7),(24,5,22,5),(25,5,23,5),(26,5,24,5),(27,5,25,11),(28,5,26,7);

/*Table structure for table `easybuy_product` */

DROP TABLE IF EXISTS `easybuy_product`;

CREATE TABLE `easybuy_product` (
                                   `epId` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品编号',
                                   `epcId` int(11) DEFAULT NULL COMMENT '分类编号',
                                   `epName` varchar(100) DEFAULT NULL COMMENT '商品名称(ep)',
                                   `epFileName` varchar(255) DEFAULT NULL COMMENT '商品图片',
                                   `epPrice` double DEFAULT NULL COMMENT '商品价格(ep)',
                                   `epPromotionCategory` char(2) DEFAULT NULL COMMENT '推广类别',
                                   `epStatus` char(2) DEFAULT NULL COMMENT '商品状态',
                                   `epBrand` varchar(50) DEFAULT NULL COMMENT '品牌',
                                   `epStock` int(11) DEFAULT NULL COMMENT '库存',
                                   `barcode` varchar(255) DEFAULT NULL COMMENT '条码号',
                                   `epDescription` varchar(255) DEFAULT NULL COMMENT '详情',
                                   PRIMARY KEY (`epId`)
) ENGINE=InnoDB AUTO_INCREMENT=7900 DEFAULT CHARSET=utf8 COMMENT='商品表';

/*Data for the table `easybuy_product` */

insert  into `easybuy_product`(`epId`,`epcId`,`epName`,`epFileName`,`epPrice`,`epPromotionCategory`,`epStatus`,`epBrand`,`epStock`,`barcode`,`epDescription`) values (2,3,'法国德菲丝松露精品巧克力500g/盒','/resources/upload/product/2d63715d-29c9-4111-a51a-3755dfb715b2.jpg',108,'1','1','法国德菲丝',500,'','纯正而朴实：松露巧克力的口感非常的纯正， 品尝过的都能立即知道。  甜度低：比起其它传统的巧克力松露的含糖量较低 ，亚洲人喜欢低甜度的巧克力。  即溶的口感：松露的脂肪成分来源于植物， 它的溶点较低，因此它会给您带来持久的冰凉之感。  口感润滑：松露巧克力外表覆盖着来自法国松软的不含糖的可可哦。'),(3,9,'乐扣普通型保鲜盒圣诞7件套','/resources/upload/product/fef188ba-8b7b-4139-9c5a-ac0a36c41c10.jpg',69.9,'1','1','',500,'','乐扣普通型保鲜盒圣诞7件套'),(4,10,'欧珀莱均衡保湿四件套','/resources/upload/product/4148f8a1-e669-49c7-86c4-1e840a101432.jpg',279,'1','1','',500,'','欧珀莱均衡保湿四件套'),(5,3,'联想笔记本电脑 高速独立显存','/resources/upload/product/b2d0921a-ac83-4183-9741-c999b0b7b525.jpg',4199.99,'1','1','联想',500,'','联想笔记本电脑 高速独立显存'),(6,8,'法姿韩版显瘦彩边时尚牛仔铅笔裤','/resources/upload/product/b706352a-58f9-4d06-9fa5-cadc2fb66756.jpg',49,'1','1','',500,'','法姿韩版显瘦彩边时尚牛仔铅笔裤'),(7,14,'Genius925纯银施华洛世奇水晶吊坠','/resources/upload/product/1c1f8181-4883-4e8e-a99e-4a76ea70d827.jpg',69.9,'1','1','',500,'','Genius925纯银施华洛世奇水晶吊坠'),(8,17,'利仁2018M福满堂电饼铛 好用实惠','/resources/upload/product/fea39055-6b9b-413f-b42d-216c0b812d7d.jpg',268,'1','1','',500,'','利仁2018M福满堂电饼铛 好用实惠'),(9,16,'达派高档拉杆箱20寸 经典款式','/resources/upload/product/a0329a85-aea4-4650-a373-91d215d5f0da.jpg',198,'1','1','',100,'','达派高档拉杆箱20寸 经典款式'),(10,13,'爱国者MP4 全屏触摸多格式播放 4G','/resources/upload/product/55cc5ee1-5868-48c2-a69c-e8b9244b3eb7.jpg',289,'2','1','',200,'','爱国者MP4 全屏触摸多格式播放 4G'),(11,11,'多美滋金装金盾3阶段幼儿配方奶粉','/resources/upload/product/8878f0e5-5f18-48e1-8515-4ef0b70f9cb1.jpg',186,'1','1','',300,'','多美滋金装金盾3阶段幼儿配方奶粉'),(12,4,'【新华正版包邮】三体纪念版 123刘慈欣雨果奖作品 三体全集123三体1+黑暗森林+死神永生科幻小说典藏图书籍排行榜','/resources/upload/product/e73cb21f-e2db-4257-ac8a-863e89326fce.jpg',154,'3','1',NULL,20,NULL,'【新华正版包邮】三体纪念版 123刘慈欣雨果奖作品 三体全集123三体1+黑暗森林+死神永生科幻小说典藏图书籍排行榜'),(13,5,'旋转木马水晶球音乐盒八音盒小女孩儿童女童生日礼物女520情人节','/resources/upload/product/ee80a26b-80be-4d2a-9b4f-2df325bfb79c.jpg',239,'1','1',NULL,50,NULL,'旋转木马水晶球音乐盒八音盒小女孩儿童女童生日礼物女520情人节'),(14,7,'李宁男鞋夏季网面透气防臭运动鞋男士旅游休闲鞋子轻便防滑跑步鞋','/resources/upload/product/962b846d-3342-460a-a6d4-17797344c02f.jpg',98,'2','1',NULL,150,NULL,'李宁男鞋夏季网面透气防臭运动鞋男士旅游休闲鞋子轻便防滑跑步鞋'),(15,12,'亿滋奥利奥礼盒夹心饼干巧克棒巧脆卷巧轻脆零食礼包520礼送女友','/resources/upload/product/2daaabb3-c2ae-4a45-a7e8-7d8530d29fd3.jpg',109,'1','1',NULL,150,NULL,'亿滋奥利奥礼盒夹心饼干巧克棒巧脆卷巧轻脆零食礼包520礼送女友'),(16,15,'正品卡罗莱全自动机械表时尚男士手表商务男表真皮带防水运动腕表','/resources/upload/product/50e79089-e3fa-43bc-8415-b32a587750c4.jpg',2380,'3','1',NULL,560,NULL,'正品卡罗莱全自动机械表时尚男士手表商务男表真皮带防水运动腕表'),(17,18,'惠普光影精灵6/十代酷睿','/resources/upload/product/824b7cfb-22c4-4a80-9c69-993cf7226263.jpg',7800,'3','1',NULL,2000,NULL,'惠普光影精灵6/十代酷睿'),(18,19,'预定 万代 DX 假面骑士帝骑 DECADE 品红神主牌套装腰带 再版 NEO','/resources/upload/product/7a294d72-374a-42e1-83bd-29845e1da334.jpg',1420,'3','1',NULL,30,NULL,'预定 万代 DX 假面骑士帝骑 DECADE 品红神主牌套装腰带 再版 NEO'),(19,19,'日版万代特利伽奥特曼火花变身器转换枪 迪迦 收纳带 武器 抢先版','/resources/upload/product/ad4000b4-cfe5-49b0-ac63-6d2925923ee6.gif',300,'3','1',NULL,789,NULL,'日版万代特利伽奥特曼火花变身器转换枪 迪迦 收纳带 武器 抢先版'),(20,20,'汽车前挡玻璃清洁刷 车载除尘器除雾车窗刮 家车两用多功能清洗擦','/resources/upload/product/43b688f6-b19e-4a14-bb66-b5e9fb0fadd1.jpg',20,'3','1',NULL,200,NULL,'汽车前挡玻璃清洁刷 车载除尘器除雾车窗刮 家车两用多功能清洗擦'),(21,4,'【新华书店旗舰店官网】盗墓笔记全套正版14册 十年之约沙海藏海花南派三叔的书全集典藏版极海听雷重启老九门侦探悬疑小说书籍','/resources/upload/product/5bfb8505-a245-4223-9dde-3e6f488f5228.jpg',319,'1','1',NULL,2000,NULL,'【新华书店旗舰店官网】盗墓笔记全套正版14册 十年之约沙海藏海花南派三叔的书全集典藏版极海听雷重启老九门侦探悬疑小说书籍'),(22,4,'现货 台版 轻小说 鸭志田一《青春猪头少年不会梦到兔女郎学姊1-10》角川 小说正版 再版中','/resources/upload/product/03ff0fd9-e20a-4786-80dc-b09722ec9889.png',545,'1','1',NULL,2000,NULL,'现货 台版 轻小说 鸭志田一《青春猪头少年不会梦到兔女郎学姊1-10》角川 小说正版 再版中'),(23,8,'刀剑神域t恤短袖 动漫周边衣服 桐人亚丝娜 sao神域剑 男女纯棉','/resources/upload/product/0c5de15f-c972-4f00-acf6-bc4d6dae4349.jpg',59,'2','1',NULL,3000,NULL,'刀剑神域t恤短袖 动漫周边衣服 桐人亚丝娜 sao神域剑 男女纯棉'),(24,5,'钢之炼金术师FA [高清蓝光BD]Animax+星空卫视双国语+粤日英配音','/resources/upload/product/2c4be98e-1bf2-4a0d-8575-1fbfdd34ac98.jpg',63,'3','1',NULL,2000,NULL,'钢之炼金术师FA [高清蓝光BD]Animax+星空卫视双国语+粤日英配音');

/*Table structure for table `easybuy_product_category` */

DROP TABLE IF EXISTS `easybuy_product_category`;

CREATE TABLE `easybuy_product_category` (
                                            `epcId` int(11) NOT NULL AUTO_INCREMENT COMMENT '分类编号',
                                            `epcFatherId` int(11) DEFAULT NULL COMMENT '父级编号',
                                            `epcName` varchar(50) DEFAULT NULL COMMENT '分类名称',
                                            `epcLevel` char(2) DEFAULT NULL COMMENT '级别',
                                            PRIMARY KEY (`epcId`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COMMENT='商品分类表';

/*Data for the table `easybuy_product_category` */

insert  into `easybuy_product_category`(`epcId`,`epcFatherId`,`epcName`,`epcLevel`) values (2,0,'图书','1'),(3,0,'百货','1'),(4,2,'图书','2'),(5,2,'音乐','2'),(7,3,'运动健康','2'),(8,3,'服装','2'),(9,3,'家居','2'),(10,3,'美妆','2'),(11,3,'母婴','2'),(12,3,'食品','2'),(13,3,'手机数码','2'),(14,3,'家具首饰','2'),(15,3,'手表饰品','2'),(16,3,'鞋包','2'),(17,3,'家电','2'),(18,3,'电脑办公','2'),(19,3,'玩具文具','2'),(20,3,'汽车用品','2');

/*Table structure for table `easybuy_reply` */

DROP TABLE IF EXISTS `easybuy_reply`;

CREATE TABLE `easybuy_reply` (
                                 `erId` int(11) NOT NULL AUTO_INCREMENT COMMENT '回复编号',
                                 `ecId` int(11) DEFAULT NULL COMMENT '留言编号',
                                 `euId` int(11) DEFAULT NULL COMMENT '用户编号',
                                 `erReplyTime` datetime DEFAULT NULL COMMENT '回复时间',
                                 `erReplyContent` varchar(255) DEFAULT NULL COMMENT '回复内容',
                                 PRIMARY KEY (`erId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='留言回复表';

/*Data for the table `easybuy_reply` */

insert  into `easybuy_reply`(`erId`,`ecId`,`euId`,`erReplyTime`,`erReplyContent`) values (1,1,7,'2021-05-07 15:35:06','感谢您的支持'),(2,2,13,'2021-05-13 10:37:55','感谢您的支持');

/*Table structure for table `easybuy_shipping_address` */

DROP TABLE IF EXISTS `easybuy_shipping_address`;

CREATE TABLE `easybuy_shipping_address` (
                                            `esaId` int(11) NOT NULL AUTO_INCREMENT COMMENT '收货地址编号',
                                            `euId` int(11) DEFAULT NULL COMMENT '用户编号',
                                            `esaConsignee` varchar(255) DEFAULT NULL COMMENT '收货人',
                                            `esaMobile` varchar(50) DEFAULT NULL COMMENT '手机号',
                                            `esaProvince` varchar(50) DEFAULT NULL COMMENT '省份',
                                            `esaCity` varchar(50) DEFAULT NULL COMMENT '市',
                                            `esaCounty` varchar(50) DEFAULT NULL COMMENT '区/县',
                                            `esaDetailedAddress` varchar(255) DEFAULT NULL COMMENT '详细地址',
                                            `esaDefault` char(2) DEFAULT NULL COMMENT '是否默认:否为0，默认则为1',
                                            PRIMARY KEY (`esaId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='收货地址表';

/*Data for the table `easybuy_shipping_address` */

insert  into `easybuy_shipping_address`(`esaId`,`euId`,`esaConsignee`,`esaMobile`,`esaProvince`,`esaCity`,`esaCounty`,`esaDetailedAddress`,`esaDefault`) values (1,5,'张三','111111111','广东','深圳','南山','高新南二道3307号','1'),(2,NULL,NULL,NULL,NULL,NULL,NULL,'哈哈',NULL),(3,NULL,NULL,NULL,NULL,NULL,NULL,'哈哈',NULL),(4,8,'郭宇峰','11111111','广东','深圳','南山','高新南二道3307号','1'),(5,11,'程行','111111111','广东','深圳','南山','高新南二道3307号','1'),(6,9,'刘晓滨','111111111','广东','深圳','南山','高新南二道3307号','1'),(7,6,'张三','111111111','广东','深圳','南山','高新南二道3307号','1'),(8,6,'李四','222222222','湖南','长沙','xxx','XXX道','2');

/*Table structure for table `easybuy_shopping_cart` */

DROP TABLE IF EXISTS `easybuy_shopping_cart`;

CREATE TABLE `easybuy_shopping_cart` (
                                         `escId` int(11) NOT NULL AUTO_INCREMENT COMMENT '购物车编号',
                                         `epId` int(11) DEFAULT NULL COMMENT '商品编号',
                                         `euId` int(11) DEFAULT NULL COMMENT '用户编号',
                                         `escQuantity` int(11) DEFAULT NULL COMMENT '数量',
                                         PRIMARY KEY (`escId`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COMMENT='购物车表';

/*Data for the table `easybuy_shopping_cart` */

insert  into `easybuy_shopping_cart`(`escId`,`epId`,`euId`,`escQuantity`) values (28,2,5,8);

/*Table structure for table `easybuy_user` */

DROP TABLE IF EXISTS `easybuy_user`;

CREATE TABLE `easybuy_user` (
                                `euId` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
                                `euUserName` varchar(50) DEFAULT NULL COMMENT '用户名',
                                `euName` varchar(50) DEFAULT NULL COMMENT '姓名：用户真实姓名',
                                `euPassword` varchar(50) DEFAULT NULL COMMENT '密码',
                                `euSex` char(2) DEFAULT NULL COMMENT '性别：0是女，1是男',
                                `euBirthday` datetime DEFAULT NULL COMMENT '出生日期',
                                `euMobile` varchar(50) DEFAULT NULL COMMENT '手机号(eu)',
                                `euPicture` varchar(255) DEFAULT NULL COMMENT '头像',
                                `euType` char(2) DEFAULT NULL COMMENT '类型(eu)：0是管理员，1是用户',
                                `euStatus` char(2) DEFAULT NULL COMMENT '使用状态：0是禁用，1是启用',
                                PRIMARY KEY (`euId`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COMMENT='用户实体';

/*Data for the table `easybuy_user` */

insert  into `easybuy_user`(`euId`,`euUserName`,`euName`,`euPassword`,`euSex`,`euBirthday`,`euMobile`,`euPicture`,`euType`,`euStatus`) values (5,'admin','admin','1','1',NULL,'222222222','/resources/upload/user/4a99a9b9-7d70-4fd6-b897-0c5fc4e8a47f.jpg','2','1'),(6,'浩','啊浩','1','2',NULL,'2222222222','/resources/upload/user/8f1b8185-53ab-4a0a-b4f0-e05c61f0d39c.jpg','1','1'),(7,'哈登','钟','1','1',NULL,'3333333','/resources/upload/user/f141c170-a900-4be3-9fbb-67972dfb5b93.jpg','1','1'),(8,'郭','hhh','1','1',NULL,'44','/resources/upload/user/c26c4e86-bc70-4fef-830e-d462ed0e8963.jpg','1','1'),(9,'刘','刘','1','1',NULL,'55555','/resources/upload/user/7d877f8b-fb97-4453-848e-dcd469aafff8.jpg','1','1'),(10,'文','文','1','1',NULL,'6666','/resources/upload/user/71b2a972-aaf5-4d35-8ea9-37b7d4cc8008.jpg','1','1'),(11,'程','程','1','1',NULL,'8888888','/resources/upload/user/ff604481-35db-46d9-9975-de10421a119f.jpg','1','1'),(12,'宇','宇','1','1',NULL,'111','/resources/upload/user/72b5b91d-ffea-4639-b93f-e051b5902c56.jpg','1','1'),(13,'路人甲','路人甲','1','1',NULL,'1','/resources/upload/user/72b5b91d-ffea-4639-b93f-e051b5902c56.jpg','1','1');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
