import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

class WeatherApiService {
    @GET("/weather")
    fun getWeatherForCity(
        @Query("city") city: String,
        @Query("apiKey") apiKey: String
    ): Call<WeatherData>
}