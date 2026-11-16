package gregtechlite.gtlitecore.api.unification.material.info

import gregtech.api.unification.material.info.MaterialIconType

object GTLiteMaterialIconType
{
    // @formatter:off

    @JvmField
    val gemSolitary = iconType("gemSolitary")
    @JvmField
    val sheetedFrame = iconType("sheetedFrame")
    @JvmField
    val wallGt = iconType("wallGt")
    @JvmField
    val seedCrystal = iconType("seedCrystal")
    @JvmField
    val boule = iconType("boule")
    @JvmField
    val fuelRod = iconType("fuelRod")
    @JvmField
    val fuelRodEnriched = iconType("fuelRodEnriched")
    @JvmField
    val fuelRodHighDensity = iconType("fuelRodHighDensity")
    @JvmField
    val fuelRodDepleted = iconType("fuelRodDepleted")
    @JvmField
    val fuelRodEnrichedDepleted = iconType("fuelRodEnrichedDepleted")
    @JvmField
    val fuelRodHighDensityDepleted = iconType("fuelRodHighDensityDepleted")
    @JvmField
    val nanite = iconType("nanite")
    @JvmField
    val planetRockLean = iconType("planetRockLean")
    @JvmField
    val planetRockNormal = iconType("planetRockNormal")
    @JvmField
    val planetRockRich = iconType("planetRockRich")

    private fun iconType(name: String) = MaterialIconType(name)

    // @formatter:on
}