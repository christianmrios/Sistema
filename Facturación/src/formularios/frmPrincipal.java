package formularios;

import javax.swing.*;

/**
 * Created by Christian on 21/3/2016.
 */
public class frmPrincipal extends JFrame {
    //Objetos
    private JMenuBar mnbFacturacion;
    private JMenu mnuArchivos;
    private JMenu mnuMovimientos;
    private JMenu mnuuAyuda;
    private JMenuItem mnbFacturacio;
    //Constructor
    public  frmPrincipal(){
        //Propiedades del Formulario
        setTitle("Sistema de Facturación");
        setResizable(true);
        setSize(700, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}