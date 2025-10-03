package abstractfactory;

public class PC {

    private GPU GPU;
    private CPU CPU;

    public PC(PCFactory fabrica) {
        this.GPU = fabrica.createGPU();
        this.CPU = fabrica.createCPU();
    }

    public String emitirGPU() {
        return this.GPU.emitir();
    }

    public String emitirCPU() {
        return this.CPU.emitir();
    }
}
