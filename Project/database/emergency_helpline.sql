-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 29, 2016 at 03:16 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `emergency_helpline`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`) VALUES
('a1', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `ambulance`
--

CREATE TABLE `ambulance` (
  `id` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `location` varchar(100) NOT NULL,
  `number` varchar(100) NOT NULL,
  `area` varchar(100) NOT NULL,
  `district` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ambulance`
--

INSERT INTO `ambulance` (`id`, `name`, `location`, `number`, `area`, `district`) VALUES
('A1', 'Alif Ambulance Service', '76/A,Ahmed Plaza,West Panthapath', '02-8117576', 'West Panthapath', 'Dhaka'),
('A2', 'Khaled Ambulance Service', '67 Motijheel Rd,Dhaka 1000', '01735-201528', 'Motijheel', 'Dhaka'),
('A3', 'Zoom Ambulance Service', 'House # 15/E,Sobhanbag,Dhanmondi', '02-8117576', 'Dhanmondi', 'Dhaka'),
('A4', 'Desh Ambulance Service', '82,East Ahmed Nagor,Mirpur', '01790-509607', ' Mirpur', 'Dhaka'),
('A5', 'ABC Ambulance', 'sector 3,Uttara,Dhaka 1230', '01630-122275', ' Uttara', 'Dhaka'),
('A6', 'Al-Markazul Islami Ambulance Service', '21/17 Babor Rd,Mohammadpur,Dhaka-1207', '01818-732905', 'Mohammadpur', 'Dhaka'),
('A7', 'Shahid Suhrawardi Hospital Ambulance', 'College Gate,Shymoli,Dhaka', '913000', 'Shymoli', 'Dhaka'),
('A8', 'Cardiac Ambulance Service', '122 Kazi Nazrul Islam Avenue,Shahbagh', '01713-003004', 'Shahbagh', 'Dhaka'),
('A9', 'Freezer Van,JBHF', '55,Sat Masjid Road(Jhigatola Bus Stand)', '9664028-9', 'Dhanmondi', 'Dhaka');

-- --------------------------------------------------------

--
-- Table structure for table `atm`
--

CREATE TABLE `atm` (
  `id` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `location` varchar(100) NOT NULL,
  `number` varchar(100) NOT NULL,
  `area` varchar(100) NOT NULL,
  `district` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `atm`
--

INSERT INTO `atm` (`id`, `name`, `location`, `number`, `area`, `district`) VALUES
('ATM1', 'Standard Chartered Bank ATM', 'Platinum Suites,House # 58,Road 11', '+880 9666-777111', 'Banani', 'Dhaka'),
('ATM10', 'AB Bank Limited ATM', 'House# B/20,Block- E Lalmatia,Dhaka', '+880-2-9560312', 'Lalmatia', 'Dhaka'),
('ATM11', 'AB Bank Limited ATM', '81,VIP Road,Kakrail,Dhaka -1000', '+880-2-9560312', 'Kakrail', 'Dhaka'),
('ATM12', 'AB Bank Limited ATM', '87,Purana Polton Road,Polton,Dhaka', '+880-2-9560312', 'Palton', 'Dhaka'),
('ATM13', 'Dutch-Bangla Bank Limited ATM', '17/E,Modhubagh,Moghbazar', '+880 2-9129290', 'Ramna', 'Dhaka'),
('ATM14', 'Standard Chartered Bank ATM', 'Bir Uttam Samsul Alam Sarak,Dhaka', '+880 9666-777111', 'Motijheel', 'Dhaka'),
('ATM15', 'Trust Bank Limited ATM', 'Bir Uttam Kazi Nuruzzaman Road,Dhaka 1215', '+880 2-8712956', 'Tejgaon', 'Dhaka'),
('ATM16', 'Trust Bank Limited ATM', '9/1,Block-D,Mohammadpur,Salimullah rd', '+880 2-8623401', 'Mohammadpur', 'Dhaka'),
('ATM2', 'Islami Bank Bangladesh Limited ATM', 'Gareeb-e-Nawaz Ave Dhaka 1230', '+880 2-9563040', 'Uttara', 'Dhaka'),
('ATM3', 'Trust Bank Limited ATM', 'Bir Uttam Kazi Nuruzzaman Road,Dhaka 1215', '+880 2-8712956', 'Tejgaon', 'Dhaka'),
('ATM4', 'Dhaka Bank Limited ATM', 'Begum Rokeya Avenue,Dhaka', '+880 2-9554514', 'Pallabi', 'Dhaka'),
('ATM5', 'Dutch-Bangla Bank Limited ATM', '17/E,Modhubagh,Moghbazar,Dhaka ', '+880 2999112', 'Ramna', 'Dhaka'),
('ATM6', 'Al-Arafah Islami Bank Limited ATM', 'Kapasia Bazar,Main Road,Kapasia,Gazipur', '+880-2-7123255-7, 9568007, 9569353', 'Kapasia', 'Dhaka'),
('ATM7', 'Eastern Bank Limited ATM', 'House 15,Lake Drive Road,Dhaka 1230', '9664028-9', 'Uttara', 'Dhaka'),
('ATM8', 'AB Bank Limited ATM', '109,B.B Road,Narayanganj', '+880-2-9560312', 'Narayanganj', 'Dhaka'),
('ATM9', 'AB Bank Limited ATM', '94,New Eskaton Road,Ramna,Dhaka', '+880-2-9560312', 'New Eskaton', 'Dhaka');

-- --------------------------------------------------------

--
-- Table structure for table `fireservice`
--

CREATE TABLE `fireservice` (
  `id` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `location` varchar(100) NOT NULL,
  `number` varchar(100) NOT NULL,
  `area` varchar(100) NOT NULL,
  `district` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fireservice`
--

INSERT INTO `fireservice` (`id`, `name`, `location`, `number`, `area`, `district`) VALUES
('FS1', 'Fire Service & Civil Defence Station', 'Mirpur Rd,Dhaka 1207', '02-9112078', ' Mohammadpur', 'Dhaka'),
('FS10', 'Tongi Fire Station ', 'Dhaka-Mymensingh Hwy,Tongi', '+880 2-9801070', ' Arichpur', 'Dhaka'),
('FS11', 'Keranigonj Fire Station', 'Konakhola Upozila Parishad,Keraniganj', '+880 1709-061731', 'Keraniganj ', 'Dhaka'),
('FS12', 'Gazipur Fire Station', 'Uttar Chhayabithy Road, oydebpur 1700', '+880 2-9262628', 'Gazipur ', 'Dhaka'),
('FS13', 'Sadarghat Fire Service and Civil Defense Station', 'Simson Rd, Dhaka 1100', '+880 2-7119759', 'Kotwali', 'Dhaka'),
('FS14', 'Sutrapur Fire Station', 'R M Dash Rd,Dhaka', '+880 2-7119759', 'Sutrapur ', 'Dhaka'),
('FS15', 'DEPZ Fire Station', 'Nabinagar-Chandra Rd,Baipayl', '+880 1730-002301', 'Nabinagar', 'Dhaka'),
('FS16', 'Demra Fire Station', ' Demra-Ranimohol-Chittagong Rd', '+880 2-7400111', 'Demra', 'Dhaka'),
('FS2', 'Palashi Barrack Fire Station', 'Dhakeshwari Rd,Dhaka 1000', '02-8628688', ' Azimpur', 'Dhaka'),
('FS3', 'Baridhara Fire Station', 'plot 1,Madani Ave,Dhaka 1212', '02-8827397', 'Baridhara DOHS', 'Dhaka'),
('FS4', 'Fire Service and Civil Defense Training Complex', 'Begum Rokeya Sarani,Mirpur-10', '02-9001055', 'Mirpur-10', 'Dhaka'),
('FS5', 'Kurmitola Fire Station', 'Holding-Cantonment,Road-Cantonment Rd', '02-9713399', ' Cantonment', 'Dhaka'),
('FS6', 'Tejgaon Fire Station', 'Shaheed Tajuddin Ahmed Ave', '+880 1730-002226', 'Tejgaon', 'Dhaka'),
('FS7', 'Siddique Bazar Fire Station', '38-46,Kazi Allaudin Rd,Dhaka 1000', '+880 2-9555555 ext. 245', 'LalBagh ', 'Dhaka'),
('FS8', 'Khilgaon Fire Station', 'Siddik Bazar Rd,khilgaon,Dhaka 1219', '+880 2-7218329', 'Khilgaon  ', 'Dhaka'),
('FS9', 'Postogola Fire Station', 'M C Rd,Dhaka', '+880 2-7410771', 'Shyampur ', 'Dhaka');

-- --------------------------------------------------------

--
-- Table structure for table `hospital`
--

CREATE TABLE `hospital` (
  `id` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `location` varchar(100) NOT NULL,
  `number` varchar(100) NOT NULL,
  `area` varchar(100) NOT NULL,
  `district` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hospital`
--

INSERT INTO `hospital` (`id`, `name`, `location`, `number`, `area`, `district`) VALUES
('H1', 'Sir Salimullah Medical College Mitford Hospital ', ' Mitford Rd,Dhaka 1100', '+880 2-7315076', 'Mitford Rd', 'Dhaka'),
('H10', 'BIRDEM  ', '122,Kazi Nazrul Islam Avenue,Shahbagh', '+880 2-8616644', 'Shahbagh', 'Dhaka'),
('H11', 'CARE Specialized Hospital and Research Centre Limited', 'Mirpur Rd, Dhaka 1207', '+880 1843-616670', 'Mirpur', 'Dhaka'),
('H12', 'Mirpur Adhunik Hospital ', 'Mirpur 11.5 Pallabi, Rd No. 5', '+880 1761-076667', 'Pallabi', 'Dhaka'),
('H13', 'Al-Rajhi Hospital Pvt. Ltd.', 'Kazi Nazrul Islam Ave', '+880 1840-756944', 'Karwan Bazar', 'Dhaka'),
('H14', 'Universal Medical College & Hospital', ' 74G/75, Pea-cock Square', '+880 1749-514007', 'Mohakhali', 'Dhaka'),
('H15', 'Dhaka City General Hospital', 'Nawab Iusuf Road, Nayabazar', '7390860', 'Nayabazar', 'Dhaka'),
('H16', 'Square Hospital', '18/F, West Panthopath', '8129338', 'Panthopath', 'Dhaka'),
('H17', 'Lever Foundation of Bangladesh', '150,Green Road,Panthopath (3rd Floor)', ' 01732-999922', 'Green Road', 'Dhaka'),
('H18', 'Max Health Care', 'Suite-B,Level-7,Navana Tower,45 Gulshan', '01929-000000', 'Gulshan', 'Dhaka'),
('H19', 'Monowara Hospital Pvt. Ltd.', '54,Siddheswori Road,Dhaka-1217.', '01715-839400', 'Siddheswori', 'Dhaka'),
('H2', 'Dhaka Shishu Hospital ', 'Syed Mahbub Morshed Ave', '+880 2-8116061', 'Dhaka', 'Dhaka'),
('H20', 'Patient Care Hospital', 'House-90,Sector-9,Sonargaon Janopath Road', '01918-749420', 'Uttara', 'Dhaka'),
('H21', 'Japan Bangladesh Friendship Hospital', '55,Sat Masjid Road,Jhigatola Bus Stand', '+880 1713-373190', 'Mohammodpur ', 'Dhaka'),
('H3', 'Apollo Hospitals Dhaka ', 'Plot: 81, Block: E, Bashundhara R/A', '+880 2-55037242', 'Bashundhara', 'Dhaka'),
('H4', 'Ispahani Islamia Eye Institute and Hospital ', ' Krishi Khamar Rd,Dhaka 1215', '+880 2-8112856', 'Sher e Bangla Nagar', 'Dhaka'),
('H5', 'Bangabandhu Shekh Mujib Medical University ', 'Kazi Nazrul Islam Ave', '+880 2-9661051', 'Karwan Bazar', 'Dhaka'),
('H6', 'National Heart Foundation Hospital & Research Institute', ' 7/2 Mirpur Rd,Dhaka 1216', '+880 2-9033442', 'Mirpur ', 'Dhaka'),
('H7', 'Ahsania Mission Cancer Hospital ', 'Mirpur Rd, Dhaka', '+880 2-8051618', 'Mirpur', 'Dhaka'),
('H8', 'Institute of Cancer Research Hospital', 'TB Gate Rd, Dhaka', '+880 2-9880078', 'Mohakhali', 'Dhaka'),
('H9', 'National Institute of Diseases of the Chest and Hospital ', 'TB Gate Rd, Dhaka', '+880 2-8811910', 'Mohakhali', 'Dhaka');

-- --------------------------------------------------------

--
-- Table structure for table `policestation`
--

CREATE TABLE `policestation` (
  `id` varchar(10) NOT NULL,
  `name` varchar(100) NOT NULL,
  `location` varchar(100) NOT NULL,
  `number` varchar(20) NOT NULL,
  `area` varchar(100) NOT NULL,
  `district` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `policestation`
--

INSERT INTO `policestation` (`id`, `name`, `location`, `number`, `area`, `district`) VALUES
('PS1', 'Mohammadpur Police Station', 'Mohammadpur Housing State,Block-E', '0199883742', 'Mohammadpur', 'Dhaka'),
('PS10', 'Tejgaon Police Station', 'Kazi Nazrul Islam Ave, Dhaka 1215', '+880 1713-373181', 'Tejgaon', 'Dhaka'),
('PS11', 'Khilgaon Police Station', 'Block#A, Taltola Market Rd', '+880 2-7219090', 'Khilgaon', 'Dhaka'),
('PS12', 'Dhaka Railway Police Station', 'Motijheel,Dhaka', '+880 1750-078697', 'Motijheel', 'Dhaka'),
('PS13', 'Vatara Police Station', 'House # 2,Madani Ave,Dhaka 1212', '+880 1713-373173', ' Baridhara', 'Dhaka'),
('PS14', 'Wari Thana', ' Tipu Sultan Rd,Dhaka,', '+880 2-9553377', 'Sutrapur', 'Dhaka'),
('PS15', 'Badda Police Station', 'DIT Project,17 Bir Uttam Rafiqul Islam Ave', '+880 1713-373173', 'Badda ', 'Dhaka'),
('PS16', 'Rupnagor Police Station', 'Rupnagar,Dhaka', '+880 1713-373190', 'Rupnagor ', 'Dhaka'),
('PS2', 'Dhanmondi Police Station', 'Road-6,House-41/A,Dhanmondi R/A', '01199883622', 'Dhanmondi', 'Dhaka'),
('PS3', 'Gulshan Police Station', 'CWN(B)-32,Holding-115,Gulshan,Dhaka', '9895826,01191001144', 'Gulshan', 'Dhaka'),
('PS4', 'Banani Police Station', 'House-37/1/F,Road-7,Banani,Dhaka', '01713393169', 'Banani', 'Dhaka'),
('PS5', 'Kalabagan Police Station', '100 North Bhuter Goli Community Center,Dhanmondi', '01199883628', 'Kalabagan', 'Dhaka'),
('PS6', 'Sutrapur Police Station', 'R M Dash Rd, Dhaka 1100', '+880 2-7116233', 'Sadarghat', 'Dhaka'),
('PS7', 'West Uttara Police Station', 'House No 48,Rd No 18,Dhaka 1230', '+880 1716-665082', 'Uttara', 'Dhaka'),
('PS8', 'Chawk Bazar Police Station', 'Bakshi Bazar Road,Dhaka 1211', '++880 2-7313966', 'Lalbagh', 'Dhaka'),
('PS9', 'Kafrul Police Station', 'Mirpur Rd,Dhaka', '+880 2-9871771', 'Mirpur', 'Dhaka');

-- --------------------------------------------------------

--
-- Table structure for table `taxiservice`
--

CREATE TABLE `taxiservice` (
  `id` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `location` varchar(100) NOT NULL,
  `number` varchar(100) NOT NULL,
  `area` varchar(100) NOT NULL,
  `district` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `taxiservice`
--

INSERT INTO `taxiservice` (`id`, `name`, `location`, `number`, `area`, `district`) VALUES
('TS1', 'Anudip Autos Ltd.', '158,Mirpur Road,Kalabagan', '+880-2-9125138, 8125690', ' Kalabagan', 'Dhaka'),
('TS10', 'Elite Car', 'Road 15,House 0,Block D, Banani', '+880 1973-334446', 'Banani', 'Dhaka'),
('TS11', 'Sarker Cab service', ' Sector#3,road#2,plot#58,uttara', '+880 1681-100022', 'Uttara', 'Dhaka'),
('TS12', 'Trust Transport Services ', ' Rd No 9, Dhaka Cant,Dhaka-1206', '+880 1755-667171', 'Cantonment', 'Dhaka'),
('TS2', 'Cab Bangla Ltd..', 'Meherba Plaza(14th floor),33 Topkhana Road', '+880-2-9571919', ' Kalabagan', 'Dhaka'),
('TS3', 'Cosmo Cab (Pvt) Ltd.', 'House # 84,Road # 7A,Dhanmondi R/A', '+880-2-9112959, 8127208, 8127191', ' Dhanmondi', 'Dhaka'),
('TS4', 'Limousine Cab Transport Ltd.', 'Head Office 27,Naya Paltan,VIP Road', '+880-2-8318351, 9337208, 8322704', 'Naya Paltan', 'Dhaka'),
('TS6', 'Khaled Cab service', ' 360/1,Mollahpara,Monipur,Mirpur', '+880 1933-246577', ' Mirpur', 'Dhaka'),
('TS7', 'Zoom Cab ', ' 2/4,Tolarbag,Mirpur 1,Dhaka 1216', '+880 1711-306557', 'Tolarbag', 'Dhaka'),
('TS8', 'Salman Car Service', ' Old  Dhaka 27, Dhaka 1209', '+880 1941-354079', 'Old Dhaka', 'Dhaka'),
('TS9', 'Babylon Rent A Car & Cab Service', 'Control Room Rd,Dhaka 1206', '+880 841-1122', 'Dhaka', 'Dhaka');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ambulance`
--
ALTER TABLE `ambulance`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `atm`
--
ALTER TABLE `atm`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `fireservice`
--
ALTER TABLE `fireservice`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `hospital`
--
ALTER TABLE `hospital`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `policestation`
--
ALTER TABLE `policestation`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `taxiservice`
--
ALTER TABLE `taxiservice`
  ADD PRIMARY KEY (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
