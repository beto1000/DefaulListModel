package controllers;
import models.Model_Default;
import views.View_Default;

public class Controller_Default {
    Model_Default model_default;
    View_Default view_default;
   
public Controller_Default(Model_Default model_default,View_Default view_default){ //view_mayor****
this.model_default = model_default;
this.view_default = view_default;
this.view_default.jbtn_agregar.addActionListener(e->jbtn_agregar_click());
this.view_default.jbtn_asc.addActionListener(e->jbtn_asc_click());
InitView();
}
        
        
public void InitView(){
    view_default.jtf_agregar.setText(String.valueOf(model_default.getVar1()));
    view_default.jl_list.setText(String.valueOf(model_default.getVar2()));
    view_default.jbtn_agregar.setText(String.valueOf(model_default.getVar3()));
    view_default.jbtn_asc.setText(String.valueOf(model_default.getVar3()));
    view_default.setVisible(true);
 
    
}
public void jbtn_agregar_click(){
    model_default.setvar1(double.parsedouble(view_default.jtf_var1.getText()));
    model_default.setvar2(double.parsedouble(view_default.jl_list.getText()));
    model_default.setvar3(double.parsedouble(view_default.jbtn_agregar.getText()));
    model_default.default();
    view_default.jl_list.setText(String.valueOf(model_default.getlist()));
}

}
