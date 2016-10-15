package org.javaday.benchmarking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Evegeny on 14/10/2016.
 */
@Service
public class JavadayServiceImpl implements JavadayService {
    @Autowired
    private JavadayService proxy;

    public void setProxy(JavadayService proxy) {
        this.proxy = proxy;
    }

    @Override
    @Benchmark
    public void ultraFast() throws InterruptedException {
        Thread.sleep(1000);
        proxy.megaFast();
    }

    @Override
    @Benchmark
    public void megaFast() throws InterruptedException {
        Thread.sleep(500);
        this.superFast();
    }

    @Benchmark
    public void superFast() throws InterruptedException {
        Thread.sleep(300);
        this.fast();
    }

    @Benchmark
    private void fast() throws InterruptedException {
        Thread.sleep(100);
    }
}














