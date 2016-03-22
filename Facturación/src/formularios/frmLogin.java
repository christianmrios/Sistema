package formularios;

import clases.Datos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Christian on 21/3/2016.
 */
public class frmLogin extends JFrame{
   //Objetos del Formulario

        private JLabel lblUsuario;
        private JLabel lblClave;
        private JLabel lblImagen;
        private JTextField txtUsuario;
        private JPasswordField txtClave;
        private JButton btnAceptar;
        private JButton btnCancelar;

    //Constructor
    public frmLogin(){
        //Propiedades del Formulario
        setTitle("Ingreso al Sistema");
        setResizable(false);
        setSize(390, 180);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creamos objetos del formulario
        lblUsuario= new JLabel("Usuario;");
        txtUsuario = new JTextField(10);
        lblClave =new JLabel("Clave;");
        txtClave = new JPasswordField(10);
        btnAceptar = new JButton("Aceptar");
        btnCancelar = new JButton("Cancelar");

        //Adicionamos objetos al formulario
        add(lblUsuario);
        add(txtUsuario);
        add(lblClave);
        add(txtClave);
        add(btnAceptar);
        add(btnCancelar);

        // Ubicamos objetos en el formulario
        lblUsuario.reshape(20,20,100,20);
        txtUsuario.reshape(120,20,100,20);

        lblClave.reshape(20,45,100,20);
        txtClave.reshape(120,45,100,20);

        btnAceptar.reshape(20,70,100,20);
        btnCancelar.reshape(130,70,100,20);

        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnAceptarActionPerformed(e);
            }
        });
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCancelarActionPerformed(e);
            }
        });

    }
    private void btnAceptarActionPerformed(ActionEvent e){
        Datos misDatos =new Datos();
        if(misDatos.validaUsuario(txtUsuario.getText(),new String(txtClave.getPassword()))== false){
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña no validos");
            txtUsuario.setText("");
            txtClave.setText("");
            txtUsuario.requestFocusInWindow();
            return;
        }
            frmPrincipal miPrincipal = new frmPrincipal();
            setVisible(false);
            miPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
            miPrincipal.setVisible(true);

    }

        private void btnCancelarActionPerformed(ActionEvent e){
            //Termina la Aplicación
            System.exit(0);
        }

    }

