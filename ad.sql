-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 09, 2014 at 07:02 AM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;



CREATE TABLE IF NOT EXISTS `ad` (
`adID` int(5) NOT NULL,
  `submittedDate` datetime NOT NULL,
  `publishDate` datetime NOT NULL,
  `contents` varchar(2000) COLLATE utf8_bin NOT NULL,
  `clientID` int(11) NOT NULL,
  `catID` int(11) NOT NULL,
  `planID` int(11) NOT NULL,
  `columns` int(2) NOT NULL,
  `title` varchar(80) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=21 ;




CREATE TABLE IF NOT EXISTS `category` (
`catID` int(11) NOT NULL,
  `catName` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;


CREATE TABLE IF NOT EXISTS `client` (
`clientID` int(2) NOT NULL,
  `address` varchar(80) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'Address to which correspondence with this client should be sent',
  `phone` bigint(11) NOT NULL COMMENT 'Phone number by which this client prefers communications to take place.',
  `companyName` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'The official name of this client',
  `billingAddress` varchar(80) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT 'The address where invoices should be sent',
  `creditCard` bigint(20) DEFAULT NULL COMMENT 'The credit card number associated with this client',
  `creditCardType` enum('Master Card','Visa','Discover Card') CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT 'the type of credit card on file'
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;


CREATE TABLE IF NOT EXISTS `employee` (
`empID` int(2) NOT NULL,
  `empFirstName` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `empLastName` varchar(20) DEFAULT NULL,
  `empType` enum('Normal','Manager','IT') NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

insert into employee(empID,empFirstName,empLastName,empType) values(0,'Manager','Account','Manager');
insert into employee(empID,empFirstName,empLastName,empType) values(1,'IT','Account','IT');
insert into employee(empID,empFirstName,empLastName,empType) values(2,'Normal','Account','Normal');

CREATE TABLE IF NOT EXISTS `payment` (
`paymentID` int(5) NOT NULL,
  `paymentDate` datetime DEFAULT CURRENT_TIMESTAMP NOT NULL,
  `paymentAmount` decimal(10,2) NOT NULL,
  `planID` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=21 ;



CREATE TRIGGER `UpdatePaymentPlanOnInsert` AFTER INSERT ON `payment`
 FOR EACH ROW update paymentPlan set totalAmountPayed = totalAmountPayed + NEW.paymentAmount where planID=NEW.planID;

CREATE TABLE IF NOT EXISTS `paymentPlan` (
`planID` int(11) NOT NULL,
  `planName` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `totalAmountPayed` decimal(10,2) NOT NULL DEFAULT '0.00',
  `balance` decimal(10,2) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=28 ;

ALTER TABLE `ad`
 ADD PRIMARY KEY (`adID`), ADD KEY `clientID` (`clientID`,`catID`,`planID`), ADD KEY `clientID2` (`clientID`,`catID`), ADD KEY `clientID3` (`clientID`), ADD KEY `catID` (`catID`), ADD KEY `planID` (`planID`), ADD KEY `planID2` (`planID`);


ALTER TABLE `category`
 ADD PRIMARY KEY (`catID`);


ALTER TABLE `client`
 ADD PRIMARY KEY (`clientID`);


ALTER TABLE `employee`
 ADD PRIMARY KEY (`empID`);


ALTER TABLE `payment`
 ADD PRIMARY KEY (`paymentID`), ADD KEY `planID` (`planID`);


ALTER TABLE `paymentPlan`
 ADD PRIMARY KEY (`planID`), ADD KEY `planID` (`planID`), ADD KEY `planID_2` (`planID`);  


ALTER TABLE `ad`
MODIFY `adID` int(5) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=21;

ALTER TABLE `category`
MODIFY `catID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;

ALTER TABLE `client`
MODIFY `clientID` int(2) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=17;

ALTER TABLE `employee`
MODIFY `empID` int(2) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;

ALTER TABLE `payment`
MODIFY `paymentID` int(5) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=21;

ALTER TABLE `paymentPlan`
MODIFY `planID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=28;

ALTER TABLE `ad`
ADD CONSTRAINT `adToCategoryRelation` FOREIGN KEY (`catID`) REFERENCES `category` (`catID`),
ADD CONSTRAINT `adToClientRelation` FOREIGN KEY (`clientID`) REFERENCES `client` (`clientID`),
ADD CONSTRAINT `adToPlanRelation` FOREIGN KEY (`planID`) REFERENCES `paymentPlan` (`planID`);


ALTER TABLE `payment`
ADD CONSTRAINT `paymentToPlanRelation` FOREIGN KEY (`planID`) REFERENCES `paymentPlan` (`planID`);


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
