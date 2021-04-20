/**Cantidad de Productos*/
SELECT
  COUNT(producto.cod_prod) AS cant_producto
FROM
  cell_center.producto;
  /**El Precio Total de los Productos*/
SELECT
  SUM(producto.precio) AS precio_total
FROM
  cell_center.producto;
  /**El Producto Marca SAMSUNG con Mayor Stock*/
SELECT
  MAX(producto.stock) AS max_stock
FROM
  cell_center.producto
WHERE
  producto.marca = 'SAMSUNG';
  /**El Producto Marca SAMSUNG con Menor Stock*/
SELECT
  MIN(producto.stock) AS min_stock
FROM
  cell_center.producto
WHERE
  producto.marca = 'SAMSUNG';
SELECT
  AVG(producto.precio) AS min_stock
FROM
  cell_center.producto
WHERE
  producto.marca = 'XIAOMI';
  /**La Fecha Actual de las Consultas*/
SELECT
  CURRENT_DATE() AS fecha_actual;
/**El Producto Marca SAMSUNG con Mayor Stock con Todos Sus Datos Opcion 1*/
SELECT
  a.*
FROM
  cell_center.producto a
WHERE
  a.marca = 'SAMSUNG'
  AND a.stock = (
    SELECT
      MAX(b.stock)
    FROM
      cell_center.producto b
    WHERE
      b.marca = 'SAMSUNG'
  );
/***/