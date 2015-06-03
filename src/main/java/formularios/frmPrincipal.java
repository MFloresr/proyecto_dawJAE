package formularios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmPrincipal extends JFrame {
    //objetos
    private JMenuBar mnbFacturacion;
    private JMenu mnuUsuarios;
    private JMenu mnuProductos;
    private JMenu mnuCategorias;
    private JMenu mnuProveedores;
    private JMenu mnuAyuda;

    private JMenuItem mnuUsuariosNuevousuario;
    private JSeparator mnuUsuariosSeparador1;
    private JMenuItem mnuUsuariosCambioContra;
    private JMenuItem mnuUsuariosCambioUsuario;
    private JSeparator mnuUsuariosSeparador2;
    private JMenuItem mnuUsuariosSalir;

    private JMenuItem mnuProductosNuevoProducto;

    private JMenuItem mnuCategoriasNuevaCategoria;

    private JMenuItem mnuProveedoresNuevoProveedor;

    private JMenuItem mnuAyudaAcercaDe;
    private JMenuItem mnuAyudaAyuda;
    private JDesktopPane dpnEscritorio;
    //contructor
    frmPrincipal(){
        //propiedades del formulario
        setTitle("Sistema De Facturción");
        setResizable(true);
        setSize(700, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creamos iconos
        Icon icoUsuarios = new ImageIcon(getClass().getResource("/usuario.png"));
        Icon icoProductos = new ImageIcon(getClass().getResource("/productos2.png"));
        Icon icoCategorias = new ImageIcon(getClass().getResource("/category.png"));
        Icon icoProveedores= new ImageIcon(getClass().getResource("/company.png"));
        Icon icoAyuda = new ImageIcon(getClass().getResource("/Ayuda.png"));
        Icon icoUsuarioNuevoUsuario = new ImageIcon(getClass().getResource("/nuevousuario.png"));
        Icon icoUsuarioCambiarContra = new ImageIcon(getClass().getResource("/CambioClave.png"));
        Icon icoUsuarioCambiarUsuario = new ImageIcon(getClass().getResource("/CambiarUsuario.png"));
        Icon icoUsuarioSalir = new ImageIcon(getClass().getResource("/Salir.png"));
        Icon icoProductoNuevoProducto= new ImageIcon(getClass().getResource("/Nuevo.png"));
        Icon icoCategoriaNuevaCategoria = new ImageIcon(getClass().getResource("/Nuevo.png"));
        Icon icoProveedoresNuevaProveedor = new ImageIcon(getClass().getResource("/Nuevo.png"));
        Icon icoAyudaAcercaDe = new ImageIcon(getClass().getResource("/AcercaDE.png"));
        Icon icoAyudaAyuda = new ImageIcon(getClass().getResource("/Ayuda2.png"));

        //creacion de objetos
        mnbFacturacion = new JMenuBar();
        mnuUsuarios = new JMenu("Usuarios");
        mnuProductos = new JMenu("Productos");
        mnuCategorias = new JMenu("Categorias");
        mnuProveedores = new JMenu("Proveedores");
        mnuAyuda = new JMenu("Ayuda");

        mnuUsuariosNuevousuario = new JMenuItem("Nuevo usuario");
        mnuUsuariosSeparador1 = new JSeparator();
        mnuUsuariosCambioContra = new JMenuItem("Canviar Contraseña");
        mnuUsuariosCambioUsuario = new JMenuItem("Canviar usuario");
        mnuUsuariosSeparador2 = new JSeparator();
        mnuUsuariosSalir = new JMenuItem("Salir");

        mnuProductosNuevoProducto = new JMenuItem("Nuevo producto");

        mnuCategoriasNuevaCategoria = new JMenuItem("Nueva categoria");

        mnuProveedoresNuevoProveedor = new JMenuItem("Nuevo proveedor");

        mnuAyudaAcercaDe = new JMenuItem("Acerca de ");
        mnuAyudaAyuda = new JMenuItem("Ayuda");
        dpnEscritorio = new JDesktopPane();

        //asignamos iconos
        mnuUsuarios.setIcon(icoUsuarios);
        mnuProductos.setIcon(icoProductos);
        mnuCategorias.setIcon(icoCategorias);
        mnuProveedores.setIcon(icoProveedores);
        mnuAyuda.setIcon(icoAyuda);
        mnuUsuariosNuevousuario.setIcon(icoUsuarioNuevoUsuario);
        mnuUsuariosCambioContra.setIcon(icoUsuarioCambiarContra);
        mnuUsuariosCambioUsuario.setIcon(icoUsuarioCambiarUsuario);
        mnuUsuariosSalir.setIcon(icoUsuarioSalir);
        mnuProductosNuevoProducto.setIcon(icoProductoNuevoProducto);
        mnuCategoriasNuevaCategoria.setIcon(icoCategoriaNuevaCategoria);
        mnuProveedoresNuevoProveedor.setIcon(icoProveedoresNuevaProveedor);
        mnuAyudaAcercaDe.setIcon(icoAyudaAcercaDe);
        mnuAyudaAyuda.setIcon(icoAyudaAyuda);

        //armamos menu
        mnuUsuarios.add(mnuUsuariosNuevousuario);
        mnuUsuarios.add(mnuUsuariosSeparador1);
        mnuUsuarios.add(mnuUsuariosCambioContra);
        mnuUsuarios.add(mnuUsuariosCambioUsuario);
        mnuUsuarios.add(mnuUsuariosSeparador2);
        mnuUsuarios.add(mnuUsuariosSalir);
        mnbFacturacion.add(mnuUsuarios);

        mnuProductos.add(mnuProductosNuevoProducto);
        mnbFacturacion.add(mnuProductos);

        mnuCategorias.add(mnuCategoriasNuevaCategoria);
        mnbFacturacion.add(mnuCategorias);

        mnuProveedores.add(mnuProveedoresNuevoProveedor);
        mnbFacturacion.add(mnuProveedores);

        mnuAyuda.add(mnuAyudaAcercaDe);
        mnuAyuda.add(mnuAyudaAyuda);
        mnbFacturacion.add(mnuAyuda);

        //mas propiedades del formulario
        setJMenuBar(mnbFacturacion);
        setContentPane(dpnEscritorio);

        //eventos de los menus
        mnuUsuariosNuevousuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mnuUsuariosNuevousuarioactionPerformed(e);
            }
        });
        mnuUsuariosCambioContra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mnuUsuariosCambioContraactionPerformed(e);
            }
        });
        mnuUsuariosCambioUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mnuUsuariosCambioUsuarioactionPerformed(e);
            }
        });
        mnuUsuariosSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mnuUsuariosSaliractionPerformed(e);
            }
        });
        mnuProductosNuevoProducto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mnuProductosNuevoProductoactionPerformed(e);
            }
        });
        mnuCategoriasNuevaCategoria.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mnuCategoriasNuevaCategoriaactionPerformed(e);
            }
        });
        mnuProveedoresNuevoProveedor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mnuProveedoresNuevoProveedoractionPerformed(e);
            }
        });
        mnuAyudaAcercaDe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mnuAyudaAcercaDeactionPerformed(e);
            }
        });
        mnuAyudaAyuda.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mnuAyudaAyudaactionPerformed(e);
            }
        });
    }

    private void mnuUsuariosNuevousuarioactionPerformed(ActionEvent e){
        frmNuevoUsuarios nuevoUsuario = new frmNuevoUsuarios();
        dpnEscritorio.add(nuevoUsuario);
        nuevoUsuario.show();
    }

    private void mnuUsuariosCambioContraactionPerformed(ActionEvent e){
        frmCambiarContra nuevoContra = new frmCambiarContra();
        dpnEscritorio.add(nuevoContra);
        nuevoContra.show();
    }

    private void mnuUsuariosCambioUsuarioactionPerformed(ActionEvent e){
        System.exit(0);//falta completar este event listenr TODO
    }

    private void mnuUsuariosSaliractionPerformed(ActionEvent e){
        System.exit(0);
    }

    private void mnuProductosNuevoProductoactionPerformed(ActionEvent e){
        frmNuevoProducto nuevoProducto = new frmNuevoProducto();
        dpnEscritorio.add(nuevoProducto);
        nuevoProducto.show();
    }

    private void mnuCategoriasNuevaCategoriaactionPerformed(ActionEvent e){
        frmNuevaCategoria nuevaCategoria = new frmNuevaCategoria();
        dpnEscritorio.add(nuevaCategoria);
        nuevaCategoria.show();
    }

    private void mnuProveedoresNuevoProveedoractionPerformed(ActionEvent e){
        frmNuevoProveedor nuevoProveedor = new frmNuevoProveedor();
        dpnEscritorio.add(nuevoProveedor);
        nuevoProveedor.show();
    }

    private void mnuAyudaAcercaDeactionPerformed(ActionEvent e){
        System.exit(0);//falta TODO
    }

    private void mnuAyudaAyudaactionPerformed(ActionEvent e){
        System.exit(0);//falta TODO
    }

}
