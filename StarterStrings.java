package HDR.config;

import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.action.TextActions;
import org.spongepowered.api.text.format.TextColors;
import org.spongepowered.api.text.format.TextStyles;

public class StarterStrings {
    public static Text EnviroKitString = Text.builder("Redeem Tinkers Kit").onClick(TextActions.runCommand("/start tinkerskit")).color(TextColors.AQUA).onHover(TextActions.showText(Text.of("Redeem the Tinkers kit"))).style(TextStyles.BOLD).build();
    public static Text RefinedKitString = Text.builder("Redeem AE Kit").onClick(TextActions.runCommand("/start aekit")).color(TextColors.AQUA).onHover(TextActions.showText(Text.of("Redeem the AE kit"))).style(TextStyles.BOLD).build();
    public static Text ThermalKitString = Text.builder("Redeem Botania Kit").onClick(TextActions.runCommand("/start botaniakit")).color(TextColors.AQUA).onHover(TextActions.showText(Text.of("Redeem the Botania kit"))).style(TextStyles.BOLD).build();
    public static Text XnetKitString = Text.builder("Redeem ThermalExpansion Kit").onClick(TextActions.runCommand("/start thermalkit")).color(TextColors.AQUA).onHover(TextActions.showText(Text.of("Redeem the Thermal Expansion kit"))).style(TextStyles.BOLD).build();
    public static Text FarmerKitString = Text.builder("Redeem Forestry Kit").onClick(TextActions.runCommand("/start forestrykit")).color(TextColors.AQUA).onHover(TextActions.showText(Text.of("Redeem the forestry kit"))).style(TextStyles.BOLD).build();
    public static Text EnchanterKitString = Text.builder("Redeem Immersive Kit").onClick(TextActions.runCommand("/start immersivekit")).color(TextColors.AQUA).onHover(TextActions.showText(Text.of("Redeem the Immersive kit"))).style(TextStyles.BOLD).build();

}