
package Ejercicio_1;

import java.util.Scanner;

public class Calcular_Salario {
    
    public static void main(String[] args) {
        //instancia(objeto) de la clase Trabajador
        
        Trabajador obj = new Trabajador();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del Trabajador: ");
        obj.setNombre(leer.nextLine());
        
        System.out.println("Ingrese Horas Trabajadas: ");
        obj.setHT(Integer.parseInt(leer.nextLine()));
        
        System.out.println("Ingrese pago por Horas: ");
        obj.setHP(Integer.parseInt(leer.nextLine()));
        
        calcular(obj.getHT(), obj.getHP());
        System.out.println("Nombre del Trabajador: " + obj.getNombre());
    }
    
    public static void calcular(int ht, int hp){
        //instacia(objeto) de la clase Trabajador
        Trabajador obj = new Trabajador();
        
        if(ht <= 40){
            System.out.println("\n===============Datos===============");
            System.out.println("Usted no ha realizado Horas Extras");
            
            double salarioSinRenta = ht * hp;
            obj.setSalarioBruto(salarioSinRenta);
            System.out.println("Salario bruto $" + obj.getSalarioBruto());
            
            double retenciónAplicada = salarioSinRenta * 0.1;
            obj.setMontoRetencion(retenciónAplicada);
            System.out.println("Retencion Aplicada(RENTA) 10%: $" + obj.getMontoRetencion());
            
            double salarioConRenta = salarioSinRenta - retenciónAplicada;
            obj.setSalarioLiquido(salarioConRenta);
            System.out.println("Salario liquido: $" + obj.getSalarioLiquido());
            System.out.println("===================================");
            
        }else if(ht > 40 && ht <= 48){
            System.out.println("\\n======Datos======");
            int calcularHoras = (ht - 40);
            double pagoDoble = (calcularHoras * hp);
            System.out.println("Ustede a realizado " + calcularHoras + " horas extras estas son pagadas al doble: $" + pagoDoble);
            
            //Calculamos cuanto gana durante las horas de trabajo normal
            double horasNormales = 40 * hp;
            
            //Calcular cuanto gana tomando en cuenta el salario normal y lo que gana por las horas extras
            double salarioSinRenta = horasNormales + pagoDoble;
            obj.setSalarioBruto(salarioSinRenta);
            System.out.println("Salario bruto $" + obj.getSalarioBruto());
            
            double retencionAplicada = salarioSinRenta * 0.1;
            obj.setMontoRetencion(retencionAplicada);
            System.out.println("Retencion Aplicada(RENTA) 10%: $" + obj.getMontoRetencion());
            
            double salarioConRenta = salarioSinRenta - retencionAplicada;
            obj.setSalarioLiquido(salarioConRenta);
            System.out.println("Salario liquido: $" + obj.getSalarioLiquido());            
            System.out.println("===================================");
            
        }else if(ht > 48){
            System.out.println("\n===============Datos===============");
            //Pago doble
            int calcularHorasDoble = (48 - 40);
            double pagoDoble = (calcularHorasDoble * hp) * 2;
            System.out.println("Usted ha realizado "+ calcularHorasDoble + " Horas Extras son pagadas al doble: $" + pagoDoble);
            
            //pago triple
            int calcularHorasTriples = (ht - 48);
            double pagoTriple = (calcularHorasTriples * hp) * 3;
            System.out.println("Usted ha excedido las 8horas, horas excedidas: "+ calcularHorasTriples + " y son pagadas al triple: $" + pagoTriple); 
            
            //Calculamos cuanto gana durante las horas de trabajo normal
            double horasNormales = 40  * hp;
            //Calculamos cuanto gana tomando en cuenta el salario normal y lo que gana por las horas extras
            double salarioSinRenta = (pagoDoble + pagoTriple + horasNormales);
            obj.setSalarioBruto(salarioSinRenta);
            System.out.println("Salario Bruto $" + obj.getSalarioBruto());
            
             double retencionAplicada = salarioSinRenta * 0.1;
            obj.setMontoRetencion(retencionAplicada);
            System.out.println("Retencion Aplicada(RENTA) 10%: $" + obj.getMontoRetencion());
            
            double salarioConRenta = salarioSinRenta - retencionAplicada;
            obj.setSalarioLiquido(salarioConRenta);
            System.out.println("Salario liquido: $" + obj.getSalarioLiquido());            
            System.out.println("===================================");
                     
        }
    }
    
}
