-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 28-Abr-2018 às 16:43
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
-- Estrutura da tabela `ddd`
--

CREATE TABLE `ddd` (
  `id_ddd` int(11) NOT NULL,
  `prefixo` int(2) DEFAULT NULL,
  `estado` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `ddd`
--

INSERT INTO `ddd` (`id_ddd`, `prefixo`, `estado`) VALUES
(1, 11, 'São Paulo'),
(2, 12, 'São paulo'),
(3, 13, 'São Paulo'),
(4, 14, 'São Paulo'),
(5, 15, 'São Paulo'),
(6, 16, 'São Paulo'),
(7, 17, 'São Paulo'),
(8, 18, 'São Paulo'),
(9, 19, 'São Paulo'),
(10, 21, 'Rio de Janeiro'),
(11, 22, 'Rio de Janeiro'),
(12, 24, 'Rio de Janeiro'),
(13, 27, 'Espirito Santo'),
(14, 28, 'Espirito Santo'),
(15, 31, 'Minas Gerais'),
(16, 32, 'Minas Gerais'),
(17, 33, 'Minas Gerais'),
(18, 34, 'Minas Gerais'),
(19, 35, 'Minas Gerais'),
(20, 37, 'Minas Gerais'),
(21, 38, 'Minas Gerais'),
(22, 41, 'Paraná'),
(23, 42, 'Paraná'),
(24, 43, 'Paraná'),
(25, 44, 'Paraná'),
(26, 45, 'Paraná '),
(27, 46, 'Paraná '),
(28, 47, 'Santa Catarina'),
(29, 48, 'Santa Catarina'),
(30, 49, 'Santa Catarina'),
(31, 51, 'Rio Grande do Sul'),
(32, 53, 'Rio Grande do Sul'),
(33, 54, 'Rio Grande do Sul'),
(34, 55, 'Rio Grande do Sul'),
(35, 61, 'Distrito Federal/Goiás'),
(36, 62, 'Goiás'),
(37, 63, 'Tocantins'),
(38, 64, 'Goiás'),
(39, 65, 'Mato Grosso'),
(40, 66, 'Mato Grosso'),
(41, 67, 'Mato Grosso do Sul'),
(42, 68, 'Acre'),
(43, 69, 'Rondônia'),
(44, 71, 'Bahia'),
(45, 73, 'Bahia'),
(46, 74, 'Bahia'),
(47, 75, 'Bahia'),
(48, 77, 'Bahia'),
(49, 79, 'Sergipe'),
(50, 81, 'Pernambuco'),
(51, 82, 'Alagoas'),
(52, 83, 'Para¡ba'),
(53, 84, 'Rio Grande do Norte'),
(54, 85, 'Ceará'),
(55, 86, 'Piauí'),
(56, 87, 'Pernambuco'),
(57, 88, 'Ceará'),
(58, 89, 'Piauí'),
(59, 91, 'Pará'),
(60, 92, 'Amazonas'),
(61, 93, 'Pará'),
(62, 94, 'Pará'),
(63, 95, 'Roraima'),
(64, 96, 'Amapá'),
(65, 97, 'Amazonas'),
(66, 98, 'Maranhão'),
(67, 99, 'Maranhão');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ddd`
--
ALTER TABLE `ddd`
  ADD PRIMARY KEY (`id_ddd`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ddd`
--
ALTER TABLE `ddd`
  MODIFY `id_ddd` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=68;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
