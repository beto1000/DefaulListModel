package main;

import models.Model_Default;
import views.View_Default;
import controllers.Controller_Default;
        
public class Main {
    
    public static void main(String jagb[]){
        Model_Default model_default = new Model_Default();
        View_Default view_default = new View_Default();
        Controller_Default controller_default = new Controller_Default(model_default, view_default);
        
    } 
    
}

