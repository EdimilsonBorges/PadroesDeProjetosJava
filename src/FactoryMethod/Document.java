package FactoryMethod;

public interface Document {

     /**
      * Abre o documento
      */
     void open();
     /**
      * Fecha o documento
      */
     void close();
     /**
      * Salva o documento
      */
     void save();
     /**
      * Reverte, desfaz o documento
      */
     void revert();
}
