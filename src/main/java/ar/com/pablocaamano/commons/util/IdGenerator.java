package ar.com.pablocaamano.commons.util;

import ar.com.pablocaamano.commons.exception.InternalErrorException;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class IdGenerator {

    private IdGenerator(){ }

    private static String generate(String structure){
        try {
            byte[] byteStructure = structure.getBytes(StandardCharsets.UTF_8);
            UUID uuid = UUID.nameUUIDFromBytes(byteStructure);
            return uuid.toString();
        }catch(Exception exception){
            throw new InternalErrorException("Error generating ID", exception);
        }
    }

    private static String generate(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }


    /**
     * Generate random UUID
     * @return String id
     */
    public static String getStringIdRadom(){
        String id = generate();
        if (id == null || id.equalsIgnoreCase(""))
            throw new InternalErrorException("Error generating ID");
        return id;
    }
}
