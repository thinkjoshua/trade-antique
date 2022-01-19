import models.Antiques;
import models.Price;import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {

        Antiques hatchback = new Antiques();
        hatchback.Year = 1994;
        hatchback.type = "Hardwood Table";
        hatchback.tier = "Mid";
        hatchback.Price = 40000 ksh;


        Antiques hatchback = new Antiques();
        hatchback.Year =1960;
        hatchback.type="House Clock";
        hatchback.tier="Top";
        hatchback.Price= 100,000 ksh;


        Antiques hatchback = new Antiques ();
        hatchback.Year=2010;
        hatchback.type="chandaleer";
        hatchback.tier="low" ;
        hatchback. Price= "20,000 ksh"
    }
