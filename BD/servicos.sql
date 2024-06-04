-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 25-Abr-2018 às 14:30
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
-- Estrutura da tabela `servicos`
--

CREATE TABLE `servicos` (
  `codigo` varchar(30) NOT NULL,
  `descricao` varchar(100) NOT NULL,
  `tipo_servico` varchar(30) NOT NULL,
  `tempo_servico` varchar(10) NOT NULL,
  `valor_servico` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `servicos`
--

INSERT INTO `servicos` (`codigo`, `descricao`, `tipo_servico`, `tempo_servico`, `valor_servico`) VALUES
('trocaoleo', 'Troca de Oleo', 'Mêcanica', '0:30', 80),
('RevisaoCompl.', 'Revisão Completa', 'Mêcanica', '3:00', 300),
('Subst.Pecas', 'Substituição Peças', 'Mêcanica', '2:30', 120),
('Pneus', 'Troca de Pneus', 'Mêcanica', '2:00', 200),
('Gás', 'Trocar Gas Ar-Condicionado', 'Mêcanica', '2:30', 400),
('RevisaoEletr.', 'Revisão Completa Parte Eletrica', 'Eletrica', '3:00', 350),
('Inst.Acess.Diver.', 'Instalação de Acessorios Diversos', 'Mêcanica', '2:00', 180),
('Pint.Paraxoque', 'Pintura dos Paraxoques', 'Pintura', '5:00', 600),
('Pintura', 'Pintura em Geral', 'Pintura', '5:00', 1000),
('TrocaLed', 'Troca de Lampadas', 'Eletrica', '1:00', 130),
('Revisao', 'Revisao Simples', 'Mêcanica', '0:30', 120);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
