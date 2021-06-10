
package calculadora;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Calculadora extends javax.swing.JFrame {
    
    ScriptEngineManager SEM = new ScriptEngineManager();
    ScriptEngine SE = SEM.getEngineByName("JavaScript");
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_resultado = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        btn_por = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_producto = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_c2 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        txtOperacion.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtResultado.setFont(new java.awt.Font("MS PGothic", 1, 36)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, -1));

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_resultado.setBackground(new java.awt.Color(153, 51, 255));
        btn_resultado.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        btn_resultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 4.jpg"))); // NOI18N
        btn_resultado.setText("=");
        btn_resultado.setFocusPainted(false);
        btn_resultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_resultado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 3.jpg"))); // NOI18N
        btn_resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resultadoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 50, 50));

        btn_del.setBackground(new java.awt.Color(153, 51, 255));
        btn_del.setFont(new java.awt.Font("MS UI Gothic", 1, 8)); // NOI18N
        btn_del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color.jpg"))); // NOI18N
        btn_del.setText("DEL");
        btn_del.setFocusPainted(false);
        btn_del.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_del.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 3.jpg"))); // NOI18N
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });
        jPanel2.add(btn_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 50, 50));

        btn_por.setBackground(new java.awt.Color(153, 51, 255));
        btn_por.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        btn_por.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color.jpg"))); // NOI18N
        btn_por.setText("%");
        btn_por.setFocusPainted(false);
        btn_por.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_por.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 3.jpg"))); // NOI18N
        btn_por.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porActionPerformed(evt);
            }
        });
        jPanel2.add(btn_por, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 50, 50));

        btn_div.setBackground(new java.awt.Color(153, 51, 255));
        btn_div.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        btn_div.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color.jpg"))); // NOI18N
        btn_div.setText("/");
        btn_div.setFocusPainted(false);
        btn_div.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_div.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 3.jpg"))); // NOI18N
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divActionPerformed(evt);
            }
        });
        jPanel2.add(btn_div, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 50, 50));

        btn_producto.setBackground(new java.awt.Color(153, 51, 255));
        btn_producto.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        btn_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color.jpg"))); // NOI18N
        btn_producto.setText("X");
        btn_producto.setFocusPainted(false);
        btn_producto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_producto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 3.jpg"))); // NOI18N
        btn_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 50, 50));

        btn_resta.setBackground(new java.awt.Color(153, 51, 255));
        btn_resta.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        btn_resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color.jpg"))); // NOI18N
        btn_resta.setText("-");
        btn_resta.setFocusPainted(false);
        btn_resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 3.jpg"))); // NOI18N
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 50, 50));

        btn_suma.setBackground(new java.awt.Color(153, 51, 255));
        btn_suma.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        btn_suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color.jpg"))); // NOI18N
        btn_suma.setText("+");
        btn_suma.setFocusPainted(false);
        btn_suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 3.jpg"))); // NOI18N
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 50, 50));

        btn_9.setBackground(new java.awt.Color(153, 51, 255));
        btn_9.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 2.jpg"))); // NOI18N
        btn_9.setText("9");
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 3.jpg"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 50, 50));

        btn_c.setBackground(new java.awt.Color(153, 51, 255));
        btn_c.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color.jpg"))); // NOI18N
        btn_c.setText("C");
        btn_c.setFocusPainted(false);
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 3.jpg"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        btn_c2.setBackground(new java.awt.Color(153, 51, 255));
        btn_c2.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        btn_c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 2.jpg"))); // NOI18N
        btn_c2.setText("C");
        btn_c2.setFocusPainted(false);
        btn_c2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 3.jpg"))); // NOI18N
        btn_c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_c2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 50, 50));

        btn_8.setBackground(new java.awt.Color(153, 51, 255));
        btn_8.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 2.jpg"))); // NOI18N
        btn_8.setText("8");
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 3.jpg"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 50, 50));

        btn_7.setBackground(new java.awt.Color(153, 51, 255));
        btn_7.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 2.jpg"))); // NOI18N
        btn_7.setText("7");
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 3.jpg"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, 50));

        btn_4.setBackground(new java.awt.Color(153, 51, 255));
        btn_4.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 2.jpg"))); // NOI18N
        btn_4.setText("4");
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 3.jpg"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 50));

        btn_5.setBackground(new java.awt.Color(153, 51, 255));
        btn_5.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 2.jpg"))); // NOI18N
        btn_5.setText("5");
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 3.jpg"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 50, 50));

        btn_6.setBackground(new java.awt.Color(153, 51, 255));
        btn_6.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 2.jpg"))); // NOI18N
        btn_6.setText("6");
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 3.jpg"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 50, 50));

        btn_1.setBackground(new java.awt.Color(153, 51, 255));
        btn_1.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 2.jpg"))); // NOI18N
        btn_1.setText("1");
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 3.jpg"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 50));

        btn_2.setBackground(new java.awt.Color(153, 51, 255));
        btn_2.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 2.jpg"))); // NOI18N
        btn_2.setText("2");
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 3.jpg"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 50, 50));

        btn_3.setBackground(new java.awt.Color(153, 51, 255));
        btn_3.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 2.jpg"))); // NOI18N
        btn_3.setText("3");
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 3.jpg"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 50, 50));

        btn_0.setBackground(new java.awt.Color(153, 51, 255));
        btn_0.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 2.jpg"))); // NOI18N
        btn_0.setText("0");
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 3.jpg"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 50, 50));

        btn_punto.setBackground(new java.awt.Color(153, 51, 255));
        btn_punto.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        btn_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 2.jpg"))); // NOI18N
        btn_punto.setText(".");
        btn_punto.setFocusPainted(false);
        btn_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/color 3.jpg"))); // NOI18N
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 310, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumber("7");       
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
    txtOperacion.setText("");
    txtResultado.setText("");
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        addNumber("4");       
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        addNumber("1");        
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addNumber("0");       
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        String texto = txtOperacion.getText().substring(0,txtOperacion.getText().length()-1);
        txtOperacion.setText(texto);       
    }//GEN-LAST:event_btn_delActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addNumber("8");       
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumber("5");       
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addNumber("2");        
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_porActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porActionPerformed
        addNumber("%");
    }//GEN-LAST:event_btn_porActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addNumber("9");        
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addNumber("6");       
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        addNumber("3");       
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed
        addNumber("/");
    }//GEN-LAST:event_btn_divActionPerformed

    private void btn_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productoActionPerformed
        addNumber("*");
    }//GEN-LAST:event_btn_productoActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        addNumber("-");
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        addNumber("+");
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_c2ActionPerformed
    txtOperacion.setText("");
    txtResultado.setText("");   
    }//GEN-LAST:event_btn_c2ActionPerformed

    private void btn_resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resultadoActionPerformed
        try {
           String resultado = SE.eval(txtOperacion.getText()).toString();
           txtResultado.setText(resultado);
        } catch (Exception e){
        }
    }//GEN-LAST:event_btn_resultadoActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        addNumber(".");       
    }//GEN-LAST:event_btn_puntoActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    
    public void addNumber(String digito){
        txtOperacion.setText(txtOperacion.getText()+digito);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_c2;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_por;
    private javax.swing.JButton btn_producto;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_resultado;
    private javax.swing.JButton btn_suma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
