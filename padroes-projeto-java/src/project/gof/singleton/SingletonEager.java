package project.gof.singleton;

/**
 * Singleton "apressado".
 * @author Felipe Bertoli
 */
public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager () {
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
