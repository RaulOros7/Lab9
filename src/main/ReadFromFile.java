package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;


public class UtilClass {
    private Product product;
    public UtilClass() {
    }
    public void adaugaFisier( Product product) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("util.json"), product );
    }
    public void citesteFisier(Product product) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.readValue(Paths.get("util.json").toFile() , Product.class);
    }
    public void adaugaFisier(ArrayList<Product> products) throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();

    }
}