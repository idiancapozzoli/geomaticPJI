import java.util.ArrayList;

public class DataStoreUsuarios {
	private static ArrayList<Usuario> listaUsuarios;
	
	public void iniciaLista() {
		
		Usuario usuario0 = new Usuario("idian","","","","idian","123");

		listaUsuarios = new ArrayList<>();
		listaUsuarios.add(usuario0);
	}

	public static void add(Usuario usuario) {
		listaUsuarios.add(usuario);
			
	}
	
	public static Usuario validaLogin (String nick, String senha) {
		for (Usuario usuario : listaUsuarios) {
            if (usuario.getNick().equals(nick)) {
            	if (usuario.getSenha().equals(senha)) {
            		return usuario;
            	}
            }
        }
		return null;
		
	}
		
}
