package additions;

import java.util.Optional;

public enum AdditionalEssentiaTier {
    TIER_256K("256k", 1024 * 256),
    TIER_1M("1m", 1024 * 1024),
    TIER_4M("4m", 1024 * 1024 * 4),
    TIER_16M("16m", 1024 * 1024 * 16),
    TIER_64M("64m", 1024 * 1024 * 64),
    TIER_256M("256m", 1024 * 1024 * 256),
    TIER_1G("1g", 1073741824),
    TIER_2G("2g", 2147482624);

    public static final int TYPES = 12;

    private final String size;
    private final int bytes;

    AdditionalEssentiaTier(String size, int bytes) {
        this.size = size;
        this.bytes = bytes;
    }

    public String getSize() {
        return this.size;
    }

    public int getBytes() {
        return this.bytes;
    }

    public String getComponentId() {
        return "essentia_component_" + this.size;
    }

    public static Optional<AdditionalEssentiaTier> bySize(String size) {
        for (AdditionalEssentiaTier tier : AdditionalEssentiaTier.values()) {
            if (tier.size.equals(size)) {
                return Optional.of(tier);
            }
        }

        return Optional.empty();
    }
}
