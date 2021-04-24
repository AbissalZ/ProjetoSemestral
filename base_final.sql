-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Apr 14, 2021 at 01:49 PM
-- Server version: 8.0.21
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `base_final`
--

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(3);

-- --------------------------------------------------------

--
-- Table structure for table `hospedagem`
--

DROP TABLE IF EXISTS `hospedagem`;
CREATE TABLE IF NOT EXISTS `hospedagem` (
  `nrDeHospedagem` int NOT NULL,
  `dataEntrada` varchar(255) DEFAULT NULL,
  `dataSaida` varchar(255) DEFAULT NULL,
  `nrDeHospedes` int NOT NULL,
  `hospede_idPessoa` int DEFAULT NULL,
  `quarto_idQuarto` int DEFAULT NULL,
  `reserva_idReserva` int DEFAULT NULL,
  PRIMARY KEY (`nrDeHospedagem`),
  KEY `FK2348ocaelt2eun3wrjwiwaqa` (`hospede_idPessoa`),
  KEY `FKdvunl5mm67ggfw0ib5jmoaelg` (`quarto_idQuarto`),
  KEY `FKpkxm4nirhxmh1j6esvxxxveiv` (`reserva_idReserva`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `hospedagem`
--

INSERT INTO `hospedagem` (`nrDeHospedagem`, `dataEntrada`, `dataSaida`, `nrDeHospedes`, `hospede_idPessoa`, `quarto_idQuarto`, `reserva_idReserva`) VALUES
(1, '03/06/2020', NULL, 0, 1, 1, NULL),
(2, '13/35/2021', '15/35/2021', 3, 1, 2, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `hospedes`
--

DROP TABLE IF EXISTS `hospedes`;
CREATE TABLE IF NOT EXISTS `hospedes` (
  `nacionalidade` varchar(255) DEFAULT NULL,
  `nrDoc` varchar(255) DEFAULT NULL,
  `nrHospede` int DEFAULT NULL,
  `tipoDeDoc` varchar(255) DEFAULT NULL,
  `idPessoa` int NOT NULL,
  PRIMARY KEY (`idPessoa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `hospedes`
--

INSERT INTO `hospedes` (`nacionalidade`, `nrDoc`, `nrHospede`, `tipoDeDoc`, `idPessoa`) VALUES
('Mocambicana', '090100610858A', 8112, 'B.I', 1);

-- --------------------------------------------------------

--
-- Table structure for table `pessoas`
--

DROP TABLE IF EXISTS `pessoas`;
CREATE TABLE IF NOT EXISTS `pessoas` (
  `idPessoa` int NOT NULL AUTO_INCREMENT,
  `apelido` varchar(255) DEFAULT NULL,
  `dataNascimento` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idPessoa`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `pessoas`
--

INSERT INTO `pessoas` (`idPessoa`, `apelido`, `dataNascimento`, `email`, `nome`, `telefone`) VALUES
(1, 'Zita', '09/09/199*', 'abissalzita09@gmail.com', 'Abissal', '845902155');

-- --------------------------------------------------------

--
-- Table structure for table `quartos`
--

DROP TABLE IF EXISTS `quartos`;
CREATE TABLE IF NOT EXISTS `quartos` (
  `idQuarto` int NOT NULL AUTO_INCREMENT,
  `Disp` varchar(255) DEFAULT NULL,
  `numeroQuarto` int DEFAULT NULL,
  `preco` double NOT NULL,
  `status` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idQuarto`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `quartos`
--

INSERT INTO `quartos` (`idQuarto`, `Disp`, `numeroQuarto`, `preco`, `status`, `tipo`) VALUES
(1, 'Disponivel', 5953, 2500, '1 Estrelas', 'Single'),
(2, 'Disponivel', 2494, 2500, '1 Estrela', 'Single'),
(3, 'Disponivel', 6387, 3800, '2 Estrelas', 'Single'),
(4, 'Disponivel', 6463, 3800, '2 Estrelas', 'Single'),
(5, 'Disponivel', 9163, 4000, '3 Estrelas', 'Twin Single'),
(6, 'Disponivel', 8598, 4000, '3 Estrelas', 'Twin Single'),
(7, 'Disponivel', 5600, 6000, '5 Estrelas', 'Twin Single'),
(8, 'Disponivel', 2608, 6000, '5 Estrelas', 'Twin Single'),
(9, 'Disponivel', 1534, 5000, '4 Estrelas', 'Casal'),
(10, 'Disponivel', 4548, 5000, '4 Estrelas', 'Casal'),
(11, 'Disponivel', 4456, 3500, '3 Estrelas', 'Casal'),
(12, 'Disponivel', 2161, 2900, '2 Estrelas', 'Casal'),
(13, 'Disponivel', 1267, 4600, '2 Estrelas', 'Grupo 3'),
(14, 'Disponivel', 6763, 4600, '2 Estrelas', 'Grupo 4'),
(15, 'Disponivel', 5732, 7300, '5 Estrelas', 'Suit Master');

-- --------------------------------------------------------

--
-- Table structure for table `reservas`
--

DROP TABLE IF EXISTS `reservas`;
CREATE TABLE IF NOT EXISTS `reservas` (
  `idReserva` int NOT NULL AUTO_INCREMENT,
  `CodReserva` int DEFAULT NULL,
  `dataChegada` varchar(255) DEFAULT NULL,
  `dataReserva` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `pagamento` bit(1) NOT NULL,
  `tempoEstadia` int DEFAULT NULL,
  `hospede_idPessoa` int DEFAULT NULL,
  `quartos_idQuarto` int DEFAULT NULL,
  PRIMARY KEY (`idReserva`),
  KEY `FKsdysd5q32rilb9ledn4s5ujv9` (`hospede_idPessoa`),
  KEY `FKhkwmvirthuowis3m19bqbooq0` (`quartos_idQuarto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `nivelAcesso` varchar(255) DEFAULT NULL,
  `passWord` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `idPessoa` int NOT NULL,
  PRIMARY KEY (`idPessoa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `hospedagem`
--
ALTER TABLE `hospedagem`
  ADD CONSTRAINT `FK2348ocaelt2eun3wrjwiwaqa` FOREIGN KEY (`hospede_idPessoa`) REFERENCES `hospedes` (`idPessoa`),
  ADD CONSTRAINT `FKdvunl5mm67ggfw0ib5jmoaelg` FOREIGN KEY (`quarto_idQuarto`) REFERENCES `quartos` (`idQuarto`),
  ADD CONSTRAINT `FKpkxm4nirhxmh1j6esvxxxveiv` FOREIGN KEY (`reserva_idReserva`) REFERENCES `reservas` (`idReserva`);

--
-- Constraints for table `hospedes`
--
ALTER TABLE `hospedes`
  ADD CONSTRAINT `FK7kg49kohlm2ykliaauq1cpn7u` FOREIGN KEY (`idPessoa`) REFERENCES `pessoas` (`idPessoa`);

--
-- Constraints for table `reservas`
--
ALTER TABLE `reservas`
  ADD CONSTRAINT `FKhkwmvirthuowis3m19bqbooq0` FOREIGN KEY (`quartos_idQuarto`) REFERENCES `quartos` (`idQuarto`),
  ADD CONSTRAINT `FKsdysd5q32rilb9ledn4s5ujv9` FOREIGN KEY (`hospede_idPessoa`) REFERENCES `hospedes` (`idPessoa`);

--
-- Constraints for table `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `FK6n8ofixbt304ashjo0wgwj7ey` FOREIGN KEY (`idPessoa`) REFERENCES `pessoas` (`idPessoa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
