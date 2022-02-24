package cz.cerma.simpleORMframework.DBacces;

public class SormManager {

    public <T> T GetEntityByID(Long id,Class<T> clazz){
    if (id == null){
        throw new IllegalArgumentException("ID nemuze byt prazdne");
    }


    return null;
    }
}
