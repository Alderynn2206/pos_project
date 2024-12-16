-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 07 Jul 2023 pada 07.14
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_transaksi`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `jual`
--

CREATE TABLE `jual` (
  `id_jual` int(11) NOT NULL,
  `no_jual` varchar(20) NOT NULL,
  `tgl_jual` date DEFAULT NULL,
  `kode_brg` varchar(10) NOT NULL,
  `nm_barang` varchar(100) NOT NULL,
  `jumlah` varchar(20) NOT NULL,
  `total` varchar(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `jual`
--

INSERT INTO `jual` (`id_jual`, `no_jual`, `tgl_jual`, `kode_brg`, `nm_barang`, `jumlah`, `total`) VALUES
(52, 'NOTA-3', '2023-07-07', '', 'Susu Bear Brand', '5', '40000.0'),
(53, 'NOTA-4', '2023-07-07', '', 'Susu Bear Brand', '5', '40000.0'),
(54, 'NOTA-5', '2023-07-07', 'A02', 'Susu Bear Brand', '5', '40000.0');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tblbrg`
--

CREATE TABLE `tblbrg` (
  `kode_barang` varchar(10) NOT NULL,
  `nama_barang` varchar(100) DEFAULT NULL,
  `satuan` varchar(20) DEFAULT NULL,
  `harga` text DEFAULT NULL,
  `jumlah` varchar(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `tblbrg`
--

INSERT INTO `tblbrg` (`kode_barang`, `nama_barang`, `satuan`, `harga`, `jumlah`) VALUES
('A04', 'Sabun Mandi', 'pcs', '5000', '10'),
('A02', 'Susu Bear Brand', 'ml', '8000', '20'),
('A03', 'Minute Maid Nutriboost', 'ml', '8000', '20');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `username` varchar(10) NOT NULL,
  `password` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`username`, `password`) VALUES
('Admin', '12345');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `jual`
--
ALTER TABLE `jual`
  ADD PRIMARY KEY (`id_jual`);

--
-- Indeks untuk tabel `tblbrg`
--
ALTER TABLE `tblbrg`
  ADD PRIMARY KEY (`kode_barang`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `jual`
--
ALTER TABLE `jual`
  MODIFY `id_jual` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
