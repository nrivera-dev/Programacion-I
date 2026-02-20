import java.util.ArrayList;
import java.util.List;

//Un Portafolio de Inversiones y sus ETFs
class ETF {
    private String ticker;

    public ETF(String ticker) {
        this.ticker = ticker;
    }
    public String getTicker() { return ticker; }
}

class Portafolio {
    // Agregación: El portafolio tiene una lista de ETFs
    private List<ETF> inversiones;

    public Portafolio() {
        this.inversiones = new ArrayList<>();
    }

    // Los ETFs se crean afuera y se "agregan" al portafolio
    public void agregarETF(ETF etf) {
        inversiones.add(etf);
    }
}