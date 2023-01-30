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
public class AlunoComboBoxModel extends AbstractListModel<Object> implements ComboBoxModel<Object>{
    private List<Aluno> listAlunos;
    private Aluno selectedAluno;
    private final static int FIRSTINDEX = 0;
 
    public AlunoComboBoxModel() {
        this.listAlunos = new ArrayList<Aluno>();
    }
     
    public AlunoComboBoxModel(List<Aluno> listAlunos) {
        this();
        this.listAlunos.addAll(listAlunos);
        if (getSize() > 0) {
            setSelectedItem(this.listAlunos.get(FIRSTINDEX));
        }
    }
     
    @Override
    public Aluno getElementAt(int index) {
        return listAlunos.get(index);
    }
 
    @Override
    public int getSize() {
        return listAlunos.size();
    }
 
    @Override
    public Aluno getSelectedItem() {
        return selectedAluno;
    }
 
    @Override
    public void setSelectedItem(Object anItem) {
        selectedAluno = (Aluno) anItem;
        
    }
     
    public void addAluno(Aluno a) {
        listAlunos.add(a);
        fireIntervalAdded(this, getSize() - 1, getSize() - 1);
        setSelectedItem(listAlunos.get(getSize() - 1));
    }
     
    public void addListALuno(List<Aluno> alunos) {
        int primeiraLinha = getSize();
        listAlunos.addAll(alunos);
        fireIntervalAdded(this, primeiraLinha, primeiraLinha  + alunos.size());
        setSelectedItem(listAlunos.get(getSize() - 1));
    }
     
    public void removeVaga() {
        listAlunos.remove(getSelectedItem());
        fireIntervalRemoved(this, FIRSTINDEX, getSize() - 1);
        setSelectedItem(listAlunos.get(FIRSTINDEX));
    }
     
    public void clear() {
        listAlunos.clear();
        fireContentsChanged(this, FIRSTINDEX, getSize() - 1);
    }
}
