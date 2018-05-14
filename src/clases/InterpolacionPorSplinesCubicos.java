/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Desktop;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.nfunk.jep.JEP;
import javax.swing.*;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


/**
 * para realiar la grafica de interpolacion se hace uso de la s librerias
 * jmathplot y jmatharray
 *
 * @author Darwin
 */
public class InterpolacionPorSplinesCubicos extends javax.swing.JFrame {

    private static int i, n;
    public static double componenteX[];
    public static double componenteY[];
    public static double dj[], cj[], bj[];

    public static int getN() {
        return n;
    }

    public static void setN(int n) {
        InterpolacionPorSplinesCubicos.n = n;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    /**
     * Creates new form InterpolacionPorSplinesCubicos
     */
    public InterpolacionPorSplinesCubicos() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Autor : Darwin Morocho");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagenes/icono.png"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());

        // al inicio del programa se muestran las casillas descativadas
        jX.setEnabled(false);
        jY.setEnabled(false);
        puntoEvaluar.setEnabled(false);
        jButtonEvaluarPunto.setEnabled(false);
        jButtonregistrar.setEnabled(false);// se desavilitamos el boton registro de puntos
        visualizar_grafica.setEnabled(false);// se desavilitamos el boton visualizar grafica de puntos
        puntosIngresados.setEnabled(false);
        

    }

    public InterpolacionPorSplinesCubicos(int g) {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagenDeFONDO = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButtonregistrar = new javax.swing.JButton();
        jX = new javax.swing.JTextField();
        jY = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numeroPuntos = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        puntoEvaluar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButtonEvaluarPunto = new javax.swing.JButton();
        jTextField_S_X = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        visualizar_grafica = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        puntosIngresados = new javax.swing.JTextField();
        jPanelMuestraGrafica = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        imagenDeFONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tecno-cubos-51b330177f585.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Autor : Darwin Morocho       Ing. En Computación Gráfica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 14), new java.awt.Color(0, 51, 51))); // NOI18N
        jPanel4.setLayout(null);

        jButtonregistrar.setText("Registrar");
        jButtonregistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonregistrarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonregistrar);
        jButtonregistrar.setBounds(190, 60, 80, 30);

        jX.setEditable(false);
        jPanel4.add(jX);
        jX.setBounds(30, 60, 60, 30);

        jY.setEditable(false);
        jY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jYActionPerformed(evt);
            }
        });
        jPanel4.add(jY);
        jY.setBounds(110, 60, 60, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText(" ,");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(90, 60, 30, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText(" (");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(10, 50, 50, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText(" )");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(170, 50, 20, 50);

        numeroPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroPuntosActionPerformed(evt);
            }
        });
        jPanel4.add(numeroPuntos);
        numeroPuntos.setBounds(190, 20, 70, 30);
        jPanel4.add(jSeparator1);
        jSeparator1.setBounds(10, 100, 0, 2);
        jPanel4.add(jSeparator2);
        jSeparator2.setBounds(10, 100, 990, 10);

        jLabel8.setText("Tema: Interpolación por Splines Cúbicos  ( con la condicion de frontera libre )");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(60, 380, 460, 30);

        jTextArea.setEditable(false);
        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 214, 560, 96);

        jLabel9.setText("Punto a evaluar");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(20, 140, 100, 50);

        puntoEvaluar.setEditable(false);
        puntoEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoEvaluarActionPerformed(evt);
            }
        });
        jPanel4.add(puntoEvaluar);
        puntoEvaluar.setBounds(120, 150, 70, 30);

        jLabel10.setText("Puntos ingresados");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(20, 100, 140, 50);

        jButtonEvaluarPunto.setText("Evaluar");
        jButtonEvaluarPunto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonEvaluarPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEvaluarPuntoActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonEvaluarPunto);
        jButtonEvaluarPunto.setBounds(200, 150, 70, 30);

        jTextField_S_X.setEditable(false);
        jPanel4.add(jTextField_S_X);
        jTextField_S_X.setBounds(10, 320, 560, 40);

        jButtonGuardar.setText("guardar");
        jButtonGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonGuardar);
        jButtonGuardar.setBounds(260, 20, 90, 30);

        jLabel1.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 24)); // NOI18N
        jLabel1.setText("Universidad Central Del Ecuador");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(100, 340, 370, 70);

        jButton1.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono.png"))); // NOI18N
        jButton1.setText("Nueva Interpolación");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(90, 410, 233, 50);

        jButton3.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono.png"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(350, 410, 130, 50);

        jLabel11.setText("Número de puntos a interpolar ");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(10, 20, 190, 30);

        visualizar_grafica.setText("Visualizar gráfica de interpolación");
        visualizar_grafica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        visualizar_grafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizar_graficaActionPerformed(evt);
            }
        });
        jPanel4.add(visualizar_grafica);
        visualizar_grafica.setBounds(340, 181, 230, 30);

        jLabel12.setText("Polinomios S (x)");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(230, 190, 100, 30);

        puntosIngresados.setEditable(false);
        jPanel4.add(puntosIngresados);
        puntosIngresados.setBounds(130, 110, 440, 30);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(10, 10, 580, 470);

        jPanelMuestraGrafica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setText("Ayuda");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Manual de usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanelMuestraGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelMuestraGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visualizar_graficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizar_graficaActionPerformed
        try {
            // TODO add your handling code here:
            jPanelMuestraGrafica.setVisible(true);// hace visible el panel de grafica
            ChartPanel panel = null;
            JFreeChart chart = null;

            // paso a determinar una particion del intervalo [Xo,Xn-1] para
            // obteer los puntos  Sj  y poder realizar la grafica
            double xi[] = new double[200];// almacena los valores Xi de las paricines de cada intervalo [Xi,Xi+1]
            // se divide el intervalo [Xo,Xn-1] en 199 particiones
            double h1 = (componenteX[componenteX.length - 1] - componenteX[0]) / 199;

            xi[0] = componenteX[0];
            for (int i = 1; i < xi.length; i++) {
                xi[i] = componenteX[0] + (i * h1);// paso a determinar las valores Xi del intervalo [Xo,Xn-1]
            }

            ParticionesSplinesCubicos obj1 = new ParticionesSplinesCubicos();// se crea una inatancia de la clase ParticionesSplinesCubicos

            double f_xi[] = new double[200];// arreglo que almacenara los valores Sj que devuelve el metodo puntosParticion de la clase ParticionesSplinesCubicos
            f_xi = Arrays.copyOf(obj1.puntosParticion(InterpolacionPorSplinesCubicos.getN(), componenteX, componenteY, xi, bj, cj, dj), f_xi.length);
            f_xi[0] = componenteY[0];

            int validar = 1;//variable usada para validar que los datos ingreados en la tabla sean validos
            XYSplineRenderer renderer = new XYSplineRenderer();// rederizador para poder hacer el grafico
            XYSeriesCollection dataset = new XYSeriesCollection();// variable usada para almacenar todos los datos a graficar

            ValueAxis x = new NumberAxis();//variable usada para definir el eje x
            ValueAxis y = new NumberAxis();//variable usada para definir el eje y

            XYSeries serie = new XYSeries("datos");// variable que almacenaras los datos ingresados en la tabla de cinco dilas
            XYPlot plot;
            jPanelMuestraGrafica.removeAll();// remueve todo lo que esta en el panel de lineas

            // pasamos a btener los datos que estan en la tabla
            try {
                for (int i = 0; i < xi.length; i++) {// es asta 6i<6 por que nuestra tabla tiene cinco filas
                    serie.add(xi[i], f_xi[i]);
                }// fin for (int i = 0; i < 6; i++)
            } catch (Exception e) {// se ejecuta si hubo un error en la lectura de datos de la tabla
                validar = 0;

            }
            if (validar == 1) {// como no hubo error en la lectura de datos de la tabla
                dataset.addSeries(serie);// adiere la serie a la  XYSeriesCollection

                // acontinuacion detallamos los ejes en el grafico que apaerece en el jPanel
                x.setLabel(" EJE X");
                y.setLabel(" EJE Y");

                plot = new XYPlot(dataset, x, y, renderer);// se adiere a la grafica todos los datos que se desean mostrar
                chart = new JFreeChart(plot);

                chart.setTitle("Grafico de interpolación S(x)");// le ponemos un titulo a nuestro grafico

                panel = new ChartPanel(chart);
                panel.setBounds(5, 10, 600, 450);// establecemos la posicion donde se visalizara la grafica de interpolacion
                jPanelMuestraGrafica.add(panel);// se adiere la grafica al JPanel
                jPanelMuestraGrafica.repaint();

            } else {
                JOptionPane.showMessageDialog(this, "error ingreso de datos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "error ingreso de datos");
        }
    }//GEN-LAST:event_visualizar_graficaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        puntosIngresados.setText("");
        InterpolacionPorSplinesCubicos m = new InterpolacionPorSplinesCubicos(0);
        m.setI(0);
        InterpolacionPorSplinesCubicos.n = 0;
        InterpolacionPorSplinesCubicos.componenteX = null;
        InterpolacionPorSplinesCubicos.componenteY = null;
        InterpolacionPorSplinesCubicos.bj = null;
        InterpolacionPorSplinesCubicos.cj = null;
        InterpolacionPorSplinesCubicos.dj = null;
        numeroPuntos.setText("");
        numeroPuntos.setEnabled(true);
        numeroPuntos.setEditable(true);
        jButtonGuardar.setEnabled(true);// se avilita el boton guardar
        jX.setEnabled(false);
        jY.setEnabled(false);
        puntoEvaluar.setText("");
        jTextArea.setText("");
        jTextField_S_X.setText("");
        puntoEvaluar.setEnabled(false);
        jButtonEvaluarPunto.setEnabled(false);
        jButtonregistrar.setEnabled(false);// se desavilitamos el boton registro de puntos
        visualizar_grafica.setEnabled(false);// se desavilitamos el boton visualizar grafica de puntos
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        try {
            InterpolacionPorSplinesCubicos.setN(Integer.parseInt(numeroPuntos.getText()));
            numeroPuntos.setEnabled(false);// desavilita la edicion del campo en donde se ingresa el numero de puntos
            InterpolacionPorSplinesCubicos.componenteX = new double[n];
            InterpolacionPorSplinesCubicos.componenteY = new double[n];

            jTextArea.setText("");

            // acontinuacion abilitamos las casillas de ingreso de puntos
            jX.setEnabled(true);
            jX.setEditable(true);
            jY.setEnabled(true);
            jY.setEditable(true);

            jButtonregistrar.setEnabled(true);// se avilitamos el boton registro de puntos
            jButtonGuardar.setEnabled(false);// se desavilita el boton guardar
        } catch (Exception e) {
            jTextArea.setText("ERROR\nIngrese un número de puntos validos");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonEvaluarPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEvaluarPuntoActionPerformed
        // TODO add your handling code here:

        try {
            boolean mensaje = false;
            JEP b1 = new JEP();
            b1.addStandardFunctions(); // adiciona las funciones matem´aticas
            b1.addStandardConstants();
            b1.parseExpression(puntoEvaluar.getText()); // paso de la expresi´on a evaluar
            double x_evaluar = b1.getValue();// almacena en el en la poicion i del arreglo el valor ingresado en jText de la componente en x
            double sx;// variable que almacena el valor del polinomio en el punto ingresado
            for (int i = 0; i < InterpolacionPorSplinesCubicos.getN() - 1; i++) {
                if (x_evaluar >= componenteX[i] && x_evaluar <= componenteX[i + 1]) {// si el punto ingresado es elemento del intervale [Xi,Xi+1]
                    // se evalua e punto ingresado en el polinomio Sj
                    sx = componenteY[i] + (bj[i] * (x_evaluar - componenteX[i])) + (cj[i] * Math.pow(x_evaluar - componenteX[i], 2)) + (dj[i] * Math.pow(x_evaluar - componenteX[i], 3));
                    jTextField_S_X.setText("valor  aproximado S(" + x_evaluar + ")= " + sx);//  inprime el resultado de la evluacion anterior
                    mensaje = true;

                }

            }// fin bucle i
            if (mensaje == false) {// si el punto ingresado no esta en el intervalo [x0,xn]
                jTextField_S_X.setText("punto a evaluar no está en el intervalo [ " + Double.toString(componenteX[0]) + " , " + Double.toString(componenteX[componenteX.length - 1]) + " ]");
            }
        } catch (Exception e) {
            jTextField_S_X.setText("error el el ingreso del punto a evaluar");
        }
    }//GEN-LAST:event_jButtonEvaluarPuntoActionPerformed

    private void puntoEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoEvaluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puntoEvaluarActionPerformed

    private void numeroPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroPuntosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroPuntosActionPerformed

    private void jYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jYActionPerformed

    private void jButtonregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonregistrarActionPerformed
        // TODO add your handling code here:

        try {
            InterpolacionPorSplinesCubicos m = new InterpolacionPorSplinesCubicos(0);
            int n = InterpolacionPorSplinesCubicos.getN();

            if (m.getI() < n) {// si los punts ingresados son menores que n  permite el ingreso de otro punto
                JEP b1 = new JEP();
                b1.addStandardFunctions(); // adiciona las funciones matem´aticas
                b1.addStandardConstants();
                b1.parseExpression(jX.getText()); // paso de la expresi´on a evaluar
                componenteX[m.getI()] = b1.getValue();// almacena en el en la poicion i del arreglo el valor ingresado en jText de la componente en x

                b1.parseExpression(jY.getText()); // paso de la expresi´on a evaluar
                componenteY[m.getI()] = b1.getValue();// almacena en el en la poicion i del arreglo el valor ingresado en jText de la componente en y

                String puntos = " ( " + jX.getText() + " , " + jY.getText() + " ) ";// variable usada para mostratr en pantala el punto regitrado
                String coma = ",";
                if (m.getI() + 1 == n) {
                    coma = "";
                }

                puntosIngresados.setText(puntosIngresados.getText() + puntos + coma);//muestra en pantalla los puntos registrados
                jX.setText("");// limpia la casilla de la componente en x del punto ngresado
                jY.setText("");// limpia la casilla de la componente en y del punto ngresado

                if (m.getI() + 1 == n) {// si ya se ingreso el numero de puntos establecidos se bloquea el boton  Registrar

                    this.splines(n);
                    jButtonregistrar.setEnabled(false);
                    // acontinuacion desabilitamos las casillas de ingreso de puntos
                    jX.setEnabled(false);
                    jY.setEnabled(false);
                    visualizar_grafica.setEnabled(true);// avilitamos el boton visualizar grafica de puntos
                }

                m.setI(m.getI() + 1);//aumenta el contador de ingreso de puntos
            }

        }// fin try
        catch (Exception e) {
            jTextArea.setText("error en el ingreso de los puntos");
        }
    }//GEN-LAST:event_jButtonregistrarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         try {
            File directorio = new File("temp"); //Creas un nuevo directorio a nivel de tu jar.
            directorio.mkdirs();
            directorio.setWritable(true);
            //copias la direccion
            String archivo = directorio.getCanonicalPath() + File.pathSeparator + "splin.pdf";
            //nuevo archivo en esa direccion
            File temp = new File(archivo);
            InputStream is = this.getClass().getResourceAsStream("/pdfs/splin.pdf");
            FileOutputStream archivoDestino = new FileOutputStream(temp);
            FileWriter fw = new FileWriter(temp);
            byte[] buffer = new byte[512 * 1024];
            //lees el archivo hasta que se acabe...
            int nbLectura;
            while ((nbLectura = is.read(buffer)) != -1) {
                archivoDestino.write(buffer, 0, nbLectura);
            }
            //cierras el archivo,el inputS y el FileW
            fw.close();
            archivoDestino.close();
            is.close();
            //abres el archivo temporal
            Desktop.getDesktop().open(temp);
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null,"error al abrir el rchivo");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public void splines(int n1) {
        boolean mensaje = false;
        try {
            int puntos = n1;
            String puntosSr[] = new String[puntos];
            String punto;
            double x[] = componenteX;// arreglo que almacena las componentes x de los puntos ingresados
            double y[] = componenteY;// arreglo que almacena las componentes Y de los puntos ingresados

            // AC=b
            double h[] = new double[puntos];




            for (int i = 0; i < puntos - 1; i++) {
                h[i] = x[i + 1] - x[i];
            }



            double b[] = new double[puntos];



            /**
             * paso a cargar la matriz b 
             * |-                                           -|
             * |         0                                   |
             * | 3(x2-x1)/h1 - 3(x1-x0)/h0                   |
             * |       .                                     | 
             * |       .                                     |
             * |       .                                     | =b, con i=0,...,n-1 | . |
             * | 3(Xn - Xn-1)/(hn-1) - 3(Xn-1 - Xn-2)/(hn-2) |
             * |          0                                  |
             * |-                                           -|(n+1)x1
             */
            b[0] = 0;
            b[puntos - 1] = 0;
            for (int i = 1; i < puntos - 1; i++) {
                b[i] = ((3 / h[i]) * (y[i + 1] - y[i])) - ((3 / h[i - 1]) * (y[i] - y[i - 1]));

            }// fin cargar matriz b







            // 
            double matrizA[][] = new double[puntos][puntos];// de orden nxn, con i=0,...,n-1
            /**
             * |-                                                  -|
             * | 1            0 ................................. 0 | 
             * | h0      2(h0+h1)    h1 ................          0 | 
             * | 0          h1   2(h1+h2)     h2 ................ 0 |
             * | 0           0  .....................  .  0       1 |
             * | 0           0             hn-2  2(hn-2 +hn-1) hn-1 |
             * |-                                                  -| (n+1)x(n+1)
                 
                 * A=matrizA, con i=0,...,n-1  
             
             */
            matrizA[0][0] = 1;
            matrizA[puntos - 1][puntos - 1] = 1;

            for (int i = 1; i < puntos; i++) {
                matrizA[0][i] = 0;
            }
            for (int i = 0; i < puntos - 1; i++) {
                matrizA[puntos - 1][i] = 0;
            }



            // paso a cargar la matrizA  desde la fila i asta la fila n,  con  i=1,...n


            for (int i = 1; i < puntos; i++) {
                for (int j = 1; j < puntos - 1; j++) {

                    if (i == j) {
                        matrizA[i][j - 1] = h[j - 1];
                        matrizA[i][j] = 2 * (h[j - 1] + h[j]);
                        matrizA[i][j + 1] = h[j];
                    }

                }// fin buqle j

            }// fin bucle i
            // fin cargar la matirzA 




            /**
             * la matrizA1 es de dimension (puntos-2)x(puntos-2), usada para
             * resolver el sistema de e uaciones para en contrar las incognitas
             * cj de la matriz C Note que por las condiciones de frotera las
             * componentes Cjo=0 y Cjn=0
             */
            double matrizA1[][] = new double[puntos - 2][puntos - 2];
            for (int i = 0; i < puntos - 2; i++) {
                for (int j = 0; j < puntos - 2; j++) {
                    matrizA1[i][j] = matrizA[i + 1][j + 1];
                }// fin buqle j
            }// bucle i







            int n = puntos - 2;
            double r[] = new double[n];// carreglo que almacenara los valores de Cji  desde i=1,...,n-2
            for (int l = 0; l < n; l++) {
                r[l] = b[l + 1];

            }




            /**
             * acontinuacion usamos el metodo de caus jordan para encontar los
             * valores de Cji desde i=1,...,n-2
             */
            double d, c1;
            for (int i = 0; i <= n - 1; i++) {
                d = matrizA1[i][i];
                for (int s = 0; s <= n - 1; s++) {
                    matrizA1[i][s] = ((matrizA1[i][s]) / d);
                }
                r[i] = ((r[i]) / d);
                for (int x1 = 0; x1 <= n - 1; x1++) {
                    if (i != x1) {
                        c1 = matrizA1[x1][i];
                        for (int y1 = 0; y1 <= n - 1; y1++) {
                            matrizA1[x1][y1] = matrizA1[x1][y1] - c1 * matrizA1[i][y1];
                        }
                        r[x1] = r[x1] - c1 * r[i];
                    }// fin if
                }/// buble x1
            }// fin bucle i





            /**
             * nesitamos que la matriz C sea de la forma
             *
             * |- -| 
             * | 0 |
             * | 1 |
             * | 1 |
             * | . |
             * | . | =C
             * | . |
             * | . |
             * | 1 |
             * | 0 |
             * |- -|(n+1)x1 Note que por las condiciones de frotera las componentes
             * Cjo=0 y Cjn=0
             */
            double cj[] = new double[puntos];
            cj[0] = 0;
            cj[puntos - 1] = 0;
            for (int i = 1; i < puntos - 1; i++) {
                cj[i] = r[i - 1];
            }



            /**
             * los polinomios de Splin cubicos esta dadas por la siguiente
             * expresion Sj(X)=aj+bj(x-xj)+cj(x-xj)^2 +dj(x-xj)^3, donde las
             * aj=y[j]
             */
            double bj[] = new double[puntos - 1];
            double dj[] = new double[puntos - 1];
            for (int i = 0; i < puntos - 1; i++) {
                bj[i] = ((y[i + 1] - y[i]) / h[i]) - ((h[i] * (2 * cj[i] + cj[i + 1])) / 3);
                dj[i] = (cj[i + 1] - cj[i]) / (3 * h[i]);
            }



            for (int j = 0; j < puntos - 1; j++) {
                String signo = "-";
                if (x[j] < 0) {
                    signo = "";

                }
                jTextArea.append("S" + j + "(x)= " + y[j] + " + (" + bj[j] + ")(x" + j + signo + x[j] + ")  +  (" + cj[j] + ")(x" + j + signo + x[j] + ")^2 + ( " + dj[j] + ")(x" + j + signo + x[j] + ")^3\n");
            }




            InterpolacionPorSplinesCubicos.cj = cj;
            InterpolacionPorSplinesCubicos.bj = bj;
            InterpolacionPorSplinesCubicos.dj = dj;

            puntoEvaluar.setEnabled(true);
            puntoEvaluar.setEditable(true);
            jButtonEvaluarPunto.setEnabled(true);

        } // try
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error lectura de datos");
        }


    }// fin del metodo splines

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
            java.util.logging.Logger.getLogger(InterpolacionPorSplinesCubicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterpolacionPorSplinesCubicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterpolacionPorSplinesCubicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterpolacionPorSplinesCubicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterpolacionPorSplinesCubicos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagenDeFONDO;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonEvaluarPunto;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonregistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelMuestraGrafica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jTextField_S_X;
    private javax.swing.JTextField jX;
    private javax.swing.JTextField jY;
    private javax.swing.JTextField numeroPuntos;
    private javax.swing.JTextField puntoEvaluar;
    private javax.swing.JTextField puntosIngresados;
    private javax.swing.JButton visualizar_grafica;
    // End of variables declaration//GEN-END:variables
}
