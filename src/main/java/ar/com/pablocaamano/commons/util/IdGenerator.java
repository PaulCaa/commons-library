package ar.com.pablocaamano.commons.util;

import ar.com.pablocaamano.commons.exception.EmptyParameterException;
import ar.com.pablocaamano.commons.exception.ProcessFailedException;

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
            throw new ProcessFailedException("Error generating ID", exception);
        }
    }

    private static String generate(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }


    /**
     * Generate UUID based on application information. Company, AppName and Version cannot be null together
     * @param company company, organization or developer of the application
     * @param name application name
     * @param version application version
     * @return String id
     */
    public static String getStringIdWith(String company, String name, String version){
        if((company == null || company.equalsIgnoreCase("")) && (name == null || name.equalsIgnoreCase(""))
                && (version == null || version.equalsIgnoreCase(""))) {
            throw new EmptyParameterException();
        }
        return generate(company + name + version);
    }

    /**
     * Generate random UUID
     * @return String id
     */
    public static String getStringIdRadom(){
        String id = generate();
        if (id == null || id.equalsIgnoreCase(""))
            throw new ProcessFailedException("Error generating ID");
        return id;
    }
}
