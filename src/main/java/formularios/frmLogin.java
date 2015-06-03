package formularios;

import clases.Datos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmLogin extends JFrame{
    //objetos
    private JLabel lblUsuario;
    private JLabel lblClave;
    private JLabel lblImagen;
    private JTextField txtUsuario;
    private JPasswordField txtClave;
    private JButton btnAceptar;
    private JButton btnCancelar;

   //constructor
    public frmLogin(){
        //propiedades del formulario
        setTitle("Ingreso al sistema");
        setResizable(false);
        setSize(390,180);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creamos los iconos
        Icon icoAceptar = new ImageIcon(getClass().getResource("/Aceptar2.png"));
        Icon icoCancelar = new ImageIcon(getClass().getResource("/Cancelar.png"));
        Icon icoImagen = new ImageIcon(getClass().getResource("/Ingreso.png"));

        // creamos objetos del formulario
        lblUsuario = new JLabel("Usuario");
        txtUsuario = new JTextField(10);
        lblClave = new JLabel("Contraseña");
        txtClave = new JPasswordField(10);
        btnAceptar = new JButton("Aceptar",icoAceptar);
        btnCancelar = new JButton("Cancelar",icoCancelar);
        lblImagen = new JLabel(icoImagen);

        // definimos propiedades de los objetos
        btnAceptar.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        btnAceptar.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnAceptar.setToolTipText(("Ingresa al sistema"));

        btnCancelar.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        btnCancelar.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnCancelar.setToolTipText(("Cancela la operacion y Cierra la aplicacion"));

        //adicionamos objetos al formulario
        add(lblUsuario);
        add(txtUsuario);
        add(lblClave);
        add(txtClave);
        add(btnAceptar);
        add(btnCancelar);
        add(lblImagen);

        //ubicamos objetos en el formulario
        lblUsuario.reshape( 20, 20, 100, 20);
        txtUsuario.reshape(120, 20, 100, 20);
        lblImagen.reshape(250, 20, 128, 128);

        lblClave.reshape( 20, 45, 100, 20);
        txtClave.reshape(120, 45, 100, 20);

        btnAceptar.reshape(20, 75, 90, 60);
        btnCancelar.reshape(130, 75, 90, 60);

        //addicionamos eventos a los botones
        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnAceptaractionPerformed(e);
            }
        });
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnCancelaractionPerformed(e);
            }
        });
   }

    private void btnAceptaractionPerformed(ActionEvent e){
        Datos misDatos = new Datos();
        if (!misDatos.validarUsuario(txtUsuario.getText(), new String(txtClave.getPassword()))){
            JOptionPane.showMessageDialog(null,"Usuario o Contraseña no validos");
            txtClave.setText("");
            txtUsuario.requestFocusInWindow();
            return;
        }
        frmPrincipal miPrincipal = new frmPrincipal();
        setVisible(false);
        miPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        miPrincipal.setVisible(true);
    }

    private void btnCancelaractionPerformed(ActionEvent e){
        //Terminamos la Aplicacion
        System.exit(0);
    }
}
