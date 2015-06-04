package formularios;

import clases.Datos;
import clases.GETP;

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
    private String[] Metodos = {"POST","GET","DELETE","UPDATE"};

   //constructor
    public frmLogin(){
        //propiedades del formulario
        setTitle("Conexion con la Api");
        setResizable(false);
        setSize(800,600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creamos los iconos
        Icon icoAceptar = new ImageIcon(getClass().getResource("/Aceptar2.png"));


        // creamos objetos del formulario
        lblUrl = new JLabel("URL :");
        txtUrl = new JTextField();
        cmbTipos = new JComboBox(Metodos);
        btnEnviar = new JButton("Enviar",icoAceptar);
        txaResultado = new JTextArea();

        //
        cmbTipos.setSelectedIndex(1);

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
        txaResultado.reshape(20, 200, 750, 350);
        btnEnviar.reshape(20, 75, 90, 60);

        //addicionamos eventos a los botones
        btnEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GETP accion = new GETP();
                String r = "";
                try {
                    r = accion.sendGet(txtUrl.getText(), cmbTipos.getSelectedItem().toString());
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

                System.out.println(" Aqui esta el texto  "+txtUrl.getText() + "  " + cmbTipos.getSelectedItem().toString() + "\n " + r);
                txaResultado.setText(r);
                txaResultado.disable();
            }
        });

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
