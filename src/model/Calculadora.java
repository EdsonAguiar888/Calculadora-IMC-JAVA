
package model;

/**
 *
 * @author HP
 */
public class Calculadora {
    
    float resultado;
    float altura;
    float peso; 

    public Calculadora(float altura, float peso, float resultado) {
        this.altura = altura;
        this.peso = peso;
        this.resultado = resultado;
    }

    public Calculadora(float altura, float peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public Calculadora() {
    }
    
    

    

    
    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    //==========================================
    //Metodo Calcular

    
    
   public float calcularResultado(){
        
        resultado = peso / (altura * altura);
        return resultado;
                
    }
   
   public float clear(){
       return resultado = 0;
   } 

    
}
