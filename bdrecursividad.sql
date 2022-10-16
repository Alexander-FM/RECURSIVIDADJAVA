-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-10-2022 a las 04:36:10
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdrecursividad`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `CAT_ID` int(11) NOT NULL,
  `CAT_CODIGO` varchar(10) NOT NULL,
  `CAT_DESCRIPCION` varchar(100) NOT NULL,
  `CAT_PADRE` int(11) DEFAULT NULL,
  `CAT_ACTIVO` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`CAT_ID`, `CAT_CODIGO`, `CAT_DESCRIPCION`, `CAT_PADRE`, `CAT_ACTIVO`) VALUES
(1, '2E34SX', 'Móviles', NULL, 'S'),
(2, '738S3X', 'Linea Blanca', NULL, 'S'),
(3, '38SJ3X', 'Audio', NULL, 'S'),
(4, 'JASEXS', 'Teléfonos Android', 1, 'S'),
(5, 'AD4SS2', 'Teléfonos iOS', 1, 'S'),
(6, 'LJDJ3X', 'Samsung Galaxy S22 Ultra', 4, 'S'),
(8, 'JCJ4LX', 'iPhone XS Max', 5, 'S'),
(9, 'BASD4S', 'LG K99', 4, 'S'),
(10, 'KJ67HG', 'iPhone 14 Pro Max', 5, 'S'),
(11, 'BNF4ND', 'iPhone 13 Pro Max', 5, 'S'),
(12, 'VH4GDS', 'LG G8', 4, 'S'),
(13, 'FKH48S', 'Minicomponentes', 3, 'S'),
(14, 'BD6YDW', 'Equipos de Sonido', 3, 'S'),
(15, 'JE4GD3', 'Barras de Sonido', 3, 'S'),
(16, 'Ñ9O3NS', 'Teatro en Casa', 3, 'S'),
(17, 'CN490F', 'Refrigeradoras', 2, 'S'),
(18, 'MXLKEN', 'Congeladores', 2, 'S'),
(19, 'Y73BDS', 'Cocinas', 2, 'S'),
(20, 'XNLL3S', 'Cocina Easy Clean LG', 19, 'S'),
(21, 'M3873B', 'Cocina Samsung 117 LTS', 19, 'S'),
(22, 'AS3XWS', 'Refrigedora Door in Door', 17, 'S'),
(23, 'NKN3XS', 'Refrigeradora InstaView', 17, 'S'),
(24, 'MCCN3X', 'iPhone 12', 5, 'N');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`CAT_ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `CAT_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
