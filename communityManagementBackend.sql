/*
 Navicat Premium Data Transfer

 Source Server         : 远端
 Source Server Type    : MySQL
 Source Server Version : 50736
 Source Host           : 1.12.244.178:3306
 Source Schema         : communityManagementBackend

 Target Server Type    : MySQL
 Target Server Version : 50736
 File Encoding         : 65001

 Date: 31/03/2022 21:42:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for action
-- ----------------------------
DROP TABLE IF EXISTS `action`;
CREATE TABLE `action`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `time_length` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `location` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `money` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `des` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ass` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sum` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 85 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of action
-- ----------------------------
INSERT INTO `action` VALUES (1, '1', '2022-02-09 00:01:00', '1-2', '3', '3', '订单', 'shanghai', '0-10', '未处理');
INSERT INTO `action` VALUES (2, '1', '2022-02-17 00:00:01', '1-2', '的', '3', '订单', 'shanghai', '0-10', '驳回');
INSERT INTO `action` VALUES (3, '22', '2022-02-15 00:00:00', '1-2', '22', '222', '222', 'beijing', '10-50', '通过');
INSERT INTO `action` VALUES (4, '22', '2022-02-15 00:00:00', '1-2', '22', '222', '222', 'beijing', '10-50', '驳回');
INSERT INTO `action` VALUES (5, '22', '2022-02-18 00:00:01', '1-2', '22', '222', '222', 'beijing', '10-50', '驳回');
INSERT INTO `action` VALUES (6, '11', '2022-02-17 10:10:16', '1', '打得到', '打得到', '打得到', 'shanghai', '10-50', '驳回');
INSERT INTO `action` VALUES (7, '1', '2022-02-09 00:01:00', '1-2', '11', '1', '11', '计算机协会', '10-50', '未处理');
INSERT INTO `action` VALUES (77, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '未处理');
INSERT INTO `action` VALUES (78, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '未处理');
INSERT INTO `action` VALUES (79, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '驳回');
INSERT INTO `action` VALUES (80, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '驳回');
INSERT INTO `action` VALUES (81, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '驳回');
INSERT INTO `action` VALUES (82, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '通过');
INSERT INTO `action` VALUES (83, '3333', '2022-02-07 00:00:00', '否', NULL, NULL, '33', '计算机协会', NULL, '驳回');
INSERT INTO `action` VALUES (84, '1111', '2022-02-08 00:00:00', '1-2', '111', '1111', '1111', '计算机协会', '10-50', '通过');

-- ----------------------------
-- Table structure for all_apply
-- ----------------------------
DROP TABLE IF EXISTS `all_apply`;
CREATE TABLE `all_apply`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `apply_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `depart` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `apply_association` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `open_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `examine` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `introduce` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of all_apply
-- ----------------------------
INSERT INTO `all_apply` VALUES (1, '2022-02-23 16:06:42', '33', '111111', '数学院', '外貌协会', '录取', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', NULL, '33', 'http://zengqinggao.oss-cn-shenzhen.aliyuncs.com/e655d337-42c5-42f9-88d1-bbc698d2f3d5.png', '男');
INSERT INTO `all_apply` VALUES (2, '2022-02-23 16:07:15', 'ddd', '111111', '数学院', '外貌协会', '录取', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', NULL, 'ddd', NULL, '男');
INSERT INTO `all_apply` VALUES (3, '2022-02-23 16:07:34', '11', '111111', '数学院', '外貌协会', '录取', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', NULL, '111', NULL, '男');
INSERT INTO `all_apply` VALUES (4, '2022-02-23 16:08:39', '11', '111111', '数学院', '外貌协会', '通过', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', NULL, '1', NULL, '男');
INSERT INTO `all_apply` VALUES (5, '2022-02-23 16:09:04', '1', '111111', '数学院', '互联网协会', '通过', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', NULL, '1', NULL, '男');
INSERT INTO `all_apply` VALUES (6, '2022-02-23 16:09:18', '22', '111111', '数学院', '互联网协会', '录取', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', NULL, '11', NULL, '男');
INSERT INTO `all_apply` VALUES (7, '2022-02-23 16:09:44', '11', '111111', '数学院', '外貌协会', '一面过', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', NULL, '11', NULL, '男');
INSERT INTO `all_apply` VALUES (8, '2022-02-23 16:12:04', '11', '111111', '数学院', NULL, '一面过', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', NULL, '11', NULL, '男');
INSERT INTO `all_apply` VALUES (9, '2022-02-23 16:12:30', '11', '111111', '数学院', NULL, '未面试', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', NULL, '11', NULL, '男');
INSERT INTO `all_apply` VALUES (10, '2022-02-23 16:12:54', 'aa', '111111', '数学院', NULL, '未面试', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', NULL, 'aa', NULL, '男');
INSERT INTO `all_apply` VALUES (11, '2022-02-23 16:13:15', '111', NULL, NULL, '外貌协会', '未面试', NULL, NULL, '1111', 'http://zengqinggao.oss-cn-shenzhen.aliyuncs.com/9d24b5af-2c55-41f6-9acf-41a1f991f9c6.png', NULL);
INSERT INTO `all_apply` VALUES (12, '2022-02-23 16:18:31', '22', '111111', '数学院', '体育协会', '未面试', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', NULL, '222', 'http://zengqinggao.oss-cn-shenzhen.aliyuncs.com/91a00c40-bd1a-4047-99cc-f760b67f11f8.png', '男');
INSERT INTO `all_apply` VALUES (13, '2022-02-23 16:18:55', '11', '111111', '数学院', '动漫协会', '未面试', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', NULL, '111', 'http://zengqinggao.oss-cn-shenzhen.aliyuncs.com/da3aea17-ad79-46ec-bf66-850fb30f83af.png', '男');
INSERT INTO `all_apply` VALUES (14, '2022-02-23 16:26:29', '', '111111', '数学院', '动漫协会', '未面试', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', NULL, NULL, NULL, '男');
INSERT INTO `all_apply` VALUES (15, '2022-02-24 10:32:48', '', '111111', '数学院', '外貌协会', '未面试', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', NULL, '1111', NULL, '男');
INSERT INTO `all_apply` VALUES (16, '2022-02-24 10:35:27', '', '111111', '数学院', '外貌协会', '未面试', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', NULL, '3333', NULL, '男');
INSERT INTO `all_apply` VALUES (17, '2022-02-26 00:40:52', '11', '111111', '数学院', '体育协会', '录取', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', NULL, '111', 'http://zengqinggao.oss-cn-shenzhen.aliyuncs.com/bbb6827c-66e2-485f-81a3-f3f54333ffd7.png', '男');
INSERT INTO `all_apply` VALUES (18, '2022-02-26 00:49:40', '11', '111111', '数学院', '体育协会', '未面试', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', NULL, '11', NULL, '男');

-- ----------------------------
-- Table structure for app_dus
-- ----------------------------
DROP TABLE IF EXISTS `app_dus`;
CREATE TABLE `app_dus`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `avatar_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `star` int(11) NULL DEFAULT 0,
  `view_d` int(11) NULL DEFAULT 0,
  `comment` int(11) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of app_dus
-- ----------------------------
INSERT INTO `app_dus` VALUES (27, '2022-02-26 00:15:02', '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '谁有铅笔', '谁有铅笔', '', 0, 15, 0);
INSERT INTO `app_dus` VALUES (28, '2022-02-26 00:19:08', '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '谁有铅笔', '舍友打得到的', 'http://zengqinggao.oss-cn-shenzhen.aliyuncs.com/ad3b6ded-1021-4917-90a5-95a6f834fb37.png', 0, 6, 0);

-- ----------------------------
-- Table structure for applets
-- ----------------------------
DROP TABLE IF EXISTS `applets`;
CREATE TABLE `applets`  (
  `img1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `img2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `img3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `onlyC` int(11) NULL DEFAULT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of applets
-- ----------------------------
INSERT INTO `applets` VALUES ('https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=4044801071,1611058903&fm=26&gp=0.jpg', 'https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1920950542,1194829913&fm=26&gp=0.jpg', 'https://img2.baidu.com/it/u=3535286647,3353716596&fm=253&fmt=auto&app=138&f=JPEG?w=750&h=375', '保证使用，反馈------', 1, 'admin');

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ass` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `title` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `time` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `star` int(11) NULL DEFAULT 0,
  `view` int(11) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 43 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES (30, '体育协会', '推文', '请求', '<p>aaaa</p>', '2022-02-18 06:10', '已发布', 18, 60);
INSERT INTO `article` VALUES (31, '动漫协会', '推文', 'aa', '<p>dddsf</p>', '2022-02-18 06:10:41', '已发布', 3, 11);
INSERT INTO `article` VALUES (37, '体育协会', '招新', '嗷嗷', '<p><img src=\"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.jj20.com%2Fup%2Fallimg%2F1113%2F092919113248%2F1Z929113248-8-1200.jpg&amp;refer=http%3A%2F%2Fimg.jj20.com&amp;app=2002&amp;size=f9999,10000&amp;q=a80&amp;n=0&amp;g=0n&amp;fmt=jpeg?sec=1647756918&amp;t=636b062c22b9cf6f5a212d8843ace595\" alt=\"\" width=\"120\" height=\"68\" /></p>\n<table style=\"border-collapse: collapse; width: 100%;\" border=\"1\">\n<tbody>\n<tr>\n<td style=\"width: 25%;\">请求</td>\n<td style=\"width: 25%;\">d</td>\n<td style=\"width: 25%;\">dd</td>\n<td style=\"width: 25%;\">ddd</td>\n</tr>\n<tr>\n<td style=\"width: 25%;\">打得到</td>\n<td style=\"width: 25%;\">等待</td>\n<td style=\"width: 25%;\">dd</td>\n<td style=\"width: 25%;\">dd</td>\n</tr>\n<tr>\n<td style=\"width: 25%;\">订单</td>\n<td style=\"width: 25%;\">dd</td>\n<td style=\"width: 25%;\">dd</td>\n<td style=\"width: 25%;\">dd</td>\n</tr>\n<tr>\n<td style=\"width: 25%;\">订单</td>\n<td style=\"width: 25%;\">d</td>\n<td style=\"width: 25%;\">dd</td>\n<td style=\"width: 25%;\">dd</td>\n</tr>\n</tbody>\n</table>', '2022-02-18 06:19:54', '已发布', 3, 3);
INSERT INTO `article` VALUES (39, '计算机协会', '招新', '测试', '<p style=\"text-align: center;\"><strong>招新</strong></p>\n<ol>\n<li style=\"text-align: left;\">招录多名人员，包括有个学院我们知道已公开时代峻峰离开家拉手孔解放路口见看简历首付款了健康来说就风口浪尖立刻就离开我今儿风口浪尖上看了福建烤老鼠荆防颗粒数据库冷风机索拉卡减肥了看了索拉卡房间里哭即亏了圣诞节弗兰克极乐空间上看了荆防颗粒即亏了数据库非零即卡罗斯福即亏了</li>\n<li>那是索拉卡的法律及计算开始减肥<img src=\"https://img0.baidu.com/it/u=857510153,4267238650&amp;fm=253&amp;fmt=auto&amp;app=120&amp;f=JPEG?w=1200&amp;h=675\" alt=\"\" width=\"250\" height=\"170\" /></li>\n</ol>', '2022-02-26 00:05', '已发布', 0, 5);
INSERT INTO `article` VALUES (40, '计算机协会', '招新', 'test', '<p style=\"text-align: center;\"><strong>你好</strong></p>\n<ol>\n<li style=\"text-align: left;\">\n<pre>招录多名人员，包括有个学院我们知道已公开时代峻峰离开家拉手孔解放路口见看简历首付款了健康来说就风口浪尖立刻就离开我今儿风口浪尖上看<br />了福建烤老鼠荆防颗粒数据库冷风机索拉卡减肥了看了索拉卡房间里哭即亏了圣诞节弗兰克极乐空间上看了荆防颗粒即亏了数据库非零即卡罗斯福即亏了<br /><img src=\"https://img0.baidu.com/it/u=857510153,4267238650&amp;fm=253&amp;fmt=auto&amp;app=120&amp;f=JPEG?w=1200&amp;h=675\" alt=\"https://img0.baidu.com/it/u=857510153,4267238650&amp;fm=253&amp;fmt=auto&amp;app=120&amp;f=JPEG?w=1200&amp;h=675\" width=\"300\" height=\"169\" /></pre>\n</li>\n</ol>', '2022-02-26 00:09', '已发布', 0, 5);
INSERT INTO `article` VALUES (41, '互联网协会', '招新', '111', '<ol>\n<li style=\"text-align: left;\">招录多名人员，包括有个学院我们知道已公开时代峻峰离开家拉手孔解放路口见看简历首付款了健康来说就风口浪尖立刻就离开我今儿风口浪尖上看了福建烤老鼠荆防颗粒数据库冷风机索拉卡减肥了看了索拉卡房间里哭即亏了圣诞节弗兰克极乐空间上看了荆防颗粒即亏了数据库非零即卡罗斯福即亏了</li>\n<li>那是索拉卡的法律及计算开始减肥</li>\n<li><img src=\"https://img0.baidu.com/it/u=857510153,4267238650&amp;fm=253&amp;fmt=auto&amp;app=120&amp;f=JPEG?w=1200&amp;h=675\" alt=\"https://img0.baidu.com/it/u=857510153,4267238650&amp;fm=253&amp;fmt=auto&amp;app=120&amp;f=JPEG?w=1200&amp;h=675\" width=\"250\" height=\"169\" /></li>\n</ol>', '2022-02-26 00:11', '已发布', 0, 2);
INSERT INTO `article` VALUES (42, '计算机协会', '招新', 'test11', '<ol>\n<li>1离开健康来说街坊邻居水利局开发离开随机福卡</li>\n<li style=\"text-align: left;\">数据库反馈离开家上看了即分类就算了京东方</li>\n</ol>', '2022-02-26 00:43', '已发布', 1, 8);

-- ----------------------------
-- Table structure for article_comment
-- ----------------------------
DROP TABLE IF EXISTS `article_comment`;
CREATE TABLE `article_comment`  (
  `article_id` int(11) NULL DEFAULT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `avatar_url` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `star` int(11) NULL DEFAULT NULL,
  `status` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '正常',
  `ac_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ac_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of article_comment
-- ----------------------------
INSERT INTO `article_comment` VALUES (30, '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '第三方哈伦裤·是会计分录', 3, '违规', 1);
INSERT INTO `article_comment` VALUES (30, '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '第三方哈伦裤·是会计分录', 4, '违规', 2);
INSERT INTO `article_comment` VALUES (NULL, NULL, NULL, NULL, NULL, NULL, 3);
INSERT INTO `article_comment` VALUES (NULL, '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', 'ddd', 0, NULL, 4);
INSERT INTO `article_comment` VALUES (NULL, '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '333', 0, NULL, 5);
INSERT INTO `article_comment` VALUES (30, NULL, NULL, '啤哪个了', NULL, '违规', 6);
INSERT INTO `article_comment` VALUES (30, NULL, NULL, '1111', NULL, '违规', 7);
INSERT INTO `article_comment` VALUES (35, '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '111', 0, '正常', 8);
INSERT INTO `article_comment` VALUES (32, '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '11', 0, '正常', 9);
INSERT INTO `article_comment` VALUES (30, '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '3333', 0, '正常', 10);
INSERT INTO `article_comment` VALUES (38, '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '111', 0, '正常', 11);
INSERT INTO `article_comment` VALUES (42, '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '很棒', 0, '正常', 12);
INSERT INTO `article_comment` VALUES (42, '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '11', 0, '正常', 13);
INSERT INTO `article_comment` VALUES (42, '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '111', 0, '正常', 14);
INSERT INTO `article_comment` VALUES (30, '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '111', 0, '违规', 15);
INSERT INTO `article_comment` VALUES (31, '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '111', 0, '正常', 16);
INSERT INTO `article_comment` VALUES (30, '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '1111定位', 0, '正常', 17);
INSERT INTO `article_comment` VALUES (30, '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '2222', 0, '正常', 18);
INSERT INTO `article_comment` VALUES (39, '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '1111', 0, '正常', 19);

-- ----------------------------
-- Table structure for association
-- ----------------------------
DROP TABLE IF EXISTS `association`;
CREATE TABLE `association`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sum` int(11) NULL DEFAULT NULL,
  `max_sum` int(11) NULL DEFAULT NULL,
  `status` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `leader` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `introduce` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `timestamp` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of association
-- ----------------------------
INSERT INTO `association` VALUES (5, '2022/02/16 09:23:28', '外貌协会', 33, NULL, '正常', NULL, NULL, '1970-01-01T00:00:00.000Z');
INSERT INTO `association` VALUES (6, '2022/02/16 09:23:33', '互联网协会', 44, 66, '注销', NULL, NULL, '1970-01-01T00:00:00.000Z');
INSERT INTO `association` VALUES (7, '2022/02/16 09:23:51', '体育协会', 4, NULL, '正常', NULL, NULL, '1970-01-01T00:00:00.000Z');
INSERT INTO `association` VALUES (8, '2022/02/16 09:23:55', '动漫协会', 33, NULL, '正常', NULL, NULL, '1970-01-01T00:00:00.000Z');
INSERT INTO `association` VALUES (9, '2022/02/16 09:36:12', '二次元社团', 22, NULL, '正常', NULL, NULL, NULL);
INSERT INTO `association` VALUES (10, '2022/02/17 08:16:47', '运动协会', 77, NULL, '正常', NULL, NULL, '1970-01-01T00:00:00.000Z');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `dus_id` int(11) NULL DEFAULT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `avatar_url` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `star` int(11) NULL DEFAULT NULL,
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `status` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '正常',
  PRIMARY KEY (`c_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES (27, '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '有', 0, 21, '违规');
INSERT INTO `comment` VALUES (27, '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '111', 0, 22, '正常');
INSERT INTO `comment` VALUES (27, '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '111', 0, 23, '正常');
INSERT INTO `comment` VALUES (28, '月里少年', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', 'test\n', 0, 24, '正常');

-- ----------------------------
-- Table structure for feedback
-- ----------------------------
DROP TABLE IF EXISTS `feedback`;
CREATE TABLE `feedback`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `time` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `association` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of feedback
-- ----------------------------
INSERT INTO `feedback` VALUES (2, '2022-02-24 10:43', '打得到', '互联网协会');
INSERT INTO `feedback` VALUES (3, '2022-02-24 10:44', '哒哒哒哒哒哒多多多多多多', '运动协会');
INSERT INTO `feedback` VALUES (4, '2022-02-26 00:33', '领导太辣鸡了', '外貌协会');
INSERT INTO `feedback` VALUES (5, '2022-02-26 00:59', 'SDK放假', '动漫协会');

-- ----------------------------
-- Table structure for items
-- ----------------------------
DROP TABLE IF EXISTS `items`;
CREATE TABLE `items`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `person` int(11) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of items
-- ----------------------------
INSERT INTO `items` VALUES ('体育运动', 20);
INSERT INTO `items` VALUES ('今晚', 33);
INSERT INTO `items` VALUES (NULL, NULL);
INSERT INTO `items` VALUES ('7', 3);

-- ----------------------------
-- Table structure for manage
-- ----------------------------
DROP TABLE IF EXISTS `manage`;
CREATE TABLE `manage`  (
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of manage
-- ----------------------------
INSERT INTO `manage` VALUES ('admin', '111111');
INSERT INTO `manage` VALUES ('555555', '555555');
INSERT INTO `manage` VALUES ('111111', '111111');

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member`  (
  `id` int(11) NULL DEFAULT NULL,
  `time` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ass` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `position` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `depart` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `open_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES (1, '2022-02-23 16:06:42', '33', '外貌协会', '部长', 'http://zengqinggao.oss-cn-shenzhen.aliyuncs.com/e655d337-42c5-42f9-88d1-bbc698d2f3d5.png', '在职', '数学院', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA');
INSERT INTO `member` VALUES (2, '2022-02-23 16:07:15', 'ddd', '外貌协会', '社员', NULL, '在职', '数学院', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA');
INSERT INTO `member` VALUES (3, '2022-02-23 16:07:34', '11', '外貌协会', '已退团', NULL, '在职', '数学院', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA');
INSERT INTO `member` VALUES (6, '2022-02-23 16:09:18', '22', '互联网协会', '干事', NULL, '在职', '数学院', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA');
INSERT INTO `member` VALUES (17, '2022-02-26 00:40:52', '11', '体育协会', '社员', 'http://zengqinggao.oss-cn-shenzhen.aliyuncs.com/bbb6827c-66e2-485f-81a3-f3f54333ffd7.png', '在职', '数学院', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA');
INSERT INTO `member` VALUES (1, '2022-02-23 16:06:42', '33', '外貌协会', '社员', 'http://zengqinggao.oss-cn-shenzhen.aliyuncs.com/e655d337-42c5-42f9-88d1-bbc698d2f3d5.png', '在职', '数学院', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA');
INSERT INTO `member` VALUES (1, '2022-02-23 16:06:42', '33', '外貌协会', '社员', 'http://zengqinggao.oss-cn-shenzhen.aliyuncs.com/e655d337-42c5-42f9-88d1-bbc698d2f3d5.png', '在职', '数学院', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA');

-- ----------------------------
-- Table structure for my_apply
-- ----------------------------
DROP TABLE IF EXISTS `my_apply`;
CREATE TABLE `my_apply`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `open_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `apply_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` int(11) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of my_apply
-- ----------------------------
INSERT INTO `my_apply` VALUES ('yuli', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', '计算机', 0);
INSERT INTO `my_apply` VALUES ('额', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', '计算机', 1);
INSERT INTO `my_apply` VALUES ('e', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', '计算机', 2);
INSERT INTO `my_apply` VALUES ('d', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', '计算机', 3);
INSERT INTO `my_apply` VALUES ('d', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', '计算机', 4);
INSERT INTO `my_apply` VALUES ('d', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', '计算机', 5);

-- ----------------------------
-- Table structure for my_com
-- ----------------------------
DROP TABLE IF EXISTS `my_com`;
CREATE TABLE `my_com`  (
  `open_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `association` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `reason` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `position` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of my_com
-- ----------------------------
INSERT INTO `my_com` VALUES ('oLz4ZwugYXzqYy7urOPvwYm0PfYA', '计算机', '离开', '干事');
INSERT INTO `my_com` VALUES ('oLz4ZwugYXzqYy7urOPvwYm0PfYA', '计算机', NULL, '部长');
INSERT INTO `my_com` VALUES ('oLz4ZwugYXzqYy7urOPvwYm0PfYA', '计算机', NULL, '已退团');

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `item` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `des` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `open_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `depart` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sign` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of notice
-- ----------------------------
INSERT INTO `notice` VALUES (1, '1', '圣诞节疯狂拉进来', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', '自鞥请嘎', '1', '1', '已签到', '2022-02-02 00:00:00');
INSERT INTO `notice` VALUES (2, '未签到', '圣诞节疯狂拉进来', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', '曾111', '2', '2', '已签到', '2022-02-02 00:00:00');
INSERT INTO `notice` VALUES (3, '3', '圣诞节疯狂拉进来', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', NULL, NULL, NULL, '已签到', '2022-02-02 00:00:00');
INSERT INTO `notice` VALUES (4, '4', '圣诞节疯狂拉进来', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', NULL, NULL, NULL, '已签到', '2022-02-02 00:00:00');
INSERT INTO `notice` VALUES (5, '硕士都浩丰科技和是否会快', '数据可视分离焦虑了开始减肥离开家拉手孔解放路口见了拉手孔解放路口见了拉手孔解放路口见拉手孔解放路口见历史课即分类看历史课即分类接口', '1', '自鞥请嘎', '1', '1', '无需签到', '2022-02-09 00:00:00');
INSERT INTO `notice` VALUES (6, '硕士都浩丰科技和是否会快', '数据可视分离焦虑了开始减肥离开家拉手孔解放路口见了拉手孔解放路口见了拉手孔解放路口见拉手孔解放路口见历史课即分类看历史课即分类接口', '2', '曾111', '2', '2', '无需签到', '2022-02-09 00:00:00');
INSERT INTO `notice` VALUES (7, '硕士都浩丰科技和是否会快', '数据可视分离焦虑了开始减肥离开家拉手孔解放路口见了拉手孔解放路口见了拉手孔解放路口见拉手孔解放路口见历史课即分类看历史课即分类接口', NULL, NULL, NULL, NULL, '无需签到', '2022-02-09 00:00:00');
INSERT INTO `notice` VALUES (8, '硕士都浩丰科技和是否会快', '数据可视分离焦虑了开始减肥离开家拉手孔解放路口见了拉手孔解放路口见了拉手孔解放路口见拉手孔解放路口见历史课即分类看历史课即分类接口', NULL, NULL, NULL, NULL, '无需签到', '2022-02-09 00:00:00');
INSERT INTO `notice` VALUES (9, '1', '1', '1', '自鞥请嘎', '1', '1', '无需签到', '2022-02-28 00:00:00');
INSERT INTO `notice` VALUES (10, '1', '1', '2', '曾111', '2', '2', '无需签到', '2022-02-28 00:00:00');
INSERT INTO `notice` VALUES (11, '1', '1', NULL, NULL, NULL, NULL, '无需签到', '2022-02-28 00:00:00');
INSERT INTO `notice` VALUES (12, '1', '1', NULL, NULL, NULL, NULL, '无需签到', '2022-02-28 00:00:00');
INSERT INTO `notice` VALUES (13, '33', '33', '1', '自鞥请嘎', '1', '1', '未签到', '2022-03-29 00:00:00');
INSERT INTO `notice` VALUES (14, '33', '33', '2', '曾111', '2', '2', '未签到', '2022-03-29 00:00:00');
INSERT INTO `notice` VALUES (15, '33', '33', NULL, NULL, NULL, NULL, '未签到', '2022-03-29 00:00:00');
INSERT INTO `notice` VALUES (16, '33', '33', NULL, NULL, NULL, NULL, '未签到', '2022-03-29 00:00:00');
INSERT INTO `notice` VALUES (17, '通知', '1111', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', '33', '数学院', '111111', '已签到', '2022-02-26 00:00:00');
INSERT INTO `notice` VALUES (18, '通知', '1111', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', 'ddd', '数学院', '111111', '已签到', '2022-02-26 00:00:00');
INSERT INTO `notice` VALUES (19, '通知', '1111', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', '11', '数学院', '111111', '已签到', '2022-02-26 00:00:00');
INSERT INTO `notice` VALUES (20, '通知', '2月1号东区广场集中', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', '33', '数学院', '111111', '未签到', '2022-02-08 00:00:00');
INSERT INTO `notice` VALUES (21, '通知', '提交文章', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', 'ddd', '数学院', '111111', '未签到', '2022-02-08 00:00:00');
INSERT INTO `notice` VALUES (22, '通知', '111', 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', '11', '数学院', '111111', '已签到', '2022-02-08 00:00:00');

-- ----------------------------
-- Table structure for public_apply
-- ----------------------------
DROP TABLE IF EXISTS `public_apply`;
CREATE TABLE `public_apply`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `item` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `photo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `depart` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ass` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `grade` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `time` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of public_apply
-- ----------------------------
INSERT INTO `public_apply` VALUES (1, '今晚吃鸡', '月', '男', '招片', '计算机', '人事部', '大一', '2022/02/16 09:21:44');
INSERT INTO `public_apply` VALUES (2, '3', '3', '3', '3', '3', '3', '3', '2022/12/16 09:21:44');
INSERT INTO `public_apply` VALUES (3, '7', '月里少年', '男', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '数学院', NULL, '大一', '2022-02-23 17:00:05');
INSERT INTO `public_apply` VALUES (4, '体育运动', '月里少年', '男', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '数学院', NULL, '大一', '2022-02-23 17:02:29');
INSERT INTO `public_apply` VALUES (5, NULL, '月里少年', '男', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '数学院', NULL, '大一', '2022-02-23 17:03:49');
INSERT INTO `public_apply` VALUES (6, NULL, '月里少年', '男', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '数学院', NULL, '大一', '2022-02-23 17:03:51');
INSERT INTO `public_apply` VALUES (7, '今晚', '月里少年', '男', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '数学院', NULL, '大一', '2022-02-23 17:27:45');
INSERT INTO `public_apply` VALUES (8, NULL, '月里少年', '男', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '数学院', NULL, '大一', '2022-02-23 17:28:39');
INSERT INTO `public_apply` VALUES (9, '体育运动', '月里少年', '男', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '数学院', NULL, '大一', '2022-02-23 17:28:43');
INSERT INTO `public_apply` VALUES (10, NULL, '月里少年', '男', 'https://thirdwx.qlogo.cn/mmopen/vi_32/AboJJOXb0RKV3RticJt06wMB9g8u0lLXpug8EnziaOyGvrYTHCyDN166wfKGsAbvQWvp2uwCYdiaicd09icWY3CfKvw/132', '数学院', NULL, '大一', '2022-02-26 00:57:02');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `unique_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_app_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `grade` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `depart` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` bigint(50) NULL DEFAULT NULL,
  UNIQUE INDEX `user_user_app_id_uindex`(`user_app_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (NULL, NULL, 'oLz4ZwugYXzqYy7urOPvwYm0PfYA', '男', '大一', '计算机协会', '33', 111111);
INSERT INTO `user` VALUES (NULL, NULL, '1', NULL, '大三', '计算机协会', NULL, NULL);
INSERT INTO `user` VALUES (NULL, NULL, '2', NULL, '大二', '计算机协会', NULL, NULL);
INSERT INTO `user` VALUES (NULL, NULL, '3', NULL, '大二', '计算机协会', NULL, NULL);
INSERT INTO `user` VALUES (NULL, NULL, '4', NULL, '大二', NULL, NULL, NULL);
INSERT INTO `user` VALUES (NULL, NULL, '5', NULL, '大一', NULL, NULL, NULL);
INSERT INTO `user` VALUES (NULL, NULL, '6', NULL, '大一', NULL, NULL, NULL);
INSERT INTO `user` VALUES (NULL, NULL, '7', NULL, '大一', NULL, NULL, NULL);
INSERT INTO `user` VALUES (NULL, NULL, '8', NULL, '大一', NULL, NULL, NULL);
INSERT INTO `user` VALUES (NULL, NULL, '9', NULL, '大一', NULL, NULL, NULL);
INSERT INTO `user` VALUES (NULL, NULL, '11', NULL, '大三', NULL, NULL, NULL);
INSERT INTO `user` VALUES (NULL, NULL, '12', NULL, '大三', NULL, NULL, NULL);
INSERT INTO `user` VALUES (NULL, NULL, '13', NULL, '大三', NULL, NULL, NULL);
INSERT INTO `user` VALUES (NULL, NULL, '14', NULL, '大二', NULL, NULL, NULL);
INSERT INTO `user` VALUES (NULL, NULL, '15', NULL, '大二', NULL, NULL, NULL);
INSERT INTO `user` VALUES (NULL, NULL, '16', NULL, '大二', NULL, NULL, NULL);
INSERT INTO `user` VALUES (NULL, NULL, '17', NULL, '大二', NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
