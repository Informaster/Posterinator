/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posterinator;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

/**
 *
 * @author Arthur
 */
public class window extends javax.swing.JFrame {
    BufferedImage bi=null;
    BufferedImage biB=null;
    /**
     * Creates new form window
     */
    public window() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton2 = new javax.swing.JToggleButton();
        jTextField2 = new javax.swing.JTextField();
        jToggleButton3 = new javax.swing.JToggleButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jToggleButton1.setText("Bild wählen");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("H:\\Informatik\\Arthür\\Tom.jpg");
        jTextField1.setToolTipText("");

        jToggleButton2.setText("Bildbibliothek wählen");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jTextField2.setText("H:\\Informatik\\Arthür");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jToggleButton3.setText("Poster erstellen");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jTextField3.setText("10");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setText("10");

        jLabel1.setText("Raster wählen:");

        jLabel2.setText("X");

        jLabel3.setText("Y");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        final JFileChooser fc = new JFileChooser();//In response to a button click:        
        fc.setCurrentDirectory(new File("/"));
        int zahl = fc.showOpenDialog(this);
        File p=fc.getSelectedFile();     //p=poster
        jTextField1.setText(p.getAbsolutePath());
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        final JFileChooser fc = new JFileChooser();//In response to a button click:        
        fc.setCurrentDirectory(new File("/"));
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int zahl = fc.showOpenDialog(this);
        File b=fc.getSelectedFile();       // b=bilder        
        jTextField2.setText(b.getAbsolutePath());
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        Render();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void Render(){ 
        String pfadB=jTextField2.getText();
        String pfadP=jTextField1.getText();
        
       
            System.out.println("Bilder werden geladen...");
        Color[] durchschnittsfarbeP=new Color[1000];
        Color[] durchschnittsfarbeB=new Color[1000]; 
        int rasterX=1;
        int rasterY=1;
          
            System.out.println("1");
         String X=jTextField3.getText();
         try{
            rasterX=Integer.parseInt(X);
            System.out.println("Erfolgreich Textfeld 3 ausgelesen! rasterX="+rasterX);
         }catch(NumberFormatException e){
            System.out.println("Fehler in Textfeld 3");
         }
        
           
            
         String Y=jTextField4.getText();  
         try{
             rasterY=Integer.parseInt(Y);
             System.out.println("Erfolgreich Textfeld 4 ausgelesen! rasterY="+rasterY);
         }catch(NumberFormatException e){
             System.out.println("Fehler in Textfeld 4");
         }
        
        
            System.out.println("Deklarierung");
        
        if (pfadP!=null){
            try {
                bi=ImageIO.read(new File(pfadP));      
                System.out.println("Poster gelesen");
            } catch (IOException ex) {
                System.out.println("Fehler aufgetreten beim Lesen der Datei");
            }
        }
             System.out.println("berechne Durchschnittsfarbe...");
                     
        
        
        for(int x=0;x<rasterX;x++){                   //geht jedes kästchen des raster durch
            for(int y=0;y<rasterY;y++){
                System.out.println("  test0:   "+x+";"+y+";"+(x*rasterY+y));               
                durchschnittsfarbeP[x*rasterY+y]=AverageColor(bi,x*(bi.getWidth()/rasterX),y*(bi.getHeight()/rasterY),bi.getWidth()/rasterX,bi.getHeight()/rasterY); //durchschnittsfarbe posterraster
                System.out.println("  test1:   "+durchschnittsfarbeP[x*rasterY+y]);
            }
             System.out.println("test2");
        }
        
           
            System.out.println("Durchschnittsfarbe der Rasterkästchen berechnen");
        
        File bilder=new File(pfadB);
        File[] Bild=bilder.listFiles();
        if(bilder!=null){
            Bild=bilder.listFiles();  
        }else{
            System.out.println("                    FEHLER !!!");;
        }
            System.out.println("Bildordner gelesen");
            System.out.println("Dateien: "+Bild[0]+" ; "+Bild[1]);
        //File[] bilder=(new File(pfadB)).listFiles().getAbsolutePath();
        
        int anzahlbilder=0;
        
        for(anzahlbilder=0; anzahlbilder<Bild.length;anzahlbilder++){
            if (Bild[anzahlbilder]!=null){
                try {
                    biB=ImageIO.read(Bild[anzahlbilder]);   
                    System.out.println("Bild gelesen : "+(anzahlbilder+1)+" von "+Bild.length);
                } catch (IOException ex) {
                    System.out.println("Fehler aufgetreten beim Lesen der Datei: "+(anzahlbilder+1));
                }
            }                     
            durchschnittsfarbeB[anzahlbilder]=AverageColor(biB,0,0,biB.getWidth(),biB.getHeight());  //durchschnittsfarbe poster         
                
        }
        Color[] dP=new Color[rasterX*rasterY];
        for(int aP=0;aP<dP.length;aP++){
            dP[aP]=durchschnittsfarbeP[aP];
        }
        Color[] dB=new Color[anzahlbilder];
        for(int aB=0;aB<anzahlbilder;aB++){
            dB[aB]=durchschnittsfarbeB[aB];
        }
        System.out.println("Durchschnittsfarbe der Bilder berechnen");
        
        System.out.println("Farbe Posterraster");
        for(int a=0;a<dP.length;a++){
           System.out.println(a+" : "+dP[a]);
        }
        System.out.println("Farbe Bilder       ");
        for(int b=0;b<dB.length;b++){
           System.out.println(b+" : "+dB[b]);
        }
        String[] Bildabfolge=new String[dP.length];
        Bildabfolge=Regression(dP,dB);
        Color[] Bildfarben=new Color[Bildabfolge.length];
        int[] Bildnummern=new int[Bildabfolge.length];
        for(int i=0;i<Bildabfolge.length;i++){
            String[] a=Bildabfolge[i].split(":");    //a[0] gibt den linken Teil des Array (Farbwerte) und  a[1] den rechten Teil (BildNr) an
            String[] b=a[0].split(","); //b teilt den Farbstring in die 3 Komponenten auf.
            Bildfarben[i]=new Color(Integer.parseInt(b[0]),Integer.parseInt(b[1]),Integer.parseInt(b[2]));
            Bildnummern[i]=Integer.parseInt(a[1]);
        }
        
        
        System.out.println("Bildabfolgenfarbe");
        for(int i=0;i<Bildabfolge.length;i++){
            System.out.println( (i+1)+" : Farbe:"+Bildfarben[i]+"  von Bild mit Nr "+(Bildnummern[i]+1));
        }
        
        //Ab hier wird gezeichnet
        
        BufferedImage[] biRaster=new BufferedImage[Bildabfolge.length];
        Graphics2D[] g_biRaster=new Graphics2D[Bildabfolge.length];
        for(int i=0;i<Bildabfolge.length;i++){
            biRaster[i]=new BufferedImage(bi.getWidth()/rasterX,bi.getHeight()/rasterY,BufferedImage.TYPE_INT_ARGB);        
            g_biRaster[i]=biRaster[i].createGraphics();
        }
        System.out.println("Erfolgreich!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11");
        
    }
    
    private Color AverageColor(BufferedImage bi,int X,int Y,int breite, int hoehe){   
        int r=0,g=0,b=0,pixelanzahl=0;     
        System.out.println("    Deklarierung");
        System.out.println("    Berechne...");
            for(pixelanzahl=0;pixelanzahl<Math.sqrt(breite*hoehe);pixelanzahl++){
                int co=bi.getRGB((int)((Math.random()*breite+X)),(int)((Math.random()*hoehe+Y)));
                Color c=new Color(co);
                r+=c.getRed();
                g+=c.getGreen();
                b+=c.getBlue();         
            }
       
        r/=pixelanzahl;
        g/=pixelanzahl;
        b/=pixelanzahl;
        Color C=new Color(r,g,b);  
        
        System.out.println("    Erfolgreich! Farbe: "+C);
        return C;       
    }
    
    private String[] Regression(Color[] P, Color[] B){                                   //Finde zu jedem Rasterkästchen des Poster das passendste Bild
        
        int[][] poster=new int[P.length][3];
        int[][] bilder=new int[B.length][3]; 
        int[] bildNr=new int[P.length];
        String[] bild=new String[bilder.length];
        
        for(int i=0;i<P.length;i++){
            poster[i][0]=P[i].getRed();
            poster[i][1]=P[i].getGreen();
            poster[i][2]=P[i].getBlue();            
        }
        for(int i=0;i<B.length;i++){
            bilder[i][0]=B[i].getRed();
            bilder[i][1]=B[i].getGreen();
            bilder[i][2]=B[i].getBlue();            
        }
        
        int[][] Xbilder=new int[P.length][3];
        for(int j=0;j<P.length;j++){          
            bildNr[j]=kleinsterAbstand(poster[j],bilder);
        }
        for(int j=0;j<B.length;j++){            
            Xbilder[j]=bilder[bildNr[j]];
            bilder[bildNr[j]]=null;
            bild[j]=Xbilder[j][0]+","+Xbilder[j][1]+","+Xbilder[j][2]+":"+bildNr[j];
            System.out.println("    BildNr: "+(bildNr[j]+1)+" von "+bilder.length);
        }
      //  int sad=2;
        return bild;
    }
    
    
    private int kleinsterAbstand(int[]a, int[][]b){
        
        int nr=0;
        for(int i=0;i<b.length-1;i++){
            if(Abstand(a,b[i+1])<Abstand(a,b[i])){
                nr=i+1;
            }
        }
        return nr;
        
    }
    
    /**
     * Abstand der Farbvektoren wird berechnet
     * a entspricht der Durchschnittsfarbe eines Rasterkästchens des Posters
     * b entspricht allen Durchschnittsfarben der Bilder aus der Bildbibliothek
    */
    private double Abstand(int[] a, int[] b){        
        return (a[0]-b[0])*(a[0]-b[0])+(a[1]-b[1])*(a[1]-b[1])+(a[2]-b[2])*(a[2]-b[2]);     
    }
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new window().setVisible(true);
            }
        });
    }

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables
}
