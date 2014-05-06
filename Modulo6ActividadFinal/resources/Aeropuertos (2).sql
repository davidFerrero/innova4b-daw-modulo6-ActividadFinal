-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 05-05-2014 a las 21:32:32
-- Versión del servidor: 5.5.37-0ubuntu0.14.04.1
-- Versión de PHP: 5.5.9-1ubuntu4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `Aeropuertos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Aeropuerto`
--

CREATE TABLE IF NOT EXISTS `Aeropuerto` (
  `idAeropuerto` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `idLocalidad` int(11) NOT NULL,
  PRIMARY KEY (`idAeropuerto`),
  KEY `idLocalidad` (`idLocalidad`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `Aeropuerto`
--

INSERT INTO `Aeropuerto` (`idAeropuerto`, `nombre`, `idLocalidad`) VALUES
(1, 'Madrid Barajas', 1),
(2, 'Zamora', 2),
(3, 'Londres', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Avion`
--

CREATE TABLE IF NOT EXISTS `Avion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `modelo` varchar(45) COLLATE latin1_german1_ci NOT NULL,
  `maxPasajeros` int(11) NOT NULL,
  `personalAbordo` int(11) NOT NULL,
  `idCompañia` int(11) NOT NULL,
  `idEstado` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idCompañia` (`idCompañia`),
  KEY `idEstadoAvion` (`idEstado`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 COLLATE=latin1_german1_ci AUTO_INCREMENT=14 ;

--
-- Volcado de datos para la tabla `Avion`
--

INSERT INTO `Avion` (`id`, `modelo`, `maxPasajeros`, `personalAbordo`, `idCompañia`, `idEstado`) VALUES
(1, 'AIRBUS 347', 200, 5, 1, 1),
(2, 'AIRBUS 374', 250, 8, 2, 2),
(3, 'AIRBUS 647', 300, 5, 1, 4),
(4, 'AIRBUS 674', 350, 8, 2, 3),
(8, 'AIRBUS 347', 200, 5, 1, 1),
(9, 'AIRBUS 374', 250, 8, 2, 2),
(10, 'AIRBUS 647', 300, 5, 1, 4),
(11, 'AIRBUS 674', 350, 8, 2, 3),
(12, 'AIRBUS 247', 100, 5, 1, 1),
(13, 'AIRBUS 274', 100, 8, 2, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Billete`
--

CREATE TABLE IF NOT EXISTS `Billete` (
  `dni` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `dtNacimiento` date NOT NULL,
  `asiento` int(11) NOT NULL,
  `dtVuelo` date NOT NULL,
  `CodBillete` varchar(45) NOT NULL,
  `idVuelo` int(11) NOT NULL,
  `embarca` int(11) NOT NULL,
  `idBillete` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idBillete`),
  KEY `idVuelo` (`idVuelo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `Billete`
--

INSERT INTO `Billete` (`dni`, `nombre`, `apellidos`, `dtNacimiento`, `asiento`, `dtVuelo`, `CodBillete`, `idVuelo`, `embarca`, `idBillete`) VALUES
('11111111A', 'Nombre1', 'Apellido1', '2014-05-05', 1, '2014-05-15', '001', 1, 1, 1),
('22222222A', 'Nombre2', 'Apellido2', '2014-05-01', 2, '2014-05-10', '001', 1, 1, 2),
('3333333A', 'Nombre3', 'Apellido3', '2014-05-21', 3, '2014-05-21', '001', 1, 1, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Compañia`
--

CREATE TABLE IF NOT EXISTS `Compañia` (
  `nombre` varchar(45) NOT NULL,
  `codLicencia` varchar(45) DEFAULT NULL,
  `dtConcesion` date DEFAULT NULL,
  `dtCaducidad` date DEFAULT NULL,
  `idCompañia` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idCompañia`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `Compañia`
--

INSERT INTO `Compañia` (`nombre`, `codLicencia`, `dtConcesion`, `dtCaducidad`, `idCompañia`) VALUES
('Iberia', 'IBERIA001', '2012-05-04', '2013-05-04', 1),
('AIR EUROPA', 'AIREUROPA001', '2014-05-04', '2016-05-04', 2),
('RYANAIR', 'RYANAIR001', '2014-05-04', '2018-05-04', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `EstadoAvion`
--

CREATE TABLE IF NOT EXISTS `EstadoAvion` (
  `idEstado` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(45) NOT NULL,
  PRIMARY KEY (`idEstado`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `EstadoAvion`
--

INSERT INTO `EstadoAvion` (`idEstado`, `Descripcion`) VALUES
(1, 'Sin incidencia'),
(2, 'Sin incidencia en revision'),
(3, 'Con incidencia en taller'),
(4, 'Con incidencia en reparacion');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `EstadoPuerta`
--

CREATE TABLE IF NOT EXISTS `EstadoPuerta` (
  `idEstado` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) NOT NULL,
  PRIMARY KEY (`idEstado`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `EstadoPuerta`
--

INSERT INTO `EstadoPuerta` (`idEstado`, `descripcion`) VALUES
(1, 'Abierta'),
(2, 'Cerrada');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Localidad`
--

CREATE TABLE IF NOT EXISTS `Localidad` (
  `idLocalidad` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `territorio` varchar(45) NOT NULL,
  PRIMARY KEY (`idLocalidad`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `Localidad`
--

INSERT INTO `Localidad` (`idLocalidad`, `nombre`, `territorio`) VALUES
(1, 'Madrid', 'España'),
(2, 'Paris', 'Francia'),
(3, 'londres', 'Reino Unido');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `PuertaEmbarque`
--

CREATE TABLE IF NOT EXISTS `PuertaEmbarque` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idAeropuerto` int(11) NOT NULL,
  `idEstadoPuerta` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idAeropuerto` (`idAeropuerto`),
  KEY `idEstadoPuerta` (`idEstadoPuerta`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=37 ;

--
-- Volcado de datos para la tabla `PuertaEmbarque`
--

INSERT INTO `PuertaEmbarque` (`id`, `idAeropuerto`, `idEstadoPuerta`) VALUES
(1, 1, 1),
(2, 3, 1),
(3, 1, 1),
(4, 3, 2),
(5, 1, 1),
(6, 1, 1),
(7, 1, 1),
(8, 1, 1),
(9, 1, 1),
(10, 1, 2),
(18, 1, 1),
(19, 1, 2),
(25, 1, 1),
(26, 1, 2),
(27, 1, 2),
(28, 1, 1),
(29, 1, 1),
(30, 2, 1),
(31, 2, 2),
(32, 2, 2),
(33, 2, 1),
(34, 2, 1),
(35, 2, 1),
(36, 2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Vuelo`
--

CREATE TABLE IF NOT EXISTS `Vuelo` (
  `idVuelo` int(11) NOT NULL AUTO_INCREMENT,
  `idCompañia` int(11) NOT NULL,
  `idPuertaEmbarqueSalida` int(11) NOT NULL,
  `horaSalida` date NOT NULL,
  `idPuertaEmbarqueLlegada` int(11) NOT NULL COMMENT '			',
  `horaLlegada` date NOT NULL,
  `idAvion` int(11) NOT NULL,
  PRIMARY KEY (`idVuelo`),
  KEY `idCompañia` (`idCompañia`),
  KEY `idPuertaEmbarqueSalida` (`idPuertaEmbarqueSalida`),
  KEY `idPuertaEmbarqueLlegada` (`idPuertaEmbarqueLlegada`),
  KEY `idAvion` (`idAvion`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcado de datos para la tabla `Vuelo`
--

INSERT INTO `Vuelo` (`idVuelo`, `idCompañia`, `idPuertaEmbarqueSalida`, `horaSalida`, `idPuertaEmbarqueLlegada`, `horaLlegada`, `idAvion`) VALUES
(1, 1, 2, '2014-05-04', 2, '2014-05-15', 1),
(2, 1, 2, '2014-06-04', 2, '2014-06-04', 1),
(3, 1, 2, '2014-08-04', 2, '2014-08-04', 1),
(4, 3, 2, '2014-05-19', 2, '2014-05-20', 1),
(5, 2, 3, '2014-05-12', 6, '2014-05-12', 3);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Aeropuerto`
--
ALTER TABLE `Aeropuerto`
  ADD CONSTRAINT `fk_idLocalidad` FOREIGN KEY (`idLocalidad`) REFERENCES `Localidad` (`idLocalidad`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `Avion`
--
ALTER TABLE `Avion`
  ADD CONSTRAINT `fk_idEstadoAvion` FOREIGN KEY (`idEstado`) REFERENCES `EstadoAvion` (`idEstado`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_idCompañiaAvion` FOREIGN KEY (`idCompañia`) REFERENCES `Compañia` (`idCompañia`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `Billete`
--
ALTER TABLE `Billete`
  ADD CONSTRAINT `fk_idVuelo` FOREIGN KEY (`idVuelo`) REFERENCES `Vuelo` (`idVuelo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `PuertaEmbarque`
--
ALTER TABLE `PuertaEmbarque`
  ADD CONSTRAINT `fk_idEstadoPuerta` FOREIGN KEY (`idEstadoPuerta`) REFERENCES `EstadoPuerta` (`idEstado`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_IdAeropuero` FOREIGN KEY (`idAeropuerto`) REFERENCES `Aeropuerto` (`idAeropuerto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `Vuelo`
--
ALTER TABLE `Vuelo`
  ADD CONSTRAINT `fk_idPuertaEmbarqueLlegada` FOREIGN KEY (`idPuertaEmbarqueLlegada`) REFERENCES `PuertaEmbarque` (`id`),
  ADD CONSTRAINT `fk_idAvion` FOREIGN KEY (`idAvion`) REFERENCES `Avion` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_idCompañia` FOREIGN KEY (`idCompañia`) REFERENCES `Compañia` (`idCompañia`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_idPuertaEmbarqueSalida` FOREIGN KEY (`idPuertaEmbarqueSalida`) REFERENCES `PuertaEmbarque` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
