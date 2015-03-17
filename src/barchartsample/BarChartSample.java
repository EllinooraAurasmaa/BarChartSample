
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 
public class BarChartSample extends Application {
    final static String yksi = "Asia1";
    final static String kaksi = "Asia2";
    final static String kolme = "Asio3";
    final static String neljä = "Asia4";
    final static String viisi = "Asia5";
    final static String kuusi = "Asia6";
 
    @Override public void start(Stage stage) {
        stage.setTitle("Bar Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = 
            new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Kokeilu");
        xAxis.setLabel("Asia");       
        yAxis.setLabel("Määrä");
 
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Nimi1");       
        series1.getData().add(new XYChart.Data(yksi, 25601.34));
        series1.getData().add(new XYChart.Data(kaksi, 20148.82));
        series1.getData().add(new XYChart.Data(kolme, 10000));
        series1.getData().add(new XYChart.Data(neljä, 35407.15));
        series1.getData().add(new XYChart.Data(viisi, 12000));      
        
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Nimi2");
        series2.getData().add(new XYChart.Data(yksi, 57401.85));
        series2.getData().add(new XYChart.Data(kaksi, 41941.19));
        series2.getData().add(new XYChart.Data(kolme, 45263.37));
        series2.getData().add(new XYChart.Data(neljä, 117320.16));
        series2.getData().add(new XYChart.Data(viisi, 14845.27));  
        
        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Nimi3");
        series3.getData().add(new XYChart.Data(yksi, 45000.65));
        series3.getData().add(new XYChart.Data(kaksi, 44835.76));
        series3.getData().add(new XYChart.Data(kolme, 18722.18));
        series3.getData().add(new XYChart.Data(neljä, 17557.31));
        series3.getData().add(new XYChart.Data(viisi, 92633.68));  
        
        Scene scene  = new Scene(bc,800,600);
        bc.getData().addAll(series1, series2, series3);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}