CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `employee` VALUES 
	 (1,'Virat','Kohli','virat@kohli.com'),
	(2,'Rohith','Sharma','rohithsharma.com'),
	(3,'Ravindra','Jadeja','ravindrajadeja.com'),
	(4,'Jasprit','Bumrah','jasprit@bumrah.com'),
	(5,'Mohammad','Shami','shami@123.com');


