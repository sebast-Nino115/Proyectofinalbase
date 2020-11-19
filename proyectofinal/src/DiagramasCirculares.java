
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;


public class DiagramasCirculares {
  
        public void Graficando2(String Opcion){
       DefaultPieDataset pieDataset = new DefaultPieDataset();
        if(Opcion.equals("Hora")){
            String Ayudante1 = "";
                int Hora = 0;
                int Minutos = 0;
                int a = 0;
                int b = 0;
                int c = 0;
                int d = 0;
                
                for (int j = 1; j <= Inicio.Filas; j++) {
                Ayudante1 = Inicio.Datos.getValueAt(j,1).toString();
                        if(Ayudante1.length()==5){
                        Minutos = Integer.parseInt(Ayudante1.substring(3,5));
                        Hora = Integer.parseInt(Ayudante1.substring(0,2));
                        }
                        if(Ayudante1.length()==4){
                        Minutos = Integer.parseInt(Ayudante1.substring(2,4));
                        Hora = Integer.parseInt(Ayudante1.substring(0,1));
                    }
                         if((Hora==0 && Minutos==1) || (Hora==6 && Minutos==0) || (Hora>=0 && Hora<6)){
                             a++;
                         }
                         if((Hora==6 && Minutos==1) || (Hora==12 && Minutos==0) || (Hora>=6 && Hora<12)){
                             b++;
                    }
                        if((Hora==12 && Minutos==1) || (Hora==18 && Minutos==0) || (Hora>=12 && Hora<18)){
                            c++;
                    }
                        if((Hora==18 && Minutos==1) || (Hora==0 && Minutos==0) || (Hora>=18 && Hora<=23)){
                            d++;
                    }}
        
        pieDataset.setValue("00:01-06:00", new Integer(a));
        pieDataset.setValue("06:01-12:00", new Integer(b));
        pieDataset.setValue("12:01-18:00", new Integer(c));
        pieDataset.setValue("18:01-00:00", new Integer(d));
        }
       
        if(Opcion.equals("Edad")){
            int Ayudante1 = 0;
                int a = 0;
                int b = 0;
                int c = 0;
                int d = 0;
                int e = 0;
                for (int j = 1; j <= Inicio.Filas; j++) {
                    if(!Inicio.Datos.getValueAt(j,8).toString().equals("")){
                         Ayudante1 = Integer.parseInt(Inicio.Datos.getValueAt(j,8).toString());
                         if(Ayudante1<=15){
                             a++;
                         }
                         if(Ayudante1>15 && Ayudante1<=30){
                             b++;
                    }
                        if(Ayudante1>30 && Ayudante1<=45){
                            c++;
                    }
                        if(Ayudante1>45 && Ayudante1<=60){
                            d++;
                    }
                        if(Ayudante1>60){
                            e++;
                    }
                    }}
        
        pieDataset.setValue("0 - 15 Años", new Integer(a));
        pieDataset.setValue("16 - 30 Años", new Integer(b));
        pieDataset.setValue("31 - 45 Años", new Integer(c));
        pieDataset.setValue("46 - 60 Años", new Integer(d));
        pieDataset.setValue("Mas de 60 Años", new Integer(e));
        }
        
         if(Opcion.equals("Genero")){
            String Ayudante1 = "";
                int a = 0;
                int b = 0;
                for (int j = 1; j <= Inicio.Filas; j++) {
                    if(!Inicio.Datos.getValueAt(j,9).toString().equals("")){
                         Ayudante1 = Inicio.Datos.getValueAt(j,9).toString();
                         if(Ayudante1.equals("MASCULINO")){
                             a++;
                         }
                         if(Ayudante1.equals("FEMENINO")){
                             b++;
                    }
                    }}
        pieDataset.setValue("Masculino", new Integer(a));
        pieDataset.setValue("Femenino", new Integer(b));
        }
         
        if(Opcion.equals("Arma")){
            String Ayudante1 = "";
                int a = 0;int b = 0;int c = 0;int d = 0; int e = 0;
                int f = 0; int g = 0; int h = 0; int i = 0;
                for (int j = 1; j <= Inicio.Filas; j++) {
                    if(!Inicio.Datos.getValueAt(j,5).toString().equals("")){
                         Ayudante1 = Inicio.Datos.getValueAt(j,5).toString();
                         if(Ayudante1.equals("ARMA BLANCA")){
                             a++;
                         }
                         if(Ayudante1.equals("ARMA DE FUEGO")){
                             b++;
                    }
                         if(Ayudante1.equals("CONTUNDENTES")){
                             c++;
                    }
                         if(Ayudante1.equals("CORTANTES")){
                             d++;
                    }
                         if(Ayudante1.equals("ESCOPOLAMINA")){
                             e++;
                    }
                         if(Ayudante1.equals("JERINGA")){
                             f++;
                    }
                         if(Ayudante1.equals("NO REPORTADO")){
                             g++;
                    }
                         if(Ayudante1.equals("PERRO")){
                             h++;
                    }
                         if(Ayudante1.equals("SIN EMPLEO DE ARMAS")){
                             i++;
                    }
                    }}
        pieDataset.setValue("Arma Blanca", new Integer(a));
        pieDataset.setValue("Arma de Fuego", new Integer(b));
        pieDataset.setValue("Contundentes", new Integer(c));
        pieDataset.setValue("Cortantes", new Integer(d));
        pieDataset.setValue("Escopolamina", new Integer(e));
        pieDataset.setValue("Jeringa", new Integer(f));
        pieDataset.setValue("No Reportado", new Integer(g));
        pieDataset.setValue("Perro", new Integer(h));
        pieDataset.setValue("Sin Empleo de Armas", new Integer(i));
        }
        
        JFreeChart chart = ChartFactory.createPieChart3D("Grafico de " + Opcion,pieDataset,true,true,false);

        ChartFrame frame = new ChartFrame("Diagrama Circular", chart);
        frame.pack();
        frame.setVisible(true);
}
}
