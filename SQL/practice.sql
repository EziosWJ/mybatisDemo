/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50642
Source Host           : localhost:3306
Source Database       : practice

Target Server Type    : MYSQL
Target Server Version : 50642
File Encoding         : 65001

Date: 2018-12-24 22:42:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` char(255) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `wanted` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('001', 'wj', 'everything');
INSERT INTO `customer` VALUES ('002', 'yyn', 'bab');
INSERT INTO `customer` VALUES ('003', 'zt', 'father');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_Id` char(255) NOT NULL,
  `user_Name` varchar(20) DEFAULT NULL,
  `user_Password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`user_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('u001', 'wjj', '123456');
INSERT INTO `user` VALUES ('u002', 'ynn', '123456');
