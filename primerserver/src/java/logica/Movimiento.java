package logica;


public class Movimiento {
    private String tipoMovimiento;
    private String monto;
    private String concepto;

    public Movimiento(String tipoMovimiento, String monto, String concepto) {
        this.tipoMovimiento = tipoMovimiento;
        this.monto = monto;
        this.concepto = concepto;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
}
