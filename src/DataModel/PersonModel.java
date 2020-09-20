/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModel;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author saadb
 */
public class PersonModel extends AbstractTableModel{
    List<Person> myData;

    public PersonModel() {
        myData=new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            myData.add(new Person(i,"nom "+i));
        }
        
    }
    

    @Override
    public int getRowCount() {
      return  myData.size();
            
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : return myData.get(rowIndex).getId();
            case 1 : return myData.get(rowIndex).getNom();
            default: return "None";
        }
    }
    
}
