import java.util.ArrayList;

public class TratamentoErros{

    public static void main(String[] args) {

            ArrayList<String> carros = new ArrayList<>();

            carros.add("HRV");
            carros.add("Polo");
            carros.add("Cruze");
            carros.add("Argo");
            carros.add("Fusion");

            int nota1,nota2,res;

            nota1=50;
            nota2=20;
            
            if(nota1>50){
                throw new IllegalArgumentException("Valor de nota inválido");

            }
            if(nota2>50){
                throw new IllegalArgumentException("Valor de nota inválido");

            }
                res = nota1+nota2;
                System.out.println("Resultado: " + res);
            
            
            



           /*try{ //caso haja algum erro dentro do bloco try será tratado no catch

                System.out.println(carros.get(1));

            }catch(Exception e){
                System.out.println("ERRO: Valor fora do índice do array" + e.getMessage()); //e.getMessage extrai apenas a mensagem que explica o erro
            }finally{
                System.out.println("Fim do try");
            }*/


        
    }



}