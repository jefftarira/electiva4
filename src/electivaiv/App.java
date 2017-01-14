/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electivaiv;

import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class App extends javax.swing.JFrame implements SerialPortEventListener {

  private String puerto = "COM4";
  SerialPort serialPort;
  private BufferedReader input;
  private OutputStream output;
  private static final int TIME_OUT = 2000;
  private static final int DATA_RATE = 9600;

  public App() {
    initComponents();
    btStop.setEnabled(false);
    btMin.setEnabled(false);
    btMax.setEnabled(false);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    btIniciar = new javax.swing.JButton();
    btMax = new javax.swing.JButton();
    btMin = new javax.swing.JButton();
    btStop = new javax.swing.JButton();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    lbMensaje = new javax.swing.JTextArea();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    enLedAmarillo = new javax.swing.JButton();
    apLedAmarillo = new javax.swing.JButton();
    jLabel7 = new javax.swing.JLabel();
    enLedVerde = new javax.swing.JButton();
    apLedVerde = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    btIniciar.setText("Iniciar");
    btIniciar.setToolTipText("");
    btIniciar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btIniciarActionPerformed(evt);
      }
    });

    btMax.setText("Velocidad maxima");
    btMax.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btMaxActionPerformed(evt);
      }
    });

    btMin.setText("Velocidad minima");
    btMin.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btMinActionPerformed(evt);
      }
    });

    btStop.setText("Detener");
    btStop.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btStopActionPerformed(evt);
      }
    });

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    jLabel1.setText("Electiva IV");

    jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel2.setText("Control de velocidad de un motor con arduino");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1)
          .addComponent(jLabel2))
        .addContainerGap(185, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    lbMensaje.setColumns(20);
    lbMensaje.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    lbMensaje.setLineWrap(true);
    lbMensaje.setRows(5);
    jScrollPane1.setViewportView(lbMensaje);

    jLabel3.setText("Mensajes");

    jLabel4.setText("Opciones del arduino");

    jLabel5.setText("Opciones del Motor");

    jLabel6.setText("Led Amarillo");

    enLedAmarillo.setText("Encender");
    enLedAmarillo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        enLedAmarilloActionPerformed(evt);
      }
    });

    apLedAmarillo.setText("Apagar");
    apLedAmarillo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        apLedAmarilloActionPerformed(evt);
      }
    });

    jLabel7.setText("Led Verde");

    enLedVerde.setText("Encender");
    enLedVerde.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        enLedVerdeActionPerformed(evt);
      }
    });

    apLedVerde.setText("Apagar");
    apLedVerde.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        apLedVerdeActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel3)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel5)
              .addComponent(btMin, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(btMax, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(45, 45, 45)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel6)
              .addComponent(enLedAmarillo, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
              .addComponent(apLedAmarillo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(43, 43, 43)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel7)
              .addComponent(enLedVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(apLedVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addComponent(btIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btStop, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jLabel4))
        .addGap(0, 20, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(29, 29, 29)
        .addComponent(jLabel4)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btStop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(44, 44, 44)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel5)
              .addComponent(jLabel6))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(btMin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btMax, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(enLedAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(apLedAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(enLedVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(apLedVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(26, 26, 26)
        .addComponent(jLabel3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarActionPerformed
    initialize();
  }//GEN-LAST:event_btIniciarActionPerformed

  private void btMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMaxActionPerformed
    String b = "9";
    try {
      output.write(b.getBytes());
    } catch (IOException ex) {
      Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_btMaxActionPerformed

  private void btStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btStopActionPerformed
    String b = "0";
    try {
      
      output.write(b.getBytes());
      input.close();
      output.close();
      serialPort.removeEventListener();
      serialPort.close();
      
      btStop.setEnabled(false);
      btMin.setEnabled(false);
      btMax.setEnabled(false);
      btIniciar.setEnabled(true);
      
    } catch (IOException ex) {
      Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_btStopActionPerformed

  private void btMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMinActionPerformed
    String b = "4";
    try {
      output.write(b.getBytes());
    } catch (IOException ex) {
      Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_btMinActionPerformed

  private void enLedAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enLedAmarilloActionPerformed
    String b = "a";
    try {
      output.write(b.getBytes());
    } catch (IOException ex) {
      Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_enLedAmarilloActionPerformed

  private void apLedAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apLedAmarilloActionPerformed
    String b = "z";
    try {
      output.write(b.getBytes());
    } catch (IOException ex) {
      Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_apLedAmarilloActionPerformed

  private void enLedVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enLedVerdeActionPerformed
    String b = "v";
    try {
      output.write(b.getBytes());
    } catch (IOException ex) {
      Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_enLedVerdeActionPerformed

  private void apLedVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apLedVerdeActionPerformed
    String b = "b";
    try {
      output.write(b.getBytes());
    } catch (IOException ex) {
      Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_apLedVerdeActionPerformed

  public static void main(String args[]){
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Windows".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new App().setVisible(true);
      }
    });
  }

  public void initialize() {
    CommPortIdentifier portId = null;
    Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();

    while (portEnum.hasMoreElements()) {
      CommPortIdentifier currPortId = (CommPortIdentifier) portEnum.nextElement();

      if (currPortId.getName().equals("COM4")) {
        portId = currPortId;
        break;
      }
    }

    if (portId == null) {
      System.out.println("No se encontro Arduino en el puerto " + puerto);
      return;
    }

    try {
      serialPort = (SerialPort) portId.open(this.getClass().getName(),
              TIME_OUT);

      serialPort.setSerialPortParams(DATA_RATE,
              SerialPort.DATABITS_8,
              SerialPort.STOPBITS_1,
              SerialPort.PARITY_NONE);

      // open the streams
      input = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
      output = serialPort.getOutputStream();

      // add event listeners
      serialPort.addEventListener(this);
      serialPort.notifyOnDataAvailable(true);
      serialPort.notifyOnBreakInterrupt(true);
//      System.out.println("Se inicio el Arduino " + puerto);
      btStop.setEnabled(true);
      btMin.setEnabled(true);
      btMax.setEnabled(true);
      btIniciar.setEnabled(false);
    } catch (Exception e) {
      System.err.println(e.toString());
    }
  }

  public synchronized void close() throws IOException {
    if (serialPort != null) {
      input.close();
      output.close();
      serialPort.removeEventListener();
      serialPort.close();
    }
  }

  @Override
  public synchronized void serialEvent(SerialPortEvent oEvent) {

    if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
      try {
        String inputLine = input.readLine();
//        System.out.println(inputLine);
        lbMensaje.append(inputLine+"\n");

      } catch (Exception e) {
        System.err.println(e.toString());
      }
    }
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton apLedAmarillo;
  private javax.swing.JButton apLedVerde;
  private javax.swing.JButton btIniciar;
  private javax.swing.JButton btMax;
  private javax.swing.JButton btMin;
  private javax.swing.JButton btStop;
  private javax.swing.JButton enLedAmarillo;
  private javax.swing.JButton enLedVerde;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea lbMensaje;
  // End of variables declaration//GEN-END:variables

}
