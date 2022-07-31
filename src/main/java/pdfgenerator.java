
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mcahi
 */
public class pdfgenerator extends javax.swing.JFrame {

    /**
     * Creates new form pdfgenerator
     */
    public pdfgenerator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        isima = new javax.swing.JLabel();
        tariha = new javax.swing.JLabel();
        isim = new javax.swing.JTextField();
        tarih = new javax.swing.JTextField();
        num = new javax.swing.JLabel();
        numara = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sınav = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        adres = new javax.swing.JTextField();
        telefon = new javax.swing.JTextField();
        kimlik = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        generate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        generate.setText("Olustur");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel1.setText("Dilekçe Olusturucu");

        isima.setText("İsim Soyisim:");

        tariha.setText("Tarih:");

        isim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isimActionPerformed(evt);
            }
        });

        tarih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarihActionPerformed(evt);
            }
        });

        num.setText("Numara:");

        numara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numaraActionPerformed(evt);
            }
        });

        jLabel2.setText("Sınav Tarihi:");

        jLabel3.setText("Adres:");

        jLabel4.setText("Telefon:");

        jLabel5.setText("Kimlik Numarası:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addGap(45, 45, 45)
                        .addComponent(sınav, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(isima)
                        .addGap(45, 45, 45)
                        .addComponent(isim, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(num)
                        .addGap(45, 45, 45)
                        .addComponent(numara, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(tariha)
                        .addGap(45, 45, 45)
                        .addComponent(tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel3)
                        .addGap(45, 45, 45)
                        .addComponent(adres, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4)
                        .addGap(45, 45, 45)
                        .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5)
                        .addGap(45, 45, 45)
                        .addComponent(kimlik, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(generate)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(109, 109, 109))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(isima))
                    .addComponent(isim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(num))
                    .addComponent(numara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(tariha))
                    .addComponent(tarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(sınav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(adres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(kimlik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(generate)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
    
        try{
          Document document = new Document();
            PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("Dilekce.pdf"));
            document.open();
            document.add(new Paragraph("                                                                                                           "+tarih.getText()+""));
            document.add(new Paragraph("                                                         Düzce Üniversitesi"));
            document.add(new Paragraph("                                    Elektrik-Elektronik Mühendisligi Bölüm Baskanligina;"));
            document.add(new Paragraph("   Okulunuzun Elektrik Elektronik Mühendisligi Bölümü "+numara.getText()+" no'lu ogrencisiyim. "));
            document.add(new Paragraph(""+sınav.getText()+" tarihli EEM101 Elektrik Elektronik Mühendisligine Giris dersi Vize Sinavina hasta "+" oldugum icin giremedim."));
            document.add(new Paragraph("\n\n"));
            document.add(new Paragraph(" Saglik raporum ekte sunulmustur. Mazeret sinavina girebilmem konusunda gereginin yapilmasini saygilarimla arz ederim."));
            document.add(new Paragraph("\n      Adres:"+adres.getText()+""));
            document.add(new Paragraph("      Telefon:"+telefon.getText()+""));
            document.add(new Paragraph("      Tc :"+kimlik.getText()+""));
            document.add(new Paragraph("                                                                                                             Ad-Soyad:"+isim.getText()+""));
            document.add(new Paragraph("                                                                                                                Imza:"));
            document.add(new Paragraph("\n\n\n\n    Ek;"));
            Image image = Image.getInstance("https://yt3.ggpht.com/ytc/AKedOLTjaz6FRdwA8gTingD5srx6cS0IGUPX0lPcn0UGaQ=s900-c-k-c0x00ffffff-no-rj");
            image.setAbsolutePosition(530,780);
            image.scaleAbsolute(50,50);
            //Image imagetwo=Image.getInstance("https://cdn-icons-png.flaticon.com/512/226/226777.png");
           // imagetwo.setAbsolutePosition(1,800);
           // imagetwo.scaleAbsoluteHeight(30);
           // imagetwo.scaleAbsoluteWidth(30);
            Image imagethree=Image.getInstance("https://slideplayer.biz.tr/slide/8837518/26/images/87/%C4%B0stirahat+Raporu+%28Tek+hekim+raporu%29.jpg");
            imagethree.scaleAbsolute(500,300);
            document.add(image);
           // document.add(imagetwo);
            document.add(imagethree);
            document.close();
            pdfWriter.close();
        File dilekce = new File("C:\\Users\\mcahi\\OneDrive\\Masaüstü\\workspace\\Dilekcepdf\\Dilekce.pdf");
        if(dilekce.exists()){
            if(Desktop.isDesktopSupported()){
                Desktop.getDesktop().open(dilekce);
            }else{
                JOptionPane.showMessageDialog(this,"Not Supported");
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Dosya bulunamadı");
        }
    }catch(Exception ex){
        ex.printStackTrace();
    }      
      
    }//GEN-LAST:event_generateActionPerformed

    private void isimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isimActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_isimActionPerformed

    private void tarihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tarihActionPerformed

    private void numaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numaraActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_numaraActionPerformed

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
            java.util.logging.Logger.getLogger(pdfgenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pdfgenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pdfgenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pdfgenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pdfgenerator().setVisible(true);
            }
        });
    }       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adres;
    private javax.swing.JButton generate;
    private javax.swing.JTextField isim;
    private javax.swing.JLabel isima;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField kimlik;
    private javax.swing.JLabel num;
    private javax.swing.JTextField numara;
    private javax.swing.JTextField sınav;
    private javax.swing.JTextField tarih;
    private javax.swing.JLabel tariha;
    private javax.swing.JTextField telefon;
    // End of variables declaration//GEN-END:variables

    private String getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
