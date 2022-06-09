

-- ----------------------------
-- Table structure for COURSE
-- ----------------------------
DROP TABLE IF EXISTS `COURSE`;
CREATE TABLE `COURSE` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `CNO` varchar(100) DEFAULT NULL,
  `CNAME` varchar(100) DEFAULT NULL,
  `POINTS` int DEFAULT NULL,
  `IMG` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ID`)
);

-- ----------------------------
-- Records of COURSE
-- ----------------------------
BEGIN;
INSERT INTO `COURSE` VALUES (1, '111', '数学', 10, NULL);
INSERT INTO `COURSE` VALUES (2, '222', '英语', 5, NULL);
INSERT INTO `COURSE` VALUES (3, '333', '物理', 8, NULL);
INSERT INTO `COURSE` VALUES (4, '444', '生物', 3, NULL);
INSERT INTO `COURSE` VALUES (5, '555', '化学', 2, NULL);
COMMIT;

-- ----------------------------
-- Table structure for SCORE
-- ----------------------------
DROP TABLE IF EXISTS `SCORE`;
CREATE TABLE `SCORE` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `SID` int DEFAULT NULL,
  `CID` int DEFAULT NULL,
  `SCORE` int DEFAULT NULL,
  PRIMARY KEY (`ID`)
);

-- ----------------------------
-- Records of SCORE
-- ----------------------------
BEGIN;
INSERT INTO `SCORE` VALUES (1, 1, 1, 90);
INSERT INTO `SCORE` VALUES (2, 1, 2, 78);
INSERT INTO `SCORE` VALUES (3, 1, 3, 88);
INSERT INTO `SCORE` VALUES (4, 2, 2, 66);
INSERT INTO `SCORE` VALUES (5, 2, 3, 77);
INSERT INTO `SCORE` VALUES (6, 2, 4, 98);
INSERT INTO `SCORE` VALUES (7, 2, 5, 45);
INSERT INTO `SCORE` VALUES (8, 3, 1, 88);
INSERT INTO `SCORE` VALUES (9, 3, 2, 67);
INSERT INTO `SCORE` VALUES (10, 4, 3, 87);
INSERT INTO `SCORE` VALUES (11, 4, 4, 65);
INSERT INTO `SCORE` VALUES (12, 5, 5, 76);
COMMIT;

-- ----------------------------
-- Table structure for STUDENT
-- ----------------------------
DROP TABLE IF EXISTS `STUDENT`;
CREATE TABLE `STUDENT` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `STUNO` varchar(100) DEFAULT NULL,
  `NAME` varchar(100) DEFAULT NULL,
  `BIRTHDAY` date DEFAULT NULL,
  `COUNTRY` int DEFAULT NULL,
  `HOBBY` varchar(100) DEFAULT NULL,
  `SEX` int DEFAULT NULL,
  `TID` int DEFAULT NULL,
  PRIMARY KEY (`ID`)
)  ;

-- ----------------------------
-- Records of STUDENT
-- ----------------------------
BEGIN;
INSERT INTO `STUDENT` VALUES (1, '111', 's1', '2020-12-01', 0, 'java sport', 0, 1);
INSERT INTO `STUDENT` VALUES (2, '222', 's2', '2020-12-02', 1, 'music sport', 1, 1);
INSERT INTO `STUDENT` VALUES (3, '333', 's3', '2020-12-03', 0, 'music sport', 1, 2);
INSERT INTO `STUDENT` VALUES (4, '444', 's4', NULL, 1, NULL, 1, 3);
INSERT INTO `STUDENT` VALUES (5, '555', 's5', '2020-12-04', 1, 'java music', 0, 1);
COMMIT;

-- ----------------------------
-- Table structure for TEACHER
-- ----------------------------
DROP TABLE IF EXISTS `TEACHER`;
CREATE TABLE `TEACHER` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `NAME` varchar(100) DEFAULT NULL,
  `AGE` int DEFAULT NULL,
  PRIMARY KEY (`ID`)
);

-- ----------------------------
-- Records of TEACHER
-- ----------------------------
BEGIN;
INSERT INTO `TEACHER` VALUES (1, 't1', 40);
INSERT INTO `TEACHER` VALUES (2, 't2', 35);
INSERT INTO `TEACHER` VALUES (3, 't3', 30);
INSERT INTO `TEACHER` VALUES (4, 't4', 38);
INSERT INTO `TEACHER` VALUES (5, 't5', 48);
COMMIT;

-- ----------------------------
-- Table structure for USERINFO
-- ----------------------------
DROP TABLE IF EXISTS `USERINFO`;
CREATE TABLE `USERINFO` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `USERNAME` varchar(100) DEFAULT NULL,
  `PASSWORD` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ;

-- ----------------------------
-- Records of USERINFO
-- ----------------------------
BEGIN;
INSERT INTO `USERINFO` VALUES (1, 'admin', '123');
COMMIT;


