package controlador;

import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Textbox;

public class PersonaController  extends GenericForwardComposer {
	Textbox txtNombre;
	Textbox txtEdad;
	Textbox txtDireccion;
	Listbox listado;
	Button btnAgregar;
	
	public void onClick$btnAgregar(){
		Listitem g = new Listitem();
		g.appendChild(new Listcell(txtNombre.getValue()));
		g.appendChild(new Listcell(txtEdad.getValue()));
		g.appendChild(new Listcell(txtDireccion.getValue()));
		listado.appendChild(g);
		
	}
}
