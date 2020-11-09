CREATE TABLE `participante` (
  `id_participante` bigint PRIMARY KEY AUTO_INCREMENT,
  `dni_participante` varchar(10),
  `apellido` varchar(30),
  `nombre` varchar(30),
  `direccion` varchar(100),
  `edad` int(3),
  `telefono` varchar(15),
  `sexo` varchar(1)
);

CREATE TABLE `categoria` (
  `id_categoria` bigint PRIMARY KEY AUTO_INCREMENT,
  `nombre` varchar(30),
  `edad_min` int(3),
  `edad_max` int(3),
  `sexo` varchar(1)
);

CREATE TABLE `inscripcion` (
  `num_inscripcion` bigint PRIMARY KEY AUTO_INCREMENT,
  `id_participante` bigint,
  `id_categoria` bigint,
  `fecha_insc` date,
  `abono_inscrip` boolean DEFAULT true
);

ALTER TABLE `inscripcion` ADD FOREIGN KEY (`id_participante`) REFERENCES `participante` (`id_participante`);

ALTER TABLE `inscripcion` ADD FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`);
