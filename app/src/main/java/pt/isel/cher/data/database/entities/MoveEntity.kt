package pt.isel.cher.data.database.entities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "moves",
    foreignKeys = [
        ForeignKey(
            entity = FavoriteGame::class,
            parentColumns = ["id"],
            childColumns = ["favoriteGameId"],
            onDelete = ForeignKey.CASCADE,
        ),
    ],
    indices = [Index(value = ["favoriteGameId"])],
)
data class MoveEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val favoriteGameId: String,
    val moveNumber: Int,
    val row: Int,
    val col: Int,
    val player: String, // "BLACK" or "WHITE"
)
