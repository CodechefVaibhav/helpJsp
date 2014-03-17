-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 17, 2014 at 10:31 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `mydatabase`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE IF NOT EXISTS `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) DEFAULT NULL,
  `company` varchar(20) DEFAULT NULL,
  `designation` varchar(20) DEFAULT NULL,
  `exp` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `name`, `company`, `designation`, `exp`) VALUES
(1, 'DIMPLE CHADHA', 'TCS', 'TECHNICAL LEAD', 5),
(2, 'NEHA GOEL', 'HCL', 'PROJECT MANAGER', 12),
(3, 'AMIT JOSHI', 'IBM', 'TECHNICAL LEAD', 7),
(4, 'KUNAL CHADHA', 'TCS', 'SOFTWARE ENGINEER', 3),
(5, 'SAKSHI DHINGRA', 'IBM', 'BUSINESS ANALYST', 4),
(6, 'RAHUL GULATI', 'SAPIENT', 'TECHNICAL LEAD', 5),
(7, 'SHILPA MANGLA', 'INFOGAIN', 'BUSINESS ANALYST', 5),
(8, 'MANYATA DUTT', 'ORACLE', 'SOFTWARE ENGINEER', 6),
(9, 'SACHIN KUMAR', 'MICROSOFT', 'PROJECT MANAGER', 10),
(10, 'ANKIT MORE', 'GOOGLE', 'SOFTWARE ENGINEER', 1),
(12, 'neeru', 'xyz', 'data analyst', 1),
(13, 'priya', 'sus', 'ser', 2345);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `city` varchar(50) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=914 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `first_name`, `last_name`, `gender`, `city`) VALUES
(1, 'vaibhav', 'kashyap', 'Male', 'Delhi'),
(906, 'Ankush', 'Thakur', 'male', 'gurgaon'),
(907, 'Anamika', 'Singh', 'female', 'meerut'),
(908, 'Shweta', 'Gupta', 'female', 'gurgaon'),
(909, 'Rajesh', 'Chauhan', 'male', 'noida'),
(911, 'Andrew', 'Symonds', 'male', 'delhi'),
(912, 'vaibhav', 'kashyap', 'Male', 'Delhi'),
(913, 'anvesh', 'saxena', 'Male', 'Bangalore');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
