drop table if exists `employee`;
CREATE TABLE `employee` (
  `ID` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `NAME` VARCHAR(100) NOT NULL,
  `AGE` INT(3),
  `JOINING_DATE` DATE,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
insert into employee(id, name) values (1, "Sam");
insert into employee(id, name) values (2, "John");