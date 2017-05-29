class SpaceAge {
    double seconds;
    private final double EARTH_YEAR_SECONDS = 31557600;
    private final double MERCURY_ORBITAL_IN_SECONDS = 0.2408467 * EARTH_YEAR_SECONDS;
    private final double VENUS_ORBITAL_IN_SECONDS   = 0.61519726 * EARTH_YEAR_SECONDS;
    private final double MARS_ORBITAL_IN_SECONDS    = 1.8808158 * EARTH_YEAR_SECONDS;
    private final double JUPITER_ORBITAL_IN_SECONDS = 11.862615 * EARTH_YEAR_SECONDS;
    private final double SATURN_ORBITAL_IN_SECONDS  = 29.447498 * EARTH_YEAR_SECONDS;
    private final double URANUS_ORBITAL_IN_SECONDS  = 84.016846 * EARTH_YEAR_SECONDS;
    private final double NEPTUNE_ORBITAL_IN_SECONDS = 164.79132 * EARTH_YEAR_SECONDS;

    SpaceAge(double seconds) throws IllegalArgumentException{
        if(seconds < 0) {
            throw new IllegalArgumentException("Seconds cannot be less than 0");
        } else {
            this.seconds = seconds;
        }
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return seconds / EARTH_YEAR_SECONDS;
    }
    double onMercury() {
        return seconds / MERCURY_ORBITAL_IN_SECONDS;
    }

    double onVenus() {
        return seconds / VENUS_ORBITAL_IN_SECONDS;
    }

    double onMars() {
        return seconds / MARS_ORBITAL_IN_SECONDS;
    }

    double onJupiter() {
        return seconds / JUPITER_ORBITAL_IN_SECONDS;
    }

    double onSaturn() {
        return seconds / SATURN_ORBITAL_IN_SECONDS;
    }

    double onUranus() {
        return seconds / URANUS_ORBITAL_IN_SECONDS;
    }

    double onNeptune() {
        return seconds / NEPTUNE_ORBITAL_IN_SECONDS;
    }

}
