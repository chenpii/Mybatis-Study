CREATE TABLE `teacher` (
  `id` INT NOT NULL,
  `name` VARCHAR(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4


CREATE TABLE `student` (
  `id` INT NOT NULL,
  `name` VARCHAR(30) DEFAULT NULL,
  `tid` INT DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fktid` (`tid`),
  CONSTRAINT `fktid` FOREIGN KEY (`tid`) REFERENCES `teacher` (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4