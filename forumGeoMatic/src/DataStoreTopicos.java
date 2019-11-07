import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DataStoreTopicos {
	private static ArrayList<Topico> listaTopicos;
	
	public void iniciaLista() {	
		listaTopicos = new ArrayList<>();
	}
	
	public static void add(Topico topico) {
		listaTopicos.add(topico);
	}
		
	/*public static String[][] listaComoMatrix(){
		
				String[][] matrizTopicos = new String[listaTopicos.size()][3];
				int i =1;
						matrizTopicos[1][1]="Titulo";
						matrizTopicos[1][2]="Texto";
						matrizTopicos[1][3]="Usuario";
				
				for(Topico topico:listaTopicos) {	
						matrizTopicos[i][1]=topico.getTituloTopico();
						matrizTopicos[i][2]=topico.getTextoTopico();
						matrizTopicos[i][3]=topico.getUsuario().getNome();
						i++;
					
					}
				return matrizTopicos;
	}*/
}
