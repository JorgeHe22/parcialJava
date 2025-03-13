import java.util.Random;

public class Cabinas {
    private int numCabina;
    private int minLlamadaLocal = 50;
    private int minLlamadaDistancia = 350;
    private int minLlamadaCelular = 150;
    private int llamadasLocal;
    private int llamadasDistancia;
    private int llamadasCelular;


    public Cabinas(int numCabina, int minLlamadaLocal, int minLlamadaDistancia, int minLlamadaCelular, int llamadasLocal, int llamadasDistancia, int llamadasCelular) {
        this.numCabina = numCabina;
        this.minLlamadaLocal = minLlamadaLocal;
        this.minLlamadaDistancia = minLlamadaDistancia;
        this.minLlamadaCelular = minLlamadaCelular;
        this.llamadasLocal = llamadasLocal;
        this.llamadasDistancia = llamadasDistancia;
        this.llamadasCelular = llamadasCelular;
    }

    public int getNumCabina() {
        return numCabina;
    }

    public void setNumCabina(int numCabina) {
        this.numCabina = numCabina;
    }

    public int getMinLlamadaLocal() {
        return minLlamadaLocal;
    }

    public void setMinLlamadaLocal(int minLlamadaLocal) {
        this.minLlamadaLocal = minLlamadaLocal;
    }

    public int getMinLlamadaDistancia() {
        return minLlamadaDistancia;
    }

    public void setMinLlamadaDistancia(int minLlamadaDistancia) {
        this.minLlamadaDistancia = minLlamadaDistancia;
    }

    public int getMinLlamadaCelular() {
        return minLlamadaCelular;
    }

    public void setMinLlamadaCelular(int minLlamadaCelular) {
        this.minLlamadaCelular = minLlamadaCelular;
    }

    public int getLlamadasLocal() {
        return llamadasLocal;
    }

    public void setLlamadasLocal(int llamadasLocal) {
        this.llamadasLocal = llamadasLocal;
    }

    public int getLlamadasDistancia() {
        return llamadasDistancia;
    }

    public void setLlamadasDistancia(int llamadasDistancia) {
        this.llamadasDistancia = llamadasDistancia;
    }

    public int getLlamadasCelular() {
        return llamadasCelular;
    }

    public void setLlamadasCelular(int llamadasCelular) {
        this.llamadasCelular = llamadasCelular;
    }

    public void registrarLlamadLocal(){
        Random random = new Random();
        int duracionLlamada = random.nextInt(60) + 1;
        this.llamadasLocal++;
        this.minLlamadaLocal += duracionLlamada;
        System.out.println("Llamada local registrada en: " + numCabina + "La duracion de la llamada fue de: " +duracionLlamada + "Minutos.");
    }
    public void  registrarLlamadaDistancia(){
        Random random = new Random();
        int duracionLlamada = random.nextInt(60) + 1;
        this.llamadasDistancia++;
        this.minLlamadaDistancia += duracionLlamada;
        System.out.println("Llamada a distancia registrada en: " + numCabina + "La duracion de la llamda fue de: " + duracionLlamada + "Minutos.");
    }
    public void registrarLlamadaCelular(){
        Random random = new Random();
        int duracionLlamada = random.nextInt(60) + 1;
        this.llamadasCelular ++;
        this.minLlamadaCelular *= duracionLlamada;
        System.out.println("Llamada celular registrada en: " + numCabina + "La duracion de la llamada fue de: " + duracionLlamada + "Minutos.");
    }
    public void mostrarInformacion(){
        System.out.println("Informacion detallada de la cabina: " + numCabina);

        int costoLocal = llamadasLocal * minLlamadaLocal;
        System.out.println("Llamadas locales: " + llamadasLocal + "Duracion Total:" + minLlamadaLocal + "minutos. Costo: $" + costoLocal + "pesos");

        int costoDistancia = llamadasDistancia * minLlamadaDistancia;
        System.out.println("Llamadas a Distancia: " + llamadasDistancia + "Duracion Total: " + minLlamadaDistancia + "minutos. Costo: $" + costoDistancia + "pesos.");

        int costoCelular = llamadasCelular * minLlamadaCelular;
        System.out.println("Llamadas Celular: " + llamadasCelular + "Duracion total: " + minLlamadaCelular + "minutos. Costo: $" + costoCelular +"pesos");


        int totalLlamadas = llamadasLocal + llamadasDistancia + llamadasCelular;
        int totalMinutos = minLlamadaLocal + minLlamadaDistancia + minLlamadaCelular;
        int costoTotal = costoLocal + costoDistancia + costoCelular;
        System.out.println("Total de la cabina numero:" + numCabina);
        System.out.println("TOTAL LLAMADAS: " + totalLlamadas + " TOTAL MINUTOS: " + totalMinutos + "COSTO TOTAL: " +costoTotal);
    }
    public void reiniciarCabinas(){
        this.llamadasLocal = 0;
        this.llamadasDistancia = 0;
        this.llamadasCelular = 0;
        this.minLlamadaLocal = 0;
        this.minLlamadaDistancia = 0;
        this.minLlamadaCelular = 0;
    }

}