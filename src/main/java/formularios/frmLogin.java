package formularios;

import clases.Datos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmLogin extends JFrame{
    //objetos
    private JLabel lblUrl;
    private JTextField txtUrl;
    private JComboBox cmbTipos;
    private JButton btnEnviar;
    private JTextArea txaResultado;


   //constructor
    public frmLogin(){
        //propiedades del formulario
        setTitle("Conexion con la Api");
        setResizable(false);
        setSize(800,700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creamos los iconos
        Icon icoAceptar = new ImageIcon(getClass().getResource("/Aceptar2.png"));


        // creamos objetos del formulario
        lblUrl = new JLabel("URL :");
        txtUrl = new JTextField();
        cmbTipos = new JComboBox();
        btnEnviar = new JButton("Enviar",icoAceptar);
        txaResultado = new JTextArea();

        // definimos propiedades de los objetos
        btnEnviar.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        btnEnviar.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnEnviar.setToolTipText(("Ingresa al sistema"));


        //adicionamos objetos al formulario
        add(lblUrl);
        add(txtUrl);
        add(cmbTipos);
        add(btnEnviar);
        add(txaResultado);

        //ubicamos objetos en el formulario
        lblUrl.reshape(20, 20, 50, 20);
        txtUrl.reshape(55, 20, 450, 20);
        cmbTipos.reshape(530, 20, 250, 20);
        txaResultado.reshape(55, 100, 450, 300);
        btnEnviar.reshape(20, 75, 90, 60);

        //addicionamos eventos a los botones
/*        btnEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnAceptaractionPerformed(e);
            }
        });*/

   }

 /*   private void btnAceptaractionPerformed(ActionEvent e){
        Datos misDatos = new Datos();
        if (!misDatos.validarUsuario(txtUrl.getText(), new String(txtClave.getPassword()))){
            JOptionPane.showMessageDialog(null,"Usuario o Contraseña no validos");

            txtUrl.requestFocusInWindow();
            return;
        }
        frmPrincipal miPrincipal = new frmPrincipal();
        setVisible(false);
        miPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        miPrincipal.setVisible(true);
    }*/


}
