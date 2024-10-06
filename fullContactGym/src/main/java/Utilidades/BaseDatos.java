package Utilidades;

import java.io.FileReader;
import java.io.Reader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class BaseDatos {
    public static void pruebas() {
        Reader in = new FileReader("base de datos.csv");
        Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
        for (CSVRecord record : records) {
            String lastName = record.get("Last Name");
            String firstName = record.get("First Name");
        }
    }

    public static void main(String[] args) {
        BaseDatos.pruebas();
    } 
}