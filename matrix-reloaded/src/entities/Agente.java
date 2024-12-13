package entities;

import java.util.ArrayList;

public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;
    private ArrayList<String> recompensas; 
    private ArrayList<String> misionesCompletadas; 
    private ArrayList<String> anomalíasNeutralizadas; 

    public Agente(int id, String nombre, String habilidadEspecial) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
        this.recompensas = new ArrayList<>();   
        this.misionesCompletadas = new ArrayList<>(); 
        this.anomalíasNeutralizadas = new ArrayList<>(); 
    }

    public void registrarMisionCompletada(String mision) {
        misionesCompletadas.add(mision);
    }

    public void registrarAnomaliaNeutralizada(String anomalia) {
        anomalíasNeutralizadas.add(anomalia);
    }

    public void generarReporte() {
        System.out.println("=== Reporte de Actividad del Agente ===");
        System.out.println("Misiones Completadas:");
        if (misionesCompletadas.isEmpty()) {
            System.out.println("No hay misiones completadas.");
        } else {
            for (String mision : misionesCompletadas) {
                System.out.println("- " + mision);
            }
        }

        System.out.println("Anomalías Neutralizadas:");
        if (anomalíasNeutralizadas.isEmpty()) {
            System.out.println("No hay anomalías neutralizadas.");
        } else {
            for (String anomalia : anomalíasNeutralizadas) {
                System.out.println("- " + anomalia);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial +
                (misionAsignada != null ? ", Misión: " + misionAsignada : "");
    }
}
