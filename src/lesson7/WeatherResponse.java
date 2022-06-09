package lesson7;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WeatherResponse {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public void print(String s) {
        System.out.println(s);
    }

    public void printForecast(String in) throws JsonProcessingException {
        String city = ApplicationGlobalState.getInstance().getSelectedCity();
        JsonNode tree = objectMapper.readTree(in);
        JsonNode forecasts = tree.get("DailyForecasts");
        for (int i = 0; i< forecasts.size(); i++) {
            JsonNode day = forecasts.get(i);
            String date = day.at("/Date").toString();
            String temp = day.at("/Temperature").at("/Maximum").at("/Value").toString();
            String dayText = day.at("/Day").at("/IconPhrase").toString();
            print("In city: " + city + " on date: " + date + ", temp: " + temp + " C, weather: "+dayText);
        }
    }

    public void printWeather(String in) throws JsonProcessingException {
        String city = ApplicationGlobalState.getInstance().getSelectedCity();
        JsonNode tree = objectMapper.readTree(in);
        if (tree.size() < 1) {
            print("No weather");
            return;
        }
        JsonNode day = tree.get(0);
        String date = day.at("/LocalObservationDateTime").toString();
        String dayText = day.at("/WeatherText").toString();
        String temp = day.at("/Temperature").at("/Metric").at("/Value").toString();
        print("In city: " + city + " on date: " + date + ", temp: " + temp + " C, weather: "+dayText);

    }
}
