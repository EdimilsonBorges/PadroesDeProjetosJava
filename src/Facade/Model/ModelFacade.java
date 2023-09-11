package Facade.Model;

import java.util.List;

public class ModelFacade {

    public static List<Cliente> listarTodosClientes(){

        return DataBase.clientes;
    }
}
