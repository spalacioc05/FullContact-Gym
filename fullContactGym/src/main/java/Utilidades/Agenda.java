package Utilidades;

import java.util.ArrayList;
import java.util.List;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;
import java.io.*;

/**
 * Clase Agenda para gestionar clientes.
 * 
 * @author Duvan Ruiz
 */
public class Agenda {
    private List<Persona> listaClientes = new ArrayList<>();
    private List<Persona> listaRecuperada = new ArrayList<>();

    public void adiccionarCliente(Persona objA) {
        listaClientes.add(objA);
        guardarFichero();
    }

    public int obtenerIndice(String id) {
        for (Persona cliente : listaRecuperada) {
            if (cliente.getId().equals(id)) {
                return listaRecuperada.indexOf(cliente);
            }
        }
        return -1;
    }

    public String listarClientes() {
        StringBuilder lista = new StringBuilder();
        if (!listaRecuperada.isEmpty()) {
            for (Persona cliente : listaRecuperada) {
                lista.append(cliente.getId()).append("\t")
                     .append(cliente.getNombre()).append("\t")
                     .append(cliente.getSexo()).append("\t")
                     .append(cliente.getRequerimiento()).append("\t\t")
                     .append(cliente.getEstado()).append("\n");
            }
        }
        return lista.toString();
    }

    public Persona buscarPorID(int indice) {
        return listaRecuperada.get(indice);
    }

    public void actualizarCliente(Persona obj) {
        for (Persona cliente : listaRecuperada) {
            if (obj.getId().equals(cliente.getId())) {
                cliente.setId(obj.getId());
                cliente.setNombre(obj.getNombre());
                cliente.setSexo(obj.getSexo());
                cliente.setEmpresa(obj.getEmpresa());
                cliente.setRequerimiento(obj.getRequerimiento());
                cliente.setEstado(obj.getEstado());
                cliente.setFecha(obj.getFecha());
                cliente.setMultas(obj.getMultas());
                cliente.setMotivoMulta(obj.getMotivoMulta());
                cliente.setTotalPagar(obj.getTotalPagar());
                cliente.setMotivoPago(obj.getMotivoPago());
                cliente.setTransporte(obj.getTransporte());
            }
        }
        actualizarFichero(listaRecuperada);
    }

    public void eliminarCliente(int indice) {
        listaRecuperada.remove(indice);
        actualizarFichero(listaRecuperada);
    }

    public int numClientes() {
        return listaRecuperada.size();
    }

    public float recaudo() {
        float recaudo = 0;
        for (Persona cliente : listaRecuperada) {
            recaudo += cliente.getTotalPagar();
        }
        return recaudo;
    }

    public float gastoTransporte() {
        float gasto = 0;
        for (Persona cliente : listaRecuperada) {
            gasto += cliente.getTransporte();
        }
        return gasto;
    }

    public void guardarFichero() {
        try (ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream("aproambiental.dat"))) {
            escribiendoFichero.writeObject(listaClientes);
        } catch (IOException e) {
            System.out.println("Error al guardar el fichero: " + e.getMessage());
        }
    }

    public void leerFichero() {
        try (ObjectInputStream leyendoFichero = new ObjectInputStream(new FileInputStream("aproambiental.dat"))) {
            listaRecuperada = (ArrayList<Persona>) leyendoFichero.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    public void actualizarFichero(List<Persona> lista) {
        try (ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream("aproambiental.dat"))) {
            escribiendoFichero.writeObject(lista);
        } catch (IOException e) {
            System.out.println("Error al actualizar el fichero: " + e.getMessage());
        }
    }

    public void crearPDF1() {
        try {
            Document doc = new Document();
            Font tipo1 = FontFactory.getFont(BaseFont.TIMES_ROMAN, 12, BaseColor.BLACK);
            Font tipo2 = FontFactory.getFont(BaseFont.TIMES_BOLD, 20, BaseColor.BLUE);
            Font tipo3 = FontFactory.getFont(BaseFont.MACROMAN, 12, BaseColor.CYAN);

            PdfWriter.getInstance(doc, new FileOutputStream("Lista_de_Solicitudes.pdf"));
            doc.open();
            Paragraph titulo = new Paragraph("Lista de clientes", tipo3);
            doc.add(titulo);
            for (Persona cliente : listaRecuperada) {
                doc.add(new Paragraph("Nombre: " + cliente.getNombre(), tipo2));
                doc.add(new Paragraph("ID: " + cliente.getId(), tipo1));
                doc.add(new Paragraph("Sexo: " + cliente.getSexo(), tipo1));
                doc.add(new Paragraph("Requerimiento: " + cliente.getRequerimiento(), tipo1));
                doc.add(new Paragraph("Empresa: " + cliente.getEmpresa(), tipo1));
                doc.add(new Paragraph("Estado: " + cliente.getEstado(), tipo1));
                doc.add(new Paragraph("Fecha: " + cliente.getFecha(), tipo1));
                doc.add(new Paragraph("------------------------------------------------------", tipo1));
            }
            doc.addAuthor("Duvan Ruiz, Rafael Osorio");
            doc.close();
        } catch (DocumentException | IOException e) {
            System.out.println("Error al crear el PDF: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void crearPDF2() {
        try {
            Document doc = new Document();
            Font tipo1 = FontFactory.getFont(BaseFont.TIMES_ROMAN, 12, BaseColor.BLACK);
            Font tipo2 = FontFactory.getFont(BaseFont.TIMES_BOLD, 20, BaseColor.BLUE);

            PdfWriter.getInstance(doc, new FileOutputStream("Arqueo_de_caja.pdf"));
            doc.open();
            Paragraph titulo = new Paragraph("Arqueo de Caja", tipo2);
            doc.add(titulo);
            doc.add(new Paragraph("Numero de clientes atendidos: " + numClientes(), tipo1));
            doc.add(new Paragraph("Recaudo: " + recaudo(), tipo1));
            doc.add(new Paragraph("Gastos en transporte: " + gastoTransporte(), tipo1));
            doc.add(new Paragraph("------------------------------------------------------", tipo1));
            doc.addAuthor("Duvan Ruiz, Rafael Osorio");
            doc.close();
        } catch (DocumentException | IOException e) {
            System.out.println("Error al crear el PDF: " + e.getMessage());
            e.printStackTrace();
        }
    }
}