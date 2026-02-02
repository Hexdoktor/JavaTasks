import java.io.*;
import java.net.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class FileReaderMain {
    public static void main(String[] args){
        URL myUrl;
        try{
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        }catch(MalformedURLException e){
            System.err.println(e);
            return;
        }
        try(InputStream inputStream = myUrl.openStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader))
        {
            String header = reader.readLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
            double sum = 0;
            int count = 0;

            String line;
            while((line = reader.readLine())!=null){
                String[] parts = line.split(";");
                if(parts.length < 2){
                    continue;
                }
                try{
                    LocalDateTime dt = LocalDateTime.parse(parts[0].trim(),formatter);
                    if(dt.getYear()==2023 &&
                       dt.getMonthValue() == 1 &&
                       dt.getDayOfMonth() == 1){
                       double temp = Double.parseDouble(parts[1].trim().replace(",","."));
                       sum += temp;
                       count++;
                    }
                } catch (NumberFormatException ex) {
                    continue;
                }

            }

            if(count > 0){
                double avg = sum/count;
                System.out.printf("Average temperature on 1.1.2023: %.1f Celsius", avg);
            }else{
                System.out.println("No data for 1.1.2023");
            }

        }catch(IOException e){
            System.err.println(e);
        }
    }

}
