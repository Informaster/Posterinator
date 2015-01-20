/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posterinator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

/**
 *
 * @author Arthur
 */
public class window extends javax.swing.JFrame {
    BufferedImage bi=new BufferedImage(10,10,BufferedImage.TYPE_INT_RGB);
    BufferedImage biOriginal=null;
    String library="";  
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

        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                zeichnen(g);
            }

        };
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 858, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        jTextField1.setText(" ");
        jTextField1.setToolTipText("");

        jTextField2.setText(" ");
        jTextField2.setToolTipText("");

        jTextField3.setText("10");

        jTextField4.setText("10");

        jLabel1.setText("Raster wählen:");

        jLabel2.setText("X");

        jLabel3.setText("Y");

        jLabel4.setText("jLabel4");

        jButton2.setText("Bild wählen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Bildbibliothek wählen");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Bild speichern unter...");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Poster erstellen");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Bildbibliothek speichern");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setText("Bildbibliothek lesen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton7.setText("Bildbibliothek laden");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton7)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(jButton1)
                    .addComponent(jButton7))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        //"Bild wählen"
        //Öffnet ein Fenster zum Wählen des Bildes, was als Poster dargestellt werden soll
        final JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File("/"));
        int zahl = fc.showOpenDialog(this);
        File f=fc.getSelectedFile();        
        jTextField1.setText(f.getAbsolutePath());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        //"Bildbibliothek wählen"
        //Öffnet ein Fenster zum Wählen eines Ordners mit Bildern
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY );
        fc.setCurrentDirectory(new File("/"));
        int zahl = fc.showOpenDialog(this);        
        File f=fc.getSelectedFile();        
        jTextField2.setText(f.getAbsolutePath());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        //"Poster erstellen" 
        Render(); //erstellt das Poster
        jPanel1.repaint(); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        //"Bild speichern"
        //Das erstellte Poster wird gespeichert
        final JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File("/"));
        int zahl = fc.showOpenDialog(this);  
        File f=fc.getSelectedFile();
        System.out.println("Speichern als "+f.getAbsolutePath());
        try {
            ImageIO.write(biOriginal, "jpg", f);
        } catch (IOException ex) {
            System.out.println("Problem beim Speichern aufgetreten!");
        }
        jLabel4.setText("Erfolgreich als "+f.getAbsolutePath()+" gespeichert!");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        //"Bildbibliothek speichern"
        //Der String "library" der beim Lesen der Bildbibliothek erstellt wird, wird als txt-Datei gespeichert
        final JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File("/"));
        int zahl = fc.showOpenDialog(this);   
        File f=fc.getSelectedFile();    
            
        try{         
            PrintWriter pWriter=new PrintWriter(new BufferedWriter(new FileWriter(f.getAbsolutePath()+".txt"))); 
            pWriter.println(library);            //Die gesamte Datei besteht aus (oft sehr langen) einer Zeile
            if (pWriter != null){ 
                pWriter.flush(); 
                pWriter.close(); 
            }
        } catch (IOException e) {
            System.out.println("Problem beim Speichern aufgetreten!");            
        } 
           
         
        System.out.println("Bildbibliothek gespeichert als "+f.getAbsolutePath());
           
        jLabel4.setText("Erfolgreich gespeichert!");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //"Bildbibliothek laden"
        //Jedes Bild der Bildbibliothek wird geladen, seine Durchschnittsfarbe wird berechnet
        //Diese Daten werden in "library" gespeichert
        String pfadB=jTextField2.getText();  
        File bilder=new File(pfadB);   // Lesen der Bildbibiliothek      
        File[] Bild=bilder.listFiles();
        if(bilder!=null){
            Bild=bilder.listFiles();  
        }else{
            System.out.println("                    FEHLER !!!");;
        }
            System.out.println("Bildordner gelesen");
            System.out.println("Dateien: "+Bild);        
        
        int anzahlbilder=Bild.length;
        int[][] dB=new int[anzahlbilder][3]; 
        library=pfadB;
             System.out.println("Durchschnittsfarbe der Bilder berechnen");
             System.out.println("Anzahl Bilder: "+anzahlbilder);
        for(anzahlbilder=0; anzahlbilder<Bild.length;anzahlbilder++){
            if (Bild[anzahlbilder]!=null){
                try {
                    BufferedImage biB=ImageIO.read(Bild[anzahlbilder]);  
                    dB[anzahlbilder]=AverageColor(biB,0,0,biB.getWidth(),biB.getHeight());  //Durchschnittsfarbe Bildbibliothekbilder         
                    biB=null;   
                    library+="#"+dB[anzahlbilder][0]+","+dB[anzahlbilder][1]+","+dB[anzahlbilder][2];
                    System.out.println("Bild gelesen : "+(anzahlbilder+1)+" von "+Bild.length);
                } catch (IOException ex) {
                    System.out.println("Fehler aufgetreten beim Lesen der Datei: "+(anzahlbilder+1));
                }
            }                     
            
        }   
        jLabel4.setText("Erfolgreich gelesen!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        //"Bildbibliothek laden"
        //Der Inhalt der txt-Datei (aus einer Zeile bestehend) wird in "library" gespeichert
        final JFileChooser fc = new JFileChooser();      
        fc.setCurrentDirectory(new File("/"));
        int zahl = fc.showOpenDialog(this);
        File f=fc.getSelectedFile();
       
        try{
            BufferedReader br=new BufferedReader(new FileReader(f.getAbsolutePath()));
            library=br.readLine();            
            System.out.println("Datei "+f.getAbsolutePath()+" wurde erfolgreich eingelesen!");
        } catch(Exception e){
            System.out.println("Datei nicht gefunden!");
        }
        jLabel4.setText("Erfolgreich "+f.getAbsolutePath()+" geladen!");
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * Hauptprozess
     */
    private void Render(){ 
        double time=System.currentTimeMillis();      //Die Zeit wird sowohl zu Beginn des Rechnens als auch am Ende gemessen. Die Dauer wird am Ende angegeben
        int rasterX=Integer.parseInt(jTextField3.getText());  //Raster, in das das Bild unterteilt wird
        int rasterY=Integer.parseInt(jTextField4.getText());           
       
        String pfadP=jTextField1.getText();
        int[][] durchschnittsfarbeP=new int[rasterX*rasterY][3];       
           
        if (pfadP!=null){                                                    //Lesen des Einzelbildes (Poster)
            try {
                bi=ImageIO.read(new File(pfadP));    
                Image scaledBi=bi.getScaledInstance(((int)(bi.getWidth()/rasterX))*rasterX,((int)(bi.getHeight()/rasterY))*rasterY,Image.SCALE_SMOOTH);
                bi=new BufferedImage(scaledBi.getWidth(null),scaledBi.getHeight(null),BufferedImage.TYPE_INT_RGB);
                bi.getGraphics().drawImage(scaledBi, 0, 0, null);
                System.out.println("Poster gelesen");
            } catch (IOException ex) {
                System.out.println("Fehler aufgetreten beim Lesen der Datei");
            }
        }     
       
        int rasterBreite=bi.getWidth()/rasterX;
        int rasterHoehe=bi.getHeight()/rasterY;             
        for(int x=0;x<rasterX;x++){                   //Das Poster wird in ein Raster unterteilt, dessen Durchschnittsfarben im durchschnittsfarbeP-Array gespeichert werden
            for(int y=0;y<rasterY;y++){         
                durchschnittsfarbeP[x*rasterY+y]=AverageColor(bi,x*rasterBreite,y*rasterHoehe,rasterBreite,rasterHoehe); 
                System.out.println("  Durchschnittsfarbe Kästchen Nr. "+(x*rasterY+y)+" Koordinaten: "+x+","+y+":   "+durchschnittsfarbeP[x*rasterY+y]);
            }
        }
             
        int[][] durchschnittsfarbeB=null;              //Hier wird der Array der Durchschnittsfarben der Bildbibliothek gespeichert
        File[] Bild=null;
        
        if(library==""){                                             //Entweder es wird direkt eine Bibliothek Bild für Bild eingelesen
            Bild=(new File(jTextField2.getText())).listFiles();          //Dann wird jedes einzelne Bild geladen und dessen Durchschnittsfarbe berechnet und gespeichert...
            durchschnittsfarbeB=new int[Bild.length][3]; 
                System.out.println("Durchschnittsfarbe der Rasterkästchen berechnen");  
                System.out.println("Durchschnittsfarbe der Bilder berechnen");
                System.out.println("Anzahl Bilder: "+Bild.length);
            for(int anzahlbilder=0; anzahlbilder<Bild.length;anzahlbilder++){
                if (Bild[anzahlbilder]!=null){
                    try {
                        BufferedImage biB=ImageIO.read(Bild[anzahlbilder]);  
                        durchschnittsfarbeB[anzahlbilder]=AverageColor(biB,0,0,biB.getWidth(),biB.getHeight());    
                        biB=null;
                        System.out.println("Bild gelesen : "+(anzahlbilder+1)+" von "+Bild.length);
                    } catch (IOException ex) {
                        System.out.println("Fehler aufgetreten beim Lesen der Datei: "+(anzahlbilder+1));
                    }
                }           
            }   
        } else{                                                  //... oder eine Bibliothek, die schon als txt-Datei vorhanden ist, wird geladen (Geht schneller)
            String[] zeile=library.split("#");      
            File bilder=new File(zeile[0]);  
            Bild=bilder.listFiles(); 
               System.out.println("Anzahl Bilder geladen: "+Bild.length); 
            durchschnittsfarbeB=new int[zeile.length-1][3];
            for(int i=1;i<zeile.length;i++){                
                String[] a=zeile[i].split(",");
                durchschnittsfarbeB[i-1][0]=Integer.parseInt(a[0]);
                durchschnittsfarbeB[i-1][1]=Integer.parseInt(a[1]);
                durchschnittsfarbeB[i-1][2]=Integer.parseInt(a[2]);                
            }         
        }        
       
        System.out.println("Positionszuordnung");     
        
        
        
        int width=12000;                                                   //Das hier ist nötig, damit das richtige Seitenverhältnis und ein voll gezeichnetes Bild entstehen kann
        int height=12000*bi.getHeight()/bi.getWidth();        
        width=((int)(width/rasterX))*rasterX;
        height=((int)(height/rasterY))*rasterY;       
        biOriginal=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        
        Graphics2D g_bi=bi.createGraphics();      
        g_bi.setColor(new Color(255,255,255));
        g_bi.fillRect(0,0,bi.getWidth(),bi.getHeight());
        Graphics2D g_biOriginal=biOriginal.createGraphics();      
        g_biOriginal.setColor(new Color(255,255,255));
        g_biOriginal.fillRect(0,0,biOriginal.getWidth(),biOriginal.getHeight());      
        int[] Bildnummern=Regression(durchschnittsfarbeP,durchschnittsfarbeB);  
        int hoeheD=biOriginal.getHeight()/rasterY;
        int breiteD=biOriginal.getWidth()/rasterX;
        int raster=rasterX*rasterY;
        int zaehler=0;
        System.out.println("Fortschritt:");
        //---- Ab hier wird gezeichnet
        for(int i=0;i<Bildnummern.length;i++){            
           // System.out.println("    "+i);
            if(Bildnummern[i]!=-1){ 
                try{
                    BufferedImage bildPoster=ImageIO.read(Bild[Bildnummern[i]]);
                    
                    for(int p=i;p<Bildnummern.length;p++){
                        if(Bildnummern[i]==Bildnummern[p] &&Bildnummern[i]!=-1){
                           // System.out.println("        "+p);                        
                            g_bi.drawImage(bildPoster, ((p-(p%rasterY))/rasterY)*rasterBreite,(p%rasterY)*rasterHoehe,rasterBreite,rasterHoehe,this);  //Zeichnen in jPanel1            
                            g_biOriginal.drawImage(bildPoster, ((p-(p%rasterY))/rasterY)*breiteD,(p%rasterY)*hoeheD,breiteD,hoeheD,this);   // Zeichnen in das grosse BufferedImage als jpg-Datei
                            zaehler++;
                            if (p!=i){
                                Bildnummern[p]=-1;
                            }
                        } 
                    }                         
                }catch(IOException e){
                System.out.println("Fehler aufgetreten beim Lesen der Datei");
                }
            }
            System.out.println((int)((zaehler*100)/raster)+"%");
           
        }      
        time=System.currentTimeMillis()-time;        //Zeitangabe
        System.out.println("Erfolgreich!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11");    
        System.out.println("Dauer: "+time/(1000*60)+" Minuten ");       
    }
    
    /**
     * Zeichnen der Objekte in jPanel1
     * @param g Graphics-Objekt
     */
    private void zeichnen(Graphics g){
        
        if(bi!=null){                              // wenn ein Bild geladen ist
            g.drawImage(bi,0 , 0, bi.getWidth(),bi.getHeight(),this);
            
        }else{                                     //wenn noch kein Bild geladen ist
            g.setColor(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
            g.fillRect(0,0,jPanel1.getWidth(),jPanel1.getHeight());
        }
        
    }   
    
    /**
     * Berechnung der Durchschnittsfarbe eines Ausschnitts eines Bildes
     * @param bi das zu verwendete Bild
     * @param X links oben x-Koordinate des Ausschnitts
     * @param Y links oben y-Koordinate des Ausschnitts
     * @param breite Breite des Ausschnitts
     * @param hoehe Höhe des Ausschnitts
     * @return die Durchschnittsfarbenwerte als int array
     */    
    private int[] AverageColor(BufferedImage bi,int X,int Y,int breite, int hoehe){   
        int pixelanzahl=0;  
        int[] C=new int[3];
        System.out.println("    Deklarierung");
        System.out.println("    Berechne...");
            for(pixelanzahl=1;pixelanzahl<Math.sqrt(breite*hoehe);pixelanzahl++){
                int co=bi.getRGB((int)((Math.random()*breite+X)),(int)((Math.random()*hoehe+Y)));
                Color c=new Color(co);
                C[0]+=c.getRed();                                   // Farbwerte werden alle  addiert und ...
                C[1]+=c.getGreen();
                C[2]+=c.getBlue();         
            }
       
        C[0]/=pixelanzahl;                                           // ... durch die Anzahl der ausgwewählten Pixel dividiert
        C[1]/=pixelanzahl;
        C[2]/=pixelanzahl;
       
        
        
        System.out.println("    Erfolgreich! Farbe: "+C[0]+","+C[1]+","+C[2]);
        return C;       
    }
    
    /**Ordnet Farbvektoren zueinander
     * @param P Durchschnittsfarben aller Posterrasterkästchen
     * @param B Durchschnittsfarben aller Bilder aus der Bildbibliothek
     * @return B-Array in der passenden Reihenfolge, das so lang ist, wie die Anzahl der Rasterkästchen
     */
    private int[] Regression(int[][] P, int[][] B){                                //Finde zu jedem Rasterkästchen des Poster das passendste Bild        
        
        int[] bildNr=new int[P.length];              
        int[][] Xbilder=new int[P.length][3];
        for(int j=0;j<P.length;j++){          
            bildNr[j]=kleinsterAbstand(P[j],B);
            System.out.println("        bildNr["+j+"]: "+bildNr[j]);
        }
        
       
        return bildNr;
    }
    
    /**nächster Vektor einer Gruppe zu einem anderen Vektor
     * 
     * @param a entspricht EINER Durchschnittsfarbe eines Rasterkästchens des Posters   
     * @param b entspricht ALLEN Durchschnittsfarben der Bilder aus der Bildbibliothek
     * @return Nummer des nächstgelegenen Vektors zu a
     */ 
    private int kleinsterAbstand(int[]a, int[][]b){ //berechnet den kleinsten Abstand einer Vektorengruppe und einem Bezugsvektor
        
        int nr=0;
        for(int i=0;i<b.length-1;i++){
            if(Abstand(a,b[i+1])<Abstand(a,b[nr])){
                nr=i+1;               
            }
        }
        return nr;                                  //gibt die Nummer des Vektors,der am nächsten zum Bezugsvektor a liegt, an
        
    }
    
    /**Abstandsberechnung
     * 
     * @param a Vektor a
     * @param b Vektor b
     * @return Abstand von a und b (ohne Wurzel, da der Abstand nicht nötig ist, sondern nur die Hierarchie von vielen Abständen; spart Rechenarbeit)
     */
    private double Abstand(int[] a, int[] b){        
        return (a[0]-b[0])*(a[0]-b[0])+(a[1]-b[1])*(a[1]-b[1])+(a[2]-b[2])*(a[2]-b[2]);     //Abstandsberechnung
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
