package Atividades.Atividade_05;
import java.util.Scanner;

import Atividades.Atividade_05.Atividade05_Code1.AtendimentoMedico; 

public class Atividade05_Classes {
    public class ProgramaAtendimentosMedicos { 
        public static void main(String [] args) { 
            Scanner leitor = new Scanner(System.in); 
            System.out.println("Quantos atendimentos você quer cadastrar?"); 
            int quantAtendimentos = Integer.parseInt(leitor.nextLine()); 
            AtendimentoMedico [] atendimentos = new AtendimentoMedico [quantAtendimentos]; 
            for (int k=0; k< quantAtendimentos; k++) { 
                System.out.println("Qual o código do atendimento?"); 
                String codigo= leitor.nextLine(); 
                System.out.println("Qual o dia do atendimento?"); 
                String diaAtendimento = leitor.nextLine(); 
                System.out.println("Qual a categoria do atendimento? CLÍNICA,"+ "ORTOPÉDICO ou CARDIOLÓGICO");   
                String categoriaAtendimento = leitor.nextLine(); 
                atendimentos[k]  = new AtendimentoMedico(codigo, diaAtendimento, categoriaAtendimento);
          } 
          imprimeAtendimentos(atendimentos);      
          leitor.close(); 
      }
    int h = 1;
        private void imprimeAtendimentos(AtendimentoMedico[] atendimentos) { 
           System.out.println("Atendimentos feitos:"); 
           int i=0;  
           while (i< atendimentos.length) {
                System.out.println("Ficha:"+atendimentos[i].getCodigoAtendimento()+", Data:"+atendimentos[i].getDiaAtendimento()+", Categoria:"+       atendimentos[i].getCategoriaAtendimento()); 
                i+=1;
                    }
               } 
        
        private static contaQuantidadeDeAtendimentosCardiologicos(AtendimentoMedico[] args){
            int cont = args.length;
            int quantTotal = 0;
            int k=0;
            while (k<cont) {
                if(args[k].getCategoriaAtendimento().equals("CARDIOLÓGICO")){
                    quantTotal++;
                }
                k++;
            }return quantTotal;


        private static boolean existiramAtendimentosNaData(String data, AtendimentoMedico[] atendimentos){
            int cont = atendimentos.lenght;
            int k=0;
            while(k<cont){
                if( atendimento[k].getDiaAtendimento().equals(data) ) {
                    return true;
                } else{
                    return false;
                }
                k++;
            }
        }
            }
        }
       }

    


