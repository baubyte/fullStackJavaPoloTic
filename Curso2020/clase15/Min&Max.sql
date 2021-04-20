/**Sueldo mas Bajo*/
SELECT MIN(cliente.sueldo) AS sueldo_min FROM m_seguros.cliente;
/**Sueldo mas Alto*/
SELECT MAX(cliente.sueldo) AS suelo_max FROM m_seguros.cliente;