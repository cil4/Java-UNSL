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
-- Table structure for table `estudiante`
--

DROP TABLE IF EXISTS `estudiante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudiante` (
  `E_DNI` int NOT NULL,
  `E_Nbre` varchar(50) NOT NULL,
  `E_Apell` varchar(50) NOT NULL,
  `E_Tel` varchar(20) NOT NULL,
  `E_Email` varchar(120) NOT NULL,
  `E_Foto` varchar(250) NOT NULL,
  `E_Curso` int NOT NULL,
  `E_NbreTutor` varchar(50) NOT NULL,
  `E_ApellTutor` varchar(50) NOT NULL,
  `U_Key` varchar(10) NOT NULL,
  PRIMARY KEY (`E_DNI`,`U_Key`),
  UNIQUE KEY `E_DNI` (`E_DNI`),
  KEY `fk_key_idx` (`U_Key`),
  CONSTRAINT `fk_usuario_key` FOREIGN KEY (`U_Key`) REFERENCES `usuario` (`U_Key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante`
--

LOCK TABLES `estudiante` WRITE;
/*!40000 ALTER TABLE `estudiante` DISABLE KEYS */;
INSERT INTO `estudiante` VALUES (29300767,'Norma','Collucci','1123239800','normacollucci@gmail.com','',102,'Antonia','Vazquez','normaC3'),(30222111,'roberto','ze','2211221122','zepekenio@mail.com','C:\\Users\\netXMM\\Documents\\NetBeansProjects\\Final_Integrador\\src\\Resources\\fotos_usuario\\student.jpg',203,'uriel','simoni','zepekeni'),(38111909,'Walter','Torres','1190877700','walter_t@gmail.com','',203,'Teresa','Gutierrez','ferrari32'),(39000528,'Macarena','Garcia','1190908855','macagarcia@gmail.com','',101,'Pedro','Sanchez','cereza002'),(40010101,'yago','lares','9099009900','yago_l@gmail.com','C:\\Users\\netXMM\\Documents\\NetBeansProjects\\Final_Integrador\\src\\Resources\\fotos_usuario\\student3.jpg',203,'teresa','campos','lalala90'),(40123321,'Fiorella','Tarrez','11909900908','fiorella_tarrez@gmail.com','C:\\Users\\netXMM\\Documents\\NetBeansProjects\\Final_Integrador\\src\\Resources\\fotos_usuario\\student2.jpg',103,'antonio','rios','aaa90ZX'),(41010376,'Agustin','Paez','1178006324','agus_rocket@gmail.com','',203,'Sandra','Palermo','TT91@-mm'),(41909888,'Delia','Juarez','1133221122','delia@gmail.com','C:\\Users\\netXMM\\Documents\\NetBeansProjects\\Final_Integrador\\src\\Resources\\fotos_usuario\\student2.jpg',203,'teresa','campos','coco90'),(90777777,'lila','violeta','1129922990','lila_v@gmail.com','C:\\Users\\netXMM\\Documents\\NetBeansProjects\\Final_Integrador\\src\\Resources\\fotos_usuario\\student2.jpg',102,'Teresa','Campos','stich');
/*!40000 ALTER TABLE `estudiante` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-05 18:18:01
