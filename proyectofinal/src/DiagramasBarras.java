
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class DiagramasBarras {
    public void Graficando(String TitulosBarras[]){
 DefaultCategoryDataset dataset = new DefaultCategoryDataset();
 if(TitulosBarras[0].equalsIgnoreCase("Edad") && TitulosBarras[1].equalsIgnoreCase("Genero")){
        int Masculino1 = 0; int Masculino2 = 0; int Masculino3 = 0; int Masculino4 = 0; int Masculino5 = 0;
        int Femenino1 = 0; int Femenino2 = 0; int Femenino3 = 0; int Femenino4 = 0; int Femenino5 = 0;
            for (int i = 1; i < Inicio.Filas; i++) {
            if(!Inicio.Datos.getValueAt(i,8).toString().equals("")){    
            if(Inicio.Datos.getValueAt(i,9).equals("MASCULINO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=15){
                    Masculino1++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("MASCULINO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>15 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=30){
                    Masculino2++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("MASCULINO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>30 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=45){
                    Masculino3++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("MASCULINO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>45 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=60){
                    Masculino4++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("MASCULINO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>60){
                    Masculino5++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("FEMENINO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=15){
                    Femenino1++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("FEMENINO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>15 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=30){
                    Femenino2++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("FEMENINO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>30 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=45){
                    Femenino3++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("FEMENINO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>45 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=60){
                    Femenino4++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("FEMENINO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>60){
                    Femenino5++;
            }
        }}
        
        dataset.setValue(Masculino1, "Masculino", "0-15 Años");
        dataset.setValue(Femenino1, "Femenino", "0-15 Años");
        dataset.setValue(Masculino2, "Masculino", "16-30 Años");
        dataset.setValue(Femenino2, "Femenino", "16-30 Años");
        dataset.setValue(Masculino3, "Masculino", "31-45 Años");
        dataset.setValue(Femenino3, "Femenino", "31-45 Años");
        dataset.setValue(Masculino4, "Masculino", "46-60 Años");
        dataset.setValue(Femenino4, "Femenino", "46-60 Años");        
        dataset.setValue(Masculino5, "Masculino", "Mayor a 60 Años");
        dataset.setValue(Femenino5, "Femenino", "Mayor a 60 Años");   
 }
 
 if(TitulosBarras[0].equalsIgnoreCase("Genero") && TitulosBarras[1].equalsIgnoreCase("Arma")){
        int Masculino1 = 0; int Masculino2 = 0; int Masculino3 = 0; int Masculino4 = 0; int Masculino5 = 0;
        int Masculino6 = 0; int Masculino7 = 0; int Masculino8 = 0; int Masculino9 = 0;
        int Femenino1 = 0; int Femenino2 = 0; int Femenino3 = 0; int Femenino4 = 0; int Femenino5 = 0;
        int Femenino6 = 0; int Femenino7 = 0; int Femenino8 = 0; int Femenino9 = 0;
            for (int i = 1; i < Inicio.Filas; i++) {
            if(Inicio.Datos.getValueAt(i,9).equals("MASCULINO") && Inicio.Datos.getValueAt(i,5).equals("ARMA BLANCA")){
                    Masculino1++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("MASCULINO") && Inicio.Datos.getValueAt(i,5).equals("ARMA DE FUEGO")){
                    Masculino2++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("MASCULINO") && Inicio.Datos.getValueAt(i,5).equals("CONTUNDENTES")){
                    Masculino3++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("MASCULINO") && Inicio.Datos.getValueAt(i,5).equals("CORTANTES")){
                    Masculino4++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("MASCULINO") && Inicio.Datos.getValueAt(i,5).equals("ESCOPOLAMINA")){
                    Masculino5++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("MASCULINO") && Inicio.Datos.getValueAt(i,5).equals("JERINGA")){
                    Masculino6++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("MASCULINO") && Inicio.Datos.getValueAt(i,5).equals("NO REPORTADO")){
                    Masculino7++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("MASCULINO") && Inicio.Datos.getValueAt(i,5).equals("PERRO")){
                    Masculino8++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("MASCULINO") && Inicio.Datos.getValueAt(i,5).equals("SIN EMPLEO DE ARMAS")){
                    Masculino9++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("FEMENINO") && Inicio.Datos.getValueAt(i,5).equals("ARMA BLANCA")){
                    Femenino1++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("FEMENINO") && Inicio.Datos.getValueAt(i,5).equals("ARMA DE FUEGO")){
                    Femenino2++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("FEMENINO") && Inicio.Datos.getValueAt(i,5).equals("CONTUNDENTES")){
                    Femenino3++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("FEMENINO") && Inicio.Datos.getValueAt(i,5).equals("CORTANTES")){
                    Femenino4++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("FEMENINO") && Inicio.Datos.getValueAt(i,5).equals("ESCOPOLAMINA")){
                    Femenino5++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("FEMENINO") && Inicio.Datos.getValueAt(i,5).equals("JERINGA")){
                    Femenino6++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("FEMENINO") && Inicio.Datos.getValueAt(i,5).equals("NO REPORTADO")){
                    Femenino7++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("FEMENINO") && Inicio.Datos.getValueAt(i,5).equals("PERRO")){
                    Femenino8++;
            }
            if(Inicio.Datos.getValueAt(i,9).equals("FEMENINO") && Inicio.Datos.getValueAt(i,5).equals("SIN EMPLEO DE ARMAS")){
                    Femenino9++;
            }
        }
        
        dataset.setValue(Masculino1, "Masculino", "Arma Blanca");
        dataset.setValue(Femenino1, "Femenino", "Arma Blanca");
        dataset.setValue(Masculino2, "Masculino", "Arma Fuego");
        dataset.setValue(Femenino2, "Femenino", "Arma Fuego");
        dataset.setValue(Masculino3, "Masculino", "Contundente");
        dataset.setValue(Femenino3, "Femenino", "Contundente");
        dataset.setValue(Masculino4, "Masculino", "Cortante");
        dataset.setValue(Femenino4, "Femenino", "Cortante");        
        dataset.setValue(Masculino5, "Masculino", "Escopolamina");
        dataset.setValue(Femenino5, "Femenino", "Escopolamina");        
        dataset.setValue(Masculino6, "Masculino", "Jeringa");
        dataset.setValue(Femenino6, "Femenino", "Jeringa");
        dataset.setValue(Masculino7, "Masculino", "No Rep.");
        dataset.setValue(Femenino7, "Femenino", "No Rep.");        
        dataset.setValue(Masculino8, "Masculino", "Perro");
        dataset.setValue(Femenino8, "Femenino", "Perro");
        dataset.setValue(Masculino9, "Masculino", "Sin Armas");
        dataset.setValue(Femenino9, "Femenino", "Sin Armas");
 }
 
 if(TitulosBarras[0].equalsIgnoreCase("Edad") && TitulosBarras[1].equalsIgnoreCase("Arma")){
        int Blanca1 = 0; int Blanca2 = 0; int Blanca3 = 0; int Blanca4 = 0; int Blanca5 = 0;
        int Fuego1 = 0; int Fuego2 = 0; int Fuego3 = 0; int Fuego4 = 0; int Fuego5 = 0;
        int Contundente1 = 0; int Contundente2 = 0; int Contundente3 = 0; int Contundente4 = 0; int Contundente5 = 0;
        int Cortante1 = 0; int Cortante2 = 0; int Cortante3 = 0; int Cortante4 = 0; int Cortante5 = 0;
        int Esco1 = 0; int Esco2 = 0; int Esco3 = 0; int Esco4 = 0; int Esco5 = 0;
        int Jeringa1 = 0; int Jeringa2 = 0; int Jeringa3 = 0; int Jeringa4 = 0; int Jeringa5 = 0;
        int No1 = 0; int No2 = 0; int No3 = 0; int No4 = 0; int No5 = 0;
        int Perro1 = 0; int Perro2 = 0; int Perro3 = 0; int Perro4 = 0; int Perro5 = 0;
        int Sin1 = 0; int Sin2 = 0; int Sin3 = 0; int Sin4 = 0; int Sin5 = 0;
            for (int i = 1; i < Inicio.Filas; i++) {
            if(!Inicio.Datos.getValueAt(i,8).toString().equals("")){    
            if(Inicio.Datos.getValueAt(i,5).equals("ARMA BLANCA") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=15){
                    Blanca1++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("ARMA BLANCA") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>15 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=30){
                    Blanca2++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("ARMA BLANCA") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>30 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=45){
                    Blanca3++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("ARMA BLANCA") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>45 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=60){
                    Blanca4++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("ARMA BLANCA") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>60){
                    Blanca5++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("ARMA DE FUEGO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=15){
                    Fuego1++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("ARMA DE FUEGO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>15 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=30){
                    Fuego2++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("ARMA DE FUEGO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>30 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=45){
                    Fuego3++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("ARMA DE FUEGO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>45 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=60){
                    Fuego4++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("ARMA DE FUEGO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>60){
                    Fuego5++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("CONTUNDENTES") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=15){
                    Contundente1++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("CONTUNDENTES") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>15 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=30){
                    Contundente2++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("CONTUNDENTES") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>30 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=45){
                    Contundente3++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("CONTUNDENTES") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>45 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=60){
                    Contundente4++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("CONTUNDENTES") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>60){
                    Contundente5++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("CORTANTES") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=15){
                    Cortante1++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("CORTANTES") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>15 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=30){
                    Cortante2++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("CORTANTES") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>30 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=45){
                    Cortante3++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("CORTANTES") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>45 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=60){
                    Cortante4++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("CORTANTES") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>60){
                    Cortante5++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("ESCOPOLAMINA") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=15){
                    Esco1++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("ESCOPOLAMINA") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>15 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=30){
                    Esco2++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("ESCOPOLAMINA") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>30 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=45){
                    Esco3++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("ESCOPOLAMINA") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>45 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=60){
                    Esco4++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("ESCOPOLAMINA") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>60){
                    Esco5++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("JERINGA") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=15){
                    Jeringa1++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("JERINGA") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>15 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=30){
                    Jeringa2++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("JERINGA") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>30 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=45){
                    Jeringa3++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("JERINGA") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>45 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=60){
                    Jeringa4++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("JERINGA") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>60){
                    Jeringa5++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("NO REPORTADO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=15){
                    No1++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("NO REPORTADO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>15 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=30){
                    No2++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("NO REPORTADO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>30 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=45){
                    No3++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("NO REPORTADO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>45 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=60){
                    No4++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("NO REPORTADO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>60){
                    No5++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("PERRO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=15){
                    Perro1++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("PERRO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>15 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=30){
                    Perro2++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("PERRO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>30 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=45){
                    Perro3++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("PERRO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>45 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=60){
                    Perro4++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("PERRO") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>60){
                    Perro5++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("SIN EMPLEO DE ARMAS") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=15){
                    Sin1++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("SIN EMPLEO DE ARMAS") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>15 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=30){
                    Sin2++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("SIN EMPLEO DE ARMAS") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>30 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=45){
                    Sin3++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("SIN EMPLEO DE ARMAS") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>45 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=60){
                    Sin4++;
            }
            if(Inicio.Datos.getValueAt(i,5).equals("SIN EMPLEO DE ARMAS") && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>60){
                    Sin5++;
            }
        }}
        
        dataset.setValue(Blanca1, "0-15 Años", "Arma Blanca");
        dataset.setValue(Blanca2, "16-30 Años", "Arma Blanca");
        dataset.setValue(Blanca3, "31-45 Años", "Arma Blanca");
        dataset.setValue(Blanca4, "46-60 Años", "Arma Blanca");
        dataset.setValue(Blanca5, "Mayor a 60 Años", "Arma Blanca");  
        dataset.setValue(Fuego1, "0-15 Años", "Arma Fuego");
        dataset.setValue(Fuego2, "16-30 Años", "Arma Fuego");
        dataset.setValue(Fuego3, "31-45 Años", "Arma Fuego");
        dataset.setValue(Fuego4, "46-60 Años", "Arma Fuego");
        dataset.setValue(Fuego5, "Mayor a 60 Años", "Arma Fuego");
        dataset.setValue(Contundente1, "0-15 Años", "Contundente");
        dataset.setValue(Contundente2, "16-30 Años", "Contundente");
        dataset.setValue(Contundente3, "31-45 Años", "Contundente");
        dataset.setValue(Contundente4, "46-60 Años", "Contundente");
        dataset.setValue(Contundente5, "Mayor a 60 Años", "Contundente");
        dataset.setValue(Cortante1, "0-15 Años", "Cortante");
        dataset.setValue(Cortante2, "16-30 Años", "Cortante");
        dataset.setValue(Cortante3, "31-45 Años", "Cortante");
        dataset.setValue(Cortante4, "46-60 Años", "Cortante");
        dataset.setValue(Cortante5, "Mayor a 60 Años", "Cortante");
        dataset.setValue(Esco1, "0-15 Años", "Escopolamina");
        dataset.setValue(Esco2, "16-30 Años", "Escopolamina");
        dataset.setValue(Esco3, "31-45 Años", "Escopolamina");
        dataset.setValue(Esco4, "46-60 Años", "Escopolamina");
        dataset.setValue(Esco5, "Mayor a 60 Años", "Escopolamina");
        dataset.setValue(Jeringa1, "0-15 Años", "Jeringa");
        dataset.setValue(Jeringa2, "16-30 Años", "Jeringa");
        dataset.setValue(Jeringa3, "31-45 Años", "Jeringa");
        dataset.setValue(Jeringa4, "46-60 Años", "Jeringa");
        dataset.setValue(Jeringa5, "Mayor a 60 Años", "Jeringa");
        dataset.setValue(No1, "0-15 Años", "No Rep.");
        dataset.setValue(No2, "16-30 Años", "No Rep.");
        dataset.setValue(No3, "31-45 Años", "No Rep.");
        dataset.setValue(No4, "46-60 Años", "No Rep.");
        dataset.setValue(No5, "Mayor a 60 Años", "Perro");
        dataset.setValue(Perro1, "0-15 Años", "Perro");
        dataset.setValue(Perro2, "16-30 Años", "Perro");
        dataset.setValue(Perro3, "31-45 Años", "Perro");
        dataset.setValue(Perro4, "46-60 Años", "Perro");
        dataset.setValue(Perro5, "Mayor a 60 Años", "Perro");
        dataset.setValue(Sin1, "0-15 Años", "Sin Armas");
        dataset.setValue(Sin2, "16-30 Años", "Sin Armas");
        dataset.setValue(Sin3, "31-45 Años", "Sin Armas");
        dataset.setValue(Sin4, "46-60 Años", "Sin Armas");
        dataset.setValue(Sin5, "Mayor a 60 Años", "Sin Armas");
 }
 
 if(TitulosBarras[0].equalsIgnoreCase("Hora") && TitulosBarras[1].equalsIgnoreCase("Edad")){
        int Hora1 = 0; int Hora2 = 0; int Hora3 = 0; int Hora4 = 0; int Hora5 = 0;
        int Hora6 = 0; int Hora7 = 0; int Hora8 = 0; int Hora9 = 0; int Hora10 = 0;
        int Hora11 = 0; int Hora12 = 0; int Hora13 = 0; int Hora14 = 0; int Hora15 = 0;
        int Hora16 = 0; int Hora17 = 0; int Hora18 = 0; int Hora19 = 0; int Hora20 = 0;
        String Ayudante1 = "";
        int Minutos = 0; int Hora = 0;
            for (int i = 1; i < Inicio.Filas; i++) {
                Ayudante1 = Inicio.Datos.getValueAt(i,1).toString();
                    if(Ayudante1.length()==5){
                        Minutos = Integer.parseInt(Ayudante1.substring(3,5));
                        Hora = Integer.parseInt(Ayudante1.substring(0,2));
                    }
                    if(Ayudante1.length()==4){
                        Minutos = Integer.parseInt(Ayudante1.substring(2,4));
                        Hora = Integer.parseInt(Ayudante1.substring(0,1));
                    }
            if(!Inicio.Datos.getValueAt(i,8).toString().equals("")){    
            if(((Hora==0 && Minutos==1) || (Hora==6 && Minutos==0) || (Hora>=0 && Hora<6)) && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=15){
                    Hora1++;
            }
            if(((Hora==0 && Minutos==1) || (Hora==6 && Minutos==0) || (Hora>=0 && Hora<6)) && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>15 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=30){
                    Hora2++;
            }
            if(((Hora==0 && Minutos==1) || (Hora==6 && Minutos==0) || (Hora>=0 && Hora<6)) && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>30 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=45){
                    Hora3++;
            }
            if(((Hora==0 && Minutos==1) || (Hora==6 && Minutos==0) || (Hora>=0 && Hora<6)) && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>45 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=60){
                    Hora4++;
            }
            if(((Hora==0 && Minutos==1) || (Hora==6 && Minutos==0) || (Hora>=0 && Hora<6)) && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>60){
                    Hora5++;
            }
            if(((Hora==6 && Minutos==1) || (Hora==12 && Minutos==0) || (Hora>=6 && Hora<12)) && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=15){
                    Hora6++;
            }
            if(((Hora==6 && Minutos==1) || (Hora==12 && Minutos==0) || (Hora>=6 && Hora<12)) && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>15 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=30){
                    Hora7++;
            }
            if(((Hora==6 && Minutos==1) || (Hora==12 && Minutos==0) || (Hora>=6 && Hora<12)) && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>30 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=45){
                    Hora8++;
            }
            if(((Hora==6 && Minutos==1) || (Hora==12 && Minutos==0) || (Hora>=6 && Hora<12)) && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>45 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=60){
                    Hora9++;
            }
            if(((Hora==6 && Minutos==1) || (Hora==12 && Minutos==0) || (Hora>=6 && Hora<12)) && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>60){
                    Hora10++;
            }
            if(((Hora==12 && Minutos==1) || (Hora==18 && Minutos==0) || (Hora>=12 && Hora<18)) && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=15){
                    Hora11++;
            }
            if(((Hora==12 && Minutos==1) || (Hora==18 && Minutos==0) || (Hora>=12 && Hora<18)) && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>15 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=30){
                    Hora12++;
            }
            if(((Hora==12 && Minutos==1) || (Hora==18 && Minutos==0) || (Hora>=12 && Hora<18)) && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>30 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=45){
                    Hora13++;
            }
            if(((Hora==12 && Minutos==1) || (Hora==18 && Minutos==0) || (Hora>=12 && Hora<18)) && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>45 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=60){
                    Hora14++;
            }
            if(((Hora==12 && Minutos==1) || (Hora==18 && Minutos==0) || (Hora>=12 && Hora<18)) && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>60){
                    Hora15++;
            }
            if(((Hora==18 && Minutos==1) || (Hora==0 && Minutos==0) || (Hora>=18 && Hora<=23)) && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=15){
                    Hora16++;
            }
            if(((Hora==18 && Minutos==1) || (Hora==0 && Minutos==0) || (Hora>=18 && Hora<=23)) && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>15 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=30){
                    Hora17++;
            }
            if(((Hora==18 && Minutos==1) || (Hora==0 && Minutos==0) || (Hora>=18 && Hora<=23)) && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>30 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=45){
                    Hora18++;
            }
            if(((Hora==18 && Minutos==1) || (Hora==0 && Minutos==0) || (Hora>=18 && Hora<=23)) && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>45 && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())<=60){
                    Hora19++;
            }
            if(((Hora==18 && Minutos==1) || (Hora==0 && Minutos==0) || (Hora>=18 && Hora<=23)) && Integer.parseInt(Inicio.Datos.getValueAt(i,8).toString())>60){
                    Hora20++;
            }
        }}
        
        dataset.setValue(Hora1, "0-15 Años", "00:01 - 06:00");
        dataset.setValue(Hora2, "16-30 Años", "00:01 - 06:00");
        dataset.setValue(Hora3, "31-45 Años", "00:01 - 06:00");
        dataset.setValue(Hora4, "46-60 Años", "00:01 - 06:00");
        dataset.setValue(Hora5, "Mayor a 60 Años", "00:01 - 06:00");
        dataset.setValue(Hora6, "0-15 Años", "06:01 - 12:00");
        dataset.setValue(Hora7, "16-30 Años", "06:01 - 12:00");
        dataset.setValue(Hora8, "31-45 Años", "06:01 - 12:00");
        dataset.setValue(Hora9, "46-60 Años", "06:01 - 12:00");
        dataset.setValue(Hora10, "Mayor a 60 Años", "06:01 - 12:00"); 
        dataset.setValue(Hora11, "0-15 Años", "12:01 - 18:00");
        dataset.setValue(Hora12, "16-30 Años", "12:01 - 18:00");
        dataset.setValue(Hora13, "31-45 Años", "12:01 - 18:00");
        dataset.setValue(Hora14, "46-60 Años", "12:01 - 18:00");
        dataset.setValue(Hora15, "Mayor a 60 Años", "12:01 - 18:00");
        dataset.setValue(Hora16, "0-15 Años", "18:01 - 00:00");
        dataset.setValue(Hora17, "16-30 Años", "18:01 - 00:00");
        dataset.setValue(Hora18, "31-45 Años", "18:01 - 00:00");
        dataset.setValue(Hora19, "46-60 Años", "18:01 - 00:00");
        dataset.setValue(Hora20, "Mayor a 60 Años", "18:01 - 00:00");
 }
 
if(TitulosBarras[0].equalsIgnoreCase("Hora") && TitulosBarras[1].equalsIgnoreCase("Genero")){
        int Masculino1 = 0; int Masculino2 = 0; int Masculino3 = 0; int Masculino4 = 0; 
        int Femenino1 = 0; int Femenino2 = 0; int Femenino3 = 0; int Femenino4 = 0;
        String Ayudante1 = "";
        int Minutos = 0; int Hora = 0;
            for (int i = 1; i < Inicio.Filas; i++) {
                Ayudante1 = Inicio.Datos.getValueAt(i,1).toString();
                    if(Ayudante1.length()==5){
                        Minutos = Integer.parseInt(Ayudante1.substring(3,5));
                        Hora = Integer.parseInt(Ayudante1.substring(0,2));
                    }
                    if(Ayudante1.length()==4){
                        Minutos = Integer.parseInt(Ayudante1.substring(2,4));
                        Hora = Integer.parseInt(Ayudante1.substring(0,1));
                    }    
            if(((Hora==0 && Minutos==1) || (Hora==6 && Minutos==0) || (Hora>=0 && Hora<6)) && Inicio.Datos.getValueAt(i,9).equals("MASCULINO")){
                    Masculino1++;
            }
            if(((Hora==6 && Minutos==1) || (Hora==12 && Minutos==0) || (Hora>=6 && Hora<12)) && Inicio.Datos.getValueAt(i,9).equals("MASCULINO")){
                    Masculino2++;
            }
            if(((Hora==12 && Minutos==1) || (Hora==18 && Minutos==0) || (Hora>=12 && Hora<18)) && Inicio.Datos.getValueAt(i,9).equals("MASCULINO")){
                    Masculino3++;
            }
            if(((Hora==18 && Minutos==1) || (Hora==0 && Minutos==0) || (Hora>=18 && Hora<=23)) && Inicio.Datos.getValueAt(i,9).equals("MASCULINO")){
                    Masculino4++;
            }
            if(((Hora==0 && Minutos==1) || (Hora==6 && Minutos==0) || (Hora>=0 && Hora<6)) && Inicio.Datos.getValueAt(i,9).equals("FEMENINO")){
                    Femenino1++;
            }
            if(((Hora==6 && Minutos==1) || (Hora==12 && Minutos==0) || (Hora>=6 && Hora<12)) && Inicio.Datos.getValueAt(i,9).equals("FEMENINO")){
                    Femenino2++;
            }
            if(((Hora==12 && Minutos==1) || (Hora==18 && Minutos==0) || (Hora>=12 && Hora<18)) && Inicio.Datos.getValueAt(i,9).equals("FEMENINO")){
                    Femenino3++;
            }
            if(((Hora==18 && Minutos==1) || (Hora==0 && Minutos==0) || (Hora>=18 && Hora<=23)) && Inicio.Datos.getValueAt(i,9).equals("FEMENINO")){
                    Femenino4++;
            }
        }
        
        dataset.setValue(Masculino1, "Masculino", "00:01 - 06:00");
        dataset.setValue(Femenino1, "Femenino", "00:01 - 06:00");
        dataset.setValue(Masculino2, "Masculino", "06:01 - 12:00");
        dataset.setValue(Femenino2, "Femenino", "06:01 - 12:00");
        dataset.setValue(Masculino3, "Masculino", "12:01 - 18:00");
        dataset.setValue(Femenino3, "Femenino", "12:01 - 18:00");
        dataset.setValue(Masculino4, "Masculino", "18:01 - 00:00");
        dataset.setValue(Femenino4, "Femenino", "18:01 - 00:00");
 }

if(TitulosBarras[0].equalsIgnoreCase("Hora") && TitulosBarras[1].equalsIgnoreCase("Arma")){
        int Blanca1 = 0; int Blanca2 = 0; int Blanca3 = 0; int Blanca4 = 0; 
        int Fuego1 = 0; int Fuego2 = 0; int Fuego3 = 0; int Fuego4 = 0; 
        int Contundente1 = 0; int Contundente2 = 0; int Contundente3 = 0; int Contundente4 = 0;
        int Cortante1 = 0; int Cortante2 = 0; int Cortante3 = 0; int Cortante4 = 0; 
        int Esco1 = 0; int Esco2 = 0; int Esco3 = 0; int Esco4 = 0; 
        int Jeringa1 = 0; int Jeringa2 = 0; int Jeringa3 = 0; int Jeringa4 = 0;
        int No1 = 0; int No2 = 0; int No3 = 0; int No4 = 0; 
        int Perro1 = 0; int Perro2 = 0; int Perro3 = 0; int Perro4 = 0;
        int Sin1 = 0; int Sin2 = 0; int Sin3 = 0; int Sin4 = 0; 
        String Ayudante1 = "";
        int Minutos = 0; int Hora = 0;
            for (int i = 1; i < Inicio.Filas; i++) {
                Ayudante1 = Inicio.Datos.getValueAt(i,1).toString();
                    if(Ayudante1.length()==5){
                        Minutos = Integer.parseInt(Ayudante1.substring(3,5));
                        Hora = Integer.parseInt(Ayudante1.substring(0,2));
                    }
                    if(Ayudante1.length()==4){
                        Minutos = Integer.parseInt(Ayudante1.substring(2,4));
                        Hora = Integer.parseInt(Ayudante1.substring(0,1));
                    } 
            if(((Hora==0 && Minutos==1) || (Hora==6 && Minutos==0) || (Hora>=0 && Hora<6)) && Inicio.Datos.getValueAt(i,5).equals("ARMA BLANCA")){
                    Blanca1++;
            }
            if(((Hora==6 && Minutos==1) || (Hora==12 && Minutos==0) || (Hora>=6 && Hora<12)) && Inicio.Datos.getValueAt(i,5).equals("ARMA BLANCA")){
                    Blanca2++;
            }
            if(((Hora==12 && Minutos==1) || (Hora==18 && Minutos==0) || (Hora>=12 && Hora<18)) && Inicio.Datos.getValueAt(i,5).equals("ARMA BLANCA")){
                    Blanca3++;
            }
            if(((Hora==18 && Minutos==1) || (Hora==0 && Minutos==0) || (Hora>=18 && Hora<=23)) && Inicio.Datos.getValueAt(i,5).equals("ARMA BLANCA")){
                    Blanca4++;
            }
            if(((Hora==0 && Minutos==1) || (Hora==6 && Minutos==0) || (Hora>=0 && Hora<6)) && Inicio.Datos.getValueAt(i,5).equals("ARMA DE FUEGO")){
                    Fuego1++;
            }
            if(((Hora==6 && Minutos==1) || (Hora==12 && Minutos==0) || (Hora>=6 && Hora<12)) && Inicio.Datos.getValueAt(i,5).equals("ARMA DE FUEGO")){
                    Fuego2++;
            }
            if(((Hora==12 && Minutos==1) || (Hora==18 && Minutos==0) || (Hora>=12 && Hora<18)) && Inicio.Datos.getValueAt(i,5).equals("ARMA DE FUEGO")){
                    Fuego3++;
            }
            if(((Hora==18 && Minutos==1) || (Hora==0 && Minutos==0) || (Hora>=18 && Hora<=23)) && Inicio.Datos.getValueAt(i,5).equals("ARMA DE FUEGO")){
                    Fuego4++;
            }
            if(((Hora==0 && Minutos==1) || (Hora==6 && Minutos==0) || (Hora>=0 && Hora<6)) && Inicio.Datos.getValueAt(i,5).equals("CONTUNDENTES")){
                    Contundente1++;
            }
            if(((Hora==6 && Minutos==1) || (Hora==12 && Minutos==0) || (Hora>=6 && Hora<12)) && Inicio.Datos.getValueAt(i,5).equals("CONTUNDENTES")){
                    Contundente2++;
            }
            if(((Hora==12 && Minutos==1) || (Hora==18 && Minutos==0) || (Hora>=12 && Hora<18)) && Inicio.Datos.getValueAt(i,5).equals("CONTUNDENTES")){
                    Contundente3++;
            }
            if(((Hora==18 && Minutos==1) || (Hora==0 && Minutos==0) || (Hora>=18 && Hora<=23)) && Inicio.Datos.getValueAt(i,5).equals("CONTUNDENTES")){
                    Contundente4++;
            }
            if(((Hora==0 && Minutos==1) || (Hora==6 && Minutos==0) || (Hora>=0 && Hora<6)) && Inicio.Datos.getValueAt(i,5).equals("CORTANTES")){
                    Cortante1++;
            }
            if(((Hora==6 && Minutos==1) || (Hora==12 && Minutos==0) || (Hora>=6 && Hora<12)) && Inicio.Datos.getValueAt(i,5).equals("CORTANTES")){
                    Cortante2++;
            }
            if(((Hora==12 && Minutos==1) || (Hora==18 && Minutos==0) || (Hora>=12 && Hora<18)) && Inicio.Datos.getValueAt(i,5).equals("CORTANTES")){
                    Cortante3++;
            }
            if(((Hora==18 && Minutos==1) || (Hora==0 && Minutos==0) || (Hora>=18 && Hora<=23)) && Inicio.Datos.getValueAt(i,5).equals("CORTANTES")){
                    Cortante4++;
            }
            if(((Hora==0 && Minutos==1) || (Hora==6 && Minutos==0) || (Hora>=0 && Hora<6)) && Inicio.Datos.getValueAt(i,5).equals("ESCOPOLAMINA")){
                    Esco1++;
            }
            if(((Hora==6 && Minutos==1) || (Hora==12 && Minutos==0) || (Hora>=6 && Hora<12)) && Inicio.Datos.getValueAt(i,5).equals("ESCOPOLAMINA")){
                    Esco2++;
            }
            if(((Hora==12 && Minutos==1) || (Hora==18 && Minutos==0) || (Hora>=12 && Hora<18)) && Inicio.Datos.getValueAt(i,5).equals("ESCOPOLAMINA")){
                    Esco3++;
            }
            if(((Hora==18 && Minutos==1) || (Hora==0 && Minutos==0) || (Hora>=18 && Hora<=23)) && Inicio.Datos.getValueAt(i,5).equals("ESCOPOLAMINA")){
                    Esco4++;
            }
            if(((Hora==0 && Minutos==1) || (Hora==6 && Minutos==0) || (Hora>=0 && Hora<6)) && Inicio.Datos.getValueAt(i,5).equals("JERINGA")){
                    Jeringa1++;
            }
            if(((Hora==6 && Minutos==1) || (Hora==12 && Minutos==0) || (Hora>=6 && Hora<12)) && Inicio.Datos.getValueAt(i,5).equals("JERINGA")){
                    Jeringa2++;
            }
            if(((Hora==12 && Minutos==1) || (Hora==18 && Minutos==0) || (Hora>=12 && Hora<18)) && Inicio.Datos.getValueAt(i,5).equals("JERINGA")){
                    Jeringa3++;
            }
            if(((Hora==18 && Minutos==1) || (Hora==0 && Minutos==0) || (Hora>=18 && Hora<=23)) && Inicio.Datos.getValueAt(i,5).equals("JERINGA")){
                    Jeringa4++;
            }
            if(((Hora==0 && Minutos==1) || (Hora==6 && Minutos==0) || (Hora>=0 && Hora<6)) && Inicio.Datos.getValueAt(i,5).equals("NO REPORTADO")){
                    No1++;
            }
            if(((Hora==6 && Minutos==1) || (Hora==12 && Minutos==0) || (Hora>=6 && Hora<12)) && Inicio.Datos.getValueAt(i,5).equals("NO REPORTADO")){
                    No2++;
            }
            if(((Hora==12 && Minutos==1) || (Hora==18 && Minutos==0) || (Hora>=12 && Hora<18)) && Inicio.Datos.getValueAt(i,5).equals("NO REPORTADO")){
                    No3++;
            }
            if(((Hora==18 && Minutos==1) || (Hora==0 && Minutos==0) || (Hora>=18 && Hora<=23)) && Inicio.Datos.getValueAt(i,5).equals("NO REPORTADO")){
                    No4++;
            }
            if(((Hora==0 && Minutos==1) || (Hora==6 && Minutos==0) || (Hora>=0 && Hora<6)) && Inicio.Datos.getValueAt(i,5).equals("PERRO")){
                    Perro1++;
            }
            if(((Hora==6 && Minutos==1) || (Hora==12 && Minutos==0) || (Hora>=6 && Hora<12)) && Inicio.Datos.getValueAt(i,5).equals("PERRO")){
                    Perro2++;
            }
            if(((Hora==12 && Minutos==1) || (Hora==18 && Minutos==0) || (Hora>=12 && Hora<18)) && Inicio.Datos.getValueAt(i,5).equals("PERRO")){
                    Perro3++;
            }
            if(((Hora==18 && Minutos==1) || (Hora==0 && Minutos==0) || (Hora>=18 && Hora<=23)) && Inicio.Datos.getValueAt(i,5).equals("PERRO")){
                    Perro4++;
            }
            if(((Hora==0 && Minutos==1) || (Hora==6 && Minutos==0) || (Hora>=0 && Hora<6)) && Inicio.Datos.getValueAt(i,5).equals("SIN EMPLEO DE ARMAS")){
                    Sin1++;
            }
            if(((Hora==6 && Minutos==1) || (Hora==12 && Minutos==0) || (Hora>=6 && Hora<12)) && Inicio.Datos.getValueAt(i,5).equals("SIN EMPLEO DE ARMAS")){
                    Sin2++;
            }
            if(((Hora==12 && Minutos==1) || (Hora==18 && Minutos==0) || (Hora>=12 && Hora<18)) && Inicio.Datos.getValueAt(i,5).equals("SIN EMPLEO DE ARMAS")){
                    Sin3++;
            }
            if(((Hora==18 && Minutos==1) || (Hora==0 && Minutos==0) || (Hora>=18 && Hora<=23)) && Inicio.Datos.getValueAt(i,5).equals("SIN EMPLEO DE ARMAS")){
                    Sin4++;
            }
        }
        
        dataset.setValue(Blanca1, "00:01 - 06:00", "Arma Blanca");
        dataset.setValue(Blanca2, "06:01 - 12:00", "Arma Blanca");
        dataset.setValue(Blanca3, "12:01 - 18:00", "Arma Blanca");
        dataset.setValue(Blanca4, "18:01 - 00:00", "Arma Blanca");
        dataset.setValue(Fuego1, "00:01 - 06:00", "Arma Fuego");
        dataset.setValue(Fuego2, "06:01 - 12:00", "Arma Fuego");
        dataset.setValue(Fuego3, "12:01 - 18:00", "Arma Fuego");
        dataset.setValue(Fuego4, "18:01 - 00:00", "Arma Fuego");
        dataset.setValue(Contundente1, "00:01 - 06:00", "Contundente");
        dataset.setValue(Contundente2, "06:01 - 12:00", "Contundente");
        dataset.setValue(Contundente3, "12:01 - 18:00", "Contundente");
        dataset.setValue(Contundente4, "18:01 - 00:00", "Contundente");
        dataset.setValue(Cortante1, "00:01 - 06:00", "Cortante");
        dataset.setValue(Cortante2, "06:01 - 12:00", "Cortante");
        dataset.setValue(Cortante3, "12:01 - 18:00", "Cortante");
        dataset.setValue(Cortante4, "18:01 - 00:00", "Cortante");
        dataset.setValue(Esco1, "00:01 - 06:00", "Escopolamina");
        dataset.setValue(Esco2, "06:01 - 12:00", "Escopolamina");
        dataset.setValue(Esco3, "12:01 - 18:00", "Escopolamina");
        dataset.setValue(Esco4, "18:01 - 00:00", "Escopolamina");
        dataset.setValue(Jeringa1, "00:01 - 06:00", "Jeringa");
        dataset.setValue(Jeringa2, "06:01 - 12:00", "Jeringa");
        dataset.setValue(Jeringa3, "12:01 - 18:00", "Jeringa");
        dataset.setValue(Jeringa4, "18:01 - 00:00", "Jeringa");
        dataset.setValue(No1, "00:01 - 06:00", "No Rep.");
        dataset.setValue(No2, "06:01 - 12:00", "No Rep.");
        dataset.setValue(No3, "12:01 - 18:00", "No Rep.");
        dataset.setValue(No4, "18:01 - 00:00", "No Rep.");
        dataset.setValue(Perro1, "00:01 - 06:00", "Perro");
        dataset.setValue(Perro2, "06:01 - 12:00", "Perro");
        dataset.setValue(Perro3, "12:01 - 18:00", "Perro");
        dataset.setValue(Perro4, "18:01 - 00:00", "Perro");
        dataset.setValue(Sin1, "00:01 - 06:00", "Sin Armas");
        dataset.setValue(Sin2, "06:01 - 12:00", "Sin Armas");
        dataset.setValue(Sin3, "12:01 - 18:00", "Sin Armas");
        dataset.setValue(Sin4, "18:01 - 00:00", "Sin Armas");
 }
        
        JFreeChart chart = ChartFactory.createBarChart(TitulosBarras[0] + " VS " + TitulosBarras[1],TitulosBarras[0],"CANTIDAD DE HURTOS", 
                dataset,PlotOrientation.VERTICAL,true,false,false);
        
        ChartFrame frame = new ChartFrame("GRAFICA DE BARRAS", chart);
        frame.pack();
        frame.setSize(1200, 600);
        frame.setVisible(true);
}
}
