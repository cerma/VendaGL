package cz.cerma.simpleORMframework.DBacces;

import cz.cerma.simpleORMframework.exceptions.AnnotationMissingException;
import cz.cerma.simpleORMframework.reflection.ObjectReflector;

import java.sql.ResultSet;
import java.util.List;

public class SormManager {

    public <T> T GetEntityByID(Long id,Class<T> clazz){
    if (id == null){
        throw new IllegalArgumentException("ID nemuze byt prazdne");
    }
        if(!ObjectReflector.isTable(clazz)){
        throw new AnnotationMissingException("Objekt nema anotaci tabulky");
        }
        else {
            System.out.println("is table: "+clazz.getName());
        }
        // nacitan dat z DB
        ResultSet result = loadData(id,clazz);
    return null;
    }

    private <T> ResultSet loadData(Long id, Class<T> clazz) {
        String tableName = ObjectReflector.getTableName(clazz);
        List<String> tableColums = ObjectReflector.getColumnName(clazz);
       // String idColumName = ObjectReflector.getIdColumName(clazz);

       // String query = SqlBuilder.buildQuery(id,tableName,idColumName,tableColums);

        //ziskat result set
        return null;
    }

}
