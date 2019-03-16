-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 17, 2019 at 12:51 AM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 7.2.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fms`
--

-- --------------------------------------------------------

--
-- Table structure for table `building`
--

CREATE TABLE `building` (
  `FacilityID` varchar(25) NOT NULL,
  `FacilityName` varchar(25) DEFAULT NULL,
  `Address` varchar(30) DEFAULT NULL,
  `City` varchar(20) DEFAULT NULL,
  `State` char(2) DEFAULT NULL,
  `ZipCode` varchar(10) DEFAULT NULL,
  `Type` varchar(25) DEFAULT NULL,
  `Capacity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `building`
--

INSERT INTO `building` (`FacilityID`, `FacilityName`, `Address`, `City`, `State`, `ZipCode`, `Type`, `Capacity`) VALUES
('FA1095', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA1164', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA1177', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA123', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA12461', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 30),
('FA12465', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA1336', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA1361', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA1373', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA1408', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA1673', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA1678', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA1692', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA1922', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA1959', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA2005', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA2099', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA2102', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA2172', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA2191', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA2218', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA222', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA229', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA2420', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA2457', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA247', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA2660', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA2669', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA2945', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA2980', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA3070', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA3108', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA311', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA3120', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA3129', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA3186', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA3263', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA3360', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA3377', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA3450', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA3613', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA3698', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA3818', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA3822', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA3840', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA3851', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA3925', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA3969', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA399', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA4019', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA4092', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA4164', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA4191', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA4192', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA4210', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA4245', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA4255', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA4346', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA4350', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA4568', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA4575', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA4584', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA4660', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA4690', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA4716', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA4742', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA4980', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA5058', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA5090', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA5121', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA5167', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA5249', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA5340', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA5466', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA5638', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA5882', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA5903', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA5907', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA5974', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA5998', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA618', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA6194', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA6199', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA6246', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA6289', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA6340', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA6406', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA6421', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA6490', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA6538', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA6685', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA670', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA6718', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA6748', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA6796', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA6873', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA6882', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA6924', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA6983', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA7131', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA7174', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA7237', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA7275', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA7293', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA745', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA7637', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA7708', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA7713', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA7714', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA7987', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA7990', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA7998', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA8019', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA811', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA8139', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA8153', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA8268', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA8402', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA8407', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA8474', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA8665', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA8669', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA879', 'HeadOffice', '1604 North Ave.', 'Chicago', 'IL', '60600', 'Office', 50),
('FA8799', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA8818', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA8842', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA891', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA8977', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA898', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA9035', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA9051', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA923', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA9240', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA934', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA9362', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA9399', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA9405', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA9416', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA9462', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA9496', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA957', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA9736', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA974', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA9741', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20);

-- --------------------------------------------------------

--
-- Table structure for table `inspection`
--

CREATE TABLE `inspection` (
  `InspectionID` varchar(25) NOT NULL,
  `DateFrom` date DEFAULT NULL,
  `DateTo` date DEFAULT NULL,
  `FacilityID` varchar(25) DEFAULT NULL,
  `InspectionType` varchar(25) DEFAULT NULL,
  `InspectedBy` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inspection`
--

INSERT INTO `inspection` (`InspectionID`, `DateFrom`, `DateTo`, `FacilityID`, `InspectionType`, `InspectedBy`) VALUES
('IN3161', '2019-03-01', '2019-03-15', 'FA9741', 'Structure', 'Namipp Corp.'),
('IN3210', '2019-03-01', '2019-03-15', 'FA8818', 'Structure', 'Namipp Corp.'),
('IN3632', '2019-03-01', '2019-03-15', 'FA745', 'Structure', 'Namipp Corp.'),
('IN4137', '2019-03-01', '2019-03-15', 'FA9736', 'Structure', 'Namipp Corp.'),
('IN5916', '2019-03-01', '2019-03-15', 'FA4660', 'Structure', 'Namipp Corp.'),
('IN6431', '2019-03-01', '2019-03-15', 'FA3129', 'Structure', 'Namipp Corp.'),
('IN6942', '2019-03-01', '2019-03-15', 'FA5907', 'Structure', ''),
('IN8155', '2019-03-01', '2019-03-15', 'FA4019', 'Structure', 'Namipp Corp.'),
('IN8388', '2019-03-01', '2019-03-15', 'FA891', 'Structure', 'Namipp Corp.'),
('IN9048', '2019-03-01', '2019-03-15', 'FA3822', 'Structure', 'Namipp Corp.'),
('IN9073', '2019-03-01', '2019-03-15', 'FA2945', 'Structure', 'Namipp Corp.');

-- --------------------------------------------------------

--
-- Table structure for table `inuse`
--

CREATE TABLE `inuse` (
  `UsageID` varchar(25) NOT NULL,
  `Rstatus` varchar(25) DEFAULT NULL,
  `ReserveID` varchar(25) DEFAULT NULL,
  `RoomID` varchar(25) DEFAULT NULL,
  `UserID` varchar(25) DEFAULT NULL,
  `UsedInInterval` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inuse`
--

INSERT INTO `inuse` (`UsageID`, `Rstatus`, `ReserveID`, `RoomID`, `UserID`, `UsedInInterval`) VALUES
('US2137', 'Vacant', 'RE7588', 'RM6149', 'USR9371', 0),
('US3332', 'Vacant', 'RE1178', 'RM1885', 'USR3919', 0),
('US7605', 'Vacant', 'RE6390', 'RM9577', 'USR3830', 0);

-- --------------------------------------------------------

--
-- Table structure for table `maintenance`
--

CREATE TABLE `maintenance` (
  `MaintenanceID` varchar(25) NOT NULL,
  `Type` varchar(25) DEFAULT NULL,
  `MaintenanceStart` date DEFAULT NULL,
  `MaintenanceEnd` date DEFAULT NULL,
  `Cost` double DEFAULT NULL,
  `SStatus` varchar(25) DEFAULT NULL,
  `ScheduleID` varchar(25) DEFAULT NULL,
  `MOrderID` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `maintenance`
--

INSERT INTO `maintenance` (`MaintenanceID`, `Type`, `MaintenanceStart`, `MaintenanceEnd`, `Cost`, `SStatus`, `ScheduleID`, `MOrderID`) VALUES
('MN3987', 'Engineering', '2019-03-02', '2019-03-16', 10004.75, 'InProcess', 'SC5067', 'MO3833'),
('MN4476', 'Engineering', '2019-03-02', '2019-03-16', 10004.75, 'InProcess', 'SC5775', 'MO6296'),
('MN4937', 'Engineering', '2019-03-02', '2019-03-16', 10004.75, 'InProcess', 'SC8251', 'MO4315'),
('MN9218', 'Engineering', '2019-03-02', '2019-03-16', 10004.75, 'InProcess', 'SC4874', 'MO1139');

-- --------------------------------------------------------

--
-- Table structure for table `maintenanceorder`
--

CREATE TABLE `maintenanceorder` (
  `MOrderID` varchar(25) NOT NULL,
  `Orderdate` date NOT NULL,
  `MStatus` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `maintenanceorder`
--

INSERT INTO `maintenanceorder` (`MOrderID`, `Orderdate`, `MStatus`) VALUES
('MO1139', '2019-02-18', 'Filled'),
('MO3833', '2019-02-18', 'Filled'),
('MO4315', '2019-02-18', 'Filled'),
('MO6296', '2019-02-18', 'Filled');

-- --------------------------------------------------------

--
-- Table structure for table `maintenancereq`
--

CREATE TABLE `maintenancereq` (
  `RequestID` varchar(25) NOT NULL,
  `Description` varchar(25) DEFAULT NULL,
  `RequestDate` date DEFAULT NULL,
  `UserID` varchar(25) DEFAULT NULL,
  `RoomID` varchar(25) DEFAULT NULL,
  `MOrderID` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `maintenancereq`
--

INSERT INTO `maintenancereq` (`RequestID`, `Description`, `RequestDate`, `UserID`, `RoomID`, `MOrderID`) VALUES
('MR1236', 'Chair Broken', '2019-02-18', 'USR5612', 'RM5109', NULL),
('MR20', 'Chair Broken', '2019-02-18', 'USR5303', 'RM1275', 'MO6296'),
('MR6623', 'Chair Broken', '2019-02-18', 'USR4667', 'RM8853', NULL),
('MR7689', 'Chair Broken', '2019-02-18', 'USR9519', 'RM60', NULL),
('MR7944', 'Chair Broken', '2019-02-18', 'USR3919', 'RM1885', 'MO1139'),
('MR7961', 'Chair Broken', '2019-02-18', 'USR3830', 'RM9577', 'MO3833'),
('MR7999', 'Chair Broken', '2019-02-18', 'USR7339', 'RM5255', NULL),
('MR8859', 'Chair Broken', '2019-02-18', 'USR9371', 'RM6149', 'MO4315'),
('MR9087', 'Chair Broken', '2019-02-18', 'USR3520', 'RM8831', NULL),
('MR9791', 'Chair Broken', '2019-02-18', 'USR5450', 'RM456', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `maintenanceschedule`
--

CREATE TABLE `maintenanceschedule` (
  `ScheduleID` varchar(25) NOT NULL,
  `DateFrom` date DEFAULT NULL,
  `DateTo` date DEFAULT NULL,
  `MOrderID` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `maintenanceschedule`
--

INSERT INTO `maintenanceschedule` (`ScheduleID`, `DateFrom`, `DateTo`, `MOrderID`) VALUES
('SC1046', '2019-03-01', '2019-03-15', 'MO9183'),
('SC108', '2019-03-01', '2019-03-15', 'MO3046'),
('SC1131', '2019-03-01', '2019-03-15', 'MO5937'),
('SC1281', '2019-03-01', '2019-03-15', 'MO8170'),
('SC1360', '2019-03-01', '2019-03-15', 'MO4593'),
('SC1374', '2019-03-01', '2019-03-15', 'MO6805'),
('SC1490', '2019-03-01', '2019-03-15', 'MO685'),
('SC1578', '2019-03-01', '2019-03-15', 'MO3475'),
('SC1610', '2019-03-01', '2019-03-15', 'MO6049'),
('SC1634', '2019-03-01', '2019-03-15', 'MO5682'),
('SC1716', '2019-03-01', '2019-03-15', 'MO1635'),
('SC1775', '2019-03-01', '2019-03-15', 'MO6137'),
('SC1850', '2019-03-01', '2019-03-15', 'MO4955'),
('SC1897', '2019-03-01', '2019-03-15', 'MO8275'),
('SC1955', '2019-03-01', '2019-03-15', 'MO3667'),
('SC2101', '2019-03-01', '2019-03-15', 'MO772'),
('SC2143', '2019-03-01', '2019-03-15', 'MO754'),
('SC2191', '2019-03-01', '2019-03-15', 'MO4399'),
('SC2202', '2019-03-01', '2019-03-15', 'MO9567'),
('SC2209', '2019-03-01', '2019-03-15', 'MO7970'),
('SC2288', '2019-03-01', '2019-03-15', 'MO3960'),
('SC2389', '2019-03-01', '2019-03-15', 'MO1813'),
('SC2438', '2019-03-01', '2019-03-15', 'MO7865'),
('SC2697', '2019-03-01', '2019-03-15', 'MO2834'),
('SC2781', '2019-03-01', '2019-03-15', 'MO1753'),
('SC2788', '2019-03-01', '2019-03-15', 'MO7360'),
('SC2824', '2019-03-01', '2019-03-15', 'MO6296'),
('SC2871', '2019-03-01', '2019-03-15', 'MO860'),
('SC2915', '2019-03-01', '2019-03-15', 'MO162'),
('SC3049', '2019-03-01', '2019-03-15', 'MO167'),
('SC3354', '2019-03-01', '2019-03-15', 'MO7546'),
('SC3357', '2019-03-01', '2019-03-15', 'MO8010'),
('SC3369', '2019-03-01', '2019-03-15', 'MO3884'),
('SC3617', '2019-03-01', '2019-03-15', 'MO6027'),
('SC3728', '2019-03-01', '2019-03-15', 'MO7394'),
('SC3801', '2019-03-01', '2019-03-15', 'MO853'),
('SC3822', '2019-03-01', '2019-03-15', 'MO8282'),
('SC386', '2019-03-01', '2019-03-15', 'MO6645'),
('SC3873', '2019-03-01', '2019-03-15', 'MO6156'),
('SC4076', '2019-03-01', '2019-03-15', 'MO2105'),
('SC4096', '2019-03-01', '2019-03-15', 'MO5172'),
('SC4169', '2019-03-01', '2019-03-15', 'MO6945'),
('SC4346', '2019-03-01', '2019-03-15', 'MO6512'),
('SC4462', '2019-03-01', '2019-03-15', 'MO7210'),
('SC4544', '2019-03-01', '2019-03-15', 'MO7918'),
('SC468', '2019-03-01', '2019-03-15', 'MO1025'),
('SC4755', '2019-03-01', '2019-03-15', 'MO4049'),
('SC4770', '2019-03-01', '2019-03-15', 'MO6495'),
('SC4874', '2019-03-01', '2019-03-15', 'MO1139'),
('SC4925', '2019-03-01', '2019-03-15', 'MO1145'),
('SC4997', '2019-03-01', '2019-03-15', 'MO6744'),
('SC5010', '2019-03-01', '2019-03-15', 'MO7636'),
('SC5067', '2019-03-01', '2019-03-15', 'MO3833'),
('SC5095', '2019-03-01', '2019-03-15', 'MO1375'),
('SC5101', '2019-03-01', '2019-03-15', 'MO3840'),
('SC5155', '2019-03-01', '2019-03-15', 'MO3519'),
('SC5204', '2019-03-01', '2019-03-15', 'MO3100'),
('SC5395', '2019-03-01', '2019-03-15', 'MO9278'),
('SC5428', '2019-03-01', '2019-03-15', 'MO2210'),
('SC5544', '2019-03-01', '2019-03-15', 'MO7812'),
('SC5763', '2019-03-01', '2019-03-15', 'MO7467'),
('SC5774', '2019-03-01', '2019-03-15', 'MO2916'),
('SC5775', '2019-03-01', '2019-03-15', 'MO6296'),
('SC5827', '2019-03-01', '2019-03-15', 'MO5918'),
('SC5828', '2019-03-01', '2019-03-15', 'MO9186'),
('SC5829', '2019-03-01', '2019-03-15', 'MO8405'),
('SC5889', '2019-03-01', '2019-03-15', 'MO4136'),
('SC5906', '2019-03-01', '2019-03-15', 'MO5310'),
('SC5994', '2019-03-01', '2019-03-15', 'MO7771'),
('SC6261', '2019-03-01', '2019-03-15', 'MO4745'),
('SC6359', '2019-03-01', '2019-03-15', 'MO1599'),
('SC6519', '2019-03-01', '2019-03-15', 'MO1178'),
('SC6617', '2019-03-01', '2019-03-15', 'MO3980'),
('SC6685', '2019-03-01', '2019-03-15', 'MO1088'),
('SC6829', '2019-03-01', '2019-03-15', 'MO8360'),
('SC6954', '2019-03-01', '2019-03-15', 'MO9859'),
('SC7015', '2019-03-01', '2019-03-15', 'MO7457'),
('SC7059', '2019-03-01', '2019-03-15', 'MO5978'),
('SC7202', '2019-03-01', '2019-03-15', 'MO3304'),
('SC7271', '2019-03-01', '2019-03-15', 'MO1142'),
('SC7589', '2019-03-01', '2019-03-15', 'MO1910'),
('SC7597', '2019-03-01', '2019-03-15', 'MO3948'),
('SC7665', '2019-03-01', '2019-03-15', 'MO1521'),
('SC7770', '2019-03-01', '2019-03-15', 'MO9243'),
('SC7834', '2019-03-01', '2019-03-15', 'MO1965'),
('SC7917', '2019-03-01', '2019-03-15', 'MO6963'),
('SC7924', '2019-03-01', '2019-03-15', 'MO8802'),
('SC7987', '2019-03-01', '2019-03-15', 'MO1319'),
('SC805', '2019-03-01', '2019-03-15', 'MO1765'),
('SC8070', '2019-03-01', '2019-03-15', 'MO5621'),
('SC8134', '2019-03-01', '2019-03-15', 'MO4136'),
('SC8154', '2019-03-01', '2019-03-15', 'MO8510'),
('SC8251', '2019-03-01', '2019-03-15', 'MO4315'),
('SC8285', '2019-03-01', '2019-03-15', 'MO2259'),
('SC8541', '2019-03-01', '2019-03-15', 'MO641'),
('SC8596', '2019-03-01', '2019-03-15', 'MO3840'),
('SC8598', '2019-03-01', '2019-03-15', 'MO5588'),
('SC8601', '2019-03-01', '2019-03-15', 'MO5793'),
('SC8642', '2019-03-01', '2019-03-15', 'MO8554'),
('SC8688', '2019-03-01', '2019-03-15', 'MO7812'),
('SC8750', '2019-03-01', '2019-03-15', 'MO3354'),
('SC8836', '2019-03-01', '2019-03-15', 'MO2688'),
('SC8983', '2019-03-01', '2019-03-15', 'MO4286'),
('SC9081', '2019-03-01', '2019-03-15', 'MO9893'),
('SC9082', '2019-03-01', '2019-03-15', 'MO5495'),
('SC9145', '2019-03-01', '2019-03-15', 'MO3028'),
('SC9169', '2019-03-01', '2019-03-15', 'MO3909'),
('SC9347', '2019-03-01', '2019-03-15', 'MO6227'),
('SC9437', '2019-03-01', '2019-03-15', 'MO5198'),
('SC9474', '2019-03-01', '2019-03-15', 'MO173'),
('SC9515', '2019-03-01', '2019-03-15', 'MO3502'),
('SC9588', '2019-03-01', '2019-03-15', 'MO5545'),
('SC9782', '2019-03-01', '2019-03-15', 'MO8157'),
('SC9905', '2019-03-01', '2019-03-15', 'MO5428');

-- --------------------------------------------------------

--
-- Table structure for table `phone`
--

CREATE TABLE `phone` (
  `PhoneID` varchar(25) NOT NULL,
  `PhoneNumber` varchar(25) DEFAULT NULL,
  `Description` varchar(30) DEFAULT NULL,
  `FacilityID` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `phone`
--

INSERT INTO `phone` (`PhoneID`, `PhoneNumber`, `Description`, `FacilityID`) VALUES
('PH1890', '504', 'Reception phone number', 'FA4660'),
('PH1968', '504', 'Reception phone number', 'FA9741'),
('PH2004', '504', 'Reception phone number', 'FA3377'),
('PH2080', '504', 'Reception phone number', 'FA8818'),
('PH2092', '304', 'VP Office phone number', 'FA3822'),
('PH241', '304', 'VP Office phone number', 'FA2945'),
('PH2426', '504', 'Reception phone number', 'FA7275'),
('PH2815', '304', 'VP Office phone number', 'FA4164'),
('PH2823', '304', 'VP Office phone number', 'FA745'),
('PH331', '504', 'Reception phone number', 'FA2005'),
('PH3465', '304', 'VP Office phone number', 'FA3129'),
('PH3737', '304', 'VP Office phone number', 'FA9736'),
('PH3812', '304', 'VP Office phone number', 'FA4092'),
('PH3839', '304', 'VP Office phone number', 'FA9741'),
('PH4114', '504', 'Reception phone number', 'FA4019'),
('PH4372', '504', 'Reception phone number', 'FA4164'),
('PH4722', '304', 'VP Office phone number', 'FA3377'),
('PH4839', '504', 'Reception phone number', 'FA5907'),
('PH4863', '504', 'Reception phone number', 'FA3129'),
('PH499', '304', 'VP Office phone number', 'FA7275'),
('PH5425', '504', 'Reception phone number', 'FA3822'),
('PH6422', '504', 'Reception phone number', 'FA4092'),
('PH6424', '304', 'VP Office phone number', 'FA5907'),
('PH6440', '504', 'Reception phone number', 'FA2945'),
('PH7086', '304', 'VP Office phone number', 'FA4019'),
('PH7149', '504', 'Reception phone number', 'FA745'),
('PH7335', '304', 'VP Office phone number', 'FA2005'),
('PH7711', '304', 'VP Office phone number', 'FA8818'),
('PH7837', '504', 'Reception phone number', 'FA9736'),
('PH8080', '504', 'Reception phone number', 'FA891'),
('PH8589', '304', 'VP Office phone number', 'FA4660'),
('PH9555', '304', 'VP Office phone number', 'FA891');

-- --------------------------------------------------------

--
-- Table structure for table `reserve`
--

CREATE TABLE `reserve` (
  `ReserveID` varchar(25) NOT NULL,
  `DateFrom` date NOT NULL,
  `DateTo` date NOT NULL,
  `UserID` varchar(25) DEFAULT NULL,
  `Rstatus` varchar(25) DEFAULT NULL,
  `RoomID` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reserve`
--

INSERT INTO `reserve` (`ReserveID`, `DateFrom`, `DateTo`, `UserID`, `Rstatus`, `RoomID`) VALUES
('RE1178', '2019-03-01', '2019-03-15', 'USR3919', 'Cancelled', 'RM1885'),
('RE6390', '2019-03-01', '2019-03-15', 'USR3830', 'Cancelled', 'RM9577'),
('RE7588', '2019-03-01', '2019-03-15', 'USR9371', 'Cancelled', 'RM6149');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `RoomID` varchar(25) NOT NULL,
  `RoomType` varchar(25) DEFAULT NULL,
  `FacilityID` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`RoomID`, `RoomType`, `FacilityID`) VALUES
('RM1009', 'Training Room', 'FA6199'),
('RM103', 'Training Room', 'FA4575'),
('RM1036', 'Conference', 'FA670'),
('RM1103', 'Conference', 'FA3070'),
('RM1183', 'Conference', 'FA9462'),
('RM1267', 'Training Room', 'FA5090'),
('RM1275', 'Training Room', 'FA9741'),
('RM1371', 'Conference', 'FA6924'),
('RM1395', 'Conference', 'FA8665'),
('RM1502', 'Training Room', 'FA8665'),
('RM151', 'Training Room', 'FA4660'),
('RM1519', 'Training Room', 'FA7637'),
('RM1730', 'Conference', 'FA7987'),
('RM1850', 'Conference', 'FA7990'),
('RM1873', 'Training Room', 'FA9035'),
('RM1885', 'Training Room', 'FA5907'),
('RM2163', 'Conference', 'FA6538'),
('RM2176', 'Training Room', 'FA6406'),
('RM2281', 'Training Room', 'FA9496'),
('RM2290', 'Conference', 'FA6340'),
('RM2324', 'Training Room', 'FA6194'),
('RM2474', 'Training Room', 'FA3070'),
('RM2538', 'Training Room', 'FA1373'),
('RM2560', 'Training Room', 'FA229'),
('RM2592', 'Conference', 'FA9496'),
('RM2600', 'Training Room', 'FA2099'),
('RM2607', 'Training Room', 'FA6718'),
('RM2628', 'Training Room', 'FA9405'),
('RM2709', 'Conference', 'FA8153'),
('RM2786', 'Conference', 'FA6873'),
('RM2810', 'Conference', 'FA9416'),
('RM2851', 'Conference', 'FA4584'),
('RM2875', 'Conference', 'FA6194'),
('RM2896', 'Conference', 'FA9240'),
('RM2950', 'Conference', 'FA229'),
('RM3010', 'Conference', 'FA2099'),
('RM3075', 'Training Room', 'FA9362'),
('RM3079', 'Conference', 'FA7131'),
('RM3141', 'Conference', 'FA891'),
('RM3373', 'Conference', 'FA5121'),
('RM3402', 'Conference', 'FA9741'),
('RM3413', 'Conference', 'FA2191'),
('RM3441', 'Training Room', 'FA4350'),
('RM3496', 'Training Room', 'FA4742'),
('RM3641', 'Training Room', 'FA4210'),
('RM3806', 'Conference', 'FA4716'),
('RM3861', 'Training Room', 'FA3925'),
('RM3868', 'Training Room', 'FA3377'),
('RM3879', 'Training Room', 'FA3263'),
('RM3937', 'Training Room', 'FA2005'),
('RM3973', 'Conference', 'FA4690'),
('RM4034', 'Conference', 'FA6882'),
('RM4059', 'Conference', 'FA5882'),
('RM4063', 'Conference', 'FA9051'),
('RM4099', 'Training Room', 'FA7713'),
('RM4321', 'Conference', 'FA2005'),
('RM4354', 'Training Room', 'FA3818'),
('RM4358', 'Training Room', 'FA891'),
('RM4368', 'Training Room', 'FA6796'),
('RM4372', 'Conference', 'FA3840'),
('RM4425', 'Conference', 'FA8268'),
('RM446', 'Training Room', 'FA3840'),
('RM4551', 'Conference', 'FA3108'),
('RM456', 'Training Room', 'FA8818'),
('RM4620', 'Conference', 'FA745'),
('RM4633', 'Training Room', 'FA6983'),
('RM4639', 'Training Room', 'FA1673'),
('RM468', 'Conference', 'FA3186'),
('RM4683', 'Training Room', 'FA4690'),
('RM4698', 'Training Room', 'FA7131'),
('RM4707', 'Training Room', 'FA1361'),
('RM4729', 'Training Room', 'FA1095'),
('RM4761', 'Training Room', 'FA6340'),
('RM4903', 'Training Room', 'FA8268'),
('RM4942', 'Conference', 'FA879'),
('RM4991', 'Conference', 'FA6983'),
('RM5005', 'Conference', 'FA2945'),
('RM5065', 'Training Room', 'FA7708'),
('RM51', 'Conference', 'FA957'),
('RM5109', 'Training Room', 'FA4164'),
('RM5126', 'Conference', 'FA7637'),
('RM5234', 'Training Room', 'FA1959'),
('RM5255', 'Training Room', 'FA745'),
('RM5262', 'Conference', 'FA1959'),
('RM5381', 'Conference', 'FA4660'),
('RM5394', 'Conference', 'FA4245'),
('RM5402', 'Conference', 'FA934'),
('RM5453', 'Training Room', 'FA9399'),
('RM5516', 'Training Room', 'FA8019'),
('RM5542', 'Conference', 'FA4210'),
('RM5564', 'Conference', 'FA2457'),
('RM5640', 'Training Room', 'FA3186'),
('RM5784', 'Conference', 'FA6406'),
('RM5807', 'Training Room', 'FA6873'),
('RM5843', 'Conference', 'FA8019'),
('RM5866', 'Conference', 'FA2660'),
('RM5915', 'Training Room', 'FA1164'),
('RM5968', 'Training Room', 'FA8153'),
('RM60', 'Training Room', 'FA9736'),
('RM6000', 'Training Room', 'FA4346'),
('RM6018', 'Conference', 'FA9362'),
('RM6036', 'Training Room', 'FA9416'),
('RM6102', 'Training Room', 'FA974'),
('RM6103', 'Training Room', 'FA3120'),
('RM6128', 'Conference', 'FA7708'),
('RM6145', 'Training Room', 'FA7237'),
('RM6149', 'Training Room', 'FA2945'),
('RM616', 'Conference', 'FA3377'),
('RM6225', 'Conference', 'FA9736'),
('RM6232', 'Conference', 'FA1373'),
('RM6247', 'Training Room', 'FA934'),
('RM6258', 'Training Room', 'FA5121'),
('RM634', 'Conference', 'FA9035'),
('RM6377', 'Conference', 'FA3822'),
('RM6462', 'Training Room', 'FA3108'),
('RM6477', 'Training Room', 'FA4092'),
('RM6542', 'Conference', 'FA3818'),
('RM6545', 'Conference', 'FA6199'),
('RM6658', 'Meeting', 'FA879'),
('RM6719', 'Conference', 'FA4575'),
('RM6740', 'Conference', 'FA4164'),
('RM6829', 'Training Room', 'FA8474'),
('RM6862', 'Conference', 'FA8669'),
('RM6874', 'Training Room', 'FA8669'),
('RM6892', 'Training Room', 'FA5882'),
('RM6904', 'Conference', 'FA5907'),
('RM6929', 'Conference', 'FA6748'),
('RM6972', 'Training Room', 'FA9051'),
('RM698', 'Training Room', 'FA2660'),
('RM72', 'Training Room', 'FA222'),
('RM721', 'Conference', 'FA1678'),
('RM7245', 'Training Room', 'FA9462'),
('RM7288', 'Conference', 'FA7713'),
('RM7409', 'Conference', 'FA974'),
('RM7410', 'Conference', 'FA4742'),
('RM7417', 'Conference', 'FA5638'),
('RM744', 'Training Room', 'FA5167'),
('RM765', 'Conference', 'FA8474'),
('RM7676', 'Conference', 'FA3263'),
('RM769', 'Conference', 'FA3925'),
('RM7772', 'Training Room', 'FA6882'),
('RM7840', 'Training Room', 'FA957'),
('RM7888', 'Training Room', 'FA7275'),
('RM7943', 'Conference', 'FA4350'),
('RM7955', 'Training Room', 'FA4716'),
('RM8028', 'Conference', 'FA5167'),
('RM8094', 'Training Room', 'FA2191'),
('RM8212', 'Conference', 'FA6718'),
('RM8243', 'Conference', 'FA3120'),
('RM8274', 'Conference', 'FA9405'),
('RM8324', 'Conference', 'FA1673'),
('RM8360', 'Training Room', 'FA9240'),
('RM8367', 'Training Room', 'FA5638'),
('RM8385', 'Conference', 'FA1164'),
('RM856', 'Training Room', 'FA3851'),
('RM8656', 'Training Room', 'FA4255'),
('RM8774', 'Training Room', 'FA6924'),
('RM8800', 'Conference', 'FA4346'),
('RM8831', 'Training Room', 'FA3822'),
('RM8853', 'Training Room', 'FA4019'),
('RM8966', 'Conference', 'FA4019'),
('RM9056', 'Training Room', 'FA7998'),
('RM9158', 'Conference', 'FA4092'),
('RM9232', 'Training Room', 'FA4245'),
('RM9238', 'Conference', 'FA7275'),
('RM9253', 'Training Room', 'FA7990'),
('RM9375', 'Conference', 'FA3129'),
('RM9379', 'Conference', 'FA4255'),
('RM9384', 'Training Room', 'FA2457'),
('RM9388', 'Training Room', 'FA670'),
('RM9401', 'Training Room', 'FA4584'),
('RM9429', 'Training Room', 'FA6748'),
('RM9440', 'Conference', 'FA1095'),
('RM9503', 'Training Room', 'FA1678'),
('RM9507', 'Training Room', 'FA6538'),
('RM9564', 'Conference', 'FA6796'),
('RM9577', 'Training Room', 'FA3129'),
('RM958', 'Conference', 'FA1361'),
('RM9605', 'Conference', 'FA5090'),
('RM9651', 'Conference', 'FA9399'),
('RM966', 'Conference', 'FA3851'),
('RM9681', 'Conference', 'FA7237'),
('RM9904', 'Conference', 'FA7998'),
('RM9926', 'Training Room', 'FA7987');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `UserID` varchar(25) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `PhoneNumber` varchar(25) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `TypeOfUser` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`UserID`, `Name`, `PhoneNumber`, `Address`, `TypeOfUser`) VALUES
('USR1016', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR1055', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR1158', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR130', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR1357', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR1361', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR1477', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR1672', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR178', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR1804', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR1842', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR1894', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR1915', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR1922', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR1925', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR2047', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR2048', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR2301', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR2347', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR243', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR2485', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR2489', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR2739', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR2826', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR2921', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR30', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3007', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3010', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3017', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3031', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3100', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3127', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3184', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3199', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3201', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3232', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3275', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3280', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3348', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3439', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3520', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3603', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3604', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3634', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3750', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3780', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3785', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3830', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3881', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR3919', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR413', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR4236', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR4329', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR4657', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR4658', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR4663', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR4667', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR472', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR4812', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR4840', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR4846', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR4914', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR4958', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR5119', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR516', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR5214', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR5272', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR5303', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR5404', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR5450', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR5567', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR5612', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR5648', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR5795', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR5800', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR5812', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR5983', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR6095', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR6266', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR6272', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR6278', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR6480', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR6539', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR6568', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR6604', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR6647', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR6739', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR6777', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR6839', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR6874', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR6948', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR7111', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR7184', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR7258', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR7298', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR7339', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR7386', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR7412', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR7796', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR78', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR781', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR7844', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR8083', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR8151', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR8171', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR819', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR8221', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR8279', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR8285', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR8514', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR8526', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR8652', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR8848', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR8907', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR8940', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR8943', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR897', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR9187', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR9202', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR9310', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR9371', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR9381', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR9402', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR9519', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR9527', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR9532', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR9593', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR9867', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR9878', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `building`
--
ALTER TABLE `building`
  ADD PRIMARY KEY (`FacilityID`);

--
-- Indexes for table `inspection`
--
ALTER TABLE `inspection`
  ADD PRIMARY KEY (`InspectionID`),
  ADD KEY `HasI_FK1` (`FacilityID`);

--
-- Indexes for table `inuse`
--
ALTER TABLE `inuse`
  ADD PRIMARY KEY (`UsageID`),
  ADD KEY `HasU_FK1` (`RoomID`);

--
-- Indexes for table `maintenance`
--
ALTER TABLE `maintenance`
  ADD PRIMARY KEY (`MaintenanceID`),
  ADD KEY `HasSe_FK1` (`ScheduleID`);

--
-- Indexes for table `maintenanceorder`
--
ALTER TABLE `maintenanceorder`
  ADD PRIMARY KEY (`MOrderID`);

--
-- Indexes for table `maintenancereq`
--
ALTER TABLE `maintenancereq`
  ADD PRIMARY KEY (`RequestID`),
  ADD KEY `HasReqUser_FK1` (`UserID`),
  ADD KEY `HasReqRoom_FK1` (`RoomID`);

--
-- Indexes for table `maintenanceschedule`
--
ALTER TABLE `maintenanceschedule`
  ADD PRIMARY KEY (`ScheduleID`);

--
-- Indexes for table `phone`
--
ALTER TABLE `phone`
  ADD PRIMARY KEY (`PhoneID`),
  ADD KEY `Has_FK1` (`FacilityID`);

--
-- Indexes for table `reserve`
--
ALTER TABLE `reserve`
  ADD PRIMARY KEY (`ReserveID`,`DateFrom`,`DateTo`),
  ADD KEY `HasRe_FK1` (`RoomID`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`RoomID`),
  ADD KEY `HasR_FK1` (`FacilityID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`UserID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `inspection`
--
ALTER TABLE `inspection`
  ADD CONSTRAINT `HasI_FK1` FOREIGN KEY (`FacilityID`) REFERENCES `building` (`FacilityID`);

--
-- Constraints for table `inuse`
--
ALTER TABLE `inuse`
  ADD CONSTRAINT `HasU_FK1` FOREIGN KEY (`RoomID`) REFERENCES `room` (`RoomID`);

--
-- Constraints for table `maintenance`
--
ALTER TABLE `maintenance`
  ADD CONSTRAINT `HasSe_FK1` FOREIGN KEY (`ScheduleID`) REFERENCES `maintenanceschedule` (`ScheduleID`);

--
-- Constraints for table `maintenancereq`
--
ALTER TABLE `maintenancereq`
  ADD CONSTRAINT `HasReqRoom_FK1` FOREIGN KEY (`RoomID`) REFERENCES `room` (`RoomID`),
  ADD CONSTRAINT `HasReqUser_FK1` FOREIGN KEY (`UserID`) REFERENCES `user` (`UserID`);

--
-- Constraints for table `phone`
--
ALTER TABLE `phone`
  ADD CONSTRAINT `Has_FK1` FOREIGN KEY (`FacilityID`) REFERENCES `building` (`FacilityID`);

--
-- Constraints for table `reserve`
--
ALTER TABLE `reserve`
  ADD CONSTRAINT `HasRe_FK1` FOREIGN KEY (`RoomID`) REFERENCES `room` (`RoomID`);

--
-- Constraints for table `room`
--
ALTER TABLE `room`
  ADD CONSTRAINT `HasR_FK1` FOREIGN KEY (`FacilityID`) REFERENCES `building` (`FacilityID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
