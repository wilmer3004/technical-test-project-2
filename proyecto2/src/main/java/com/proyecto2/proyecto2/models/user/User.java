package com.proyecto2.proyecto2.models.user;

import com.proyecto2.proyecto2.models.Ciudad;
import com.proyecto2.proyecto2.models.TipoDoc;

public class User {
    private Integer idUsu;
    private String nombresUsu;
    private String apellidosUsu;
    private Long numDocUsu;
    private Long telefonoUsu;
    private String correoUsu;
    private String passwordUsu;
    private Boolean estadoUsu;
    private TipoDoc idTipoDocFK;
    private Ciudad idCiudadFK;



}
