-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 11, 2023 at 08:02 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hima`
--

-- --------------------------------------------------------

--
-- Table structure for table `jadwal`
--

CREATE TABLE `jadwal` (
  `key` int(11) NOT NULL,
  `depar` varchar(50) NOT NULL,
  `nama_proker` varchar(255) NOT NULL,
  `tanggal` varchar(255) NOT NULL,
  `tempat` varchar(255) NOT NULL,
  `waktu` varchar(255) NOT NULL,
  `kode` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `jadwal`
--

INSERT INTO `jadwal` (`key`, `depar`, `nama_proker`, `tanggal`, `tempat`, `waktu`, `kode`) VALUES
(3, 'KPSDM', 'Fresh UP', '30-06-2023', 'Pantai Samboja', '07.30', 'JDORQ'),
(4, 'Internal', 'Kerja Bakti', '11-06-2023', 'Unmul', '10.00', 'JDBJN');

-- --------------------------------------------------------

--
-- Table structure for table `mhs`
--

CREATE TABLE `mhs` (
  `key` int(11) NOT NULL,
  `nama` text NOT NULL,
  `nomorHp` varchar(40) NOT NULL,
  `jenis_kel` varchar(50) NOT NULL,
  `jabatan` varchar(255) NOT NULL,
  `departemen` varchar(255) NOT NULL,
  `prodi` varchar(255) NOT NULL,
  `fakultas` varchar(255) NOT NULL,
  `angkatan` varchar(30) NOT NULL,
  `kode` varchar(10) NOT NULL,
  `pass` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mhs`
--

INSERT INTO `mhs` (`key`, `nama`, `nomorHp`, `jenis_kel`, `jabatan`, `departemen`, `prodi`, `fakultas`, `angkatan`, `kode`, `pass`) VALUES
(6, 'Siskaa', '0828723', 'Perempuan', 'Bendahara', 'Internal', 'S1 Fisika', 'MIPA', '2022', 'UVF8WE', '123'),
(8, 'Windaa', '09899', 'Perempuan', 'Anggota', 'Eksternal', 'S1 Kimia', 'MIPA', '2022', 'UCX8VY', 'w'),
(11, 'Herni', 'jejejej', 'Perempuan', 'Sekretaris', 'Eksternal', 'S1 Informatika', 'Teknik', '2021', 'UZG8I4', '123'),
(12, 'Gan', '62301', 'Laki-laki', 'Anggota', 'Badan Usaha dan Dana', 'S1 Dokter gigi', 'Kedokteran', '2022', 'USY6', '123'),
(13, 'Herniiii', '0823929', 'Perempuan', 'Bendahara', 'KPSDM', 'S1 Pendidikan Kedokteran', 'Kedokteran', '2020', 'USRF', '123');

-- --------------------------------------------------------

--
-- Table structure for table `proker`
--

CREATE TABLE `proker` (
  `key` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `depar` varchar(255) NOT NULL,
  `ket` text NOT NULL,
  `jumlah` int(11) NOT NULL,
  `kode` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `proker`
--

INSERT INTO `proker` (`key`, `nama`, `depar`, `ket`, `jumlah`, `kode`) VALUES
(2, 'Kerja Bakti', 'Internal', 'Membersihkan Sekre', 2, 'PKR78M'),
(4, 'Fresh UP', 'KPSDM', 'Healing', 0, 'PKRAMY');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD PRIMARY KEY (`key`);

--
-- Indexes for table `mhs`
--
ALTER TABLE `mhs`
  ADD PRIMARY KEY (`key`);

--
-- Indexes for table `proker`
--
ALTER TABLE `proker`
  ADD PRIMARY KEY (`key`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `jadwal`
--
ALTER TABLE `jadwal`
  MODIFY `key` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `mhs`
--
ALTER TABLE `mhs`
  MODIFY `key` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `proker`
--
ALTER TABLE `proker`
  MODIFY `key` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
