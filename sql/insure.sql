SHOW DATABASES;
CREATE DATABASE insurance;
DROP TABLE IF EXISTS insurance.admin;
CREATE TABLE insurance.admin (
  id        INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  Adminname VARCHAR(255) NOT NULL,
  pass      VARCHAR(255) NOT NULL
);
INSERT INTO insurance.admin VALUE (NULL, 'admin', '123');
DROP TABLE IF EXISTS insurance.user;
CREATE TABLE insurance.user (
  id       INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  pass     VARCHAR(255) NOT NULL,
  may_id   INT UNSIGNED
);
INSERT INTO insurance.user VALUE (NULL, '张华', 'abc123', NULL);
DROP TABLE IF EXISTS insurance.fund;
CREATE TABLE insurance.fund (
  id      INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  may     DATE,
  yanglao DECIMAL(6, 2) COMMENT '养老保险',
  yiliao  DECIMAL(6, 2) COMMENT '医疗保险',
  gongs   DECIMAL(6, 2) COMMENT '工伤保险',
  shiye   DECIMAL(6, 2) COMMENT '失业保险',
  zfgjj   DECIMAL(6, 2) COMMENT '住房公基金'
);
INSERT INTO insurance.fund VALUES (NULL, '2012-10-1', 256.50, 105.66, 12.36, 15.00, 1159.00);
ALTER TABLE insurance.user
ADD CONSTRAINT
  sss
FOREIGN KEY (may_id)
REFERENCES insurance.fund (id);
SELECT *
FROM insurance.admin;
SELECT *
FROM insurance.user;
SELECT *
FROM insurance.fund;
SHOW DATABASES ;
USE insuranceb;
