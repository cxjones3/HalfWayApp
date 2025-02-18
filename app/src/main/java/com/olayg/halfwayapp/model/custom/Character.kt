package com.olayg.halfwayapp.model.custom

import android.os.Parcelable
import com.olayg.halfwayapp.model.response.CharacterResponse
import com.olayg.halfwayapp.model.response.Gif
import com.olayg.halfwayapp.model.response.Image
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class Character(
    val name: String?,
    val image: Image?,
    val rank: String,
    val weightRank: String,
    val speedRank: String,
    val gifs: List<Gif?>
):Parcelable {

    companion object {
        fun convertToCharacter(characterResponse: CharacterResponse, image: Image?) = Character(
            name = characterResponse.name,
            image = image,
            rank = characterResponse.tierData,
            weightRank = characterResponse.weight,
            speedRank = characterResponse.fallSpeed,
            gifs = characterResponse.gifs
        )
    }
}