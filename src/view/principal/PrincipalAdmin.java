/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.principal;

import model.DesktopBackground;
import model.ModelUniversal;
import view.proveedor.Proveedores;
import view.usuario.Usuarios;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;
import view.categorias.Categorias;
import view.clientes.Clientes;
import view.compras.Compras;
import view.compras.ListarCompras;
import view.productos.Productos;
import view.tiendas.Tiendas;
import view.ventas.Ventas;

/**
 *
 * @author gonza
 */
public class PrincipalAdmin extends javax.swing.JFrame {

    
    
    
    ModelUniversal modelUniversal = new ModelUniversal();
    
    public InputStream fondo = this.getClass().getResourceAsStream("/images/fondojava.png");

    ModelUniversal modelU = new ModelUniversal();
    // String imagePath = "C:/Users/gonza/Documents/EjerciciosJava/Sistema Control Relopsa/src/images/HNCK4011.jpg";

    public PrincipalAdmin() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        //  loadImage(desktopPaneIndex, fondo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        desktopPaneIndex = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelClientesPrincipalAdmin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        labelUserPAdmin = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabelCargopAdmin = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuRegistroCliente = new javax.swing.JMenuItem();
        jMenuRegisEmpleados = new javax.swing.JMenuItem();
        jMenuRegistroProveedor = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Clientes");

        labelClientesPrincipalAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelClientesPrincipalAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cliente-32.png"))); // NOI18N
        labelClientesPrincipalAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelClientesPrincipalAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelClientesPrincipalAdminMouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuarios-32.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setText("Usuarios");

        jLabel5.setText("Proveedores");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/proveedor-32.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setText("Categorias");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/categoria-32.png"))); // NOI18N

        jLabel9.setText("Productos");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/registrar producto32.png"))); // NOI18N

        jLabel11.setText("Gastos");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/gastos-32.png"))); // NOI18N

        jLabel13.setText("Stock de productos");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/stock-32.png"))); // NOI18N

        jLabel15.setText("Compras");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/compras proveedor-36.png"))); // NOI18N

        jLabel17.setText("Tiendas");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tienda-32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelClientesPrincipalAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelClientesPrincipalAdmin, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Usuario:");

        labelUserPAdmin.setForeground(new java.awt.Color(0, 0, 0));
        labelUserPAdmin.setText("admin");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Cargo:");

        jLabelCargopAdmin.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCargopAdmin.setText("Administrador");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUserPAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCargopAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(labelUserPAdmin)
                    .addComponent(jLabel21)
                    .addComponent(jLabelCargopAdmin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        desktopPaneIndex.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPaneIndex.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneIndexLayout = new javax.swing.GroupLayout(desktopPaneIndex);
        desktopPaneIndex.setLayout(desktopPaneIndexLayout);
        desktopPaneIndexLayout.setHorizontalGroup(
            desktopPaneIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desktopPaneIndexLayout.setVerticalGroup(
            desktopPaneIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneIndexLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 384, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("Configuración");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/configuracion-16.png"))); // NOI18N
        jMenuItem1.setText("Parametros del sistema");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar-16.png"))); // NOI18N
        jMenuItem2.setText("Salir del sistema");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mantenimiento");

        jMenuRegistroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cliente-16.png"))); // NOI18N
        jMenuRegistroCliente.setText("Registro de cliente");
        jMenuRegistroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegistroClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuRegistroCliente);

        jMenuRegisEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuarios-16.png"))); // NOI18N
        jMenuRegisEmpleados.setText("Registro de empleados");
        jMenuRegisEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegisEmpleadosActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuRegisEmpleados);

        jMenuRegistroProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/proveedor-16.png"))); // NOI18N
        jMenuRegistroProveedor.setText("Registrar proveedor");
        jMenuRegistroProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegistroProveedorActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuRegistroProveedor);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/categoria-16.png"))); // NOI18N
        jMenuItem5.setText("Registrar Categoria");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/registrar producto-16.png"))); // NOI18N
        jMenuItem6.setText("Registrar producto");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tienda-16 .png"))); // NOI18N
        jMenuItem7.setText("Registrar tiendas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/gastos-16.png"))); // NOI18N
        jMenuItem8.setText("Registro de gastos");
        jMenu2.add(jMenuItem8);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/stock-16.png"))); // NOI18N
        jMenuItem9.setText("Ver stock de productos");
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Pedidos");

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pedido-16.png"))); // NOI18N
        jMenuItem10.setText("Registrar compras");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem29.setText("Listar Compras");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem29);

        jMenuBar1.add(jMenu3);

        jMenu13.setText("Ventas");

        jMenuItem30.setText("Generar Venta");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem30);

        jMenuBar1.add(jMenu13);

        jMenu4.setText("Reportes");

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cliente-16.png"))); // NOI18N
        jMenu6.setText("Clientes");

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/reporte cliente-16.png"))); // NOI18N
        jMenuItem11.setText("Catalogo de clientes");
        jMenu6.add(jMenuItem11);

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/venta cliente-16.png"))); // NOI18N
        jMenuItem12.setText("Venta por clientes");
        jMenu6.add(jMenuItem12);

        jMenu4.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/proveedor-16.png"))); // NOI18N
        jMenu7.setText("Proveedores");

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/catalogo proveedor-16.png"))); // NOI18N
        jMenuItem13.setText("catalogo de proveedores");
        jMenu7.add(jMenuItem13);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/compras proveedor-16.png"))); // NOI18N
        jMenuItem14.setText("Compras por proveedores");
        jMenu7.add(jMenuItem14);

        jMenu4.add(jMenu7);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/registrar producto-16.png"))); // NOI18N
        jMenu11.setText("Productos");

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/catalogo producto - 16.png"))); // NOI18N
        jMenuItem18.setText("Catalogo de productos");
        jMenu11.add(jMenuItem18);

        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/producto categoria-16.png"))); // NOI18N
        jMenuItem19.setText("Productos por categoria");
        jMenu11.add(jMenuItem19);

        jMenu4.add(jMenu11);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tienda-16 .png"))); // NOI18N
        jMenu8.setText("Ventas");

        jMenuItem15.setText("Ventas por año");
        jMenu8.add(jMenuItem15);

        jMenuItem17.setText("Ventas por año y mes");
        jMenu8.add(jMenuItem17);

        jMenu4.add(jMenu8);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuarios-16.png"))); // NOI18N
        jMenu9.setText("Vendedores");

        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ventas vendedor-16.png"))); // NOI18N
        jMenuItem20.setText("Ventas realizadas por vendedor");
        jMenu9.add(jMenuItem20);

        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ventas rango-16.png"))); // NOI18N
        jMenuItem21.setText("Rango de ventas por fechas");
        jMenu9.add(jMenuItem21);

        jMenu4.add(jMenu9);

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/business-16.png"))); // NOI18N
        jMenuItem16.setText("movimiento de estrada y salida");
        jMenu4.add(jMenuItem16);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Sales Performance-16.png"))); // NOI18N
        jMenu10.setText("Gastos");

        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/gastos-16.png"))); // NOI18N
        jMenuItem22.setText("Gastos por fechas");
        jMenu10.add(jMenuItem22);

        jMenuItem23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Overtime-16.png"))); // NOI18N
        jMenuItem23.setText("Gastos por año");
        jMenu10.add(jMenuItem23);

        jMenuItem24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Calendar-16.png"))); // NOI18N
        jMenuItem24.setText("Gastos por año y mes");
        jMenu10.add(jMenuItem24);

        jMenu4.add(jMenu10);

        jMenuBar1.add(jMenu4);

        jMenu12.setText("Contabilidad");

        jMenuItem3.setText("Inventario");
        jMenu12.add(jMenuItem3);

        jMenuItem4.setText("Diario");
        jMenu12.add(jMenuItem4);

        jMenuItem27.setText("Mayor");
        jMenu12.add(jMenuItem27);

        jMenuItem28.setText("Balance");
        jMenu12.add(jMenuItem28);

        jMenuBar1.add(jMenu12);

        jMenu5.setText("Ayuda");

        jMenuItem25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/key-go-icone-3791-16.png"))); // NOI18N
        jMenuItem25.setText("Cambiar clave");
        jMenu5.add(jMenuItem25);

        jMenuItem26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuarios-16.png"))); // NOI18N
        jMenuItem26.setText("Cambiar de Usuario");
        jMenu5.add(jMenuItem26);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPaneIndex)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPaneIndex)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelClientesPrincipalAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelClientesPrincipalAdminMouseClicked

    }//GEN-LAST:event_labelClientesPrincipalAdminMouseClicked

    private void jMenuRegisEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegisEmpleadosActionPerformed
        try {
            abrirVentanaUsuarios();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jMenuRegisEmpleadosActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        try {
            abrirVentanaUsuarios();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jMenuRegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegistroClienteActionPerformed
        try {
            abrirVentanaCliente();
        } catch (Exception e) {
            System.out.println("No se puede abrir ventana cliente " + e);
        }

    }//GEN-LAST:event_jMenuRegistroClienteActionPerformed

    private void jMenuRegistroProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegistroProveedorActionPerformed
        try {
            abrirVentanaProveedores();
        } catch (Exception e) {
            System.out.println("No se puede abrir ventana proveedor " + e);
        }
    }//GEN-LAST:event_jMenuRegistroProveedorActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        try {
            abrirVentanaProveedores();
        } catch (Exception e) {
            System.out.println("No se puede abrir ventana proveedor " + e);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            abrirVentanaCategorias();
        } catch (Exception e) {
            System.out.println("No se puede abrir ventana proveedor " + e);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        try {
            abrirVentanaProducto();
        } catch (Exception e) {
            System.out.println("No se puede abrir ventana producto " + e);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        try {
            abrirVentanaTiendas();
        } catch (Exception e) {
            System.out.println("No se puede abrir ventana producto " + e);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        int opcion = 0;
        try {
            abrirVentanaCompras();
        } catch (Exception e) {
            System.out.println("No se puede abrir ventana producto " + e);
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        try {
            abrirVentanaListarCompras();
        } catch (Exception e) {
            System.out.println("No se puede abrir ventana producto " + e);
        }
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        try {
            abrirVentanaVentas();
        } catch (Exception e) {
            System.out.println("No se puede abrir ventana producto " + e);
        }
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane desktopPaneIndex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jLabelCargopAdmin;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuRegisEmpleados;
    private javax.swing.JMenuItem jMenuRegistroCliente;
    private javax.swing.JMenuItem jMenuRegistroProveedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JLabel labelClientesPrincipalAdmin;
    public static javax.swing.JLabel labelUserPAdmin;
    // End of variables declaration//GEN-END:variables

    public void loadImage(JDesktopPane jdesktop, InputStream fileImage) {

        Usuarios user = new Usuarios();
        ModelUniversal modelUniversal = new ModelUniversal();

        try {
            BufferedImage image = ImageIO.read(fileImage);
            jdesktop.setBorder(new DesktopBackground(image));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void abrirVentanaCliente(){
        Clientes cliente = new Clientes();
        if (cliente.isShowing()) {
            System.out.println("ya esta abierto");
        } else {
            desktopPaneIndex.add(cliente);
            // user.setLocation(null);
            modelUniversal.centerJIF(desktopPaneIndex, cliente);
            cliente.show();
        }
    }

    public void abrirVentanaUsuarios() {
        Usuarios user = new Usuarios();
        if (user.isShowing()) {
            System.out.println("ya esta abierto");
        } else {
            desktopPaneIndex.add(user);
            // user.setLocation(null);
            modelUniversal.centerJIF(desktopPaneIndex, user);
            user.show();
        }
    }
    
    public void abrirVentanaProveedores(){
        Proveedores proveedor = new Proveedores();
        if (proveedor.isShowing()) {
            System.err.println("ya esta abierto");
        }else{
            desktopPaneIndex.add(proveedor);
            modelUniversal.centerJIF(desktopPaneIndex, proveedor);
            proveedor.show();
        }
    }

    private void abrirVentanaCategorias() {
        Categorias categoria = new Categorias();
        if (categoria.isShowing()) {
            System.err.println("ya esta abierto");
        }else{
            desktopPaneIndex.add(categoria);
            modelUniversal.centerJIF(desktopPaneIndex, categoria);
            categoria.show();
        }
    }

    public void abrirVentanaProducto() {
        Productos producto = new Productos();
        if (producto.isShowing()) {
            System.err.println("ya esta abierto");
        }else{
            desktopPaneIndex.add(producto);
            modelUniversal.centerJIF(desktopPaneIndex, producto);
            producto.show();
        }
    }

    private void abrirVentanaTiendas() {
       Tiendas tienda = new Tiendas();
       if (tienda.isShowing()) {
            System.err.println("ya esta abierto");
        }else{
            desktopPaneIndex.add(tienda);
            modelUniversal.centerJIF(desktopPaneIndex, tienda);
            tienda.show();
        }
    }

    private void abrirVentanaCompras() {
        Compras compras = new Compras();
        if (compras.isShowing()) {
            System.err.println("ya esta abierto");
        }else{
            desktopPaneIndex.add(compras);
            modelUniversal.centerJIF(desktopPaneIndex, compras);
            compras.show();
        }
    }

    private void abrirVentanaListarCompras() {
        ListarCompras listarCompras = new ListarCompras();
        if(listarCompras.isShowing()){
            System.err.println("ya esta abierto");
        }else{
            desktopPaneIndex.add(listarCompras);
            modelUniversal.centerJIF(desktopPaneIndex, listarCompras);
            listarCompras.show();
        }
    }

    private void abrirVentanaVentas() {
        Ventas ventas = new Ventas();
        if(ventas.isShowing()){
            System.err.println("ya esta abierto");
        }else{
            desktopPaneIndex.add(ventas);
            modelUniversal.centerJIF(desktopPaneIndex, ventas);
            ventas.show();
        }
    }
    
    

}
