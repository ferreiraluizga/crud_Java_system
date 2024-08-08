package controller;

import DAO.DesenvolvedorDAO;
import dao.ExceptionDAO;
import java.util.List;
import model.Desenvolvedor;

public class DesenvolvedorController {

    public static void cadastrarDev(Desenvolvedor dev) throws ExceptionDAO {
        DesenvolvedorDAO.cadastrarDev(dev);
    }
    
    public static List<Desenvolvedor> listarDev() throws ExceptionDAO {
        return DesenvolvedorDAO.listarDev();
    }
    
    public static Desenvolvedor consultarDev(int id) throws ExceptionDAO {
        return DesenvolvedorDAO.consultarDev(id);
    }
    
    public static void editarDev(Desenvolvedor dev) throws ExceptionDAO {
        DesenvolvedorDAO.editarDev(dev);
    }
    
    public static void deletarDev(int id) throws ExceptionDAO {
        DesenvolvedorDAO.deletarDev(id);
    }

}
