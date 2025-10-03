package abstractfactory;

public class PCOfficeFactory implements PCFactory {

    @Override
    public GPU createGPU() {
        return new GPUOffice();
    }

    @Override
    public CPU createCPU() {
        return new CPUOffice();
    }
}
