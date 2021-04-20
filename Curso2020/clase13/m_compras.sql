-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 07-10-2020 a las 23:16:09
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
-- Base de datos: `m_seguros`
--
CREATE DATABASE IF NOT EXISTS `m_seguros` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE `m_seguros`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `dni` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `apellido` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `fecha_nac` date NOT NULL,
  `sueldo` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `dni`, `nombre`, `apellido`, `fecha_nac`, `sueldo`) VALUES
(1, '3500155', 'Martin', 'BAUBYTE', '1990-02-24', 500000),
(2, '4545464564', 'BAU', 'BAU', '2020-10-08', 1000),
(3, '42081854', 'Cameron', 'Velez', '2020-12-19', 22439),
(4, '29853771', 'Andrew', 'Parker', '2020-06-28', 548505),
(5, '46967465', 'Ila', 'Paul', '2121-08-25', 801745),
(6, '31790813', 'Howard', 'Dennis', '2020-07-22', 361951),
(7, '46288608', 'Cecilia', 'Beasley', '2020-05-19', 209517),
(8, '25219312', 'Rogan', 'Sampson', '1919-12-05', 441768),
(9, '50820439', 'Hedley', 'Ray', '2121-03-10', 194954),
(10, '10853787', 'Clinton', 'Jimenez', '2020-11-21', 914635),
(11, '31816328', 'Priscilla', 'Ayala', '2121-08-17', 623579),
(12, '44871746', 'Jordan', 'Curry', '1919-11-18', 922345),
(13, '11376267', 'Quintessa', 'Mccarty', '2020-03-04', 676269),
(14, '50109941', 'Whoopi', 'Velazquez', '2020-09-11', 515204),
(15, '41910541', 'Maggie', 'Miranda', '2121-07-09', 19174),
(16, '12700647', 'Alexa', 'Phillips', '2121-02-27', 20113),
(17, '10698135', 'Hakeem', 'Gay', '2020-12-31', 265460),
(18, '26619911', 'Ina', 'Wilder', '2121-05-24', 563344),
(19, '6566410', 'Chantale', 'Zimmerman', '2121-04-07', 723826),
(20, '7102258', 'Charles', 'Weeks', '2020-08-31', 921683),
(21, '49338095', 'Hyatt', 'Bender', '2121-09-01', 231890),
(22, '20438594', 'Galvin', 'Washington', '2020-10-02', 613952),
(23, '48613288', 'Brenden', 'Hoover', '2020-03-07', 608844),
(24, '45024741', 'Ainsley', 'Woods', '2020-05-05', 690337),
(25, '16679925', 'Georgia', 'Dennis', '2121-08-31', 74133),
(26, '32501111', 'Alea', 'Nunez', '2121-10-01', 215846),
(27, '16352332', 'Graham', 'Hoover', '2121-09-01', 361705),
(28, '36466815', 'Gary', 'Bentley', '2020-05-04', 50291),
(29, '20481354', 'Alana', 'Lowery', '2020-02-27', 191103),
(30, '42723155', 'Erica', 'Oliver', '2121-08-07', 546265),
(31, '11075862', 'Uriah', 'Page', '2121-08-05', 63104),
(32, '50242396', 'Hayfa', 'Hunt', '2020-04-16', 547868),
(33, '41629917', 'Abdul', 'Shaffer', '2121-05-22', 617832),
(34, '11450602', 'Ebony', 'Mullins', '2121-01-30', 351922),
(35, '34175653', 'Lydia', 'Richmond', '2020-01-27', 78719),
(36, '34903438', 'Reece', 'Snider', '2121-05-17', 291833),
(37, '46855134', 'Carl', 'Macias', '2121-03-10', 571277),
(38, '30279966', 'Randall', 'Shepherd', '2121-01-28', 559654),
(39, '21831125', 'Sean', 'Huffman', '2121-01-24', 809833),
(40, '7286391', 'Driscoll', 'Sykes', '2020-03-04', 963213),
(41, '9917778', 'Garrison', 'Horn', '2020-02-24', 225081),
(42, '50775025', 'Keith', 'Best', '2020-02-24', 244149),
(43, '28765438', 'Rowan', 'Goodwin', '2020-08-31', 370054),
(44, '22165556', 'Clayton', 'Gordon', '2121-02-08', 127481),
(45, '27881746', 'Ciaran', 'Mcfarland', '2020-03-03', 312239),
(46, '16871461', 'Natalie', 'Martin', '2121-05-25', 547037),
(47, '30727604', 'Rina', 'Shelton', '2020-12-02', 638030),
(48, '33856801', 'Uma', 'Blanchard', '2020-02-16', 837396),
(49, '35697160', 'Chelsea', 'Durham', '1919-11-02', 628115),
(50, '43710222', 'Ramona', 'Sears', '2020-07-06', 812422),
(51, '31044529', 'Veronica', 'Roberts', '1919-10-24', 645722),
(52, '30057358', 'Hilda', 'Marsh', '2121-05-14', 189815),
(53, '31821878', 'Mark', 'Mcguire', '2121-01-12', 796994),
(54, '40885294', 'Larissa', 'Mosley', '2020-07-06', 718776),
(55, '15050598', 'Paul', 'Wagner', '2020-07-04', 67956),
(56, '37153548', 'Halee', 'Snyder', '2121-06-25', 746490),
(57, '5113371', 'Gareth', 'Trujillo', '2121-04-18', 217226),
(58, '7633336', 'Camille', 'Mayer', '2121-01-06', 686629),
(59, '33510256', 'Rooney', 'Bentley', '2121-04-21', 835779),
(60, '49952264', 'Jenna', 'Lynn', '2020-02-09', 957156),
(61, '18370900', 'Tucker', 'Snow', '2020-08-20', 420040),
(62, '18294979', 'Kelsey', 'Pacheco', '2020-01-06', 716067),
(63, '8542545', 'Ashely', 'Barry', '2020-10-20', 985432),
(64, '19079368', 'Xena', 'Britt', '2121-01-27', 160190),
(65, '41759453', 'Denton', 'Brennan', '2020-10-01', 784993),
(66, '48957600', 'Allistair', 'Pratt', '2020-05-30', 33296),
(67, '40848295', 'Nell', 'Vasquez', '2121-05-26', 936221),
(68, '38889304', 'Kamal', 'Hoffman', '1919-10-26', 239587),
(69, '7036125', 'Eve', 'Branch', '2020-04-03', 381945),
(70, '35235729', 'Fletcher', 'Hunter', '2020-05-11', 998120),
(71, '23586847', 'Griffith', 'Casey', '2020-12-10', 716058),
(72, '39253796', 'Jermaine', 'Perez', '2020-10-14', 865621),
(73, '21116093', 'Berk', 'Miller', '1919-10-31', 851822),
(74, '38105597', 'Nora', 'Mccarthy', '2020-01-07', 335172),
(75, '38483197', 'Herrod', 'Mcdonald', '2121-06-30', 588387),
(76, '42997135', 'Lee', 'Hewitt', '2020-05-03', 303257),
(77, '29966152', 'Charde', 'Walter', '2020-11-15', 493702),
(78, '44618795', 'Quin', 'Wilkerson', '2121-02-15', 829638),
(79, '33028711', 'Kennedy', 'Conley', '2020-11-03', 934865),
(80, '37801837', 'Aline', 'Washington', '2020-12-31', 2426),
(81, '33383007', 'Karina', 'Simmons', '2020-04-01', 426118),
(82, '26758274', 'Cathleen', 'Ferrell', '2121-07-09', 794607),
(83, '28478988', 'Fay', 'Perkins', '2020-12-29', 582379),
(84, '32832400', 'Zeus', 'Haynes', '2020-05-18', 275676),
(85, '45862441', 'Ramona', 'House', '2020-04-04', 655064),
(86, '49620839', 'Maggie', 'Singleton', '2020-07-18', 849061),
(87, '44521671', 'Bree', 'Hanson', '2020-05-07', 448457),
(88, '38249624', 'Chadwick', 'Gross', '2020-08-11', 828300),
(89, '47663213', 'Kelly', 'Levine', '2121-08-13', 927690),
(90, '9970674', 'Erasmus', 'Stanley', '2020-06-15', 737704),
(91, '26049500', 'Jerry', 'Tran', '2020-10-14', 274909),
(92, '50796938', 'Burke', 'Bartlett', '2121-04-13', 183621),
(93, '28606654', 'Gage', 'Mcdonald', '2020-10-27', 171304),
(94, '48284456', 'Oscar', 'Obrien', '2020-10-29', 345197),
(95, '31865433', 'Avram', 'Fitzpatrick', '2121-03-25', 287341),
(96, '14457935', 'Kyle', 'Ball', '1919-11-15', 991574),
(97, '31556672', 'Solomon', 'Bates', '2121-06-16', 616978),
(98, '33823075', 'Deborah', 'Orr', '2020-09-07', 593943),
(99, '11395698', 'Rhoda', 'Manning', '2121-04-21', 78746),
(100, '5429196', 'Galena', 'Morin', '2020-06-28', 255954),
(101, '28935909', 'Ahmed', 'Powers', '2121-01-23', 984949),
(102, '32157233', 'Alisa', 'Hinton', '1919-11-04', 357839);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propiedad`
--

CREATE TABLE `propiedad` (
  `id_propiedad` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `codigo_servicio` int(11) NOT NULL,
  `direccion` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `metros_cuad` varchar(8) COLLATE utf8_spanish_ci NOT NULL,
  `zona` varchar(25) COLLATE utf8_spanish_ci NOT NULL,
  `valor_mercado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `propiedad`
--

INSERT INTO `propiedad` (`id_propiedad`, `id_cliente`, `codigo_servicio`, `direccion`, `metros_cuad`, `zona`, `valor_mercado`) VALUES
(5, 1, 1, 'Gallo 908', '80', 'Almagro', 1000000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `codigo_servicio` int(11) NOT NULL,
  `tipo` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `detalle` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`codigo_servicio`, `tipo`, `detalle`, `precio`) VALUES
(1, 'Seguro', 'Contra Incendios Total', 450),
(2, 'Seguro', 'Robo Total y Parcial', 480);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `propiedad`
--
ALTER TABLE `propiedad`
  ADD PRIMARY KEY (`id_propiedad`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `codigo_servicio` (`codigo_servicio`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`codigo_servicio`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `propiedad`
--
ALTER TABLE `propiedad`
  ADD CONSTRAINT `codigo_servicio` FOREIGN KEY (`codigo_servicio`) REFERENCES `servicio` (`codigo_servicio`),
  ADD CONSTRAINT `id_cliente` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
