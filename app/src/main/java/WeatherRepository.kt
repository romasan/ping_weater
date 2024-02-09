import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WeatherRepository {
    private val retrofit = Retrofit.Builder()
        .baseUrl("http://api.weatherprovider.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val weatherApiService = retrofit.create(WeatherApiService::class.java)

    fun getWeatherForCity(city: String, apiKey: String): Call<WeatherData> {
        return weatherApiService.getWeatherForCity(city, apiKey)
    }
}