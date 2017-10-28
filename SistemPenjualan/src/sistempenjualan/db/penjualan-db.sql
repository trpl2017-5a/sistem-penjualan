--
-- Database: `penjualan-db`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `kasir`
--

CREATE TABLE `kasir` (
  `nama_kasir` varchar(20) NOT NULL,
  `kode_barang` int(10) NOT NULL,
  `nama_barang` varchar(25) NOT NULL,
  `jumlah` int(10) NOT NULL,
  `tanggal` date NOT NULL,
  `total_harga` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kasir`
--

INSERT INTO `kasir` (`nama_kasir`, `kode_barang`, `nama_barang`, `jumlah`, `tanggal`, `total_harga`) VALUES
('ead', 121, 'xz', 1, '2017-10-10', 1),
('saf', 1002, 'fas', 2, '2017-10-10', 10000),
('Eka', 1021, 'Roti Keju', 5, '2017-10-09', 25000),
('Tisa', 2511, 'Roti Gulung', 2, '2017-10-10', 20000),
('Eka', 2512, 'Keju', 2, '2017-10-10', 1000),
('Tisa', 3211, 'Roti Lapis', 1, '2017-10-10', 2000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
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
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `waktu_transaksi`, `kuantitas`, `tipe_transaksi`, `harga`, `nama_pembeli`, `nama_kasir`, `cabang`) VALUES
(1, '2017-10-02', 1, 'kontan', 2000, 'Munaroh', 'Adelia', 'Jember'),
(1, '2017-10-02', 1, 'kontan', 2000, 'Munaroh', 'Adelia', 'Jember');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
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
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`, `alamat`, `jenis kelamin`, `privilage`, `cabang`, `no.telp`) VALUES
(101, 'tisyana', 1234, 'Jl.Kalisat Gg.Opec 1', 'perempuan', 'kasir1', 'Jember', '0895361989742');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kasir`
--
ALTER TABLE `kasir`
  ADD PRIMARY KEY (`kode_barang`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
