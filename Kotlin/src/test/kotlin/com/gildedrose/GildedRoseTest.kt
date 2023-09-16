package com.gildedrose

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

internal class GildedRoseTest {

    @Test
    fun `should lower sellIn of a standard item by 1`() {
        val item = aStandardItem(sellIn = 1)

        val updatedItem = updateQualityFor(item)

        updatedItem.sellIn shouldBe 0
    }

    @Test
    fun `should lower quality of a standard item by 1`() {
        val item = aStandardItem(quality = 10)

        val updatedItem = updateQualityFor(item)

        updatedItem.quality shouldBe 9
    }

    private fun aStandardItem(name: String = "anyName", sellIn: Int = 0, quality: Int = 0): Item =
        Item(name, sellIn, quality)

    private fun updateQualityFor(item: Item): Item = GildedRose.updateQuality(listOf(item)).first()
}


