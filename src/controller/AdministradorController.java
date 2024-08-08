package controller;

import DAO.AdministradorDAO;
import java.util.List;
import model.Administrador;

public class AdministradorController {
    
    public static List<Administrador> listarAdm() {
        return AdministradorDAO.listarAdm();
    }
    
    public static boolean verificarAdm(String usuario, String senha) {
        return AdministradorDAO.verificarAdm(usuario, senha);
    }
    
}
