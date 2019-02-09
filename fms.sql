-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 09, 2019 at 11:59 PM
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

-- --------------------------------------------------------

--
-- Table structure for table `inspection`
--

CREATE TABLE `inspection` (
  `InspectionID` varchar(25) NOT NULL,
  `DateFrom` date DEFAULT NULL,
  `DateTo` date DEFAULT NULL,
  `InspectedBy` varchar(25) DEFAULT NULL,
  `FacilityID` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `inuse`
--

CREATE TABLE `inuse` (
  `UsageID` varchar(25) NOT NULL,
  `Rstatus` varchar(25) DEFAULT NULL,
  `ReserveID` varchar(25) DEFAULT NULL,
  `RoomID` varchar(25) DEFAULT NULL
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
  `ScheduleID` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `maintenancerequest`
--

CREATE TABLE `maintenancerequest` (
  `RequestID` varchar(25) NOT NULL,
  `Description` varchar(25) DEFAULT NULL,
  `RequestedBy` varchar(25) DEFAULT NULL,
  `RoomID` varchar(25) DEFAULT NULL,
  `ScheduleID` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `maintenanceschedule`
--

CREATE TABLE `maintenanceschedule` (
  `ScheduleID` varchar(25) NOT NULL,
  `DateFrom` date DEFAULT NULL,
  `DateTo` date DEFAULT NULL,
  `MStatus` varchar(25) DEFAULT NULL
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

-- --------------------------------------------------------

--
-- Table structure for table `reserve`
--

CREATE TABLE `reserve` (
  `ReserveID` varchar(25) NOT NULL,
  `DateFrom` date NOT NULL,
  `DateTo` date NOT NULL,
  `ReservedBy` varchar(25) DEFAULT NULL,
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
-- Indexes for table `maintenancerequest`
--
ALTER TABLE `maintenancerequest`
  ADD PRIMARY KEY (`RequestID`),
  ADD KEY `HasReqS_FK1` (`ScheduleID`),
  ADD KEY `HasReqR_FK1` (`RoomID`);

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
-- Constraints for table `maintenancerequest`
--
ALTER TABLE `maintenancerequest`
  ADD CONSTRAINT `HasReqR_FK1` FOREIGN KEY (`RoomID`) REFERENCES `room` (`RoomID`),
  ADD CONSTRAINT `HasReqS_FK1` FOREIGN KEY (`ScheduleID`) REFERENCES `maintenanceschedule` (`ScheduleID`);

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
