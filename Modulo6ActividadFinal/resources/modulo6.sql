-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 23-04-2014 a las 18:40:09
-- Versión del servidor: 5.5.35-1ubuntu1
-- Versión de PHP: 5.5.9-1ubuntu4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `modulo6`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Aeropuerto`
--

CREATE TABLE IF NOT EXISTS `Aeropuerto` (
  `nombre` varchar(45) NOT NULL,
  `Aeropuertocol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Avion`
--

CREATE TABLE IF NOT EXISTS `Avion` (
  `id` int(11) NOT NULL,
  `modelo` varchar(45) DEFAULT NULL,
  `maxPasajeros` int(11) DEFAULT NULL,
  `personalAbordo` int(11) DEFAULT NULL,
  `EstadoAvion_estado` int(11) NOT NULL,
  `Compañia_nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id`,`Compañia_nombre`),
  KEY `fk_Avion_EstadoAvion1_idx` (`EstadoAvion_estado`),
  KEY `fk_Avion_Compañia1_idx` (`Compañia_nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Billete`
--

CREATE TABLE IF NOT EXISTS `Billete` (
  `dni` varchar(45) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `fNacimiento` date DEFAULT NULL,
  `asiento` int(11) DEFAULT NULL,
  `fVuelo` date DEFAULT NULL,
  `CodBillete` varchar(45) DEFAULT NULL,
  `Vuelo_id` int(11) NOT NULL,
  `Vuelo_Compañia_nombre` varchar(45) NOT NULL COMMENT '	',
  `embarca` int(11) DEFAULT NULL,
  PRIMARY KEY (`dni`),
  KEY `fk_Billete_Vuelo1_idx` (`Vuelo_id`,`Vuelo_Compañia_nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Compañia`
--

CREATE TABLE IF NOT EXISTS `Compañia` (
  `nombre` varchar(45) NOT NULL,
  `codLicencia` varchar(45) DEFAULT NULL,
  `fConcesion` date DEFAULT NULL,
  `fCaducidad` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `EstadoAvion`
--

CREATE TABLE IF NOT EXISTS `EstadoAvion` (
  `estado` int(11) NOT NULL,
  PRIMARY KEY (`estado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `EstadoPuerta`
--

CREATE TABLE IF NOT EXISTS `EstadoPuerta` (
  `estado` varchar(45) NOT NULL,
  PRIMARY KEY (`estado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `PuertaEmbarque`
--

CREATE TABLE IF NOT EXISTS `PuertaEmbarque` (
  `id` int(11) NOT NULL,
  `Aeropuerto_nombre` varchar(45) NOT NULL,
  `EstadoPuerta_estado` varchar(45) NOT NULL,
  PRIMARY KEY (`id`,`Aeropuerto_nombre`),
  KEY `fk_PuertaEmbarque_Aeropuerto_idx` (`Aeropuerto_nombre`),
  KEY `fk_PuertaEmbarque_EstadoPuerta1_idx` (`EstadoPuerta_estado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Vuelo`
--

CREATE TABLE IF NOT EXISTS `Vuelo` (
  `id` int(11) NOT NULL,
  `Compañia_nombre` varchar(45) NOT NULL,
  `PuertaEmbarque_id_Salida` int(11) NOT NULL,
  `PuertaEmbarque_Aeropuerto_nombre_salida` varchar(45) NOT NULL,
  `horaSalida` date DEFAULT NULL,
  `PuertaEmbarque_id_llegada` int(11) NOT NULL COMMENT '			',
  `PuertaEmbarque_Aeropuerto_nombre_llegada` varchar(45) NOT NULL,
  `horaLlegada` date DEFAULT NULL,
  `Avion_id` int(11) NOT NULL,
  `Avion_Compañia_nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`id`,`Compañia_nombre`),
  KEY `fk_Vuelo_Compañia1_idx` (`Compañia_nombre`),
  KEY `fk_Vuelo_PuertaEmbarque1_idx` (`PuertaEmbarque_id_Salida`,`PuertaEmbarque_Aeropuerto_nombre_salida`),
  KEY `fk_Vuelo_PuertaEmbarque2_idx` (`PuertaEmbarque_id_llegada`,`PuertaEmbarque_Aeropuerto_nombre_llegada`),
  KEY `fk_Vuelo_Avion1_idx` (`Avion_id`,`Avion_Compañia_nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Avion`
--
ALTER TABLE `Avion`
  ADD CONSTRAINT `fk_Avion_Compañia1` FOREIGN KEY (`Compañia_nombre`) REFERENCES `Compañia` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Avion_EstadoAvion1` FOREIGN KEY (`EstadoAvion_estado`) REFERENCES `EstadoAvion` (`estado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `Billete`
--
ALTER TABLE `Billete`
  ADD CONSTRAINT `fk_Billete_Vuelo1` FOREIGN KEY (`Vuelo_id`, `Vuelo_Compañia_nombre`) REFERENCES `Vuelo` (`id`, `Compañia_nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `PuertaEmbarque`
--
ALTER TABLE `PuertaEmbarque`
  ADD CONSTRAINT `fk_PuertaEmbarque_Aeropuerto` FOREIGN KEY (`Aeropuerto_nombre`) REFERENCES `Aeropuerto` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_PuertaEmbarque_EstadoPuerta1` FOREIGN KEY (`EstadoPuerta_estado`) REFERENCES `EstadoPuerta` (`estado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `Vuelo`
--
ALTER TABLE `Vuelo`
  ADD CONSTRAINT `fk_Vuelo_Avion1` FOREIGN KEY (`Avion_id`, `Avion_Compañia_nombre`) REFERENCES `Avion` (`id`, `Compañia_nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Vuelo_Compañia1` FOREIGN KEY (`Compañia_nombre`) REFERENCES `Compañia` (`nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Vuelo_PuertaEmbarque1` FOREIGN KEY (`PuertaEmbarque_id_Salida`, `PuertaEmbarque_Aeropuerto_nombre_salida`) REFERENCES `PuertaEmbarque` (`id`, `Aeropuerto_nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Vuelo_PuertaEmbarque2` FOREIGN KEY (`PuertaEmbarque_id_llegada`, `PuertaEmbarque_Aeropuerto_nombre_llegada`) REFERENCES `PuertaEmbarque` (`id`, `Aeropuerto_nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
