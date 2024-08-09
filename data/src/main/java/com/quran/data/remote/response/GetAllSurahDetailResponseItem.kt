package com.quran.data.remote.response


import com.quran.domain.Ayat
import com.quran.domain.Edition
import com.quran.domain.SurahDetail
import com.google.gson.annotations.SerializedName

data class GetAllSurahDetailResponseItem(
    @SerializedName("ayahs")
    val ayahs: List<Ayat>,
    @SerializedName("edition")
    val edition: Edition,
    @SerializedName("englishName")
    val englishName: String,
    @SerializedName("englishNameTranslation")
    val englishNameTranslation: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("number")
    val number: Int,
    @SerializedName("numberOfAyahs")
    val numberOfAyahs: Int,
    @SerializedName("revelationType")
    val revelationType: String
)

fun GetAllSurahDetailResponseItem.toSurahDetail(): SurahDetail {
    return SurahDetail(
        ayahs = ayahs.orEmpty(),
        edition = edition,
        englishName = englishName.orEmpty(),
        englishNameTranslation = englishNameTranslation.orEmpty(),
        name = name.orEmpty(),
        number = number,
        numberOfAyahs = numberOfAyahs,
        revelationType = revelationType.orEmpty()
    )
}