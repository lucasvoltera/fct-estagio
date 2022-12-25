/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author ranoc
 */
public class VagasComboBoxModel extends AbstractListModel<Object> implements ComboBoxModel<Object>{
    private List<Vaga> listVagas;
    private Vaga selectedVaga;
    private final static int FIRSTINDEX = 0;
 
    public VagasComboBoxModel() {
        this.listVagas = new ArrayList<Vaga>();
    }
     
    public VagasComboBoxModel(List<Vaga> listVagas) {
        this();
        this.listVagas.addAll(listVagas);
        if (getSize() > 0) {
            setSelectedItem(this.listVagas.get(FIRSTINDEX));
        }
    }
     
    @Override
    public Vaga getElementAt(int index) {
        return listVagas.get(index);
    }
 
    @Override
    public int getSize() {
        return listVagas.size();
    }
 
    @Override
    public Vaga getSelectedItem() {
        return selectedVaga;
    }
 
    @Override
    public void setSelectedItem(Object anItem) {
        selectedVaga = (Vaga) anItem;
        
    }
     
    public void addVaga(Vaga v) {
        listVagas.add(v);
        fireIntervalAdded(this, getSize() - 1, getSize() - 1);
        setSelectedItem(listVagas.get(getSize() - 1));
    }
     
    public void addListVaga(List<Vaga> vagas) {
        int primeiraLinha = getSize();
        listVagas.addAll(vagas);
        fireIntervalAdded(this, primeiraLinha, primeiraLinha  + vagas.size());
        setSelectedItem(listVagas.get(getSize() - 1));
    }
     
    public void removeVaga() {
        listVagas.remove(getSelectedItem());
        fireIntervalRemoved(this, FIRSTINDEX, getSize() - 1);
        setSelectedItem(listVagas.get(FIRSTINDEX));
    }
     
    public void clear() {
        listVagas.clear();
        fireContentsChanged(this, FIRSTINDEX, getSize() - 1);
    }
}
