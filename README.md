# CRUD_Cine
Para el desarrollo de este proyecto, uilice los programas neatbeans IDE en su ultima version (12.6)
Y pgAdmin 4 version (6.7).
Con ayuda de eatbeans generaria el backend mediante paquetes (package's), comenzando por el model,
dentro del cual se encontrarian las tablas que contiene la base de datos (m_pelicula, clasificacion y cine)
Las cuales posteriormente se migrarian a la base de datos de postgresql; la tabla cine alamacenaria la informacion del cine, la tabla clasificacion almacenaria las posibles clasificaciones que puede tener una pelicula y la tabla m_plicula, almacenaria la informacion de las peliculas las cuales se mencionaban en el documento. 

Una vezrealizado el modelo, pase a generar la interfaz, seguido de el servicio rest (Resources) en el cual se encuentra el metodo de crear, leer y eliminar) 

Para finalizar el desarrollo cree la clase services para asignarle una ruta (url) a los metodos mencionados anteriormente. 

Cabe mencionar que al inicio del desarrollo se hizo los ajustes necesarios al "application.properties" para poder conectarse a la base de datos del Postgresql.
