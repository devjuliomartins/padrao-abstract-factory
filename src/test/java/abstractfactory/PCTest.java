package abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PCTest {

    @Test
    void deveEmitirCPUOffice() {
        PCFactory fabrica = new PCOfficeFactory();
        PC PC = new PC(fabrica);
        assertEquals("Intel i5 10400F", PC.emitirCPU());
    }

    @Test
    void deveEmitirCPUPosGamer() {
        PCFactory fabrica = new PCGamerFactory();
        PC PC = new PC(fabrica);
        assertEquals("Intel i9 13900K", PC.emitirCPU());
    }

    @Test
    void deveEmitirGPUOffice() {
        PCFactory fabrica = new PCOfficeFactory();
        PC PC = new PC(fabrica);
        assertEquals("Gráficos Integrado", PC.emitirGPU());
    }

    @Test
    void deveEmitirGPUPosGamer() {
        PCFactory fabrica = new PCGamerFactory();
        PC PC = new PC(fabrica);
        assertEquals("RTX 5090", PC.emitirGPU());
    }

}