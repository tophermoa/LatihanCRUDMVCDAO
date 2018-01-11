/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.christover.latihanmvcjdbc.event;

import edu.christover.latihanmvcjdbc.entity.Pelanggan;
import edu.christover.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Christover Ramanda Moa-10116531-PBO12
 */
public interface PelangganListener {
    
    public void onChage (PelangganModel model);
    public void onInsert (PelangganModel pelanggan);
    public void onDelete ();
    public void onUpdate (PelangganModel pelanggan);

    public void onChange(PelangganModel aThis);

    public void onInsert(Pelanggan pelanggan);

    public void onUpdate(Pelanggan pelanggan);

    
}
