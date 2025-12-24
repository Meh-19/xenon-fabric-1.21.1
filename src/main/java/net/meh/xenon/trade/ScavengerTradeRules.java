package net.meh.xenon.trade;

public final class ScavengerTradeRules {

    private ScavengerTradeRules() {}

    public static int slotsForLevel(int level) {
        return switch (level) {
            case 1 -> 6;
            case 2 -> 8;
            case 3 -> 10;
            case 4 -> 12;
            case 5 -> 16;
            default -> 6;
        };
    }
}
