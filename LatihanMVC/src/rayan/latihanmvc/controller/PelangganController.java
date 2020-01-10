/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rayan.latihanmvc.controller;

import javax.swing.JOptionPane;
import rayan.latihanmvc.model.PelangganModel;
import rayan.latihanmvc.view.PelangganView;

/**
 *
 * @author RyanJuan
 * NIM      : 10115557
 * NAMA     : RAYAN
 * KELAS    : PBOULG
 * MEMBUAT APLIKASI PELANGGAN MEN BABERSHOP
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    public void resetForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();
        
        if(nama.equals("") && email.equals("") && noTelp.equals("")){
        } else {
        
            model.resetForm();
            
        }
       
    }
    
    public void simpanForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();
        
        if (nama.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nama Masih kosong");
        } else if (email.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Email Masih kosong");
        } else if (noTelp.trim().equals("")){
            JOptionPane.showMessageDialog(view, "No.Telp Masih kosong");
        } else {
            model.simpanForm();
        }
    }
}
