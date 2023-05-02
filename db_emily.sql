CREATE DATABASE  IF NOT EXISTS `db_emily` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `db_emily`;
-- MySQL dump 10.13  Distrib 5.7.26, for Win64 (x86_64)
--
-- Host: localhost    Database: db_emily
-- ------------------------------------------------------
-- Server version	5.7.24

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `idcliente` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `rg` varchar(45) DEFAULT NULL,
  `cpf` varchar(45) DEFAULT NULL,
  `sexo` varchar(10) DEFAULT NULL,
  `data_nascimento` date DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `telefone` varchar(45) DEFAULT NULL,
  `endereco` varchar(45) DEFAULT NULL,
  `bairro` varchar(45) DEFAULT NULL,
  `numero` varchar(45) DEFAULT NULL,
  `cep` varchar(45) DEFAULT NULL,
  `cidade` varchar(45) DEFAULT NULL,
  `estado` varchar(45) NOT NULL,
  `complemento` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idcliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Nicolas','1.667.155','044.443.550.99','Masculino','2023-05-02','emilysdas@gmail.com','(67)99100222123','Rua Presidente Vargas','ipê','10','799.00-00','Ponta Porã','MS','Teste de cliente2');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produto` (
  `idproduto` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `valor_unitario` varchar(45) DEFAULT NULL,
  `quantidadeEstoque` varchar(45) DEFAULT NULL,
  `categoria` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idproduto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (1,'Sabão','17','100','Rosto');
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `senha` varchar(20) DEFAULT NULL,
  `nivel` varchar(20) DEFAULT NULL,
  `ativo` varchar(4) DEFAULT NULL,
  `apelido` varchar(24) DEFAULT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'flores','12345','adm','s','jo');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venda`
--

DROP TABLE IF EXISTS `venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venda` (
  `idvenda` int(11) NOT NULL,
  `cliente` int(11) DEFAULT NULL,
  `vendedor` int(11) DEFAULT NULL,
  `total` decimal(10,2) DEFAULT NULL,
  `data_venda` date DEFAULT NULL,
  PRIMARY KEY (`idvenda`),
  KEY `cliente_idx` (`cliente`),
  KEY `vendedor_idx` (`vendedor`),
  CONSTRAINT `cliente` FOREIGN KEY (`cliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `vendedor` FOREIGN KEY (`vendedor`) REFERENCES `vendedor` (`idvendedor`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venda`
--

LOCK TABLES `venda` WRITE;
/*!40000 ALTER TABLE `venda` DISABLE KEYS */;
/*!40000 ALTER TABLE `venda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venda_produto`
--

DROP TABLE IF EXISTS `venda_produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venda_produto` (
  `idvenda_produto` int(11) NOT NULL,
  `produto` int(11) DEFAULT NULL,
  `venda` int(11) DEFAULT NULL,
  `quantidade` varchar(45) DEFAULT NULL,
  `valor_unitario` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idvenda_produto`),
  UNIQUE KEY `idvenda_produto_UNIQUE` (`idvenda_produto`),
  KEY `produto_idx` (`produto`),
  KEY `venda_idx` (`venda`),
  CONSTRAINT `produto` FOREIGN KEY (`produto`) REFERENCES `produto` (`idproduto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `venda` FOREIGN KEY (`venda`) REFERENCES `venda` (`idvenda`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venda_produto`
--

LOCK TABLES `venda_produto` WRITE;
/*!40000 ALTER TABLE `venda_produto` DISABLE KEYS */;
/*!40000 ALTER TABLE `venda_produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendedor`
--

DROP TABLE IF EXISTS `vendedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vendedor` (
  `idvendedor` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `sobrenome` varchar(45) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `rg` varchar(14) DEFAULT NULL,
  `endereco` varchar(45) DEFAULT NULL,
  `ativo` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`idvendedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendedor`
--

LOCK TABLES `vendedor` WRITE;
/*!40000 ALTER TABLE `vendedor` DISABLE KEYS */;
INSERT INTO `vendedor` VALUES (1,'flores','perez','000.000.00-11','1.222.222','R.Centro','s');
/*!40000 ALTER TABLE `vendedor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-02  2:32:35
