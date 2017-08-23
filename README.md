[![Build Status](https://travis-ci.org/art-sov/ContactsBackEnd.svg?branch=master)](https://travis-ci.org/art-sov/ContactsBackEnd)

TestTask2

Run the following script in MySQL: 

CREATE DATABASE `hello`;

USE `hello`;

CREATE TABLE `contact` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;


INSERT INTO `hello`.`contact` (`name`) VALUES ('first');

INSERT INTO `hello`.`contact` (`name`) VALUES ('second');

.....

Launch the application:

java -jar contacts-backend-1.0.jar
