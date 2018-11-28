-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Aug 21, 2017 at 10:59 AM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `bank`
--
CREATE DATABASE `bank` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `bank`;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `serial` int(50) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `uid` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`serial`),
  UNIQUE KEY `uid` (`uid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`serial`, `name`, `uid`, `password`) VALUES
(1, 'Piyush Garg', '9023481563', 'hi123456');

-- --------------------------------------------------------

--
-- Table structure for table `sem1`
--

CREATE TABLE IF NOT EXISTS `sem1` (
  `rollno` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `smester` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `dob` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL,
  PRIMARY KEY (`rollno`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `sem1`
--

INSERT INTO `sem1` (`rollno`, `fname`, `lname`, `smester`, `gender`, `dob`, `address`, `city`, `state`) VALUES
(1, 'Piyush', 'garg', 'sem1', 'MALE', '01/01/2000', '#195-A, Sewak Colonylkhf', 'patiala', 'punjab'),
(2, '', '', 'sem1', 'MALE', '', '', '', ''),
(3, 'q', 'q', 'sem1', 'MALE', 'q', 'q', 'q', 'q'),
(4, 'p', 'p', 'sem1', 'MALE', 'p', 'p', 'p', 'p');

-- --------------------------------------------------------

--
-- Table structure for table `sem2`
--

CREATE TABLE IF NOT EXISTS `sem2` (
  `rollno` int(100) NOT NULL AUTO_INCREMENT,
  `fname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `smester` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `dob` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL,
  UNIQUE KEY `rollno` (`rollno`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `sem2`
--

INSERT INTO `sem2` (`rollno`, `fname`, `lname`, `smester`, `gender`, `dob`, `address`, `city`, `state`) VALUES
(1, 'lovish', 'garg', 'sem2', 'MALE', '01/01/2000', 'adbnjnjb', 'patiala', 'punjab');

-- --------------------------------------------------------

--
-- Table structure for table `sem3`
--

CREATE TABLE IF NOT EXISTS `sem3` (
  `rollno` int(100) NOT NULL AUTO_INCREMENT,
  `fname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `smester` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `dob` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL,
  PRIMARY KEY (`rollno`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `sem3`
--

INSERT INTO `sem3` (`rollno`, `fname`, `lname`, `smester`, `gender`, `dob`, `address`, `city`, `state`) VALUES
(1, 'lovish', 'garg', 'sem3', 'MALE', '01/01/2000', 'adb', 'patiala', 'punjab');

-- --------------------------------------------------------

--
-- Table structure for table `sem4`
--

CREATE TABLE IF NOT EXISTS `sem4` (
  `rollno` int(100) NOT NULL AUTO_INCREMENT,
  `fname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `smester` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `dob` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL,
  PRIMARY KEY (`rollno`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `sem4`
--

INSERT INTO `sem4` (`rollno`, `fname`, `lname`, `smester`, `gender`, `dob`, `address`, `city`, `state`) VALUES
(1, 'lovish', 'garg', 'sem4', 'MALE', '01/01/2000', 'adb', 'patiala', 'punjab');

-- --------------------------------------------------------

--
-- Table structure for table `sem5`
--

CREATE TABLE IF NOT EXISTS `sem5` (
  `rollno` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `smester` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `dob` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL,
  PRIMARY KEY (`rollno`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `sem5`
--

INSERT INTO `sem5` (`rollno`, `fname`, `lname`, `smester`, `gender`, `dob`, `address`, `city`, `state`) VALUES
(1, 'lovish', 'garg', 'sem5', 'MALE', '01/01/2000', 'adb', 'patiala', 'punjab');

-- --------------------------------------------------------

--
-- Table structure for table `sem6`
--

CREATE TABLE IF NOT EXISTS `sem6` (
  `rollno` int(100) NOT NULL AUTO_INCREMENT,
  `fname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `smester` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `dob` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL,
  PRIMARY KEY (`rollno`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `sem6`
--

INSERT INTO `sem6` (`rollno`, `fname`, `lname`, `smester`, `gender`, `dob`, `address`, `city`, `state`) VALUES
(1, 'lovish', 'garg', 'sem6', 'MALE', '01/01/2000', 'adb', 'patiala', 'punjab');

-- --------------------------------------------------------

--
-- Table structure for table `sem7`
--

CREATE TABLE IF NOT EXISTS `sem7` (
  `rollno` int(100) NOT NULL AUTO_INCREMENT,
  `fname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `smester` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `dob` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL,
  PRIMARY KEY (`rollno`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `sem7`
--

INSERT INTO `sem7` (`rollno`, `fname`, `lname`, `smester`, `gender`, `dob`, `address`, `city`, `state`) VALUES
(1, 'lovish', 'garg', 'sem7', 'MALE', '01/01/2000', 'adb', 'patiala', 'punjab'),
(2, 'Jetinder ', 'Kumar', 'sem7', 'MALE', '29/10', 'abc', 'pataial', 'punjab'),
(3, 'Parry', 'Garg', 'sem7', 'MALE', '01/01', 'sewak colony', 'patiala', 'punjab');

-- --------------------------------------------------------

--
-- Table structure for table `sem8`
--

CREATE TABLE IF NOT EXISTS `sem8` (
  `rollno` int(100) NOT NULL AUTO_INCREMENT,
  `fname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `smester` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `dob` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL,
  PRIMARY KEY (`rollno`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `sem8`
--

INSERT INTO `sem8` (`rollno`, `fname`, `lname`, `smester`, `gender`, `dob`, `address`, `city`, `state`) VALUES
(1, 'lovish', 'garg', 'sem8', 'MALE', '01/01/2000', 'adb', 'patiala', 'punjab');

-- --------------------------------------------------------

--
-- Table structure for table `staffsem1`
--

CREATE TABLE IF NOT EXISTS `staffsem1` (
  `subname` varchar(100) NOT NULL,
  `teachname` varchar(100) NOT NULL,
  `feedback` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staffsem1`
--

INSERT INTO `staffsem1` (`subname`, `teachname`, `feedback`) VALUES
('Ed', 'Mr.Piyush', ''),
('Chem', 'Mr. Aman', 'AVERAGE'),
('Fcpit', 'Mr.Lal', 'Exelent'),
('Maths 1', 'Mr.Sandeep', 'Poor'),
('Eme', 'Ms.Kanchan', '');

-- --------------------------------------------------------

--
-- Table structure for table `staffsem2`
--

CREATE TABLE IF NOT EXISTS `staffsem2` (
  `subname` varchar(100) NOT NULL,
  `teachname` varchar(100) NOT NULL,
  `feedback` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staffsem2`
--

INSERT INTO `staffsem2` (`subname`, `teachname`, `feedback`) VALUES
('COMP. SCI', 'Mrs.Dimple', ''),
('PHY', 'Mrs. Reet', ''),
('BEEE', 'Mrs. Gagan', ''),
('HUMAN VALUES', 'Mrs. Neha', ''),
('M2 ', 'Mr.Jetinder', '');

-- --------------------------------------------------------

--
-- Table structure for table `staffsem3`
--

CREATE TABLE IF NOT EXISTS `staffsem3` (
  `subname` varchar(100) DEFAULT NULL,
  `teachname` varchar(100) DEFAULT NULL,
  `feedback` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staffsem3`
--

INSERT INTO `staffsem3` (`subname`, `teachname`, `feedback`) VALUES
('DESC Maths ', 'Ms.Navneet', ''),
('DATA STRUCTURE', 'Mrs.Sweety', ''),
('CA', 'Mrs. Shifalli', ''),
('OOPS', 'Mrs.Anjali', ''),
('DCID', 'Mrs.Gurveer', '');

-- --------------------------------------------------------

--
-- Table structure for table `staffsem4`
--

CREATE TABLE IF NOT EXISTS `staffsem4` (
  `subname` varchar(100) DEFAULT NULL,
  `teachname` varchar(100) DEFAULT NULL,
  `feedback` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staffsem4`
--

INSERT INTO `staffsem4` (`subname`, `teachname`, `feedback`) VALUES
('OS', 'Ms.Monika', ''),
('MP', 'Ms.Reeta', ''),
('CN', 'Ms.Rupra', ''),
('SP', 'Ms.Panuath', ''),
('MATHS 3', 'Ms.Indu', '');

-- --------------------------------------------------------

--
-- Table structure for table `staffsem5`
--

CREATE TABLE IF NOT EXISTS `staffsem5` (
  `subname` varchar(100) DEFAULT NULL,
  `teachname` varchar(100) DEFAULT NULL,
  `feedback` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staffsem5`
--

INSERT INTO `staffsem5` (`subname`, `teachname`, `feedback`) VALUES
('DAA', 'Mr.Pavitar', ''),
('CG', 'Ms.Bindu', ''),
('GN2', 'Mr.Prabhkar', ''),
('DEN', 'Mr.Himanshu', ''),
('EVS', 'Mrs. Ammy', '');

-- --------------------------------------------------------

--
-- Table structure for table `staffsem6`
--

CREATE TABLE IF NOT EXISTS `staffsem6` (
  `subname` varchar(100) DEFAULT NULL,
  `teachname` varchar(100) DEFAULT NULL,
  `feedback` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staffsem6`
--

INSERT INTO `staffsem6` (`subname`, `teachname`, `feedback`) VALUES
('CPI', 'Ms.Jhanvi', ''),
('IWT', 'Mr.Santoosh', ''),
('BIT', 'Ms.Padma', ''),
('VISUAL BASIC', 'MsNeelam', ''),
('SC', 'Ms.Meenakshi', '');

-- --------------------------------------------------------

--
-- Table structure for table `staffsem7`
--

CREATE TABLE IF NOT EXISTS `staffsem7` (
  `subname` varchar(100) DEFAULT NULL,
  `teachname` varchar(100) DEFAULT NULL,
  `feedback` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staffsem7`
--

INSERT INTO `staffsem7` (`subname`, `teachname`, `feedback`) VALUES
('BE', 'Ms.Anita', ''),
('PHYSICS', 'Ms.Sneh', ''),
('DSPM', 'Ms.Sanju', ''),
('MATHS', 'Ms.Shammi', ''),
('ATM', 'Ms.Khushi', '');

-- --------------------------------------------------------

--
-- Table structure for table `staffsem8`
--

CREATE TABLE IF NOT EXISTS `staffsem8` (
  `subname` varchar(100) DEFAULT NULL,
  `teachname` varchar(100) DEFAULT NULL,
  `feedback` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staffsem8`
--


-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `name` longtext NOT NULL,
  `email` varchar(100) NOT NULL,
  `phno` bigint(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `phno` (`phno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`name`, `email`, `phno`, `password`) VALUES
('Piyush', 'gargpiyush195@gmail.com', 9023481563, 'hi123456');
