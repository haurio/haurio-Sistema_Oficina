-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 18-Abr-2018 às 03:55
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
-- Database: `sistemavendas`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cst`
--

CREATE TABLE `cst` (
  `CODIGO_CST` varchar(3) NOT NULL,
  `DESCRICAO` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cst`
--

INSERT INTO `cst` (`CODIGO_CST`, `DESCRICAO`) VALUES
('0', 'Tributada Integralmente'),
('10', 'Tributada e com cobrança do ICMS\r\npor ST'),
('20', 'Com redução de BC'),
('30', 'Isenta ou não tributada e com\r\ncobrança de ICMS por ST'),
('40', 'Isenta'),
('41', 'Não Tributada'),
('50', 'Suspensão'),
('51', 'Diferimento'),
('60', 'ICMS cobrado anteriormente por\r\nST'),
('70', 'Com redução de BC e cobrança de\r\nICMS por ST'),
('90', 'Outros'),
('0', 'Tributada Integralmente'),
('10', 'Tributada e com cobrança do ICMS\r\npor ST'),
('20', 'Com redução de BC'),
('30', 'Isenta ou não tributada e com\r\ncobrança de ICMS por ST'),
('40', 'Isenta'),
('41', 'Não Tributada'),
('50', 'Suspensão'),
('51', 'Diferimento'),
('60', 'ICMS cobrado anteriormente por\r\nST'),
('70', 'Com redução de BC e cobrança de\r\nICMS por ST'),
('90', 'Outros'),
('0', 'Tributada Integralmente'),
('10', 'Tributada e com cobrança do ICMS\r\npor ST'),
('20', 'Com redução de BC'),
('30', 'Isenta ou não tributada e com\r\ncobrança de ICMS por ST'),
('40', 'Isenta'),
('41', 'Não Tributada'),
('50', 'Suspensão'),
('51', 'Diferimento'),
('60', 'ICMS cobrado anteriormente por\r\nST'),
('70', 'Com redução de BC e cobrança de\r\nICMS por ST'),
('90', 'Outros');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cst_cofins`
--

CREATE TABLE `cst_cofins` (
  `CODIGO_CST_COFINS` varchar(2) NOT NULL,
  `DESCRICAO` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cst_cofins`
--

INSERT INTO `cst_cofins` (`CODIGO_CST_COFINS`, `DESCRICAO`) VALUES
('01', 'Operação Tributável com Alíquota Básica'),
('02', 'Operação Tributável com Alíquota Diferenciada'),
('03', 'Operação Tributável com Alíquota por Unidade de Medida de Produto'),
('04', 'Operação Tributável Monofásica - Revenda a Alíquota Zero'),
('05', 'Operação Tributável por Substituição Tributária'),
('06', 'Operação Tributável a Alíquota Zero'),
('07', 'Operação Isenta da Contribuição'),
('08', 'Operação sem Incidência da Contribuição'),
('09', 'Operação com Suspensão da Contribuição'),
('49', 'Outras Operações de Saída'),
('50', 'Operação com Direito a Crédito - Vinculada Exclusivamente a Receita Tributada no Mercado Interno'),
('51', 'Operação com Direito a Crédito – Vinculada Exclusivamente a Receita Não Tributada no Mercado Interno'),
('52', 'Operação com Direito a Crédito - Vinculada Exclusivamente a Receita de Exportação'),
('53', 'Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno'),
('54', 'Operação com Direito a Crédito - Vinculada a Receitas Tributadas no Mercado Interno e de Exportação'),
('55', 'Operação com Direito a Crédito - Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação'),
('56', 'Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação'),
('60', 'Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Tributada no Mercado Interno'),
('61', 'Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Não-Tributada no Mercado Interno'),
('62', 'Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita de Exportação'),
('63', 'Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno'),
('64', 'Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas no Mercado Interno e de Exportação'),
('65', 'Crédito Presumido - Operação de Aquisição Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação'),
('66', 'Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação'),
('67', 'Crédito Presumido - Outras Operações'),
('70', 'Operação de Aquisição sem Direito a Crédito'),
('71', 'Operação de Aquisição com Isenção'),
('72', 'Operação de Aquisição com Suspensão'),
('73', 'Operação de Aquisição a Alíquota Zero'),
('74', 'Operação de Aquisição sem Incidência da Contribuição'),
('75', 'Operação de Aquisição por Substituição Tributária'),
('98', 'Outras Operações de Entrada'),
('01', 'Operação Tributável com Alíquota Básica'),
('02', 'Operação Tributável com Alíquota Diferenciada'),
('03', 'Operação Tributável com Alíquota por Unidade de Medida de Produto'),
('04', 'Operação Tributável Monofásica - Revenda a Alíquota Zero'),
('05', 'Operação Tributável por Substituição Tributária'),
('06', 'Operação Tributável a Alíquota Zero'),
('07', 'Operação Isenta da Contribuição'),
('08', 'Operação sem Incidência da Contribuição'),
('09', 'Operação com Suspensão da Contribuição'),
('49', 'Outras Operações de Saída'),
('50', 'Operação com Direito a Crédito - Vinculada Exclusivamente a Receita Tributada no Mercado Interno'),
('51', 'Operação com Direito a Crédito – Vinculada Exclusivamente a Receita Não Tributada no Mercado Interno'),
('52', 'Operação com Direito a Crédito - Vinculada Exclusivamente a Receita de Exportação'),
('53', 'Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno'),
('54', 'Operação com Direito a Crédito - Vinculada a Receitas Tributadas no Mercado Interno e de Exportação'),
('55', 'Operação com Direito a Crédito - Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação'),
('56', 'Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação'),
('60', 'Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Tributada no Mercado Interno'),
('61', 'Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Não-Tributada no Mercado Interno'),
('62', 'Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita de Exportação'),
('63', 'Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno'),
('64', 'Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas no Mercado Interno e de Exportação'),
('65', 'Crédito Presumido - Operação de Aquisição Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação'),
('66', 'Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação'),
('67', 'Crédito Presumido - Outras Operações'),
('70', 'Operação de Aquisição sem Direito a Crédito'),
('71', 'Operação de Aquisição com Isenção'),
('72', 'Operação de Aquisição com Suspensão'),
('73', 'Operação de Aquisição a Alíquota Zero'),
('74', 'Operação de Aquisição sem Incidência da Contribuição'),
('75', 'Operação de Aquisição por Substituição Tributária'),
('98', 'Outras Operações de Entrada'),
('01', 'Operação Tributável com Alíquota Básica'),
('02', 'Operação Tributável com Alíquota Diferenciada'),
('03', 'Operação Tributável com Alíquota por Unidade de Medida de Produto'),
('04', 'Operação Tributável Monofásica - Revenda a Alíquota Zero'),
('05', 'Operação Tributável por Substituição Tributária'),
('06', 'Operação Tributável a Alíquota Zero'),
('07', 'Operação Isenta da Contribuição'),
('08', 'Operação sem Incidência da Contribuição'),
('09', 'Operação com Suspensão da Contribuição'),
('49', 'Outras Operações de Saída'),
('50', 'Operação com Direito a Crédito - Vinculada Exclusivamente a Receita Tributada no Mercado Interno'),
('51', 'Operação com Direito a Crédito – Vinculada Exclusivamente a Receita Não Tributada no Mercado Interno'),
('52', 'Operação com Direito a Crédito - Vinculada Exclusivamente a Receita de Exportação'),
('53', 'Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno'),
('54', 'Operação com Direito a Crédito - Vinculada a Receitas Tributadas no Mercado Interno e de Exportação'),
('55', 'Operação com Direito a Crédito - Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação'),
('56', 'Operação com Direito a Crédito - Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação'),
('60', 'Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Tributada no Mercado Interno'),
('61', 'Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita Não-Tributada no Mercado Interno'),
('62', 'Crédito Presumido - Operação de Aquisição Vinculada Exclusivamente a Receita de Exportação'),
('63', 'Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno'),
('64', 'Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas no Mercado Interno e de Exportação'),
('65', 'Crédito Presumido - Operação de Aquisição Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação'),
('66', 'Crédito Presumido - Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação'),
('67', 'Crédito Presumido - Outras Operações'),
('70', 'Operação de Aquisição sem Direito a Crédito'),
('71', 'Operação de Aquisição com Isenção'),
('72', 'Operação de Aquisição com Suspensão'),
('73', 'Operação de Aquisição a Alíquota Zero'),
('74', 'Operação de Aquisição sem Incidência da Contribuição'),
('75', 'Operação de Aquisição por Substituição Tributária'),
('98', 'Outras Operações de Entrada');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cst_ipi`
--

CREATE TABLE `cst_ipi` (
  `CODIGO_CST` varchar(2) NOT NULL,
  `DESCRICAO` varchar(90) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cst_ipi`
--

INSERT INTO `cst_ipi` (`CODIGO_CST`, `DESCRICAO`) VALUES
('00', 'Entrada com Recuperação de Crédito'),
('01', 'Entrada Tributável com Alíquota Zero'),
('02', 'Entrada Isenta'),
('03', 'Entrada Não-Tributada'),
('04', 'Entrada Imune'),
('05', 'Entrada com Suspensão'),
('49', 'Outras Entradas'),
('50', 'Saída Tributada'),
('51', 'Saída Tributável com Aliquota Zero'),
('52', 'Saída Isenta'),
('53', 'Saída Não-Tributada'),
('54', 'Saída Imune'),
('55', 'Saída com Suspensão'),
('99', 'Outras Saídas ');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cst_pis`
--

CREATE TABLE `cst_pis` (
  `pis` varchar(2) NOT NULL,
  `descricao` varchar(120) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cst_pis`
--

INSERT INTO `cst_pis` (`pis`, `descricao`) VALUES
('00', 'Entrada com Recuperação de Crédito'),
('01', 'Entrada Tributável com Alíquota Zero'),
('02', 'Entrada Isenta'),
('03', 'Entrada Não-Tributada'),
('04', 'Entrada Imune'),
('05', 'Entrada com Suspensão'),
('49', 'Outras Entradas'),
('50', 'Saída Tributada'),
('51', 'Saída Tributável com Alíquota Zero'),
('52', 'Saída Isenta'),
('53', 'Saída Não-Tributada'),
('54', 'Saída Imune'),
('55', 'Saída com Suspensão'),
('99', 'Outras Saídas');

-- --------------------------------------------------------

--
-- Estrutura da tabela `despesas`
--

CREATE TABLE `despesas` (
  `id_despesa` int(11) NOT NULL,
  `nome_despesa` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `empresa`
--

CREATE TABLE `empresa` (
  `id_empresa` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `nomefantasia` varchar(100) NOT NULL,
  `cnpj` varchar(20) NOT NULL,
  `ie` varchar(14) NOT NULL,
  `im` varchar(15) NOT NULL,
  `crt` varchar(5) NOT NULL,
  `cnae` varchar(10) NOT NULL,
  `ra` varchar(1200) NOT NULL,
  `ibge` int(10) NOT NULL,
  `cidade` varchar(100) DEFAULT NULL,
  `uf` varchar(4) NOT NULL,
  `cep` varchar(20) NOT NULL,
  `bairro` varchar(50) NOT NULL,
  `rua` varchar(150) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `cod_uf` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `empresa`
--

INSERT INTO `empresa` (`id_empresa`, `nome`, `nomefantasia`, `cnpj`, `ie`, `im`, `crt`, `cnae`, `ra`, `ibge`, `cidade`, `uf`, `cep`, `bairro`, `rua`, `telefone`, `email`, `cod_uf`) VALUES
(1, 'test', 'ets', '21.561.651/6516-16', '165', '2132', '321', '0', 'Organismos internacionais e outras instituições extraterritoriais', 5208707, NULL, 'GO', '74843-710', 'Setor dos Afonsos ', 'Avenida Rio Verde', '(21)356135-61', 'teste', '52');

-- --------------------------------------------------------

--
-- Estrutura da tabela `estados`
--

CREATE TABLE `estados` (
  `id_estado` int(11) NOT NULL,
  `nome_estado` varchar(20) NOT NULL,
  `sigla_estado` varchar(2) NOT NULL,
  `ibge_uf` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `estados`
--

INSERT INTO `estados` (`id_estado`, `nome_estado`, `sigla_estado`, `ibge_uf`) VALUES
(1, 'ACRE', 'AC', 12),
(2, 'ALAGOAS', 'AL', 27),
(3, 'AMAZONAS', 'AM', 13),
(4, 'AMAPA', 'AP', 16),
(5, 'BAHIA', 'BA', 29),
(6, 'CEARA', 'CE', 23),
(7, 'DISTRITO FEDERAL', 'DF', 53),
(8, 'ESPIRITO SANTO', 'ES', 32),
(9, 'GOIAS', 'GO', 52),
(10, 'MARANHAO', 'MA', 21),
(11, 'MINAS GERAIS', 'MG', 31),
(12, 'MATO GROSSO DO SUL', 'MS', 50),
(13, 'MATO GROSSO ', 'MT', 51),
(14, 'PARA', 'PA', 15),
(15, 'PARAIBA', 'PB', 25),
(16, 'PERNANBUCO', 'PE', 26),
(17, 'PIAUI', 'PI', 22),
(18, 'PARANA', 'PR', 41),
(19, 'RIO DE JANEIRO', 'RJ', 33),
(20, 'RIO GRANDE DO NORTE', 'RN', 24),
(21, 'RONDONIA', 'RO', 11),
(22, 'RORAIMA', 'RR', 14),
(23, 'RIO GRANDE DO SUL', 'RS', 43),
(24, 'SANTA CATARINA', 'SC', 42),
(25, 'SERGIPE', 'SE', 28),
(26, 'SÃO PAULO', 'SP', 35),
(27, 'TOCANTINS', 'TO', 17);

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

CREATE TABLE `fornecedor` (
  `id_fornecedor` int(11) NOT NULL,
  `nome_fornecedor` varchar(35) NOT NULL,
  `endereco_fornecedor` varchar(35) DEFAULT NULL,
  `id_bairro` int(11) DEFAULT NULL,
  `bairro` varchar(50) DEFAULT NULL,
  `cidade` varchar(50) DEFAULT NULL,
  `estado` varchar(25) DEFAULT NULL,
  `cnpj` varchar(30) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `celular` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `nomefantasia` varchar(50) DEFAULT NULL,
  `ie` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `fornecedor`
--

INSERT INTO `fornecedor` (`id_fornecedor`, `nome_fornecedor`, `endereco_fornecedor`, `id_bairro`, `bairro`, `cidade`, `estado`, `cnpj`, `telefone`, `celular`, `email`, `nomefantasia`, `ie`) VALUES
(1, 'Fornecedor Padrão', 'Não cadastrado', NULL, 'paranoá', 'brasília', 'DF', '000000', '000000', '000000', 'Não cadastrado', 'Padrão', '000000'),
(2, 'Castrol Brasil Lubrificantes Ltda', 'Av. Perimentral Norte', NULL, 'Setor Nova Esperança', 'Goiânia', 'Goias', '236659236000358', '(62)4002-6356', '', 'Vendas.CB@castrolbrasil.com.br', 'Castrol Brasil Lubrificantes', '56986597');

-- --------------------------------------------------------

--
-- Estrutura da tabela `itens_compra_produto`
--

CREATE TABLE `itens_compra_produto` (
  `id_compra` int(11) NOT NULL,
  `id_produto` int(11) NOT NULL,
  `quantidade_produto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `itens_venda_produto`
--

CREATE TABLE `itens_venda_produto` (
  `id_venda` int(11) NOT NULL,
  `id_produto` int(11) NOT NULL,
  `quantidade_produto` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `itens_venda_produto`
--

INSERT INTO `itens_venda_produto` (`id_venda`, `id_produto`, `quantidade_produto`) VALUES
(10, 1, 1),
(47, 1, 1),
(97, 2, 0.985);

-- --------------------------------------------------------

--
-- Estrutura da tabela `parcela_cartao`
--

CREATE TABLE `parcela_cartao` (
  `id_parc_venda` int(11) NOT NULL,
  `cod_venda` int(11) DEFAULT NULL,
  `valor_venda` float DEFAULT NULL,
  `valor_total` float DEFAULT NULL,
  `numero_parcela` int(11) DEFAULT NULL,
  `valor_parc` float DEFAULT NULL,
  `datavenc` date DEFAULT NULL,
  `estado` varchar(15) DEFAULT NULL,
  `recebido` float DEFAULT NULL,
  `bandeira` varchar(30) DEFAULT NULL,
  `tipo_pagamento` varchar(15) DEFAULT NULL,
  `datavenda` date DEFAULT NULL,
  `datarecebimento` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `parcela_cartao`
--

INSERT INTO `parcela_cartao` (`id_parc_venda`, `cod_venda`, `valor_venda`, `valor_total`, `numero_parcela`, `valor_parc`, `datavenc`, `estado`, `recebido`, `bandeira`, `tipo_pagamento`, `datavenda`, `datarecebimento`) VALUES
(1, 10, 98.65, 98.65, 1, 98.65, '2018-04-08', 'NAO', NULL, 'Visa', 'Credito', '2018-03-08', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `parcela_compra`
--

CREATE TABLE `parcela_compra` (
  `id_parc_compra` int(11) NOT NULL,
  `cod_compra` int(11) DEFAULT NULL,
  `valor_compra` float DEFAULT NULL,
  `valor_nota` float DEFAULT NULL,
  `numero_parcela` int(11) DEFAULT NULL,
  `valor_parc` float DEFAULT NULL,
  `datavenc` date DEFAULT NULL,
  `estado` varchar(15) DEFAULT NULL,
  `valor_parcial` int(11) DEFAULT NULL,
  `valor_resta` float DEFAULT NULL,
  `pago` float DEFAULT NULL,
  `id_fornecedor` int(11) DEFAULT NULL,
  `datavenda` date DEFAULT NULL,
  `datarecebimento` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `parcela_venda`
--

CREATE TABLE `parcela_venda` (
  `id_parc_venda` int(11) NOT NULL,
  `cod_venda` int(11) DEFAULT NULL,
  `valor_venda` float DEFAULT NULL,
  `valor_total` float DEFAULT NULL,
  `numero_parcela` int(11) DEFAULT NULL,
  `valor_parc` float DEFAULT NULL,
  `datavenc` date DEFAULT NULL,
  `estado` varchar(15) DEFAULT NULL,
  `valor_parcial` float DEFAULT NULL,
  `valor_resta` float DEFAULT NULL,
  `pago` float DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  `datavenda` date DEFAULT NULL,
  `datarecebimento` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `parcela_venda`
--

INSERT INTO `parcela_venda` (`id_parc_venda`, `cod_venda`, `valor_venda`, `valor_total`, `numero_parcela`, `valor_parc`, `datavenc`, `estado`, `valor_parcial`, `valor_resta`, `pago`, `id_cliente`, `datavenda`, `datarecebimento`) VALUES
(1, 47, 98.65, 48.65, 1, 48.65, '2018-04-14', 'NAO', NULL, NULL, NULL, 1, '2018-03-14', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `despesas`
--
ALTER TABLE `despesas`
  ADD PRIMARY KEY (`id_despesa`);

--
-- Indexes for table `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`id_empresa`);

--
-- Indexes for table `estados`
--
ALTER TABLE `estados`
  ADD PRIMARY KEY (`id_estado`);

--
-- Indexes for table `fornecedor`
--
ALTER TABLE `fornecedor`
  ADD PRIMARY KEY (`id_fornecedor`),
  ADD KEY `id_bairro` (`id_bairro`);

--
-- Indexes for table `itens_venda_produto`
--
ALTER TABLE `itens_venda_produto`
  ADD KEY `id_venda` (`id_venda`),
  ADD KEY `id_produto` (`id_produto`);

--
-- Indexes for table `parcela_cartao`
--
ALTER TABLE `parcela_cartao`
  ADD PRIMARY KEY (`id_parc_venda`);

--
-- Indexes for table `parcela_compra`
--
ALTER TABLE `parcela_compra`
  ADD PRIMARY KEY (`id_parc_compra`);

--
-- Indexes for table `parcela_venda`
--
ALTER TABLE `parcela_venda`
  ADD PRIMARY KEY (`id_parc_venda`),
  ADD KEY `cod_venda` (`cod_venda`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `despesas`
--
ALTER TABLE `despesas`
  MODIFY `id_despesa` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `empresa`
--
ALTER TABLE `empresa`
  MODIFY `id_empresa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `estados`
--
ALTER TABLE `estados`
  MODIFY `id_estado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `fornecedor`
--
ALTER TABLE `fornecedor`
  MODIFY `id_fornecedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `parcela_cartao`
--
ALTER TABLE `parcela_cartao`
  MODIFY `id_parc_venda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `parcela_compra`
--
ALTER TABLE `parcela_compra`
  MODIFY `id_parc_compra` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `parcela_venda`
--
ALTER TABLE `parcela_venda`
  MODIFY `id_parc_venda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `fornecedor`
--
ALTER TABLE `fornecedor`
  ADD CONSTRAINT `fornecedor_ibfk_1` FOREIGN KEY (`id_bairro`) REFERENCES `bairro` (`id_bairro`);

--
-- Limitadores para a tabela `itens_venda_produto`
--
ALTER TABLE `itens_venda_produto`
  ADD CONSTRAINT `itens_venda_produto_ibfk_1` FOREIGN KEY (`id_venda`) REFERENCES `venda` (`id_venda`),
  ADD CONSTRAINT `itens_venda_produto_ibfk_2` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id_produto`);

--
-- Limitadores para a tabela `parcela_venda`
--
ALTER TABLE `parcela_venda`
  ADD CONSTRAINT `parcela_venda_ibfk_1` FOREIGN KEY (`cod_venda`) REFERENCES `venda` (`id_venda`),
  ADD CONSTRAINT `parcela_venda_ibfk_2` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id_cliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
