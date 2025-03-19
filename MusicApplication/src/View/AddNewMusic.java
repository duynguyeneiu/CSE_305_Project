/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.LyricMusic;
import Model.MusicTrack;
import Model.InstrumentMusic;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AddNewMusic extends javax.swing.JFrame {

    ArrayList<MusicTrack> musicList;
    MusicTrack music;

    public AddNewMusic(ArrayList<MusicTrack> musicList) {
        this.musicList = musicList;
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tiltefield = new javax.swing.JTextField();
        titleButton = new javax.swing.JLabel();
        authorlable = new javax.swing.JLabel();
        authorfield = new javax.swing.JTextField();
        yearlable = new javax.swing.JLabel();
        yearfield = new javax.swing.JTextField();
        typelable = new javax.swing.JLabel();
        songlyrictButton = new javax.swing.JRadioButton();
        instrumentButton = new javax.swing.JRadioButton();
        artistlable = new javax.swing.JLabel();
        artistfield = new javax.swing.JTextField();
        singerlable = new javax.swing.JLabel();
        Singerfield = new javax.swing.JTextField();
        instrumentlable = new javax.swing.JLabel();
        instrumnetfield = new javax.swing.JTextField();
        urlbutton = new javax.swing.JButton();
        urlfield = new javax.swing.JTextField();
        finishButton1 = new javax.swing.JButton();
        exitButton3 = new javax.swing.JButton();
        genre = new javax.swing.JLabel();
        genreBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add new song");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(50, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(jPanel1, gridBagConstraints);

        tiltefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiltefieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(7, 19, 7, 20);
        getContentPane().add(tiltefield, gridBagConstraints);

        titleButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titleButton.setText("Tiltle");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 11, 11);
        getContentPane().add(titleButton, gridBagConstraints);

        authorlable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        authorlable.setText("Author");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 11, 11);
        getContentPane().add(authorlable, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 19, 6, 19);
        getContentPane().add(authorfield, gridBagConstraints);

        yearlable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        yearlable.setText("Year");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 11, 11);
        getContentPane().add(yearlable, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 19, 6, 19);
        getContentPane().add(yearfield, gridBagConstraints);

        typelable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        typelable.setText("Type");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 11, 11);
        getContentPane().add(typelable, gridBagConstraints);

        buttonGroup1.add(songlyrictButton);
        songlyrictButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        songlyrictButton.setText("Song");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        getContentPane().add(songlyrictButton, gridBagConstraints);

        buttonGroup1.add(instrumentButton);
        instrumentButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        instrumentButton.setText("Instrument music");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(6, 19, 6, 19);
        getContentPane().add(instrumentButton, gridBagConstraints);

        artistlable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        artistlable.setText("Artist");
        artistlable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                artistlableComponentHidden(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 11, 11);
        getContentPane().add(artistlable, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 19, 6, 19);
        getContentPane().add(artistfield, gridBagConstraints);

        singerlable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        singerlable.setText("Singer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 11, 11);
        getContentPane().add(singerlable, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 19, 6, 19);
        getContentPane().add(Singerfield, gridBagConstraints);

        instrumentlable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        instrumentlable.setText("Instrument");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 11, 11);
        getContentPane().add(instrumentlable, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 19, 6, 19);
        getContentPane().add(instrumnetfield, gridBagConstraints);

        urlbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        urlbutton.setText("Browse URL");
        urlbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlbuttonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 11, 11);
        getContentPane().add(urlbutton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(6, 19, 6, 19);
        getContentPane().add(urlfield, gridBagConstraints);

        finishButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        finishButton1.setText("Done");
        finishButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 11, 11);
        getContentPane().add(finishButton1, gridBagConstraints);

        exitButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitButton3.setText("Exit");
        exitButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.insets = new java.awt.Insets(11, 24, 11, 24);
        getContentPane().add(exitButton3, gridBagConstraints);

        genre.setText("Genre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(genre, gridBagConstraints);

        genreBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EDM", "Rock", "Jazz", "Country", "Blue music", "Kpop" }));
        genreBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(6, 19, 6, 19);
        getContentPane().add(genreBox, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void artistlableComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_artistlableComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_artistlableComponentHidden

    private void tiltefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiltefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tiltefieldActionPerformed

    private void finishButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishButton1ActionPerformed

        String title = tiltefield.getText();
        String author = authorfield.getText();
        int year = Integer.parseInt(yearfield.getText());
        String artist = artistfield.getText();
        String singer = Singerfield.getText();
        String instrument = instrumnetfield.getText();
        String url = urlfield.getText();
        String genre = genreBox.getSelectedItem().toString();

        if (instrumentButton.isSelected()) {
            music = new LyricMusic(singer, genre, title, author, genre, year, url);
            musicList.add(music);
        } else {
            music = new InstrumentMusic(instrument, artist, title, author, genre, year, url);
            musicList.add(music);
        }
        saveToFile();
        JOptionPane.showMessageDialog(this, "Successfully added a new song!", "Message", JOptionPane.INFORMATION_MESSAGE);
        dispose();

    }//GEN-LAST:event_finishButton1ActionPerformed

    private void urlbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlbuttonActionPerformed
        String relativePath = "";
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("MP3 & WAV", "mp3", "wav");
        chooser.setFileFilter(filter);

        int selectedFile = chooser.showOpenDialog(this);
        if (selectedFile == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            String absolutePath = file.getAbsolutePath();
            String baseDir = System.getProperty("user.dir");
            File baseDirFile = new File(baseDir);
            relativePath = baseDirFile.toPath().relativize(file.toPath()).toString();
            urlfield.setText(relativePath);
        }


    }//GEN-LAST:event_urlbuttonActionPerformed

    private void exitButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_exitButton3ActionPerformed

    private void genreBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genreBoxActionPerformed

    private void saveToFile() {
        String fileName = "List.data";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(musicList);
            oos.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error save file 3: " + ex.getMessage(), "Message", 1);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error save file 4: " + ex.getMessage(), "Message", 1);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Singerfield;
    private javax.swing.JTextField artistfield;
    private javax.swing.JLabel artistlable;
    private javax.swing.JTextField authorfield;
    private javax.swing.JLabel authorlable;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton exitButton3;
    private javax.swing.JButton finishButton1;
    private javax.swing.JLabel genre;
    private javax.swing.JComboBox<String> genreBox;
    private javax.swing.JRadioButton instrumentButton;
    private javax.swing.JLabel instrumentlable;
    private javax.swing.JTextField instrumnetfield;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel singerlable;
    private javax.swing.JRadioButton songlyrictButton;
    private javax.swing.JTextField tiltefield;
    private javax.swing.JLabel titleButton;
    private javax.swing.JLabel typelable;
    private javax.swing.JButton urlbutton;
    private javax.swing.JTextField urlfield;
    private javax.swing.JTextField yearfield;
    private javax.swing.JLabel yearlable;
    // End of variables declaration//GEN-END:variables
}
