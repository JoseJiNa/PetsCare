/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author jjimenez
 */
public class Utils {

    public static final int COMPROBAR_USUARIO = 1;
    public static final int INSERTAR_USUARIO = 2;
    public static final int ELIMINAR_USUARIO = 3;
    public static final int OBTENER_CLIENTES_CLINICA = 4;
    public static final int OBTENER_MASCOTAS_USUARIO = 5;
    public static final int OBTENER_CLINICA_ID = 6;
    public static final int OBTENER_MASCOTAS_USUARIO_CLINICA = 7;
    public static final int OBTENER_MASCOTAS_CLINICA = 8;
    public static final int OBTENER_NOMBRE_PROPIETARIO_ID = 9;
    public static final int OBTENER_ULTIMO_INFORME = 10;
    public static final int OBTENER_INFORMES_MASCOTA = 11;
    Gson gson = new Gson();


    public String Encrypt(String password) throws NoSuchAlgorithmException{
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < hash.length; i++) {
            sb.append(Integer.toString((hash[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();
    }

}
