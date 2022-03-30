/*
Calcular el salario de un trabajador en base a los siguientes criterios.
a) Se debe pedir por teclado el número de horas trabajadas en el mes (HT) y el pago por hora (PH). Trabajar con número
reales para ambos casos.
Evaluar las horas trabajas según lo siguiente:
b) Si las horas trabajadas son menores o iguales a 40, se considera que el empleado no ha realizado horas
extras en el mes.
c) Si las horas trabajadas son mayores a 40 y menores o iguales a 48, se considera que el empleado ha
realizado horas extras que se le pagan al doble del pago de una hora normal. Haciendo para este caso un total
de 8 horas pagadas como máximo al doble.
d) Si las horas trabajadas exceden de 48, se considera que el empleado ha realizado horas extras que se le
pagan al doble y al triple del pago de una hora normal, Haciendo un total de 8 horas extras pagadas al doble y
las que excedan de 8 se pagan al triple del pago de una hora normal
e) Se debe aplicar el descuento de la retención (RENTA) del 10% al salario bruto.
f) Se debe imprimir en pantalla el nombre del empleado, salario bruto (sin renta), salario líquido (con renta) y
finalmente el monto de la retención aplicada.
 */
package Ejercicio_1;

public class Trabajador {
    int HT;
    int HP;
    String nombre;
    double  salarioBruto;
    double salarioLiquido;
    double  montoRetencion;

    public int getHT() {
        return HT;
    }

    public void setHT(int HT) {
        this.HT = HT;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double getMontoRetencion() {
        return montoRetencion;
    }

    public void setMontoRetencion(double montoRetencion) {
        this.montoRetencion = montoRetencion;
    }
}
