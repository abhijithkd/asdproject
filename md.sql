-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 10, 2020 at 04:38 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.2.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `md`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Shopid` int(20) NOT NULL,
  `ShopName` varchar(20) NOT NULL,
  `Owner Name` varchar(20) NOT NULL,
  `Location` varchar(20) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `email` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Shopid`, `ShopName`, `Owner Name`, `Location`, `Address`, `email`, `Password`) VALUES
(2, 'Archana Medicals', 'Archana M', 'Vaikom', 'Archana Medicals,\nWest Gate,Vaikom\nKottayam', 'archanamed@gmail.com', 'archana'),
(4, 'Joy Medicals', 'Joy ', 'Ernakulam', 'Joy Medicals\nEdappally P O Vytila\nErnakulam', 'joy@gmail.com', 'joy'),
(5, 'Tony Medicals', 'Tony Thomas', 'Cherthala', 'Tony Medicals.\nWest of Iron Bridge\nCherthala', 'tony@gmail.com', 'tony'),
(6, 'asd', 'asd', 'asd', 'asd	', 'asd', 'asd'),
(8, 'a', 'a', 'a', 'a', 'a', 'a'),
(9, 'aaaaaa', 'aaaaaaaaa', 'aaaaaaaaa', 'aaaaaaaaaa', 'aaaaaaaaaaa', 'aaaa'),
(10, 'qqqq', 'qqq', 'qqq', 'qqq', 'qqqq', 'qqq'),
(28, 'www`ww`', 'wwww', 'www', 'w			www', 'wwww', 'wwww'),
(30, 'ttt', 'ttt', 'ttt', 'ttt	', 'ttt', 'ttt'),
(33, 'abc', 'jisy', 'vytila', 'vytillla', 'jisy', '123'),
(36, 'kjk', 'asd', 'asd', 'asd	', 'aaaaaaff', 'asd');

-- --------------------------------------------------------

--
-- Table structure for table `medicines`
--

CREATE TABLE `medicines` (
  `M_id` int(30) NOT NULL,
  `M_Name` varchar(30) NOT NULL,
  `Disease` varchar(30) NOT NULL,
  `Price` int(30) NOT NULL,
  `Stock` int(30) NOT NULL,
  `Shopid` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `medicines`
--

INSERT INTO `medicines` (`M_id`, `M_Name`, `Disease`, `Price`, `Stock`, `Shopid`) VALUES
(15, 'Zyrtec', 'Allergy', 20, 20, '2'),
(16, 'Ibuprofen', 'Headache', 5, 20, '2'),
(18, 'Paracetamol', 'Fever', 5, 70, '5'),
(19, 'paracetamol', 'fever', 5, 20, '2'),
(21, 'Avil', 'Allergy', 10, 30, '2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Shopid`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `medicines`
--
ALTER TABLE `medicines`
  ADD PRIMARY KEY (`M_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `Shopid` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT for table `medicines`
--
ALTER TABLE `medicines`
  MODIFY `M_id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
