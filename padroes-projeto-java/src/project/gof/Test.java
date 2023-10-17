package project.gof;

import project.gof.facade.Facade;
import project.gof.singleton.SingletonEager;
import project.gof.singleton.SingletonLazy;
import project.gof.singleton.SingletonLazyHolder;
import project.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        // Design Pattern Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        // Design Pattern Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();

        // Design Pattern Facade
        Facade facade = new Facade();
        facade.migrarCliente("Fulano", "12345678");
    }
}
