-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 23-Abr-2018 às 05:18
-- Versão do servidor: 10.1.30-MariaDB
-- PHP Version: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sistemaautopecas`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculos`
--

CREATE TABLE `veiculos` (
  `id_veiculos` int(11) NOT NULL,
  `placa` varchar(10) DEFAULT NULL,
  `ano_modelo` varchar(5) NOT NULL,
  `ano_fabric` varchar(5) NOT NULL,
  `chassi` varchar(17) NOT NULL,
  `renavam` varchar(15) NOT NULL,
  `numero_motor` varchar(20) NOT NULL,
  `marca` varchar(50) NOT NULL,
  `modelo` varchar(100) NOT NULL,
  `cor_externa` varchar(50) NOT NULL,
  `cor_interna` varchar(50) NOT NULL,
  `combustivel` varchar(30) NOT NULL,
  `motor` varchar(5) NOT NULL,
  `especie` varchar(20) NOT NULL,
  `km` varchar(20) NOT NULL,
  `proprietario` varchar(150) NOT NULL,
  `data_cadastro` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `veiculos`
--

INSERT INTO `veiculos` (`id_veiculos`, `placa`, `ano_modelo`, `ano_fabric`, `chassi`, `renavam`, `numero_motor`, `marca`, `modelo`, `cor_externa`, `cor_interna`, `combustivel`, `motor`, `especie`, `km`, `proprietario`, `data_cadastro`) VALUES
(1, 'PLO-2536', '2015', '2016', 'LL009SAD9LW7890', '654519498519', '125648569', 'Fiat', 'Toro', 'Branco Nevoa', 'Preto', 'Flex', '1.6', 'Passageiros', '11.365', 'Haurio Vieira da Silva', '22/04/2018');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `veiculos`
--
ALTER TABLE `veiculos`
  ADD PRIMARY KEY (`id_veiculos`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
