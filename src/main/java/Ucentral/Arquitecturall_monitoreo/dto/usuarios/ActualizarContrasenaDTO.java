package Ucentral.Arquitecturall_monitoreo.dto.usuarios;

import lombok.Data;

@Data
public class ActualizarContrasenaDTO {
    private String correo;
    private String nuevaContraseña;
}