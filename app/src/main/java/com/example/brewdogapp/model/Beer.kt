package com.example.brewdogapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "beer")
data class Beer(

    @field:SerializedName("first_brewed")
    val firstBrewed: String? = null,

    @field:SerializedName("attenuation_level")
    val attenuationLevel: Double? = null,

    @field:SerializedName("method")
    val method: Method? = null,

    @field:SerializedName("target_og")
    val targetOg: Double? = null,

    @field:SerializedName("image_url")
    val imageUrl: String? = null,

    @field:SerializedName("boil_volume")
    val boilVolume: BoilVolume? = null,

    @field:SerializedName("ebc")
    val ebc: Double? = null,

    @field:SerializedName("description")
    val description: String? = null,

    @field:SerializedName("target_fg")
    val targetFg: Double? = null,

    @field:SerializedName("srm")
    val srm: Double? = null,

    @field:SerializedName("volume")
    val volume: Volume? = null,

    @field:SerializedName("contributed_by")
    val contributedBy: String? = null,

    @field:SerializedName("abv")
    val abv: Double? = null,

    @field:SerializedName("food_pairing")
    val foodPairing: List<String?>? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("ph")
    val ph: Double? = null,

    @field:SerializedName("tagline")
    val tagline: String? = null,

    @field:SerializedName("ingredients")
    val ingredients: Ingredients? = null,

    @PrimaryKey
    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("ibu")
    val ibu: Double? = null,

    @field:SerializedName("brewers_tips")
    val brewersTips: String? = null
)

data class Temp(

    @field:SerializedName("unit")
    val unit: String? = null,

    @field:SerializedName("value")
    val value: Int? = null
)

data class Ingredients(

    @field:SerializedName("hops")
    val hops: List<HopsItem?>? = null,

    @field:SerializedName("yeast")
    val yeast: String? = null,

    @field:SerializedName("malt")
    val malt: List<MaltItem?>? = null
)

data class Volume(

    @field:SerializedName("unit")
    val unit: String? = null,

    @field:SerializedName("value")
    val value: Int? = null
)

data class HopsItem(

    @field:SerializedName("add")
    val add: String? = null,

    @field:SerializedName("amount")
    val amount: Amount? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("attribute")
    val attribute: String? = null
)

data class Method(

    @field:SerializedName("mash_temp")
    val mashTemp: List<MashTempItem?>? = null,

    @field:SerializedName("fermentation")
    val fermentation: Fermentation? = null,

    @field:SerializedName("twist")
    val twist: Any? = null
)

data class Fermentation(

    @field:SerializedName("temp")
    val temp: Temp? = null
)

data class MashTempItem(

    @field:SerializedName("duration")
    val duration: Int? = null,

    @field:SerializedName("temp")
    val temp: Temp? = null
)

data class BoilVolume(

    @field:SerializedName("unit")
    val unit: String? = null,

    @field:SerializedName("value")
    val value: Int? = null
)

data class Amount(

    @field:SerializedName("unit")
    val unit: String? = null,

    @field:SerializedName("value")
    val value: Double? = null
)

data class MaltItem(

    @field:SerializedName("amount")
    val amount: Amount? = null,

    @field:SerializedName("name")
    val name: String? = null
)
