package abstractfactory;

public class PCGamerFactory implements PCFactory {

    @Override
    public GPU createGPU() {
        return new GPUGamer();
    }

    @Override
    public CPU createCPU() {
        return new CPUGamer();
    }
}
