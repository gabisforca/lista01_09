import java.util.Scanner;
class Main {
  public static void main(String[] args){
    //passo 1:variavel
    double Fahrenheit;
    double Celsius;
    
    //passo 2: entrada de dados 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite a temperatura em Fahrenheit: ");
    Fahrenheit = teclado.nextDouble();
    
    // passo 3: calcular
    Celsius = 5 * ((Fahrenheit-32) / 9);
    
    // passo 4: exibir
   System.out.println("Sua temperatura em Celsius é:" + Celsius); 
   
  }
}
