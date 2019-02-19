-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2019 at 01:12 AM
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
('FA1673', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA2099', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA3925', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA4255', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA5121', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA5167', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA6340', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA6924', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA7713', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA8019', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA8268', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20),
('FA879', 'HeadOffice', '1604 North Ave.', 'Chicago', 'IL', '60600', 'Office', 50),
('FA9462', 'Branch', '1804 South Ave.', 'Wheathon', 'IL', '60603', 'Office', 20);

-- --------------------------------------------------------

--
-- Table structure for table `inspection`
--

CREATE TABLE `inspection` (
  `InspectionID` varchar(25) NOT NULL,
  `DateFrom` date DEFAULT NULL,
  `DateTo` date DEFAULT NULL,
  `UserID` varchar(25) DEFAULT NULL,
  `FacilityID` varchar(25) DEFAULT NULL,
  `InspectionType` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
('MO6201', '2019-02-18', 'Filled'),
('MO7075', '2019-02-18', 'Filled'),
('MO7591', '2019-02-18', 'Filled');

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
('MR304', 'Chair Broken', '2019-02-18', 'USR6272', 'RM5516', NULL),
('MR3686', 'Chair Broken', '2019-02-18', 'USR1804', 'RM2600', NULL),
('MR6370', 'Chair Broken', '2019-02-18', 'USR8652', 'RM4099', NULL),
('MR6412', 'Chair Broken', '2019-02-18', 'USR7298', 'RM4639', 'MO7075'),
('MR8958', 'Chair Broken', '2019-02-18', 'USR1915', 'RM3861', NULL);

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
('PH1028', '304', 'VP Office phone number', 'FA8268'),
('PH1640', '504', 'Reception phone number', 'FA2099'),
('PH1876', '304', 'VP Office phone number', 'FA8019'),
('PH1921', '304', 'VP Office phone number', 'FA3925'),
('PH198', '504', 'Reception phone number', 'FA9462'),
('PH2189', '304', 'VP Office phone number', 'FA6340'),
('PH2339', '504', 'Reception phone number', 'FA6340'),
('PH2482', '304', 'VP Office phone number', 'FA1673'),
('PH4600', '304', 'VP Office phone number', 'FA5167'),
('PH4728', '504', 'Reception phone number', 'FA1673'),
('PH4865', '304', 'VP Office phone number', 'FA5121'),
('PH4960', '504', 'Reception phone number', 'FA3925'),
('PH5266', '504', 'Reception phone number', 'FA5167'),
('PH5421', '304', 'VP Office phone number', 'FA7713'),
('PH5886', '304', 'VP Office phone number', 'FA4255'),
('PH6512', '504', 'Reception phone number', 'FA8268'),
('PH7016', '504', 'Reception phone number', 'FA6924'),
('PH7095', '204', 'Reception phone number', 'FA879'),
('PH7166', '504', 'Reception phone number', 'FA4255'),
('PH8212', '104', 'Security phone number', 'FA879'),
('PH8785', '304', 'VP Office phone number', 'FA2099'),
('PH9233', '504', 'Reception phone number', 'FA5121'),
('PH9240', '504', 'Reception phone number', 'FA8019'),
('PH9299', '304', 'VP Office phone number', 'FA9462'),
('PH9665', '304', 'VP Office phone number', 'FA6924'),
('PH9745', '504', 'Reception phone number', 'FA7713');

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
('RM1183', 'Conference', 'FA9462'),
('RM1371', 'Conference', 'FA6924'),
('RM2290', 'Conference', 'FA6340'),
('RM2600', 'Training Room', 'FA2099'),
('RM3010', 'Conference', 'FA2099'),
('RM3373', 'Conference', 'FA5121'),
('RM3861', 'Training Room', 'FA3925'),
('RM4099', 'Training Room', 'FA7713'),
('RM4425', 'Conference', 'FA8268'),
('RM4639', 'Training Room', 'FA1673'),
('RM4761', 'Training Room', 'FA6340'),
('RM4903', 'Training Room', 'FA8268'),
('RM4942', 'Conference', 'FA879'),
('RM5516', 'Training Room', 'FA8019'),
('RM5843', 'Conference', 'FA8019'),
('RM6258', 'Training Room', 'FA5121'),
('RM6658', 'Meeting', 'FA879'),
('RM7245', 'Training Room', 'FA9462'),
('RM7288', 'Conference', 'FA7713'),
('RM744', 'Training Room', 'FA5167'),
('RM769', 'Conference', 'FA3925'),
('RM8028', 'Conference', 'FA5167'),
('RM8324', 'Conference', 'FA1673'),
('RM8656', 'Training Room', 'FA4255'),
('RM8774', 'Training Room', 'FA6924'),
('RM9379', 'Conference', 'FA4255');

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
('USR1804', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR1915', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR30', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR6272', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR7298', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR7796', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR8151', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee'),
('USR8652', 'Peter', '7735581010', '3510 North Street, Chicago,IL', 'Employee');

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
