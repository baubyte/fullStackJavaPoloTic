---------------------------------------------------------------
--- a) Obtener la lista completa de todos los participantes.
---------------------------------------------------------------
SELECT
  *
FROM
  torneo_tenis.participante;
---------------------------------------------------------------
--- b) Obtener la lista completa de todas las categorías.
---------------------------------------------------------------
SELECT
  *
FROM
  torneo_tenis.categoria;
---------------------------------------------------------------
--- c) Obtener todas las participantes mujeres.
---------------------------------------------------------------
SELECT
  *
FROM
  torneo_tenis.participante
WHERE
  sexo = 'F';
----------------------------------------------------------------------------------------
--- d) Obtener el nombre y apellido de las mujeres inscriptas en la categoría “Damas B”.
-----------------------------------------------------------------------------------------
SELECT
  p.nombre,
  p.apellido
FROM
  torneo_tenis.participante p
WHERE
  p.id_participante IN (
    SELECT
      i.id_participante
    FROM
      torneo_tenis.inscripcion i
    WHERE
      i.id_categoria = (
        SELECT
          c.id_categoria
        FROM
          categoria c
        WHERE
          c.nombre = 'Damas B'
      )
  );
--------------------------------------------------------------------------------------
--- e) Obtener los datos de los participantes que tengan una edad entre 25 y 37 años.
--------------------------------------------------------------------------------------
SELECT
  *
FROM
  torneo_tenis.participante
WHERE
  edad BETWEEN 25
  AND 37;
------------------------------------------------------------------------------------------------------------------
--- f) Obtener la lista completa de inscripciones, especificando nombre y apellido decada uno de los inscriptos.
------------------------------------------------------------------------------------------------------------------
SELECT
  i.num_inscripcion,
  p.nombre,
  p.apellido,
  i.fecha_insc,
  IF(i.abono_inscrip = 1, 'SI', 'NO') AS abono_inscrip
FROM
  torneo_tenis.participante p,
  torneo_tenis.inscripcion i
WHERE
  p.id_participante = i.id_participante;