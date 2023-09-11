package Visitor;

public class TypeCheckingVisitor implements NodeVisitor{

    @Override
    public void VisitAssignment(AssignmentNode assignmentNode) {
     if(assignmentNode.getTypeLeftHandeVar().equals(assignmentNode.getTypeHigthHandeExp())){

        System.out.println("Tipos Compatíveis - Visitor");
     }else{
        System.out.println("Tipos Incompatíveis - Visitor");
     }
    }

    @Override
    public void VisitVariableRef(VariableRefNode variableRefNode) {
          // Não faz nada
          System.out.println("TypeChecking da variável ref (não faz nada) - Visitor");
    }
}
