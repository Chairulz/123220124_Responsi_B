/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.List;
import GYM.*;
import DAOImplement.datagymimplement;
import DAOdatagym.datagymDAO;
import Main.*;
/**
 *
 * @author Lab Informatika
 */
public class datagymcontroller {
    MainView frame;
    datagymimplement impldatagym;
    List<datagym> d;
    
    public datagymcontroller (MainView frame) {
        this.frame = frame;
        d = impldatagym.getALL();
    }
    public void isiTabel(){}
    public void insert(){}
    public void update(){}
    public void delete(){}
}
