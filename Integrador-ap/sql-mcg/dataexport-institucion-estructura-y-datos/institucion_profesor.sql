-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: institucion
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `profesor`
--

DROP TABLE IF EXISTS `profesor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profesor` (
  `P_CUIL` bigint NOT NULL,
  `P_Nbre` varchar(50) NOT NULL,
  `P_Apell` varchar(50) NOT NULL,
  `P_Tel` varchar(15) NOT NULL,
  `P_Email` varchar(120) NOT NULL,
  `P_Foto` varchar(250) NOT NULL,
  `P_Cond` enum('Planta Permanente','Suplente') NOT NULL,
  `U_Key` varchar(10) NOT NULL,
  PRIMARY KEY (`P_CUIL`,`U_Key`),
  UNIQUE KEY `P_CUIL` (`P_CUIL`),
  KEY `fk_p_key_idx` (`U_Key`),
  CONSTRAINT `fk_p_key` FOREIGN KEY (`U_Key`) REFERENCES `usuario` (`U_Key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesor`
--

LOCK TABLES `profesor` WRITE;
/*!40000 ALTER TABLE `profesor` DISABLE KEYS */;
INSERT INTO `profesor` VALUES (20334129003,'Hector','Tievas','3718762312','hector77@gmail.com','','Suplente','auto00ZW'),(20348900987,'Poliana','Zakharova','3704909009','poli_prof@gmail.com','C:\\Users\\netXMM\\Documents\\NetBeansProjects\\Final_Integrador\\src\\Resources\\fotos_usuario\\student.jpg','Planta Permanente','11111'),(20908976783,'rolando','insfran','3777908977','roly@gmail.com','C:\\Users\\netXMM\\Documents\\NetBeansProjects\\Final_Integrador\\src\\Resources\\fotos_usuario\\student3.jpg','Planta Permanente','rolrol'),(27347876905,'Mabel','Diaz','1190908867','profemabeldiaz@gmail.com','','Planta Permanente','pavaQV9'),(27409992124,'Dolores','Caceres','3769221100','lola_prof@gmail.com','','Suplente','tecito88@!'),(27899090906,'Ana','Morales','90909090','ani@gmail.com','C:\\Users\\netXMM\\Documents\\NetBeansProjects\\Final_Integrador\\src\\Resources\\fotos_usuario\\student.jpg','Suplente','12345'),(27903231213,'agustina','herrera','119090909','tina@gmail.com','C:\\Users\\netXMM\\Documents\\NetBeansProjects\\Final_Integrador\\src\\Resources\\fotos_usuario\\student2.jpg','Suplente','pipu7170');
/*!40000 ALTER TABLE `profesor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-05 18:18:02
