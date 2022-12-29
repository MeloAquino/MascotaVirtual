package enumerados;

public enum EntretenimientoEnum {

    BAILAR(20), LEER(40), PASEAR(30), COMPRAR(50);

    private int desaburrimiento;

    EntretenimientoEnum(int desaburrimiento){
        this.desaburrimiento = desaburrimiento;
    }

    public int getDesaburrimiento() {
        return  this.desaburrimiento;
    }
}
