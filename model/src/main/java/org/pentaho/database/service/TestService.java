package org.pentaho.database.service;

public class TestService {

    public static Integer convert(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue(); 
        }

    
        if (obj instanceof CharSequence) {
            Object temp = obj.toString(); 
        
            return (Integer) temp; 
        }

        return null;
    }

    public static void main(String[] args) {
        Object value = "123"; 
        System.out.println(convert(value)); 
    }
    
   
}
