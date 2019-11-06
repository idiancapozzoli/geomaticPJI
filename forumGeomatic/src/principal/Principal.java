package principal;

import java.util.ArrayList;
import java.util.Scanner;

import dao.TopicoDAO;
import dao.UsuarioDAO;
import modelo.Topico;
import modelo.Usuario;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * 
 * @author Idian Capozzoli
 * @Author Thiago Hadano
 *
 */
public class Principal {

    public static void main(String[] args) {    
 
         	   

    	UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = null;
		TopicoDAO topicoDAO = new TopicoDAO();

		String nome, nick, telefone, email, senha, textoTopico;
		
		ArrayList<Topico> topicos;
	
		int codigoUsuario=0,codigoTopico, opcao, opcao2 = 0, opcao3;
		
		Scanner entrada = new Scanner (System.in);

		do {
		System.out.println("1. Cadastrar \n2.Login");
		System.out.println("Informe a opção desejada: ");
		opcao = entrada.nextInt();
		
		
		switch(opcao) {
		case 1:
			entrada = new Scanner(System.in);
			System.out.println("Informe o nome do usuario: ");
			nome=entrada.nextLine();
			
			entrada = new Scanner(System.in);
			System.out.println("Informe o nick do usuario: ");
			nick=entrada.nextLine();
			
			System.out.println("Informe o telefone do usuario: ");
			telefone=entrada.next();
			
			System.out.println("Informe o email do usuario: ");
			email=entrada.next();
			
			System.out.println("Informe a senha do usuario: ");
			senha=entrada.next();
		
			
			usuario = new Usuario (nome, nick, email, telefone, senha);			
			
			usuarioDAO.insereUsuario(usuario);
			
			codigoUsuario=usuarioDAO.consultaCodigoUsuario(nick);
			
			System.out.println(codigoUsuario);
			
			usuario.setCodigoUsuario(codigoUsuario);
			
		
			System.out.println("Usuário cadastrado com sucesso!");
			

			break;
		case 2:
			
			do {
			System.out.println("Insira o nick:");
			nick=entrada.next();
			
			System.out.println("Insira a senha");
			senha=entrada.next();
			
			usuarioDAO.checarLogin(nick,senha);
			System.out.println(usuarioDAO.checarLogin(nick,senha));
			}while(usuarioDAO.checarLogin(nick,senha)!="OK! Você logou!");
			
			codigoUsuario=usuarioDAO.consultaCodigoUsuario(nick);
			
		default:
				
		}
		
		}while (opcao==1);
		
	
		
		do{
			
		System.out.println("1. Criar tópico\n2. Ver tópicos");
		opcao2=entrada.nextInt();
		
		
		switch(opcao2) {
		case 1: 
			System.out.println("Digite o conteúdo do tópico:");
			
			Scanner entrada1 = new Scanner (System.in);
			
			textoTopico=entrada1.nextLine();
			
			Date data = new Date(System.currentTimeMillis());  
			SimpleDateFormat formatarDate = new SimpleDateFormat("yyyy-mm-dd"); 
			
			Topico topico = new Topico(textoTopico, data, codigoUsuario);
			
			topicoDAO = new TopicoDAO();
			
			topicoDAO.insereTopico(topico);
			
			codigoTopico=topicoDAO.consultaCodigoTopico(codigoUsuario);
			
			topico.setCodigoTopico(codigoTopico);
			
			break;
			
		case 2:
			
		
			System.out.println("Os tópicos no fórum são:");
			
			topicos=topicoDAO.consultaTopico();
			for (Topico topicoLista:topicos) 
			{
				System.out.println(topicoLista.getCodigoTopico() + "-" + topicoLista.getTextoTopico());
			}
		
			System.out.println("1. Fazer comentário \n2. Voltar");
			opcao3=entrada.nextInt();
			
			switch(opcao3) {
			case 1:
				
			}
			
			break;
		
		default:
			
		}
		
			
    }while (opcao2==1);
    
    }
}
