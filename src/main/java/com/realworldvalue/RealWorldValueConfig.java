package net.runelite.client.plugins.realworldvalue;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("realworldvalue")
public interface RealWorldValueConfig extends Config
{
    enum Currency
    {
        USD,
        GBP,
        EUR,
        CAD,
        AUD,
        NOK,
        SEK,
        BRL,
        PLN,
        SGD,
        DKK
    }

    @ConfigItem(
        keyName = "enabled",
        name = "Enable Plugin",
        description = "Toggle the real world value display on/off"
    )
    default boolean enabled()
    {
        return true;
    }

    @ConfigItem(
        keyName = "currency",
        name = "Currency",
        description = "Select which currency to display values in",
        position = 1
    )
    default Currency currency()
    {
        return Currency.USD;
    }

    @ConfigItem(
        keyName = "minimumValue",
        name = "Minimum Value",
        description = "Only show tooltip for items worth at least this much in your selected currency",
        position = 2
    )
    default double minimumValue()
    {
        return 0.01;
    }

    @ConfigItem(
        keyName = "showGPValue",
        name = "Show GP Value",
        description = "Display the GP value alongside real world value",
        position = 3
    )
    default boolean showGPValue()
    {
        return true;
    }

    @ConfigItem(
        keyName = "showBondPrice",
        name = "Show Bond Price",
        description = "Display the current bond price in the tooltip",
        position = 4
    )
    default boolean showBondPrice()
    {
        return true;
    }

    @ConfigItem(
        keyName = "showMinimumWage",
        name = "Show Minimum Wage Comparison",
        description = "Display item value in hours of minimum wage work when examining items",
        position = 5
    )
    default boolean showMinimumWage()
    {
        return true;
    }
}
