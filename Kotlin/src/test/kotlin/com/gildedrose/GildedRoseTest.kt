package com.gildedrose

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GildedRoseTest {

    @Test
    fun `should lower sellIn of a standard item by 1`() {
        val item = aStandardItem(sellIn = 1)

        val updatedItems = updateQualityIsInvokedWith(item)

        assertEquals(0, updatedItems.first().sellIn)
    }

    @Test
    fun `should lower quality of a standard item by 1`() {
        val item = aStandardItem(quality = 10)

        val updatedItems = updateQualityIsInvokedWith(item)

        assertEquals(9, updatedItems.first().quality)
    }

    private fun aStandardItem(name: String = "anyName", sellIn: Int = 0, quality: Int = 0): Item =
        Item(name, sellIn, quality)

    private fun updateQualityIsInvokedWith(item: Item): List<Item> = GildedRose.updateQuality(listOf(item))
}


