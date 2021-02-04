package com.example.brewdogapp.net

import com.example.brewdogapp.model.Beer
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PunkApi {
    @GET("beers")
    fun getAllBeers(@Query("page") page: Int = 1): Single<List<Beer>>

    /*
        Maybe:
     * @param [yeast]    matching the supplied yeast name, this performs a fuzzy match, if you need to add spaces just add an underscore (_).
     * @param [hops]    matching the supplied hops name, this performs a fuzzy match, if you need to add spaces just add an underscore (_).
     * @param [malt]    matching the supplied malt name, this performs a fuzzy match, if you need to add spaces just add an underscore (_).

     */
    /**
     * Get beers with params
     *
     * @param [alcoholGreater]    with ABV greater than the supplied number
     * @param [alcoholLess]    with ABV less than the supplied number
     * @param [bitternessGreater]    with IBU greater than the supplied number
     * @param [bitternessLess]    with IBU less than the supplied number
     * @param [ebcGreater]    with EBC greater than the supplied number
     * @param [ebcLess]    with EBC less than the supplied number
     * @param [dateBefore]    brewed before this date, the date format is mm-yyyy e.g 10-2011
     * @param [dateAfter]    brewed after this date, the date format is mm-yyyy e.g 10-2011
     */
    @GET("beers")
    fun getBeers(
        @Query("page") page: Int,
        @Query("abv_gt") alcoholGreater: Int,
        @Query("abv_lt") alcoholLess: Int,
        @Query("ibu_gt") bitternessGreater: Int,
        @Query("ibu_lt") bitternessLess: Int,
        @Query("ebc_gt") ebcGreater: Int,
        @Query("ebc_lt") ebcLess: Int,
        @Query("brewed_before") dateBefore: String,
        @Query("brewed_after") dateAfter: String
    ): Single<List<Beer>>

    /**
     * Get beers by ids
     *
     * @param [food]    matching the supplied food string, this performs a fuzzy match, if you need to add spaces just add an underscore (_).
     */
    @GET("beers")
    fun getBeersByFood(@Query("food") food: String): Single<List<Beer>>

    /**
     * Get beers by food
     *
     * @param [ids]    (id|id|...)	matching the supplied ID's. You can pass in multiple ID's by separating them with a | symbol.
     */
    @GET("beers")
    fun getBeersById(@Query("ids") ids: String): Single<List<Beer>>

    /**
     * Search beers by name
     *
     * @param [name]    matching the supplied name (this will match partial strings as well so e.g punk will return Punk IPA), if you need to add spaces just add an underscore (_).
     */
    @GET("beers")
    fun getBeersByName(@Query("beer_name") name: String): Single<List<Beer>>

    @GET("beers/random")
    fun getRandomBeer(): Single<List<Beer>>

    @GET("beers/{id}")
    fun getBeerById(@Path("id") id: Int): Single<List<Beer>>
}