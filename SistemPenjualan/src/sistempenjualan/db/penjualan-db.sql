-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 02, 2017 at 05:48 AM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `penjualan-db`
--

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE IF NOT EXISTS `transaksi` (
  `id_transaksi` int(11) NOT NULL,
  `waktu_transaksi` date NOT NULL,
  `kuantitas` int(11) NOT NULL,
  `tipe_transaksi` enum('pesanan','kontan') NOT NULL,
  `harga` bigint(11) NOT NULL,
  `nama_pembeli` varchar(25) NOT NULL,
  `nama_kasir` varchar(25) NOT NULL,
  `cabang` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `waktu_transaksi`, `kuantitas`, `tipe_transaksi`, `harga`, `nama_pembeli`, `nama_kasir`, `cabang`) VALUES
(1, '2017-10-02', 1, 'kontan', 2000, 'Munaroh', 'Adelia', 'Jember');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id_user` int(11) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` int(8) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `jenis kelamin` enum('laki-laki','perempuan') NOT NULL,
  `privilage` varchar(10) NOT NULL,
  `cabang` varchar(10) NOT NULL,
  `no.telp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`, `alamat`, `jenis kelamin`, `privilage`, `cabang`, `no.telp`) VALUES
(101, 'tisyana', 1234, 'Jl.Kalisat Gg.Opec 1', 'perempuan', 'kasir1', 'Jember', '0895361989742');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
