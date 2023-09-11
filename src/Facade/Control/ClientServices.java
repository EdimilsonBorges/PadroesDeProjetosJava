package Facade.Control;

import Facade.Model.Cliente;
import Facade.Model.ModelFacade;

import java.util.List;

public class ClientServices {

    public List<Cliente> listarTodosClientes(){

        return ModelFacade.listarTodosClientes();
    }
}
