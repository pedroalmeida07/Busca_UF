import java.util.HashMap;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args){
        // Criação do HashMap e Scanner teclado
        HashMap<String, UF> ufs = new HashMap<>();
        Scanner teclado = new Scanner(System.in);

        // Entrada de dados até digitar 'sair' no estado
        System.out.println("Digite o nome do estado ('sair' para finalizar o programa):");
        String nome = teclado.nextLine();
        while(!nome.equalsIgnoreCase("sair")){
            System.out.println("Digite a sigla do estado:");
            String uf = teclado.nextLine();
            
            System.out.println("Digite a região do estado (SE, NE, etc):");
            String regiao = teclado.nextLine();

            // Criação de um objeto UF
            UF estado = new UF(nome, uf, regiao);

            // Adiciona o objeto UF no HashMap com a sigla como chave
            ufs.put(uf, estado);

            System.out.println("Digite o nome do estado (Digite 'sair' para finalizar a entrada de dados):");
            nome = teclado.nextLine();
        }

        // Sistema de busca por sigla ou região até o usuário digitar 'sair'
        System.out.println("=======================================================================");
        System.out.println("Digite 'sigla' ou 'regiao' para iniciar a busca ('sair' para finalizar o programa):");
        String busca = teclado.nextLine();
        while(!busca.equalsIgnoreCase("sair")){
            // Busca por sigla
            if(busca.equalsIgnoreCase("sigla")){
                // Entrada da sigla que deseja buscar
                System.out.println("Digite a sigla que deseja buscar:");
                String sigla = teclado.nextLine();
                
                // Imprime os dados do estado com a sigla que foi buscada
                System.out.println("=======================================================================");
                System.out.println(ufs.get(sigla));
            }

            // Busca por região
            else if(busca.equalsIgnoreCase("regiao")){
                // Entrada da região que deseja buscar
                System.out.println("Digite a região que deseja buscar (NE, SE, etc.):");
                String regiao_busca = teclado.nextLine();
                
                // Para cada estado (valor) no HashMap, compara com a sigla desejada
                for (UF estado : ufs.values()){
                    // Se for igual, imprime os dados do estado
                    if(estado.regiao.equalsIgnoreCase(regiao_busca)){
                        System.out.println("----------------------");
                        System.out.println(estado);
                    }
                }
            }
            System.out.println("=======================================================================");
            System.out.println("Digite 'sigla' ou 'regiao' para iniciar a busca ('sair' para finalizar o programa):");
            busca = teclado.nextLine();
        }
        teclado.close();
    }   
}
