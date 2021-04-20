-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 09-11-2020 a las 19:32:50
-- Versión del servidor: 5.7.24
-- Versión de PHP: 7.2.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `torneo_tenis`
--
CREATE DATABASE IF NOT EXISTS `torneo_tenis` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE `torneo_tenis`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `id_categoria` bigint(20) NOT NULL,
  `nombre` varchar(30) COLLATE utf8_spanish_ci DEFAULT NULL,
  `edad_min` int(3) DEFAULT NULL,
  `edad_max` int(3) DEFAULT NULL,
  `sexo` varchar(1) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`id_categoria`, `nombre`, `edad_min`, `edad_max`, `sexo`) VALUES
(1, 'Damas A', 18, 34, 'F'),
(2, 'Damas B', 35, 45, 'F'),
(3, 'Damas C', 46, 100, 'F'),
(4, 'Caballeros A', 18, 34, 'M'),
(5, 'Caballeros B', 35, 50, 'M'),
(6, 'Caballeros C', 51, 100, 'M'),
(7, 'Juveniles Varones', 13, 17, 'M'),
(8, 'Juveniles Mujeres', 13, 17, 'F');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripcion`
--

CREATE TABLE `inscripcion` (
  `num_inscripcion` bigint(20) NOT NULL,
  `id_participante` bigint(20) DEFAULT NULL,
  `id_categoria` bigint(20) DEFAULT NULL,
  `fecha_insc` date DEFAULT NULL,
  `abono_inscrip` tinyint(1) DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `inscripcion`
--

INSERT INTO `inscripcion` (`num_inscripcion`, `id_participante`, `id_categoria`, `fecha_insc`, `abono_inscrip`) VALUES
(1, 1, 4, '2020-11-09', 0),
(2, 2, 8, '2020-11-09', 1),
(3, 3, 7, '2020-11-09', 1),
(4, 4, 5, '2020-11-09', 1),
(5, 5, 5, '2020-11-09', 1),
(6, 6, 4, '2020-11-09', 1),
(7, 7, 6, '2020-11-09', 0),
(8, 8, 1, '2020-11-09', 0),
(9, 9, 6, '2020-11-09', 1),
(10, 10, 1, '2020-11-09', 1),
(11, 11, 3, '2020-11-09', 1),
(12, 12, 4, '2020-11-09', 1),
(13, 13, 6, '2020-11-09', 1),
(14, 14, 4, '2020-11-09', 1),
(15, 15, 3, '2020-11-09', 1),
(16, 16, 2, '2020-11-09', 1),
(17, 17, 2, '2020-11-09', 1),
(18, 18, 4, '2020-11-09', 1),
(19, 19, 5, '2020-11-09', 1),
(20, 20, 5, '2020-11-09', 1),
(21, 21, 7, '2020-11-09', 1),
(22, 22, 8, '2020-11-09', 1),
(23, 23, 4, '2020-11-09', 1),
(24, 24, 8, '2020-11-09', 0),
(25, 25, 5, '2020-11-09', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `participante`
--

CREATE TABLE `participante` (
  `id_participante` bigint(20) NOT NULL,
  `dni_participante` varchar(10) COLLATE utf8_spanish_ci DEFAULT NULL,
  `apellido` varchar(30) COLLATE utf8_spanish_ci DEFAULT NULL,
  `nombre` varchar(30) COLLATE utf8_spanish_ci DEFAULT NULL,
  `direccion` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `edad` int(3) DEFAULT NULL,
  `telefono` varchar(15) COLLATE utf8_spanish_ci DEFAULT NULL,
  `sexo` varchar(1) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `participante`
--

INSERT INTO `participante` (`id_participante`, `dni_participante`, `apellido`, `nombre`, `direccion`, `edad`, `telefono`, `sexo`) VALUES
(1, '41764487', 'Barbera', 'Luis', 'Avenida  Azteca Valiente 103, 1º 5ª', 28, '635-963-581', 'M'),
(2, '26053323', 'Romero', 'María Carmen', 'Calle  Acrobacia Sincera 226, 1', 15, '641-937-202', 'F'),
(3, '73290051', 'Borras', 'José Luis', 'Plaza  Heterótrofo Sensible 207, 6', 14, '669-840-346', 'M'),
(4, '41541117', 'Martin', 'José', 'Plaza Selva 64, 6º', 35, '612-523-103', 'M'),
(5, '43154380', 'Fernández', 'Juan Antonio', 'Plaza Orgánulo Dulce 256, 2', 36, '607-147-381', 'M'),
(6, '47899056', 'Aparicio', 'David', 'Avenida Bisectriz 231, 4º', 20, '644-251-316', 'M'),
(7, '72006328', 'Pérez', 'Carlos', 'Avenida Capitulación 207, 6º', 79, '667-615-331', 'M'),
(8, '72098891', 'Márquez', 'Francisca', 'Paseo de la Supervivencia Aurífera 195, 1º 5ª', 34, '616-627-891', 'F'),
(9, '74463771', 'Díaz', 'Francisco Javier', 'Calle el Vulcanismo 77, 5º', 53, '689-729-238', 'M'),
(10, '97234314', 'Hermida', 'María Ángeles', 'Paseo Envase Nuevo 208, 1º 3ª', 18, '633-614-679', 'F'),
(11, '34220457', 'Estrada', 'Antonia', 'Avenida Estrella 171 bis, 2', 71, '615-527-015', 'F'),
(12, '54861812', 'Ramos', 'Juan Antonio', 'Calle Concepción Fría 10, 5º', 23, '645-076-037', 'M'),
(13, '14631276', 'Pina', 'Francisco Javier', 'Paseo Procesión Grande 60, 4º', 70, '683-007-275', 'M'),
(14, '24750496', 'Pérez', 'Juan', 'Plaza Bizcocho 219, 5', 19, '685-841-281', 'M'),
(15, '55498320', 'Beltrán', 'Josefa', 'Calle del Acaecimiento Venenoso 182, 4º', 72, '660-518-599', 'F'),
(16, '69422337', 'Lorenzo', 'Sara', 'Paseo del Abrupto 70 bis, 2º 4ª', 45, '645-625-318', 'F'),
(17, '99595646', 'Rodríguez', 'Ana María', 'Calle Júbilo 198, 5º', 35, '650-296-288', 'F'),
(18, '03968364', 'Querol', 'Jorge', 'Avenida Histológico Feo 264 bis, 6', 20, '650-640-516', 'M'),
(19, '16205507', 'Velázquez', 'Enrique', 'Plaza  Único Responsable 103, 4', 60, '674-479-483', 'M'),
(20, '42331753', 'Villar', 'Juan José', 'Avenida Septentrional Cruel 4, 3', 43, '642-169-558', 'M'),
(21, '11962265', 'Pérez', 'Javier', 'Avenida  Acusación Luminosa 199, 2', 17, '607-479-082', 'M'),
(22, '82385799', 'Martínez', 'Manuela', 'Plaza  Abastecimiento 173, 1º 1ª', 16, '638-866-862', 'F'),
(23, '70437186', 'Rodríguez', 'Rubén', 'Calle de la Sabiduría 144, 1º 4ª', 27, '662-451-899', 'M'),
(24, '22370485', 'Vargas', 'Ana', 'Paseo el Abceso Ancho 46, 1', 17, '629-472-854', 'F'),
(25, '48021024', 'Marín', 'José', 'Paseo del Cabildo 172, 4', 48, '647-718-020', 'M');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_categoria`);

--
-- Indices de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD PRIMARY KEY (`num_inscripcion`),
  ADD KEY `id_participante` (`id_participante`),
  ADD KEY `id_categoria` (`id_categoria`);

--
-- Indices de la tabla `participante`
--
ALTER TABLE `participante`
  ADD PRIMARY KEY (`id_participante`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id_categoria` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  MODIFY `num_inscripcion` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de la tabla `participante`
--
ALTER TABLE `participante`
  MODIFY `id_participante` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD CONSTRAINT `inscripcion_ibfk_1` FOREIGN KEY (`id_participante`) REFERENCES `participante` (`id_participante`),
  ADD CONSTRAINT `inscripcion_ibfk_2` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
