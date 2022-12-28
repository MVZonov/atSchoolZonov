package HWLesson19Part1Animals;

public enum HealthState {
    GOOD("HEALTHY"),
    BAD("UNHEALTHY");

    private String health;

    HealthState(String health) {
        this.health = health;
    }

    public String getHealth() {
        return health;
    }
}